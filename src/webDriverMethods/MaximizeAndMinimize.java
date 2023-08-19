package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeAndMinimize {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://business.phonepe.com/login");
		
		
		driver.manage().window().maximize();
		
		driver.manage().window().minimize();
	}

}
