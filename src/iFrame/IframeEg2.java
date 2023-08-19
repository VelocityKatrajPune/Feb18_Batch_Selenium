package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame1");// switching to frame1
		String frame1Text = driver.findElement(By.tagName("body")).getText();
		System.out.println(frame1Text);
		
		//need to switch to frame 2
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		String frame2Text = driver.findElement(By.xpath("/html/body/p")).getText();
		System.out.println(frame2Text);
	}

}
