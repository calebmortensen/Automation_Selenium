package Jenkins;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testNGReferences.ScreenCapture;

public class JENKINS_LoginLogout extends browser.Browsers{


	@Test(priority = 1, description = "JENKINS_Launch", groups = "JENKINS")
	@Parameters({ "Url" })
	public void JENKINS_Launch(String Url) throws Exception {

		 driver.get(Url);
		 String req = "REQ01";
		 String tc = "TC01";
		 ScreenCapture.takeScreenshot(req, tc);

	}
	
	@Test(priority = 2, description = "Jenkins_LoggedInCheck", groups = "JENKINS")
	public void JENKINSLoggedInCheck() throws Exception {
		System.out.println("Check if user is currently logged in: ");
		
		try {
		    assertEquals(driver.findElement(By.xpath("//b[contains(text(),'log out')]")).getText(), "log out");
		    //If the message is displayed
		    System.out.println("User is logged in Already, thus wiping cookies FAILED - proceed to logout");
		    JENKINSLogout();

		} catch (Exception e) {
		    //If the message is not displayed
		    System.out.println("User is NOT logged in as expected, thus proceed to next Method in TestNG XML");
		     String req = "REQ02";
			 String tc = "TC02";
			 ScreenCapture.takeScreenshot(req, tc);
	    
		}
			 
	}
	

	@Test(priority = 3, description = "JENKINS_Login", groups = "JENKINS")
	@Parameters({ "Username", "Password" })
	public void JENKINSLogin(String Username, String Password) throws Exception {

		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='j_username']")));
		element.clear();
		element.sendKeys(Username);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Password']")));
		element.clear();
		element.sendKeys(Password);
		
		//Click Remember Me
		Actions act = new Actions(driver);
		element = driver.findElement(By.id("remember_me"));
		act.click(element).build().perform();
		
		element = driver.findElement(By.xpath("//input[@value='Sign in']"));
		element.click();
		System.out.println("JENKINS Logged In");
		
		 String req = "REQ03";
		 String tc = "TC03";
		 ScreenCapture.takeScreenshot(req, tc);
		
	}

	@Test(priority = 4, description = "JENKINS_Logout", groups = "JENKINS")
	public void JENKINSLogout() throws Exception {

		
		
		//System.out.println(driver.getCurrentUrl());

		// Logout
		System.out.println("Logout");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//b[contains(text(),'log out')]")));
		element.click();
				
		 String req = "REQ04";
		 String tc = "TC04";
		 ScreenCapture.takeScreenshot(req, tc);
				
	}
	
	@Test(priority = 5, description = "Close Session")
	public void TearDown() throws Exception {
		System.out.println("Tear Down");
		driver.close();

	}

}
