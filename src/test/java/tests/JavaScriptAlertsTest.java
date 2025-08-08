package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class JavaScriptAlertsTest extends BaseTest {
	
	protected WebDriver driver;
	
	@Test(priority = 1)
	public void testJsAlertText() {
                
        String actualAlertText = javascriptalertspage.handleJsAlert();
        String expectedAlertText = "I am a JS Alert";
        Assert.assertTrue(actualAlertText.contains(expectedAlertText) , "Alert is wrong");
        System.out.println("Actual alert text is: " + actualAlertText);
        javascriptalertspage.jsAlerResult();
    }
	
	@Test(priority = 2)
	public void testJsAlertConfirm() {
		javascriptalertspage.handleJsConfirm();
		javascriptalertspage.jsConfirmAlerResult();
				
	}
	
	@Test(priority = 3)
	public void testJsAlertPrompt() {
		javascriptalertspage.hanldeJsPrompt("I'm DIlki");
		javascriptalertspage.jspromptAlerResult();
	}

}
