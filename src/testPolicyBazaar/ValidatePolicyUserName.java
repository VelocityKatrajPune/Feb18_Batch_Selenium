package testPolicyBazaar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.batik.anim.timing.Trace;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pomPolicyBazaar.LoginPage;
import pomPolicyBazaar.MyAccountPage;
import utilityPolicyBazaar.Utility;

public class ValidatePolicyUserName extends Base 
{
	LoginPage login;
	MyAccountPage myAcc;
	String TCID="PB_TC_1234";
	
	
	@BeforeClass
	public void launchPolicyBazaar() throws InterruptedException
	{
		Utility.wait(100);
		launchBrowser();
		login= new LoginPage(driver);
		myAcc= new MyAccountPage(driver);
	}
	
	@BeforeMethod
	public void signInToPolicyBazaar() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Utility.wait(1000);
		login.clickOnHomePageSignInButton();
		Utility.wait(1000);
		login.enterMobileNum(Utility.readDataFromExcel(0, 0));
		Utility.wait(1000);
		login.clickOnSignInWithPassword();
		Utility.wait(1000);
		login.enterPassword(Utility.readDataFromExcel(0, 1));
		Utility.wait(1000);
		login.clickOnSignInButton();
		Utility.wait(1000);
		login.clickOnMyAccountButton();
		Utility.wait(1000);
		login.clickOnMyProfileButton();
		Utility.wait(1000);
		
		Set<String> allPageID = driver.getWindowHandles();
		List<String>l= new ArrayList<>(allPageID);
		String mainPageID = l.get(0);
		String childPageID = l.get(1);
		
		driver.switchTo().window(childPageID);
		Reporter.log("switching to child page", true);
		Utility.wait(200);
	}
	
	
	@Test
  public void validateUserName() throws EncryptedDocumentException, IOException, InterruptedException 
  {
		Utility.wait(1000);
		String actualUN = myAcc.getActualUserName();
		String expUN = Utility.readDataFromExcel(0, 2);
		
		Assert.assertEquals(actualUN,expUN,"TC is failed actual and expected are not matching");
		Utility.takeScreenShot(driver, actualUN+" "+TCID);
  
  }
	
	@AfterMethod
	public void logoutFromPolicyBazaar()
	{
		myAcc.clickOnLogOutButton();
	}
	
	@AfterClass
	public void closePoilicyBazaar() throws InterruptedException
	{
		closeBrowser();
	}
	
}
