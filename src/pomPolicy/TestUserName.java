package pomPolicy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonMethods.CommonMethods;

public class TestUserName {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		CommonMethods.implicitWait(driver, 1000);
		
		
		//create object of LoginPage
		
		LoginPage login= new LoginPage(driver);
		login.clickOnHomePageSignInButton();
		Thread.sleep(500);
		login.enterMobileNum();
		Thread.sleep(500);
		login.clickOnSignInWithPassword();
		Thread.sleep(500);
		login.enterPassword();
		Thread.sleep(500);
		login.clickOnSignInButton();
		Thread.sleep(500);
		login.clickOnMyAccountButton();
		Thread.sleep(500);
		login.clickOnMyProfileButton();
		
		//new tab will be opened, we need to switch to new tab
		
		Set<String> allID = driver.getWindowHandles();
		List<String> al= new ArrayList<>(allID);
		
		//switching focus to myAccount page
		driver.switchTo().window(al.get(1));
		
		//create object of myAccountPage class
		Thread.sleep(500);
		MyAccountPage myAcc= new MyAccountPage(driver);
		myAcc.validateUserName();
		
		driver.quit();
		
	}

}
