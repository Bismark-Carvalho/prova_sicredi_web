package provasicredi.test;

import static provasicredi.core.DriverManager.getDriver;
import static provasicredi.core.DriverManager.killDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import provasicredi.page.DashBoardPage;
import provasicredi.page.FormPage;

public class Desafio1Test {

	private DashBoardPage dashBoardPage = new DashBoardPage();
	private FormPage formPage = new FormPage();
	
	@Before
	public void setup() {
		getDriver().get("https://www.grocerycrud.com/demo/bootstrap_theme");
	}

	@After
	public void tearDown() {
		killDriver();
	}

	@Test
	public void deveCadastrarUsuario() {
		dashBoardPage.selectVersionBootstrapV4();
		dashBoardPage.clickAddCustomer();
		formPage.writeName("Teste Sicredi");
		formPage.writeLastName("Teste");
		formPage.writeContactFirstName("Bismark");
		formPage.writephone("51 9999-9999");
		formPage.writeAddressLine1("Av Assis Brasil, 3970");
		formPage.writeAddressLine2("Torre D");
		formPage.writeCity("Porto Alegre");
		formPage.writeState("RS");
		formPage.writePostalCode("91000-000");
		formPage.writeCountry("Brasil");
		formPage.selectFromEmployer("Fixter");
		formPage.writeCreditLimit("200");
		formPage.clickBtnSave();
		formPage.validateSaveForm();
	}

}
