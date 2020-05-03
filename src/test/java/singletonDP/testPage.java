package singletonDP;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testPage {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		testSingleton.initialize();
	}
	
	@Test
	public void test1() {
		
		String titleVal= testSingleton.driver.getTitle();
		System.out.println(titleVal);
		Assert.assertEquals(titleVal, "www.google.com");
	}
	
	@AfterMethod
	public void tearDown() {
		testSingleton.quit();
	}
	

}
