package testNGxml;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing {
  @Test
  public void a()
  {
	  Assert.fail();
	  Reporter.log("a is running....", true);
  }
  @Test
  public void b()
  {
	  Reporter.log("b is running....", true);
  }
  @Test
  public void c()
  {
	  Reporter.log("c is running....", true);
  }
}
