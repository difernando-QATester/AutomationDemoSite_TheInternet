package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingEx1Page {

	private WebDriver driver;

	private By startbtn = By.xpath("//div[@id='start']/button");
	private By loading = By.id("loading");
	private By textresult = By.id("finish");

	public DynamicLoadingEx1Page(WebDriver driver) {
		this.driver = driver;
	}

	public String Start() {
		driver.findElement(startbtn).click();
		// Explicit wait - AJAX based content(not loading initially. but once click Start btn, its load only without refreshing the whole page).
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
		return driver.findElement(textresult).getText();

	}

}
