package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement textBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		
		System.out.println(textBox.isDisplayed());
		
		WebElement hideButton = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		WebElement showButton = driver.findElement(By.xpath("//input[@id='show-textbox']"));
		//sending keys in textBox when it is displayed
	//	textBox.sendKeys("Good morning");
		
		// Hiding the text box and trying to send keys
		
//		hideButton.click();//clicking on hide button
//		textBox.sendKeys("Good Evening");// unable to write text as element is hidden on UI
		
		
		hideButton.click();//hiding text box
		if(textBox.isDisplayed())
		{
			System.out.println("text box is displayed");
			textBox.sendKeys("Hi");
		}
		else 
		{
			System.out.println("text box is not displayed");
		}
		
		
	}

}
