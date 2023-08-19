package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateNaukriText {

	public static void main(String[] args) throws InterruptedException {
		
		//expected text--> from requirement document
		String expText="Find your dream job now";
		
		//I want actual text
		// to get actual text from webPage--> use getText() method
		// use if else--> to compare text and print result
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		String actualText = driver.findElement(By.xpath("//h1[@class='qsb-title']")).getText();
		
		if(expText.equals(actualText))
		{
			System.out.println("Actual and Expected text are Matching and TC is Passed");
		}
		else {
			System.out.println("Actual and Expected text are not Matching and TC is Failed");

		}
		

	}

}
