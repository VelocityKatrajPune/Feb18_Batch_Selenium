package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class My1stSeleniumCode {

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://neostox.com/sign-in");
	}

}
