package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
//		Thread.sleep(1000);
//		WebElement getOTPbutton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
//
//		boolean result = getOTPbutton.isEnabled();
//		
//		System.out.println("Get OTP button status is "+result);
//		
//		getOTPbutton.click();
		
		driver.get("https://demoqa.com/radio-button");
		Thread.sleep(1000);
		
		WebElement radioButton = driver.findElement(By.xpath("//input[@id='noRadio']"));
		
		System.out.println(radioButton.isEnabled());
		
		if(radioButton.isEnabled())
		{
			System.out.println("Radio button is enabled");
		}
		else 
		{
			System.out.println("Radio button is not enabled");
			
		}
		
		radioButton.click();
		
	}

}
