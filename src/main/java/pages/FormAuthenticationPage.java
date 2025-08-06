package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormAuthenticationPage {
	
	private WebDriver driver;
	
	private By username = By.id("username");
	private By password = By.id("password");
	private By login = By.xpath("//button[@type='submit']");
	
	public FormAuthenticationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterCrendetials(String Username, String Password) {
		driver.findElement(username).sendKeys(Username);
		driver.findElement(password).sendKeys(Password);
		driver.findElement(login).click();
	}
	

}
