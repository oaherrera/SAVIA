package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

import control.elementos.ObjetosConfigAux;

public class PortafolioEvento {

	ObjetosConfigAux objAux;

	By menuPortafolio = By.xpath("//label[contains(text(),'Portafolio')]");
	By menuPortafolioEvento = By.xpath("//span[contains(text(),'Portafolio evento')]");
	By claseACambiar = By.xpath("//div[@class='menu page-sidebar sidebar-fixed']");
	By menuPortafolio2 = By.xpath("(//span[contains(normalize-space(.),'Portafolio')])[1]");
	By menuPortafolioEvento2 = By.xpath("//span[contains(normalize-space(.),'Portafolio Evento')]");
	By activarPestana = By.xpath("//li[contains(@id,'sedesLi')]");
	By pestanaSedesPrestador = By.xpath("//a[contains(text(),'Sedes del prestador')]");
	By editarServiciosSede = By.xpath("(//i[contains(@class,'icon-gear text-info')])[1]");
	By botonNuevoServicio = By.xpath("//button[contains(@id,'botonNuevoServicio')]");
	By seleccionarGrupoDeHab = By.xpath("//select[contains(@id,'selectGrupoServicio')]");
	By seleccionarServicio = By.xpath("//select[contains(@id,'selectServicio')]");
	By seleccionarTarifario = By.xpath("//select[contains(@id,'selectTarifario')]");
	By txtNegociacion = By.xpath("//input[contains(@id,'inputPorcentNegociacion')]");
	By seleccionarComplejidad = By.xpath("//select[contains(@id,'complejidadServicio')]");
	By btnAgregarServicio = By.xpath("(//button[contains(text(),'Agregar')])[7]");
	By menuMedicamentos = By.xpath("//a[contains(text(),'Medicamentos') and contains(@href,'#formMedicamentos')]");
	By btnBuscarMedicamentos = By.xpath("//button[contains(@id,'btnBuscarMedicamentos')]");
	By txtDescripcion = By.xpath("(//input[contains(@name,'nombreMed')])[2]");
	By btnBuscarMedicamentos2 = By.xpath("//button[@data-original-title='Buscar medicamentos']");
	By txtValorMedicamento = By.xpath("(//input[@id='valor'])[1]");
	By chkValorMedicamento = By.xpath("(//input[@id='seleccionado'])[1]");
	By btnAgregarPortafolio = By.xpath("//button[@id='btnAgregarMedicamentosPortafolio']");
	By lstGrupoMedicamento = By.xpath("//select[@id='idGrupoMedicamento']");
	By btnBuscarMedVisualizar = By.xpath("//button[@id='buscarMedicamentosPortafolio']");
	By pestanaPaquetes = By.xpath("//a[contains(@href,'formPaquetes')]");
	By btnBuscarPaquetes = By.xpath("//button[@id='botonBuscarPaquete']");
	By lstGrupoHabPaquetes = By.xpath("//select[@id='macroServicio']");
	By btnBuscarPaquetesGrupo = By.xpath("(//button[normalize-space(.)='Buscar'])[6]");
	By txtCodigoIps = By.xpath("(//input[@id='codigoIps'])[6]");
	By chkSeleccionado = By.xpath("(//input[@id='seleccionado'])[6]");
	By btnAgregarPaqPortafolio = By.xpath("(//button[normalize-space(.)='Agregar al portafolio'])[2]");
	By btnCerrarServiciosSede = By.xpath("(//strong[contains(text(),'Servicios Sede')]//ancestor::div)[4]//button[@class='close']");
	By btnCrearNuevaSede = By.xpath("//button[contains(@id,'btnCrearNuevaSede')]");

	public PortafolioEvento(ObjetosConfigAux objAux) {
		this.objAux = objAux;
	}

	public void clicMenuPortafolio() throws IOException, InterruptedException {
		objAux.EsperaElemento(objAux.getDriver(), menuPortafolio);
		objAux.getDriver().findElement(menuPortafolio).click();
		Thread.sleep(1000);
		objAux.AdminDocPdf.generaEvidencia("Se ingresa al Portafolio",
				Shutterbug.shootPage(objAux.getDriver()).getImage());
	}

	public void clicMenuPortafolioEvento() throws IOException, InterruptedException {
		objAux.EsperaElemento(objAux.getDriver(), menuPortafolioEvento);
		objAux.getDriver().findElement(menuPortafolioEvento).click();
		Thread.sleep(1000);
		objAux.AdminDocPdf.generaEvidencia("Se ingresa a Portafolio Evento",
				Shutterbug.shootPage(objAux.getDriver()).getImage());

	}

	public void clicMenuPortafolio2() throws IOException, InterruptedException {
		objAux.EsperaElemento(objAux.getDriver(), menuPortafolio2);
		objAux.getDriver().findElement(menuPortafolio2).click();
		Thread.sleep(1000);
		objAux.AdminDocPdf.generaEvidencia("Se ingresa a Portafolio Evento",
				Shutterbug.shootPage(objAux.getDriver()).getImage());
	}

	public void clicMenuPortafolioEvento2() throws IOException, InterruptedException {
		objAux.EsperaElemento(objAux.getDriver(), menuPortafolioEvento2);
		objAux.getDriver().findElement(menuPortafolioEvento2).click();
		Thread.sleep(1000);
		objAux.AdminDocPdf.generaEvidencia("Se ingresa a Portafolio Evento",
				Shutterbug.shootPage(objAux.getDriver()).getImage());
		Thread.sleep(2000);
	}

	public void clicPestanaSedesPrestador() throws IOException, InterruptedException {
		objAux.EsperaElemento(objAux.getDriver(), pestanaSedesPrestador);
		objAux.getDriver().findElement(pestanaSedesPrestador).click();
		Thread.sleep(1000);
		objAux.AdminDocPdf.generaEvidencia("Ingreso a Sedes Prestador",
				Shutterbug.shootPage(objAux.getDriver()).getImage());
	}

	public void clicEditarServiciosSede() throws IOException, InterruptedException {
		objAux.EsperaElemento(objAux.getDriver(), editarServiciosSede);
		objAux.getDriver().findElement(editarServiciosSede).click();
		Thread.sleep(1000);
		objAux.AdminDocPdf.generaEvidencia("Ingreso a Editar servicios Sede",
				Shutterbug.shootPage(objAux.getDriver()).highlight(objAux.getDriver().findElement(editarServiciosSede)).getImage());
	}

	public void clicBotonNuevoServicio() throws IOException, InterruptedException {
		objAux.EsperaElemento(objAux.getDriver(), botonNuevoServicio);
		objAux.clicJs(objAux.getDriver().findElement(botonNuevoServicio));
		Thread.sleep(1000);
		objAux.AdminDocPdf.generaEvidencia("Click Nuevo Servicio", 
				Shutterbug.shootPage(objAux.getDriver()).highlight(objAux.getDriver().findElement(botonNuevoServicio)).getImage());
	}

	public void setSeleccionarGrupoDeHab(String pGrupo) throws Exception, IOException {

		String nuevopGrupo = "";
		nuevopGrupo = pGrupo.replace("0", " ");

		Select servicio = new Select(objAux.getDriver().findElement(seleccionarGrupoDeHab));
		servicio.selectByVisibleText(nuevopGrupo);
		Thread.sleep(1000);
		objAux.AdminDocPdf.generaEvidencia("Seleccionar Grupo habilitación",
				Shutterbug.shootPage(objAux.getDriver()).highlight(objAux.getDriver().findElement(seleccionarGrupoDeHab)).getImage());
	}

	public void setSeleccionarServicio(String pServicio) throws Exception, IOException {
		Select servicio = new Select(objAux.getDriver().findElement(seleccionarServicio));
		servicio.selectByVisibleText(pServicio);
		objAux.AdminDocPdf.generaEvidencia("Seleccionar Servicio", Shutterbug.shootPage(objAux.getDriver()).highlight(objAux.getDriver().findElement(seleccionarServicio)).getImage());
	}

	public void setSeleccionarTarifario(String pTarifario) throws Exception, IOException {
		Select tarifario = new Select(objAux.getDriver().findElement(seleccionarTarifario));
		tarifario.selectByVisibleText(pTarifario);
		objAux.AdminDocPdf.generaEvidencia("Seleccionar Tarifario",
				Shutterbug.shootPage(objAux.getDriver()).getImage());
	}

	public void setTxtNegociacion() throws IOException {
		int numeroNeg = 0;
		numeroNeg = (int) (Math.random() * 100);
		objAux.EsperaElemento(objAux.getDriver(), txtNegociacion);
		objAux.getDriver().findElement(txtNegociacion).sendKeys(Integer.toString(numeroNeg));
	}

	public void setSeleccionarComplejidad(String pComplejidad) throws Exception, IOException {
		Select tarifario = new Select(objAux.getDriver().findElement(seleccionarComplejidad));
		tarifario.selectByVisibleText(pComplejidad);
		objAux.AdminDocPdf.generaEvidencia("Selecciona Complejidad",
				Shutterbug.shootPage(objAux.getDriver()).getImage());
	}

	public void clicBtnAgregarServicio() throws IOException, InterruptedException {
		objAux.EsperaElemento(objAux.getDriver(), btnAgregarServicio);
		objAux.getDriver().findElement(btnAgregarServicio).click();
		Thread.sleep(1000);
		objAux.AdminDocPdf.generaEvidencia("Agregar Servicio", Shutterbug.shootPage(objAux.getDriver()).getImage());
	}

	public void clicMenuMedicamentos() throws IOException, InterruptedException {
		objAux.EsperaElemento(objAux.getDriver(), menuMedicamentos);
		objAux.clicJs(objAux.getDriver().findElement(menuMedicamentos));
		Thread.sleep(1000);
		objAux.AdminDocPdf.generaEvidencia("Ingresa a diligenciar medicamentos",
				Shutterbug.shootPage(objAux.getDriver()).getImage());
	}

	public void clicBtnBuscarMedicamentos() throws IOException, InterruptedException {
		objAux.EsperaElemento(objAux.getDriver(), btnBuscarMedicamentos);
		objAux.getDriver().findElement(btnBuscarMedicamentos).click();
		Thread.sleep(1000);
		objAux.AdminDocPdf.generaEvidencia("Click en boton Buscar Medicamentos",
				Shutterbug.shootPage(objAux.getDriver()).getImage());
	}

	public void setTxtDescripcion(String pValor) throws IOException {
		objAux.EsperaElemento(objAux.getDriver(), txtDescripcion);
		objAux.getDriver().findElement(txtDescripcion).sendKeys(pValor);
		objAux.AdminDocPdf.generaEvidencia("Busca valor por descripción",
				Shutterbug.shootPage(objAux.getDriver()).getImage());
	}

	public void clicBtnBuscarMedicamentos2() throws IOException, InterruptedException {
		objAux.EsperaElemento(objAux.getDriver(), btnBuscarMedicamentos2);
		objAux.getDriver().findElement(btnBuscarMedicamentos2).click();
		Thread.sleep(1000);
		objAux.AdminDocPdf.generaEvidencia("Click en boton Buscar Medicamento",
				Shutterbug.shootPage(objAux.getDriver()).getImage());
	}

	public void setTxtValorMedicamento(String pValorMed) throws IOException {
		objAux.EsperaElemento(objAux.getDriver(), txtValorMedicamento);
		objAux.getDriver().findElement(txtValorMedicamento).sendKeys(pValorMed);
		objAux.AdminDocPdf.generaEvidencia("Se ingresa valor medicamento",
				Shutterbug.shootPage(objAux.getDriver()).getImage());
	}

	public void clicChkValorMedicamento() throws IOException, InterruptedException {
		objAux.EsperaElemento(objAux.getDriver(), chkValorMedicamento);
		objAux.getDriver().findElement(chkValorMedicamento).click();
		Thread.sleep(1000);
		objAux.AdminDocPdf.generaEvidencia("Selecciona toda la Fila",
				Shutterbug.shootPage(objAux.getDriver()).getImage());
	}

	public void clicBtnAgregarPortafolio() throws IOException, InterruptedException {
		objAux.EsperaElemento(objAux.getDriver(), btnAgregarPortafolio);
		objAux.getDriver().findElement(btnAgregarPortafolio).click();
		Thread.sleep(1000);
		objAux.AdminDocPdf.generaEvidencia("Agrega al portafolio el Medicamento",
				Shutterbug.shootPage(objAux.getDriver()).getImage());
	}

	public void setLstGrupoMedicamento(String pMedicamento) throws Exception, IOException {
		Select servicio = new Select(objAux.getDriver().findElement(lstGrupoMedicamento));
		servicio.selectByVisibleText(pMedicamento);
		objAux.AdminDocPdf.generaEvidencia("Selecciona grupo de Medicamento",
				Shutterbug.shootPage(objAux.getDriver()).getImage());
	}

	public void clicBtnBuscarMedVisualizar() throws IOException, InterruptedException {
		objAux.EsperaElemento(objAux.getDriver(), btnBuscarMedVisualizar);
		objAux.getDriver().findElement(btnBuscarMedVisualizar).click();
		Thread.sleep(1000);
		objAux.AdminDocPdf.generaEvidencia("Se visualiza medicamentos agregados",
				Shutterbug.shootPage(objAux.getDriver()).getImage());
	}

	public void clicPestanaPaquetes() throws IOException, InterruptedException {
		objAux.EsperaElemento(objAux.getDriver(), pestanaPaquetes);
		objAux.clicJs(objAux.getDriver().findElement(pestanaPaquetes));
		Thread.sleep(1000);
		objAux.AdminDocPdf.generaEvidencia("Click en la pestaña paquetes",
				Shutterbug.shootPage(objAux.getDriver()).getImage());
	}

	public void clicBtnBuscarPaquetes() throws IOException, InterruptedException {
		objAux.EsperaElemento(objAux.getDriver(), btnBuscarPaquetes);
		objAux.getDriver().findElement(btnBuscarPaquetes).click();
		Thread.sleep(1000);
		objAux.AdminDocPdf.generaEvidencia("Click en boton Buscar Paquetes",
				Shutterbug.shootPage(objAux.getDriver()).getImage());
	}

	public void setLstGrupoHabPaquetes(String pValorGrupo) throws Exception, IOException {
		Select servicio = new Select(objAux.getDriver().findElement(lstGrupoHabPaquetes));
		servicio.selectByVisibleText(pValorGrupo);
		objAux.AdminDocPdf.generaEvidencia("Selecciona grupo de Habilitación",
				Shutterbug.shootPage(objAux.getDriver()).getImage());
	}

	public void clicBtnBuscarPaquetesGrupo() throws IOException, InterruptedException {
		objAux.EsperaElemento(objAux.getDriver(), btnBuscarPaquetesGrupo);
		objAux.getDriver().findElement(btnBuscarPaquetesGrupo).click();
		Thread.sleep(1000);
		objAux.AdminDocPdf.generaEvidencia("Click en boton Buscar por Grupo de habilitación",
				Shutterbug.shootPage(objAux.getDriver()).getImage());
	}

	public void setTxtCodigoIps() throws IOException {
		int numeroCuenta = 0;
		numeroCuenta = (int) (Math.random() * 100000);
		objAux.EsperaElemento(objAux.getDriver(), txtCodigoIps);
		objAux.getDriver().findElement(txtCodigoIps).sendKeys(Integer.toString(numeroCuenta));
	}

	public void clicChkSeleccionado() throws IOException, InterruptedException {
		objAux.EsperaElemento(objAux.getDriver(), chkSeleccionado);
		objAux.getDriver().findElement(chkSeleccionado).click();
		Thread.sleep(1000);
		objAux.AdminDocPdf.generaEvidencia("Selecciona el registro",
				Shutterbug.shootPage(objAux.getDriver()).getImage());
	}

	public void clicBtnAgregarPaqPortafolio() throws IOException, InterruptedException {
		objAux.EsperaElemento(objAux.getDriver(), btnAgregarPaqPortafolio);
		objAux.getDriver().findElement(btnAgregarPaqPortafolio).click();
		Thread.sleep(1000);
		objAux.AdminDocPdf.generaEvidencia("Agrega el paquete al Portafolio",
				Shutterbug.shootPage(objAux.getDriver()).getImage());
	}

	public void clicBtnCerrarServiciosSede() throws IOException {
		objAux.EsperaElemento(objAux.getDriver(), btnCerrarServiciosSede);
		objAux.getDriver().findElement(btnCerrarServiciosSede).click();
		objAux.AdminDocPdf.generaEvidencia("Se cierra servicios sede",
				Shutterbug.shootPage(objAux.getDriver()).getImage());
	}
	
	public void clicBtnCrearNuevaSede() throws IOException, InterruptedException {
		objAux.EsperaElemento(objAux.getDriver(), btnCrearNuevaSede);
		objAux.getDriver().findElement(btnCrearNuevaSede).click();
		Thread.sleep(1000);
		objAux.AdminDocPdf.generaEvidencia("Click en Boton Crear nueva sede",
				Shutterbug.shootPage(objAux.getDriver()).getImage());

	}

	public void ingresarAPortafolio() throws IOException, InterruptedException {
		clicMenuPortafolio();
		clicMenuPortafolioEvento();
	}

	public void ingresarDatosPortafolio(String pGrupo, String pServicio, String pTarifario, String pComplejidad,
			String pValor, String pValorMed, String pMedicamento, String pValorGrupo) throws Exception {

		objAux.removerPropiedadElementoWeb(claseACambiar, "style");
		JavascriptExecutor js = (JavascriptExecutor) objAux.getDriver();
		WebElement element = objAux.getDriver().findElement(claseACambiar);
		js.executeScript("arguments[0].setAttribute('style', 'display:block;')", element);
		clicMenuPortafolio2();
		clicMenuPortafolioEvento2();
		clicPestanaSedesPrestador();
		Thread.sleep(1000);
		clicEditarServiciosSede();
		Thread.sleep(1000);
		clicBotonNuevoServicio();
		Thread.sleep(1000);
		setSeleccionarGrupoDeHab(pGrupo);
		Thread.sleep(1000);
		setSeleccionarServicio(pServicio);
		Thread.sleep(1000);
		setSeleccionarTarifario(pTarifario);
		Thread.sleep(1000);
		setTxtNegociacion();
		Thread.sleep(1000);
		setSeleccionarComplejidad(pComplejidad);
		clicBtnAgregarServicio();
		clicMenuMedicamentos();
		clicBtnBuscarMedicamentos();
		setTxtDescripcion(pValor);
		clicBtnBuscarMedicamentos2();
		Thread.sleep(1000);
		setTxtValorMedicamento(pValorMed);
		Thread.sleep(1000);
		clicChkValorMedicamento();
		Thread.sleep(1000);
		clicBtnAgregarPortafolio();
		Thread.sleep(1000);
		setLstGrupoMedicamento(pMedicamento);
		Thread.sleep(1000);
		clicBtnBuscarMedVisualizar();
		Thread.sleep(1000);
		clicPestanaPaquetes();
		Thread.sleep(1000);
		clicBtnBuscarPaquetes();
		Thread.sleep(1000);
		setLstGrupoHabPaquetes(pValorGrupo);
		Thread.sleep(1000);
		clicBtnBuscarPaquetesGrupo();
		Thread.sleep(1000);
		setTxtCodigoIps();
		Thread.sleep(1000);
		clicChkSeleccionado();
		Thread.sleep(1000);
		clicBtnAgregarPaqPortafolio();
		Thread.sleep(1000);
		clicBtnCerrarServiciosSede();
		clicBtnCrearNuevaSede();

	}

}
