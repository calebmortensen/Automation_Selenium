package GCR;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GCR_LoginLogout extends browser.Browsers {
	

	@Test(priority = 1, description = "GCR_Launch", groups = "GCR")
	@Parameters({ "Url" })
	public void GCR_Launch(String url) {

		System.out.println("Navigate to URL");
		driver.get(url);

	}
	
	
	@Test(priority = 2, description = "GCR_LoggedInCheck", groups = "GCR")
	public void GCRLoggedInCheck() {
		System.out.println("Check if user is currently logged in: ");
		
		if (element != wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Sign In')]"))) ) {
			System.out.println("User is already logged in");
		}
				else {
					GCRLogout();
				}
	}
	

	@Test(priority = 3, description = "GCR_LoginLogout", groups = "GCR")
	@Parameters({ "Username", "Password" })
	public void GCRLogin(String username, String password) {

		
		System.out.println("GCR Login Method " + Thread.currentThread().getId());
		//wait = new WebDriverWait(driver, 10);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Sign In')]")));
		element.click();
		element = driver.findElement(By.xpath("//input[@id='f_user']"));
		element.clear();
		element.sendKeys(username);
		element = driver.findElement(By.xpath("//input[@id='f_pass']"));
		element.clear();
		element.sendKeys(password);
		element = driver.findElement(By.xpath("//input[@id='f_remember']"));
		element.click();
		element = driver.findElement(By.xpath("//input[@value='Sign In']"));
		element.click();
		System.out.println("GCR Logged In");
	}

	@Test(priority = 4, description = "GCR_Logout", groups = "GCR")
	public void GCRLogout() {

		// Logout
		System.out.println("Logout");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='menuBarUserName']")));
		element.click();
		element = driver.findElement(
				By.xpath("//div[@class='com-google-gerrit-client-UserPopupPanel_BinderImpl_GenCss_style-panel']"));
		element.click();
		element = driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
		element.click();

		
	}

	@Test(description = "Close Session")
	public void TearDown() {
		System.out.println("AfterMethod");
		driver.close();

	}

}
