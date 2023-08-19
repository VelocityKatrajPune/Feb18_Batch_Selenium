package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivPopUP {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("I phone 14");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}

}
