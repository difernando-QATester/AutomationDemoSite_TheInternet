package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	private By FormAuthentication = By.linkText("Form Authentication");
	private By alert = By.linkText("JavaScript Alerts");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateToFormAuthentication() {
		driver.findElement(FormAuthentication).click();
	}
	
	public void navigateToAlerts() {
		driver.findElement(alert).click();
	}

}
