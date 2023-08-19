package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	@Parameters("browserName")//chrome
	@Test
  public void testBrowser(String bname) //bname=chrome
  {
	  WebDriver driver = null;
		
	  if(bname.equals("chrome"))
	  {
		   driver= new ChromeDriver();  
	  }
	  else if (bname.equals("fireFox")) 
	 
	 {
		   driver= new FirefoxDriver();
	}
	  
	  
	  driver.get("https://www.policybazaar.com/");
	  
  }
}
