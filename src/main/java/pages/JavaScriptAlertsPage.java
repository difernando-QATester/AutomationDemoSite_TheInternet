package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {

	private WebDriver driver;

	private By jsalert = By.xpath("//button[@onclick='jsAlert()']");
	private By jsconfirm = By.xpath("//button[@onclick='jsConfirm()']");
	private By jsprompt = By.xpath("//button[@onclick='jsPrompt()']");
	private By alertresult = By.id("result");

	public JavaScriptAlertsPage(WebDriver driver) {
		this.driver = driver;
	}

	public String handleJsAlert() {
		driver.findElement(jsalert).click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
        return alertText;
       
	}
	
	public void jsAlerResult() {
		String result = driver.findElement(alertresult).getText();
		System.out.println(result);
	}

	public void handleJsConfirm() {
		driver.findElement(jsconfirm).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void jsConfirmAlerResult() {
		String result = driver.findElement(alertresult).getText();
		System.out.println(result);
	}

	public void hanldeJsPrompt(String text) {
		driver.findElement(jsprompt).click();
		Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();
	}
	
	public void jspromptAlerResult() {
		String result = driver.findElement(alertresult).getText();
		System.out.println(result);
	}

}
