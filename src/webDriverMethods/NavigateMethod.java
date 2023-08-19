package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		
	//	driver.get("https://paytm.com/");
		
		driver.manage().window().maximize();
		
	//	driver.get("https://www.facebook.com/login/");
		
		//. navigate().to(): this method is use to open an application
		driver.navigate().to("https://www.facebook.com/login/");
		
		driver.navigate().to("https://paytm.com/");

		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
	}

}
