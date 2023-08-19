package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		// 5. Locator--> linked text
		
	//	driver.findElement(By.linkText("Forgotten account?")).click();
		
		//6.	Locator-->Partial Linked Text
		
		driver.findElement(By.partialLinkText("Forgotten")).click();

	}

}
