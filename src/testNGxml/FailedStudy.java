package testNGxml;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedStudy {
  @Test
  public void myMethod1()
  {
	  Reporter.log("myMethod1 is running..", true);
  }
  
  @Test
  public void myMethod2()
  {
	  Reporter.log("myMethod2 is running..", true);
  }
  
  @Test
  public void myMethod3()
  {
	  Reporter.log("myMethod3 is running..", true);
  }
  
  @Test
  public void myMethod4()
  {
	 Assert.fail();
	  Reporter.log("myMethod4 is running..", true);
  }
  @Test
  public void myMethod5()
  {
	  Reporter.log("myMethod5 is running..", true);
  }
  @Test
  public void myMethod6()
  {
	  
	  Reporter.log("myMethod6 is running..", true);
  }
  
  
}
