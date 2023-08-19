package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorLocators {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		//CSS-->using Tag and ID-->tag#id
		
//		driver.findElement(By.cssSelector("input#email")).sendKeys("Hello");
//		driver.findElement(By.cssSelector("input#pass")).sendKeys("Bye");
	
		//CSS--> using Tag and Class-->tag.class
		
		//driver.findElement(By.cssSelector("a._97w4")).click();
		
		//CSS-->Tag and Attribute-->tag[attribute=value]
		
		driver.findElement(By.cssSelector("input[name=email]")).sendKeys("Hello");
		
		//CSS-->Tag, Class, and Attribute-->tag.class[attribute=value]
		driver.findElement(By.cssSelector("input.inputtext[id=pass]")).sendKeys("Bye");

	
	}

}
