package pomPolicyUsingTestNGUsingExcel;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonMethods.CommonMethods;

public class ValidatePolicyUserNameUsingDataProvider {
  
	WebDriver driver;
	LoginPage login;
	MyAccountPage myacc;
	
		
	@BeforeMethod
	public void loginToPolicyBazaar() throws EncryptedDocumentException, IOException
	{
		
		driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		login=new LoginPage(driver);
		myacc= new MyAccountPage(driver);
	}
	
	@Test(dataProvider = "policyBazaarData", dataProviderClass =PolicyDataProvider.class)
  public void verifyUserName(String mobNum, String pwd, String expUN)  
	{
		CommonMethods.implicitWait(driver, 1000);
		login.clickOnHomePageSignInButton();
		CommonMethods.implicitWait(driver, 1000);
		login.enterMobileNum(mobNum);
		CommonMethods.implicitWait(driver, 1000);
		login.clickOnSignInWithPassword();
		CommonMethods.implicitWait(driver, 1000);
		login.enterPassword(pwd);
		CommonMethods.implicitWait(driver, 1000);
		login.clickOnSignInButton();
		CommonMethods.implicitWait(driver, 1000);
		login.clickOnMyAccountButton();
		CommonMethods.implicitWait(driver, 1000);
		login.clickOnMyProfileButton();
		CommonMethods.implicitWait(driver, 1000);
		Set<String> allWindowID = driver.getWindowHandles();
		List<String>id= new ArrayList<>(allWindowID);
		
		//switching focus to child page
		
		driver.switchTo().window(id.get(1));
		CommonMethods.implicitWait(driver, 1000);
	String expectedUN=expUN;
	String actualUN = myacc.getActualUserName();
	
	Assert.assertEquals(actualUN, expectedUN,"TC failed, actual and expected UN not matching");
	
	}
	
	@AfterMethod
	public void logOutFromPolicyBazaar() throws InterruptedException
	{
		CommonMethods.implicitWait(driver, 1000);
		myacc.clickOnLogOutButton();
		Thread.sleep(9000);
		driver.quit();
	}
	
	
}
