package testNGAsserts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsAndNotEquals {
  @Test
  public void a()
  {
	  String s1="Pune";
	  String s2="Pune";
	  String s3="Mumbai";
	  
//	  if(s2.equals(s3))
//	  {
//		  Reporter.log("TC is passed ", true);
//	  }
//	  else {
//		Reporter.log("TC is failed", true);
//	}
	  
	 // Assert.assertEquals(s2, s1,"both not equal TC is failed");
	  
	  Assert.assertNotEquals(s2, s1,"both are equal TC is failed");
	  
	  
	  
  }
}
