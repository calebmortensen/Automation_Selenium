package testNGReferences;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.Reporter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ScreenCapture extends browser.Browsers {
	// NOTE: takeScreenshot is an OVERLOADED Method
	
	// simply add the following within another class to run ScreenCapture and
	// capture to ./savedImages folder
	// 1. Copy the following to your method:  ScreenCapture.takeScreenshot("RequirementID", "TestCaseID");
	// 2. Add Throws Declaration
	// 3. Modify "RequirementID" & "TestCaseID" accordingly

	
	// Screen Capture & Save Method (WITH Requirement & Test Case Arguments): PREFERRED
	public static String takeScreenshot(String requirement, String testCase) throws Exception {
		String timeStamp;
		File screenShotName;
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		screenShotName = new File("./savedImages/" + timeStamp + ".png");
		FileUtils.copyFile(scrFile, screenShotName);
		// Within test-output folder, open index.html in a browser to view the Test
		// Results in the format below
		Reporter.log(requirement + " " + testCase + " " + screenShotName);

		return requirement + " " + testCase + " " + screenShotName;
	}

	
	// Screen Capture & Save Method (VOID)
	public static void takeScreenshot() throws Exception {
		String timeStamp;
		File screenShotName;
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		screenShotName = new File("./savedImages/" + timeStamp + ".png");
		FileUtils.copyFile(scrFile, screenShotName);
		Reporter.log("ScreenShot: " + screenShotName);

	}

	//Simple sanity Tests below...
	
	
	@Test(priority = 1, description = "Hit Google", groups = "ScreenCapture")
	@Parameters({ "Url" })
	public void LaunchURL(String Url) throws Exception {
		System.out.println("Navigate to URL");
		driver.get(Url);
		Reporter.log("Navigate to URL");
		//NO Requirement & Test Case
		takeScreenshot();
	}

	// Test Method to search Google > Then run 'takeScreenshot' method and save
	// results
	@Test(priority = 2, description = "Search Google", groups = "ScreenCapture")
	public void GoogleCarSearch() throws Exception {
		System.out.println("Test method searching for cars");
		driver.findElement(By.name("q")).sendKeys("Cars");
		driver.findElement(By.name("btnK")).click();
		// Wait for the results to appear
		Thread.sleep(2000);
		//HAS Requirement & Test Case
		Reporter.log("Google Car Search");
		String req = "REQ02";
		String tc = "TC02";
		takeScreenshot(req, tc);
		if (driver.findElement(By.partialLinkText("car")).isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 3, description = "Close Browser", groups = "ScreenCapture")
	public void closeBrowser() {
		System.out.println("Close Browser");
		Reporter.log("Close Browser");
		driver.quit();
	}

}
