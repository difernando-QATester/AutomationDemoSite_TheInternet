package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HoversPage {
	
	private WebDriver driver;
	
	private By figure1 = By.xpath("//div[@class='figure'][1]");
	private By figure1username = By.xpath("(//div[@class='figcaption']/h5)[1]");
	
	public HoversPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void hoverFirstUser() {
		WebElement firstuser = driver.findElement(figure1);
		Actions action = new Actions(driver);
		action.moveToElement(firstuser).perform();
	}
	
	public String getFirstUserDetails() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement username1 = wait.until(ExpectedConditions.visibilityOfElementLocated(figure1username));
		return username1.getText();
	}


}
