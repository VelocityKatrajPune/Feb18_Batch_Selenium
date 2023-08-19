package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySBITitle {

	public static void main(String[] args) 
	{
		
		String expectedTitle="SBI - Loans, Accounts, Cards, Investment, Deposits, Net Banking - Personal Banking";
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.sbi.co.in/");
		String actualTitle = driver.getTitle();
		System.out.println("Expected Title is "+expectedTitle);
		System.out.println("Actual Title is "+actualTitle);
		if (expectedTitle.equals(actualTitle)) 
		{
			System.out.println("Expected and Actual Title are matching & TC is Passed ");
			
		} 
		else
		{
			System.out.println("Expected and Actual Title are not matching & TC is Failed ");

		}
		
		
		

	}

}
