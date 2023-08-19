package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) 
	{
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/contact-us");
		driver.manage().window().maximize();
		String myUrl = driver.getCurrentUrl();
		
		System.out.println("My Url is "+myUrl);

		System.out.println(driver.getPageSource());
		
	
		
		
	}

}
