package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class HoversTest extends BaseTest{
	
	@Test
	public void hoverOver() {
		
		homepage.navigateToHovers();
		hoverspage.hoverFirstUser();
		hoverspage.getFirstUserDetails();
		String actualuserdetails = hoverspage.getFirstUserDetails();
		String expecteduserdetails = "name: user1";
		Assert.assertEquals(expecteduserdetails, actualuserdetails);
		System.out.println("Actual user details: " + actualuserdetails);
		
		
	}

}
