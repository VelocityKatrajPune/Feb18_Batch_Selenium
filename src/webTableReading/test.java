package webTableReading;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://coinmarketcap.com/currencies/bitcoin/?period=7d");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		int numberOfRows = driver.findElements(By.xpath("//table[@class='sc-dba2d818-3 jMniDf cmc-table  ']//tr")).size();
		
		
		System.out.println("Total number of rows "+numberOfRows);
		
		int numberOfColumns = driver.findElements(By.xpath("//table[@class='sc-dba2d818-3 jMniDf cmc-table  ']//tr[1]//th")).size();
		System.out.println("Total number of columns "+numberOfColumns);
		
		//this is for header
		
		for(int i=1;i<=numberOfColumns;i++)
		{
			String header = driver.findElement(By.xpath("//table[@class='sc-dba2d818-3 jMniDf cmc-table  ']//thead//tr[1]//th["+i+"]")).getText();
			System.out.print(header+" ");
			//System.out.println(i);
		}
		System.out.println();
		//for others
		for(int i=1;i<=numberOfRows-1;i++)
		{
			for(int j=1;j<=numberOfColumns;j++)
			
			{
			
				
				String data = driver.findElement(By.xpath("//table[@class='sc-dba2d818-3 jMniDf cmc-table  ']//tbody//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(data+" ");
			}
			System.out.println();
		}
		
		
	}

}
