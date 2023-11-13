package JIRA;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test(groups = "All")
public class JIRA_LoginLogout extends browser.Browsers {
	
		
	@Test(description = "JIRA_Launch", groups = {"JIRA", "smoke", "functional", "regression", "sanity", "DailyBuild"})
	@Parameters({ "Url" })
	public void JIRALaunch(String Url) {
		
		System.out.println("Navigate to URL");
		driver.get(Url);

	}
	
	
	@Test(priority = 2, description = "JIRA_LoggedInCheck", groups = "JIRA")
	public void JIRALoggedInCheck() throws InterruptedException {
		System.out.println("Check if user is currently logged in: ");
		
		if (element != wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Log In')]"))) ) {
			System.out.println("Log In link is displayed");
		}
				else {
					JIRALogout();
				}
	}
	
	
	

	@Test(priority = 3, description = "JIRA_Login", groups = {"JIRA"})
	@Parameters({ "Username", "Password" })
	public void JIRALogin(String Username, String Password) {

		Assert.assertEquals(driver.getTitle(), "System Dashboard - JIRA");

		boolean quickSearchInput = driver.findElement(By.xpath("//input[@id='quickSearchInput']")).isDisplayed();
		Assert.assertTrue(quickSearchInput, "quickSearchInput NOT FOUND");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@accesskey='u']"))); 
		element = driver.findElement(By.xpath("//input[@id='login-form-username']"));
		element.clear();
		element.sendKeys(Username);
		element = driver.findElement(By.xpath("//input[@id='login-form-password']"));
		element.clear();
		element.sendKeys(Password);
		element = driver.findElement(By.xpath("//input[@id='login-form-remember-me']"));
		element.click();
		element = driver.findElement(By.xpath("//input[@id='login']"));
		element.click();
	}
	
	
	@Test(priority = 4, description = "JIRA_WelcomeToJIRA", groups = "JIRA")
	public void JIRAWelcomeToJIRA() {
		//If the default landing page has not been set and the URL lands on: https://* */secure/WelcomeToJIRA.jspa
		String WelcomeToJira = "WelcomeToJira";
		String current = driver.getCurrentUrl();
		if(current.contains(WelcomeToJira.toLowerCase())) {
			//Click 'Explore the current projects' link
			element = driver.findElement(By.xpath("//div[contains(text(),'Explore the current projects')]"));
			element.click();
		}else {
			System.out.println("The current url DOES NOT contain WelcomeToJIRA");
		}
	}
		

	@Test(priority = 5, description = "JIRA_Logout", groups = "JIRA")
	public void JIRALogout() throws InterruptedException {
		
		System.out.println("Begin Logout");
		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//a[@id='header-details-user-fullname']"));
		element.click();
		System.out.println("User Profile Clicked");
		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//a[@title='Log out and cancel any automatic login.']"));
		element.click();
		System.out.println("Log Out clicked");

	
	}

	@Test(priority = 6, description = "Close Session")
	public void TearDown() {
		System.out.println("Tear Down");
	    driver.close();

	}

}