package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class My1stTestNgCLass 
{
  @Test
  public void myMethod() 
  {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  
  }
}
