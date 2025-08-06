package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class FormAuthenticationTest extends BaseTest {
	
	@Test
	public void validateLogin() {
		homepage.navigateToFormAuthentication();
		formauthenticationpage.enterCrendetials("tomsmith", "SuperSecretPassword!");
		
		String actualMsg = secureareapage.getSuccessMsg().trim();
		String expectedMsg = "You logged into a secure area!";
		
		Assert.assertTrue(actualMsg.contains(expectedMsg),"Login Faild");
		System.out.println("Successfully Login and login message is " + actualMsg);
		
		
		
	}
		
}
