package Coverity;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class COVERITY_LoginLogout extends browser.Browsers {
	
		
	@Test(priority = 1, description = "COVERITY_Launch", groups = "COVERITY")
	@Parameters({ "Url" })
	public void COVERITYLaunch(String Url) {
		
		System.out.println("Navigate to URL");
		driver.get(Url);

	}

	@Test(priority = 2, description = "COVERITY_LoggedInCheck", groups = "COVERITY")
	public void COVERITYLoggedInCheck() {
		System.out.println("Check if user is currently logged in: ");
		
		if (element != wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='username']"))) ) {
			System.out.println("User is already logged in");
		}
				else {
					COVERITYLogout();
				}
	}
	
	
	
	@Test(priority = 3, description = "COVERITY_Login", groups = "COVERITY")
	@Parameters({ "Username", "Password" })
	public void COVERITYLogin(String Username, String Password) {

		System.out.println(driver.getCurrentUrl());
		
		boolean UN = driver.findElement(By.xpath("//input[@id='username']")).isDisplayed();
		Assert.assertTrue(UN, "Username NOT FOUND");
		//wait = new WebDriverWait(driver, 30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='username']"))); 
		element = driver.findElement(By.xpath("//input[@id='username']"));
		element.clear();
		element.sendKeys(Username);
		element = driver.findElement(By.xpath("//input[@id='password']"));
		element.clear();
		element.sendKeys(Password);
		element = driver.findElement(By.xpath("//input[@id='login-button']"));
		element.click();
		
	}

	@Test(priority = 4, description = "COVERITY_Logout", groups = "COVERITY")
	public void COVERITYLogout() {

		// Logout
		//wait = new WebDriverWait(driver, 30);
		System.out.println("Logout Initiated");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='user-name-container-id']")));
		element.click();
		element = driver.findElement(By.xpath("//a[@id='nav-signout']"));
		element.click();

		
	}

	@Test(priority = 5, description = "Close Session")
	public void TearDown() {
		System.out.println("Tear Down");
	    driver.close();

	}

}