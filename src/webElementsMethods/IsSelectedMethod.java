package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='radio1']"));
	
		//System.out.println(radioButton.isSelected());// verifying radio button is selected or not
		
		radioButton.click();
		
		if(radioButton.isSelected())
		{
			System.out.println("radio Button is already selected");
		}
		else
		{
			System.out.println("Selecting radio button");
			radioButton.click();
		}
		
		
		
		
	
	}

}
