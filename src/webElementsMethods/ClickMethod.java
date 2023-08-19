package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickMethod {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		//driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@id='loginbutton']"));
	
		loginbutton.click();
	
	}

}
