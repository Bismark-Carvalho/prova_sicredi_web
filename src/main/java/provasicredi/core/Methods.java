package provasicredi.core;

import static provasicredi.core.DriverManager.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {

	public void clicar(String xpath) {
		elementoExiste(xpath);
		getDriver().findElement(By.id(xpath)).click();
	}

	public void selecionarViaTexto(String xpath, String value) {
		elementoExiste(xpath);
		Select valueSelection = new Select(getDriver().findElement(By.xpath(xpath)));
		valueSelection.selectByVisibleText(value);

	}

	public void clicarViaJS(String xpath) {
		elementoExiste(xpath);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		WebElement element = getDriver().findElement(By.xpath(xpath));
		js.executeScript("arguments[0].click()", element);

	}

	public void escrever(String xpath, String text) {
		elementoExiste(xpath);
		getDriver().findElement(By.xpath(xpath)).sendKeys(text);

	}

	public void elementoExiste(String xpath) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}

	public void clicarViaCssSelector(String cssSelector) {
		getDriver().findElement(By.cssSelector(cssSelector)).click();

	}

	public String recuperarTexto(String xpath) {
		return getDriver().findElement(By.xpath(xpath)).getText();
	}

}
