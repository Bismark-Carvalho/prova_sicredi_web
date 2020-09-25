package provasicredi.page;

import provasicredi.core.Methods;

public class FormPage {

	private Methods dsl = new Methods();

	public void writeName(String string) {
		dsl.escrever("//*[@id='field-customerName']", string);

	}

	public void writeLastName(String string) {
		dsl.escrever("//*[@id='field-contactLastName']", string);

	}

	public void writeContactFirstName(String string) {
		dsl.escrever("//*[@id='field-contactFirstName']", string);

	}

	public void writephone(String string) {
		dsl.escrever("//*[@id='field-phone']", string);
	}

	public void writeAddressLine1(String string) {
		dsl.escrever("//*[@id='field-addressLine1']", string);

	}

	public void writeAddressLine2(String string) {
		dsl.escrever("//*[@id='field-addressLine2']", string);

	}

	public void writeCity(String string) {
		dsl.escrever("//*[@id='field-city']", string);

	}

	public void writeState(String string) {
		dsl.escrever("//*[@id='field-state']", string);
	}

	public void writePostalCode(String string) {
		dsl.escrever("//*[@id='field-postalCode']", string);
	}

	public void writeCountry(String string) {
		dsl.escrever("//*[@id='field-country']", string);
	}

	public void selectFromEmployer(String value) {
//		dsl.clicarViaJS("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]");
		
//		dsl.selectByVisibleText("//*[@id='crudForm']/div[11]/label/../div/select", value);
		dsl.selectByValue("//*[@id='crudForm']/div[11]/label/../div/select", "1611");
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
//		dsl.escrever("//*[@id='field_salesRepEmployeeNumber_chosen']/a/span", value);
		
		
	}

	public void writeCreditLimit(String string) {
		dsl.escrever("//*[@id='field-creditLimit']", string);
	}

	public void clickBtnSave() {
		dsl.clicarViaJS("//*[@id='form-button-save']");	
	}

	public void validateSaveForm() {
		dsl.elementExist("//*[@id=\"report-success\"]/p");		
	}

}
