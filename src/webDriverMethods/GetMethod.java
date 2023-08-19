package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		
		//1. get- to enter url in browser or to open an application.
		driver.get("https://vctcpune.com/");
		
		//2.to close the current tab of the browser opened by Selenium tool
		driver.close();
		
		
	}

}
