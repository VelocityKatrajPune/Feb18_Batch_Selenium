package popUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		driver.findElement(By.name("NewTab")).click();
		Thread.sleep(1000);
		String singleWindowID = driver.getWindowHandle();
		System.out.println("ID is "+singleWindowID);
		System.out.println("=========================================");
		Set<String> allWindowID = driver.getWindowHandles();
		for(String a:allWindowID)
		{
			System.out.println(a);
		}
		
		
		//
		
	}

}
