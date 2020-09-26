package provasicredi.test;

import static provasicredi.core.DriverManager.getDriver;
import static provasicredi.core.DriverManager.killDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import provasicredi.page.DashBoardPage;
import provasicredi.page.FormPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DesafioTest {

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
		dashBoardPage.selecionaVersaoBootstrapV4();
		dashBoardPage.clicarAddCustomer();
		formPage.escreverCampoName("Teste Sicredi");
		formPage.escreverCampoLastName("Teste");
		formPage.escreverCampoContactFirstName("Bismark");
		formPage.escreverCampoPhone("51 9999-9999");
		formPage.escreverCampoAddressLine1("Av Assis Brasil, 3970");
		formPage.escreverCampoAddressLine2("Torre D");
		formPage.escreverCampoCity("Porto Alegre");
		formPage.escreverCampoState("RS");
		formPage.escreverCampoPostalCode("91000-000");
		formPage.escreverCampoCountry("Brasil");
		formPage.selecionarCampoFromEmployer("Fixter");
		formPage.escreverCampoCreditLimit("200");
		formPage.clicarBtnSave();
		formPage.validarMsgSucesso();
	}

	@Test
	public void deveDeletarUsuario() {
		dashBoardPage.pesquisarCampoSearchName("Teste Sicredi");
		dashBoardPage.selecionarCheckBox();
		dashBoardPage.clicarDelete();
		dashBoardPage.validarTelaConfirmacaoExclusao();
		dashBoardPage.confirmarDelete();
		dashBoardPage.validarMsgExclusaoSucesso();

	}

}
