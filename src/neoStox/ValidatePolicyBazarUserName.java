package neoStox;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commonMethods.CommonMethods;

public class ValidatePolicyBazarUserName {

	public static void main(String[] args) throws InterruptedException
	{
		//using chrome Options for disabling notifications
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		
		CommonMethods.implicitWait(driver, 900);
		
		//click on signIn Button
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		Thread.sleep(1000);
		//enter mobile num
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("9623153925");
		
		//click on Sign In with password
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
	
		Thread.sleep(1000);
		// enter password
		driver.findElement(By.name("password")).sendKeys("raju@2811");
		
		//click on signInButton
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		CommonMethods.implicitWait(driver, 1000);
		
		//now we are on home page
		// move o myAccount
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[text()='My Account']")).click();
		Thread.sleep(1000);
		//click on my profile
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		//new window will be opened, we need to switch focus to new window
		Set<String> allId = driver.getWindowHandles();
		//convert set to list
		List<String>l= new ArrayList<>(allId);
		
		String mainPageID = l.get(0);// main page ID
		String childPageID = l.get(1);//child page ID

		//switch to child page id
		
		driver.switchTo().window(childPageID);
		
		Thread.sleep(1000);
		
		String expResult="Rajashri Kadam";
		
		String actualResult = driver.findElement(By.xpath("//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']")).getText();
	
		if(expResult.equals(actualResult))
		{
			System.out.println("Actual and expected results are matching TC is Passed");
		}
	else 
		{
			System.out.println("Actual and expected results are not-matching TC is Failed");
		}
	

	}

}
