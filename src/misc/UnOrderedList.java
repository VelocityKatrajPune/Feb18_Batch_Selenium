package misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderedList {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//search something in google search bar
		
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(100);
		
		List<WebElement> searchResults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	
		for(WebElement sr:searchResults)
		{
			System.out.println(sr.getText());
		}
	
		for(WebElement sr:searchResults)
		{
			String expectedResult="honda city";
			Thread.sleep(100);
			if(expectedResult.equals(sr.getText()))
			{
				sr.click();
				break;
			}
			
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.linkText("Images")).click();
	
	}

}
