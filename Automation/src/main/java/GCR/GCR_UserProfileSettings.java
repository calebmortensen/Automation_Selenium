package GCR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class GCR_UserProfileSettings extends browser.Browsers {

	// Logged In User
	@Test(priority = 1, description = "GCR_MenuBarUserName", groups = "GCR")
	public void MenuBarUserName() {
		System.out.println("Logged In User");
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='menuBarUserName']")));
		element.click();
	}

	// Profile Dialog Box
	@Test(priority = 2, description = "GCR_ProfileDialog", groups = "GCR")
	public void ProfileDialog() {
		System.out.println("Profile Dialog");
		element = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@class='com-google-gerrit-client-UserPopupPanel_BinderImpl_GenCss_style-panel']")));
		element.click();
	}

	// Settings
	@Test(priority = 3, description = "GCR_Settings", groups = "GCR")
	public void Settings() {
		System.out.println("Settings");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Settings')]")));
		element.click();
	}

	// Settings Main Page
	@Test(priority = 4, description = "GCR_SettingsMain", groups = "GCR")
	public void SettingsMain() {
		System.out.println("Settings Main");
		element = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//body/div[@id='gerrit_body']/div/div/div[@class='screen']/div[1]")));
		element.click();
	}

	// Profile
	@Test(priority = 5, description = "GCR_Profile", groups = "GCR")
	public void Profile() {
		System.out.println("Profile");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Profile')]")));
		element.click();
	}

	// Preferences
	@Test(priority = 6, description = "GCR_Preferences", groups = "GCR")
	public void Preferences() {
		System.out.println("Preferences");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Preferences')]")));
		element.click();
	}

	// Diff Preferences
	@Test(priority = 7, description = "GCR_DiffPreferences", groups = "GCR")
	public void DiffPreferences() {
		System.out.println("Diff Preferences");
		element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Diff Preferences')]")));
		element.click();
	}

	// Edit Preferences
	@Test(priority = 8, description = "GCR_EditPreferences", groups = "GCR")
	public void EditPreferences() {
		System.out.println("Edit Preferences");
		element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Edit Preferences')]")));
		element.click();
	}

	// Watched Projects
	@Test(priority = 9, description = "GCR_WatchedProjects", groups = "GCR")
	public void WatchedProjects() {
		System.out.println("Watched Projects");
		element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Watched Projects')]")));
		element.click();
	}

	// Contact Information
	@Test(priority = 10, description = "GCR_ContactInformation", groups = "GCR")
	public void ContactInformation() {
		System.out.println("Contact Information");
		element = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Contact Information')]")));
		element.click();
	}

	// SSH Public Keys
	@Test(priority = 11, description = "GCR_SSHPublicKeys", groups = "GCR")
	public void SSHPublicKeys() {
		System.out.println("SSH Public Keys");
		element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'SSH Public Keys')]")));
		element.click();
	}

	// Identities
	@Test(priority = 11, description = "GCR_Identities", groups = "GCR")
	public void Identities() {
		System.out.println("Identities");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Identities')]")));
		element.click();
	}

	// Groups
	@Test(priority = 12, description = "GCR_Identities", groups = "GCR")
	public void Groups() {
		System.out.println("Groups");
		element = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@class='menuScreenMenuBar']//a[@class='menuItem'][contains(text(),'Groups')]")));
		element.click();
	}

}
