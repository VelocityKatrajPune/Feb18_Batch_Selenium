package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotEg2 {

	public static void main(String[] args) throws IOException 
	{
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://paytm.com/recharge");
		driver.manage().window().maximize();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(3);
		File dest= new File("D:\\Velocity\\Java Class\\18Feb Morning\\screenShot\\testScreenShot"+random+".png");
		FileHandler.copy(src, dest);

	}

}
