package provasicredi.page;

import provasicredi.core.Methods;

public class DashBoardPage {

	private Methods dsl = new Methods();

	public void selectVersionBootstrapV4() {
		dsl.selectByVisibleText("//*[@id='switch-version-select']", "Bootstrap V4 Theme");

	}

	public void clickAddCustomer() {
		dsl.clicarViaJS("//*[@href='/demo/bootstrap_theme_v4/add']");
	}

	
	
	
}
