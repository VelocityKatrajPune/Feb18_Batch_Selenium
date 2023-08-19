package neoStox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import commonMethods.CommonMethods;

public class CheckAccountBalance {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.neostox.com/");
		driver.manage().window().maximize();
		CommonMethods.implicitWait(driver, 900);
		//click on sign-in button
		driver.findElement(By.xpath("(//a[text()='Sign In'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		//entering mobile number
		driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("9096834216");
		//click on Sign In button
		driver.findElement(By.id("lnk_signup1")).click();
		//launching password page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		//entering password
		driver.findElement(By.id("txt_accesspin")).sendKeys("9247");
		//click on submit button
		driver.findElement(By.id("lnk_submitaccesspin")).click();
		
		//launching home page
		//pop up1 
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='×'])[19]")).click();

		//trial plan pop up
		WebElement trialPlanPopUp = driver.findElement(By.xpath("(//span[text()='×'])[36]"));
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='×'])[36]")).click();
		Thread.sleep(1000);

		WebElement balance = driver.findElement(By.id("lbl_curbalancetop"));
		
		System.out.println("My balance is "+balance.getText());
		
		//logout
		balance.click();
		Thread.sleep(1000);
		driver.findElement(By.id("lnk_logout")).click();
	}

}
