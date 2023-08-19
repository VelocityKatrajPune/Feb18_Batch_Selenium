package testNGAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Study {
 
	@BeforeMethod
	public void liginToPolicyBazaar()
	{
		System.out.println("Login to application");
	}
	
	
	
	@AfterMethod
	public void logoutFromApplication()
	{
		System.out.println("Looging out....");
	}
	
	@Test
	public void validateGender()
	{
		System.out.println("ValidateGender");
	}
	@Test
	  
	public void validateUserName()
	  {
			System.out.println("validateUserName");
		  
	  }
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("LaunchBrowser and open url");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Close Browser");
	}
	
}
