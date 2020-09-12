package Gitblit;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class GB_LoginLogout extends browser.Browsers{
		

	@Test(priority = 1, description = "GB_Launch", groups = "GB")
	@Parameters({ "Url" })
	public void GB_Launch(String Url) {

		System.out.println("Navigate to URL");
		driver.get(Url);

	}
	
	
	@Test(priority = 2, description = "GB_LoggedInCheck", groups = "GB")
	public void GBLoggedInCheck() {
		System.out.println("Check if user is currently logged in: ");
		
		if (element != wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='navbar-inner']//div[@class='container'], //a[contains(text(),'my dashboard')]"))) ) {
			System.out.println("User is NOT logged in");
		}
				else {
					System.out.println("Navigate to GBLogin via TestNG xml");
				}
	}

	@Test(priority = 3, description = "GB_Login", groups = "GB")
	@Parameters({ "Username", "Password" })
	public void GBLogin(String Username, String Password) {

	
		//System.out.println("GB Login Method " + Thread.currentThread().getId());
		//WebDriverWait wait = new WebDriverWait(driver, 10);

		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='username']")));
		element.clear();
		element.sendKeys(Username);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='password']")));
		element.clear();
		element.sendKeys(Password);
		element = driver.findElement(By.xpath("//button[@type='submit']"));
		element.click();
		System.out.println("GB Logged In");
	}

	@Test(priority = 4, description = "GB_Logout", groups = "GB")
	public void GBLogout() {

		// Logout
		System.out.println("Logout");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='nav pull-right']//a[@class='dropdown-toggle']")));
		element.click();
		
		element = driver.findElement(By.xpath("//a[contains(text(),'logout')]"));
		element.click();
		
		
	}

	@Test(priority = 5, description = "Close Session")
	public void TearDown() {
		System.out.println("Tear Down");
		driver.close();

	}

}
