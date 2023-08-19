package commonMethods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCoomonMethods {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://paytm.com/");
		
		CommonMethods.implicitWait(driver, 900);
		
		WebElement cashBackSection = driver.findElement(By.xpath("//h1[text()='Unlimited Cashback']"));
		
		
		CommonMethods.scrollIntoView(driver, cashBackSection);
		
		CommonMethods.captureScreenShot(driver, "MyPaytmTest2");
		
		String myValue = CommonMethods.readDataFromExcel(0, 1);
		
		System.out.println(myValue);
		
		System.out.println(CommonMethods.readDataFromExcel(0, 0));

	}

}
