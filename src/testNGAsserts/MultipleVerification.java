package testNGAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleVerification {
  @Test(priority = -1)
  public void userNamePage()
  {
	  String actualUN=null;
	  String expUN="ABC";
	 Assert.assertNotNull(actualUN, "value is null, TC failed");
	 Assert.assertEquals(actualUN, expUN,"Actual and expected are not matching, TC failed");
	  
	  
  }
  
  @Test
  public void passwordPage()
  {
	  
	  String actualPass="123";
	  String expPass="123";
	  
	  Assert.assertNotNull(actualPass, "password is null, TC is failed");
	  Assert.assertEquals(actualPass, expPass,"Actual and expected are not matching, TC failed");
	  
	  
	  
  }
}
