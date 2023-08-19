package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotEg1 {

	public static void main(String[] args) throws IOException {
		
//		double a=10;
//		
//		int b=(int)a;
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://paytm.com/recharge");
		
	
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		
		
		//System.out.println(source);
		
		File dest= new File("D:\\Velocity\\Java Class\\18Feb Morning\\screenShot\\myScreenShot.png");
		
		FileHandler.copy(source, dest);
		
	}

}
