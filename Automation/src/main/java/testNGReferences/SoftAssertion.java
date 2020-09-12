package testNGReferences;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	SoftAssert softAssert = new SoftAssert(); //Creates import above
	SoftAssert softAssert2 = new SoftAssert();
	String className = "SoftAssertion";
	
	@Test(priority = 1)
	public void test1_UsingSoftAssertion() {
		softAssert.assertTrue(true == false, "ERROR: They DON'T MATCH!!!");
		softAssert.assertFalse(true == true, "ERROR: They MATCH");
		softAssert.assertEquals("SoftAssert", "SoftAssertion", "ERROR: THEY DO NOT Match!");  // This will fail, but the tests will continue.
		softAssert.assertEquals(className, "SoftAssertion");
		System.out.println("Last statement gets executed!!!");
		softAssert.assertAll(); //Have to use this class otherwise the failure won't display
	}

	
	@Test(priority = 2)
	public void test2_UsingSoftAssertion() {
		softAssert2.assertTrue(true == true);
		softAssert2.assertEquals("SoftAssertion", "SoftAssertion");
		softAssert2.assertEquals(className, "SoftAssertion");
		System.out.println("Last statement executed!!!");
		softAssert2.assertAll();
	}
}
