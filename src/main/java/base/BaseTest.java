package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import pages.FormAuthenticationPage;
import pages.HomePage;
import pages.SecureAreaPage;

public class BaseTest {
	
	protected WebDriver driver;
	protected HomePage homepage;
	protected FormAuthenticationPage formauthenticationpage;
	protected SecureAreaPage secureareapage;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		homepage = new HomePage(driver);
		formauthenticationpage = new FormAuthenticationPage(driver);
		secureareapage = new SecureAreaPage(driver);
		
	}

}
