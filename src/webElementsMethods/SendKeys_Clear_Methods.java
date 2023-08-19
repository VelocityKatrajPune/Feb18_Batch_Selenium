package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Clear_Methods {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://paytm.com/recharge");
//		
//		driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("9421357890");
//	
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("yjoshi02@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Velocity");
		//driver.findElement(By.xpath("//input[@name='email']")).clear();

		
		
		
	}

}
