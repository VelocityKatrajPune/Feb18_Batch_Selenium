package testNGAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueAndFalse {
  @Test
  public void a()
  {
	  
	  boolean x=true;
	  boolean y=false;
	  
	 // Assert.assertTrue(x,"value is false TC is failed");
	  
	  Assert.assertFalse(x,"value is true TC is failed");
  }
}
