package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.MalformedURLException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.lowagie.text.DocumentException;

import control.elementos.ObjetosConfigAux;
import evidencia.doc.pdf.AdminDocPdf;
import manager.param.AdminParam;
import model.Ambientes;
import model.DispositivoPrueba;
import model.Estados;
import model.Navegadores;
import model.TipoCone;
import page.Login;
import page.PortafolioEvento;

public class TestPortafolioEvento {

	ObjetosConfigAux objAux;
	Navegadores navegador;
	Login objLogin;
	PortafolioEvento objNegociacionEvento;
	Ambientes ambiente;
	int count;

	@BeforeSuite
	public void setup() throws IOException, InterruptedException {
		objAux = new ObjetosConfigAux("2");
		this.navegador = objAux.getNavegador();
		objLogin = new Login(objAux);
		objNegociacionEvento = new PortafolioEvento(objAux);
		objLogin.iniciarSesion(4);
	}

	@Test(priority = 2)
	public void ingresoDatosPrestador() throws Exception {
		objAux.AdminDocPdf = new AdminDocPdf(Ambientes.PROYECTOS, Navegadores.CHROME, DispositivoPrueba.WEB);
		objNegociacionEvento.ingresarAPortafolio();
		objLogin.iniciarSesion(4);
		objAux.AdminParam = new AdminParam(TipoCone.EXCEL, "Datos_Prestador");
		objAux.AdminParam.ObtenerParametros();
		objNegociacionEvento.ingresarDatosPortafolio(objAux.buscaElementoParametro("Grupo").toString(),objAux.buscaElementoParametro("Servicio").toString(),
				objAux.buscaElementoParametro("Tarifario").toString(),
				objAux.buscaElementoParametro("Complejidad").toString(),objAux.buscaElementoParametro("Descripcion").toString(),
				objAux.buscaElementoParametro("Valor_Medicamento").toString(),objAux.buscaElementoParametro("Medicamento").toString(),
				objAux.buscaElementoParametro("Grupo_Paquetes").toString());
	}

	

	@AfterMethod
	public void finalizeTest(ITestResult t) throws MalformedURLException, DocumentException, IOException {
		if (t.getStatus() == ITestResult.SUCCESS)
			objAux.AdminDocPdf.crearDocumento(Estados.SUCCESS);
		else {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			Throwable cause = t.getThrowable();
			if (null != cause) {
				cause.printStackTrace(pw);
				objAux.AdminDocPdf.generaEvidencia(
						"Resultado NO Esperado: "
								+ sw.getBuffer().toString().substring(0, sw.getBuffer().toString().indexOf("at ")),
						Shutterbug.shootPage(objAux.getDriver()).getImage());
			} else {
				objAux.AdminDocPdf.generaEvidencia("Resultado NO Esperado: ",
						Shutterbug.shootPage(objAux.getDriver()).getImage());
			}
			objAux.AdminDocPdf.crearDocumento(Estados.FAILED);
		}
	}
}
