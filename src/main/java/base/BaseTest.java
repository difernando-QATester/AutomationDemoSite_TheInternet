package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.DynamicLoadingEx1Page;
import pages.DynamicLoadingPage;
import pages.FormAuthenticationPage;
import pages.HomePage;
import pages.HoversPage;
import pages.JavaScriptAlertsPage;
import pages.SecureAreaPage;

public class BaseTest {
	
	protected WebDriver driver;
	protected HomePage homepage;
	protected FormAuthenticationPage formauthenticationpage;
	protected SecureAreaPage secureareapage;
	protected JavaScriptAlertsPage javascriptalertspage;
	protected DynamicLoadingPage dynamicloadingpage;
	protected DynamicLoadingEx1Page dynamicloadingex1page;
	protected HoversPage hoverspage;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		homepage = new HomePage(driver);
		formauthenticationpage = new FormAuthenticationPage(driver);
		secureareapage = new SecureAreaPage(driver);
		javascriptalertspage = new JavaScriptAlertsPage(driver);
		dynamicloadingpage = new DynamicLoadingPage (driver);
		dynamicloadingex1page = new DynamicLoadingEx1Page(driver);
		hoverspage = new HoversPage(driver);
	}
	@AfterMethod
	public void closeDown() {
		//driver.close();
	}

}
