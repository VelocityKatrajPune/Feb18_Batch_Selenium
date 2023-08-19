package verificationUsingTestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ValidateUrl {
  @Test
  public void validateUrlName() 
  {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.naukri.com/");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  String actualUrl = driver.getCurrentUrl();
	  String expectedUrl="https://www.naukri1.com/";
	  
	  if(actualUrl.equals(expectedUrl))
	  {
		  Reporter.log("Actual and Expected url are matching TC is passed", true);
	  }
	  else 
	  {
		  Reporter.log("Actual and Expected url are not matching TC is failed", true);

	}
	  
	  
	  
  }
}
