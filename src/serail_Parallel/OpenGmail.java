package serail_Parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenGmail {
  @Test
  public void twit() 
  {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://twitter.com/");
  }
}
