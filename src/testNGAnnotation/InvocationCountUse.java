package testNGAnnotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountUse {
  

	@Test(invocationCount = 5)
  public void busBooking() 
  {
	  Reporter.log("busBooking is running", true);
  }
	
	
	
}
