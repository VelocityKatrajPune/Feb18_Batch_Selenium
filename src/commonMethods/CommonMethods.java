package commonMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonMethods 
{

	//wait
	public static  void implicitWait(WebDriver driver, long waitTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
	}
	
	
	public static  void wait(int waitTime) throws InterruptedException
	{
		Thread.sleep(waitTime*1000);
	}
	
	//screenshot
	
	public static void captureScreenShot(WebDriver driver,String fileName) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\Velocity\\Java Class\\18Feb Morning\\screenShot\\"+fileName+".png");
		FileHandler.copy(src, dest);
	}
	
	//scrolling 
	public static void scrollIntoView(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element );
	}

	//readDataFromExcel
	
	public static String readDataFromExcel(int rowNum, int cellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile= new FileInputStream("D:\\Velocity\\Java Class\\18Feb Morning\\18FebExcelTest.xlsx");
		
		String value = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(rowNum).getCell(cellNum).getStringCellValue();
		
		return value;
		
	}
	
}
