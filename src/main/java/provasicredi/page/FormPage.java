package provasicredi.page;

import static org.junit.Assert.assertEquals;

import provasicredi.core.Methods;

public class FormPage {

	private Methods dsl = new Methods();

	public void escreverCampoName(String string) {
		dsl.escrever("//*[@id='field-customerName']", string);

	}

	public void escreverCampoLastName(String string) {
		dsl.escrever("//*[@id='field-contactLastName']", string);

	}

	public void escreverCampoContactFirstName(String string) {
		dsl.escrever("//*[@id='field-contactFirstName']", string);

	}

	public void escreverCampoPhone(String string) {
		dsl.escrever("//*[@id='field-phone']", string);
	}

	public void escreverCampoAddressLine1(String string) {
		dsl.escrever("//*[@id='field-addressLine1']", string);

	}

	public void escreverCampoAddressLine2(String string) {
		dsl.escrever("//*[@id='field-addressLine2']", string);

	}

	public void escreverCampoCity(String string) {
		dsl.escrever("//*[@id='field-city']", string);

	}

	public void escreverCampoState(String string) {
		dsl.escrever("//*[@id='field-state']", string);
	}

	public void escreverCampoPostalCode(String string) {
		dsl.escrever("//*[@id='field-postalCode']", string);
	}

	public void escreverCampoCountry(String string) {
		dsl.escrever("//*[@id='field-country']", string);
	}

	public void selecionarCampoFromEmployer(String value) {
		dsl.clicarViaCssSelector("#field_salesRepEmployeeNumber_chosen > a > span");
		dsl.escrever("//*[@autocomplete='off']", value);
		dsl.clicarViaCssSelector("#field_salesRepEmployeeNumber_chosen > div > ul > li > em");

	}

	public void escreverCampoCreditLimit(String string) {
		dsl.escrever("//*[@id='field-creditLimit']", string);
	}

	public void clicarBtnSave() {
		dsl.clicarViaJS("//*[@id='form-button-save']");
	}

	public void validarMsgSucesso() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String recuperarTexto = dsl.recuperarTexto("//*[@id='report-success']/p");
		assertEquals("Your data has been successfully stored into the database. Edit Customer or Go back to list",
				recuperarTexto);
	}

}
