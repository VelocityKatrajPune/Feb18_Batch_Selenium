package testNGAsserts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
  @Test
  public void userNamePage() 
  {
	  
	  String actualUN=null;
	  String expUN="abc";
	  
	  SoftAssert s= new SoftAssert();
	  
	  
	  s.assertNotNull(actualUN, "UN is null, TC is failed");
	 
	  s.assertEquals(actualUN, expUN,"Actual and expected are not matching TC is failed");

	  s.assertAll();
  
  }
}
