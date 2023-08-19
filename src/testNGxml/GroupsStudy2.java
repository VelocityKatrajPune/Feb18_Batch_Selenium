package testNGxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupsStudy2 {
  @Test(groups = "sanity")
  public void myMethod7()
  {
	  Reporter.log("myMethod7 is running..", true);
  }
  
  @Test
  public void myMethod8()
  {
	  Reporter.log("myMethod8 is running..", true);
  }
  
  @Test(groups = "sanity")
  public void myMethod9()
  {
	  Reporter.log("myMethod9 is running..", true);
  }
  
  @Test(groups = "smoke")
  public void myMethod10()
  {
	  Reporter.log("myMethod10 is running..", true);
  }
  @Test(groups = "sanity")
  public void myMethod11()
  {
	  Reporter.log("myMethod11 is running..", true);
  }
  @Test
  public void myMethod12()
  {
	  Reporter.log("myMethod12 is running..", true);
  }
  
  
}
