package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Sleeper;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

import control.elementos.ObjetosConfigAux;

public class Login {

	ObjetosConfigAux objAux;

	By txtUserName = By.id("username");
	By txtPassword = By.id("password");
	By btnLogin = By.xpath("//*[contains(@name,'submit')]");

	public Login(ObjetosConfigAux objAux) {
		this.objAux = objAux;
	}
	
	

	// Metodos de eventos y acciones
	public void setTxtUserName(String pUserName) throws IOException {
		if (objAux.EsperaElemento(objAux.getDriver(), txtUserName)) {
			objAux.getDriver().findElement(txtUserName).sendKeys(pUserName);
		}
	}

	public void setTxtPassword(String pPassword) throws IOException {
		if (objAux.EsperaElemento(objAux.getDriver(), txtPassword)) {

			System.out.println(pPassword);
			objAux.getDriver().findElement(txtPassword).sendKeys(pPassword);
			
		}
	}

	public void clicBtnLogin() throws IOException {
		
		objAux.EsperaElemento(objAux.getDriver(), btnLogin);
		objAux.getDriver().findElement(btnLogin).click();
		objAux.AdminDocPdf.generaEvidencia("Se ingresan credenciales",
				Shutterbug.shootPage(objAux.getDriver()).getImage());
		
	}
	
	public void validarElementosLogin() throws IOException {
		objAux.EsperaElemento(objAux.getDriver(), txtUserName);
		objAux.EsperaElemento(objAux.getDriver(), txtPassword);
		objAux.EsperaElemento(objAux.getDriver(), btnLogin);
	}

	/*public void iniciarSesion(String pUser, String pPassword) throws IOException {
		
		
		
		setTxtUserName(pUser);
		setTxtPassword(pPassword);
		clicBtnLogin();
	}*/
	

	public void iniciarSesion( int indicador) throws IOException, InterruptedException {


		System.out.println("LOGIN:");
		try {
			while (objAux.getDriver().findElement(txtUserName).isDisplayed()
					&& objAux.getDriver().findElement(txtPassword).isDisplayed()
					&& objAux.getDriver().findElement(btnLogin).isDisplayed()) {
				validarElementosLogin();
				switch (indicador) {
				case 1:
					setTxtUserName(objAux.obtenerValorProperties("usuario1"));
					break;
				case 2:
					setTxtUserName(objAux.obtenerValorProperties("usuario2"));
					break;
				case 3:
					setTxtUserName(objAux.obtenerValorProperties("usuario3"));
					break;
					
				case 4:
					setTxtUserName(objAux.obtenerValorProperties("usuario4"));
					break;
					
				default:
					setTxtUserName(objAux.getUsuario());
					break;}
				setTxtPassword(objAux.getContrasenia());
				System.out.println("Contraseña");		Thread.sleep(1000);
			    clicBtnLogin();
			    clicBtnLogin();}
		} catch (Exception e) {
			
		}}}
				
					
					
					
			
			

		
		
		

	
	

