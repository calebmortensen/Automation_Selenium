package testNGReferences;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

	String className = "HardAssertion";
	
	@Test
	public void test_UsingHardAssertion(){
		
		Assert.assertTrue(true == true);
		Assert.assertEquals("HardAssertion", "HardAssertion"); // If one of these doesn't pass, the rest of the tests won't execute
		Assert.assertEquals(className, "HardAssertion");
		System.out.println("Results: All Tests Passed!");
	}
}
