package testNGAnnotation;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOn
{
  @Test(dependsOnMethods = "enterPassword", priority = -10)
  public void login() 
  {
	  Reporter.log("Login sucess...", true);
  }
  
  @Test
  public void enterPassword()
  {
	 //Assert.fail();
	  Reporter.log("enter password ", true);
	  
  }
}
