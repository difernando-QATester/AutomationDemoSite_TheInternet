package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class DynamicLoadingEx1Test extends BaseTest {
	
	@Test
	public void handleEx1() {
		homepage.navigateToDynamicLoadings();
		dynamicloadingpage.navigateToEx1();
		String actualvalue = dynamicloadingex1page.Start();
		String expectedvalue = "Hello World!";
		System.out.println("Actual value is " + actualvalue);
		Assert.assertEquals(actualvalue, expectedvalue);
		
		
	}

}
