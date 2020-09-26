package provasicredi.page;

import static org.junit.Assert.assertEquals;

import provasicredi.core.Methods;

public class DashBoardPage {

	private Methods dsl = new Methods();

	public void selecionaVersaoBootstrapV4() {
		dsl.selecionarViaTexto("//*[@id='switch-version-select']", "Bootstrap V4 Theme");
	}

	public void clicarAddCustomer() {
		dsl.clicarViaJS("//*[@href='/demo/bootstrap_theme_v4/add']");
	}

	public void pesquisarCampoSearchName(String texto) {
		dsl.escrever("//input[@placeholder='Search Name']", texto);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void selecionarCheckBox() {
		dsl.clicarViaJS("//input[@type='checkbox' and @class='select-row']");

	}
	
	public void validarTelaConfirmacaoExclusao() {
		String texto = dsl.recuperarTexto("//p[contains(text(), 'Are you sure that you want to delete this 1 item?')]");
		assertEquals("Are you sure that you want to delete this 1 item?", texto);

	}

	public void clicarDelete() {
		dsl.clicarViaJS("//input[@type='checkbox' and @class='select-all-none']/../../../td[2]/div/a/span");
	}

	public void confirmarDelete() {
		try {
			Thread.sleep(2000);
			dsl.clicarViaJS("//button[@class='btn btn-danger delete-multiple-confirmation-button']");
		} catch (InterruptedException e) {
			e.getStackTrace();
			
		}

	}

	public void validarMsgExclusaoSucesso() {
		dsl.elementoExiste("//*[text()[contains(.,'Your data has been successfully deleted from the database.')]]");
	}

}
