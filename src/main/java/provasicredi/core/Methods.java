package provasicredi.core;

import static provasicredi.core.DriverManager.getDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {

	public void click(String xpath) {
		getDriver().findElement(By.id(xpath)).click();
	}

	public void selectByVisibleText(String xpath, String value) {
		Select valueSelection = new Select(getDriver().findElement(By.xpath(xpath)));
		valueSelection.selectByVisibleText(value);

	}
	
	public void selectByValue(String xpath, String value) {
		getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Select valueSelection = new Select(getDriver().findElement(By.xpath(xpath)));
		valueSelection.selectByValue(value);

	}
	


	public void clicarViaJS(String xpath) {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		WebElement element = getDriver().findElement(By.xpath(xpath));
		js.executeScript("arguments[0].click()", element);

	}

	public void escrever(String xpath, String text) {
		getDriver().findElement(By.xpath(xpath)).sendKeys(text);

	}

	public void elementExist(String xpath) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));		
	}


}
