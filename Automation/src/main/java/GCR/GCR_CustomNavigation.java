package GCR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class GCR_CustomNavigation extends browser.Browsers {

// NOTE: When logged in: 'My' & 'People' links become available

	// All (<<<<TOP MENU>>>>)

	@Test(priority = 1, description = "GCR_All", groups = "GCR")
	public void All() {
		System.out.println("All");
		wait = new WebDriverWait(driver, 10);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'All')]")));
		element.click();
	}

	// OPEN
	@Test(priority = 2, description = "GCR_Open", groups = "GCR")
	public void Open() {
		System.out.println("Open");
		String currentURL = driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("#/q/status:open"));
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Open')]")));
		element.click();
	}

	// Merged
	@Test(priority = 3, description = "GCR_Merged", groups = "GCR")
	public void Merged() {
		System.out.println("Merged");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Merged')]")));
		element.click();
	}

	// Abandoned
	@Test(priority = 4, description = "GCR_Abandoned", groups = "GCR")
	public void Abandoned() {
		System.out.println("Abandoned");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Abandoned')]")));
		element.click();
	}

	// My (<<<<TOP MENU>>>>)
	@Test(priority = 5, description = "GCR_My", groups = "GCR")
	public void My() {
		System.out.println("My");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'My')]")));
		element.click();
	}

	// Changes
	@Test(priority = 6, description = "GCR_Changes", groups = "GCR")
	public void Changes() {
		System.out.println("Changes");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Changes')]")));
		element.click();
	}

	// Drafts
	@Test(priority = 7, description = "GCR_Drafts", groups = "GCR")
	public void Drafts() {
		System.out.println("Drafts");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Drafts')]")));
		element.click();
	}

	// Draft Comments
	@Test(priority = 8, description = "GCR_DraftComments", groups = "GCR")
	public void DraftComments() {
		System.out.println("Draft Comments");
		element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Draft Comments')]")));
		element.click();
	}

	// Edits
	@Test(priority = 9, description = "GCR_Edits", groups = "GCR")
	public void Edits() {
		System.out.println("Edits");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Edits')]")));
		element.click();
	}

	// Watched Changes
	@Test(priority = 10, description = "GCR_WatchedChanges", groups = "GCR")
	public void WatchedChanges() {
		System.out.println("Watched Changes");
		element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Watched Changes')]")));
		element.click();
	}

	// Starred Changes
	@Test(priority = 11, description = "GCR_StarredChanges", groups = "GCR")
	public void StarredChanges() {
		System.out.println("Starred Changes");
		element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Starred Changes')]")));
		element.click();
	}

	// Groups
	@Test(priority = 12, description = "GCR_Groups", groups = "GCR")
	public void Groups() {
		System.out.println("Groups");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Groups')]")));
		element.click();
		
	}

	// Projects (<<<<TOP MENU>>>>)
	@Test(priority = 13, description = "GCR_Projects", groups = "GCR")
	public void Projects() {
		System.out.println("Projects");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Projects')]")));
		element.click();
	}

	// List
	@Test(priority = 14, description = "GCR_List", groups = "GCR")
	public void List() {
		System.out.println("List");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'List')]")));
		element.click();
	}

	// Filter
	@Test(priority = 15, description = "GCR_Filter", groups = "GCR")
	@Parameters({ "filter" })
	public void Filter(String filter) {
		System.out.println("Filter");
		element = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//table[@class='projectFilterPanel']//input[@type='text']")));
		element.clear();
		element.click();
		element.sendKeys(filter);
	}

	// People (<<<<TOP MENU>>>>)
	@Test(priority = 16, description = "GCR_People", groups = "GCR")
	public void People() {
		System.out.println("People");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'People')]")));
		element.click();
	}

	// List Groups
	@Test(priority = 17, description = "GCR_ListGroups", groups = "GCR")
	public void ListGroups() {
		System.out.println("List Groups");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'List Groups')]")));
		element.click();
		
	}

	// Documentation (<<<<TOP MENU>>>>))
	@Test(priority = 18, description = "GCR_Documentation", groups = "GCR")
	public void Documentation() {
		System.out.println("Documentation");
		element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Documentation')]")));
		element.click();
	}

	// Table of Contents
	@Test(priority = 19, description = "GCR_TableOfContents", groups = "GCR")
	public void TableOfContents() {
		System.out.println("Table of Contents");
		element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Table of Contents')]")));
		boolean m = driver.findElement(By.xpath("//a[contains(text(),'Table of Contents')]")).isDisplayed();
		Assert.assertTrue(m, "Table of Contents NOT FOUND");
	}

	// Searching
	@Test(priority = 20, description = "GCR_Searching", groups = "GCR")
	public void Searching() {
		System.out.println("Searching");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Searching')]")));
		boolean n = driver.findElement(By.xpath("//a[contains(text(),'Searching')]")).isDisplayed();
		Assert.assertTrue(n, "Searching NOT FOUND");
	}

	// Uploading
	@Test(priority = 21, description = "GCR_Uploading", groups = "GCR")
	public void Uploading() {
		System.out.println("Uploading");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Uploading')]")));
		boolean o = driver.findElement(By.xpath("//a[contains(text(),'Uploading')]")).isDisplayed();
		Assert.assertTrue(o, "Uploading NOT FOUND");
	}

	// Access Controls
	@Test(priority = 22, description = "GCR_AccessControls", groups = "GCR")
	public void AccessControls() {
		System.out.println("Access Controls");
		element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Access Controls')]")));
		boolean p = driver.findElement(By.xpath("//a[contains(text(),'Access Controls')]")).isDisplayed();
		Assert.assertTrue(p, "Access Controls NOT FOUND");
	}

	// REST API
	@Test(priority = 22, description = "GCR_API", groups = "GCR")
	public void API() {
		System.out.println("REST API");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'REST API')]")));
		boolean q = driver.findElement(By.xpath("//a[contains(text(),'REST API')]")).isDisplayed();
		Assert.assertTrue(q, "REST API NOT FOUND");
	}

	// Project Owner Guide
	@Test(priority = 22, description = "GCR_ProjectOwnerGuide", groups = "GCR")
	public void ProjectOwnerGuide() {
		System.out.println("Project Owner Guide");
		element = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Project Owner Guide')]")));
		boolean r = driver.findElement(By.xpath("//a[contains(text(),'Project Owner Guide')]")).isDisplayed();
		Assert.assertTrue(r, "Project Owner Guide NOT FOUND");

	}

}
