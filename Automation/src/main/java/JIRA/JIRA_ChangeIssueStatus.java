package JIRA;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class JIRA_ChangeIssueStatus extends browser.Browsers {

	// NOTE: Methods are Button Names

	@Test(priority = 0, description = "OPEN to Implement", groups = "JIRA")
	public void Implement() throws InterruptedException {
		System.out.println("Open to Implement");
		Thread.sleep(2000);
		// Navigate to 'Implement' button and click (Note: Implement button is ONLY available if Status:OPEN)
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Implement')]")));
		element.click();
		System.out.println("Clicked Implement button");
		// Verify Status change from Open to IMPLEMENT(NOTE: 'Back to Open' button ONLY
		// available if Status:IMPLEMENT)
		element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Back to Open')]")));
		System.out.println("Status: IMPLEMENT");
	}

	@Test(priority = 1, description = "Back to Open", groups = "JIRA")
	public void BackToOpen() throws InterruptedException {
		System.out.println("Back to Open");
		Thread.sleep(1000);
		// Wait until 'Back to Open' button displays
		element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Back to Open')]")));
		// Click 'Back to Open' button
		element.click();
		System.out.println("Clicked Back to Open");
		// Verify Status 'OPEN' - NOTE: 'IMPLEMENT' button is ONLY available when
		// Status:OPEN
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Implement')]")));
		System.out.println("Status: OPEN");
		
	}
	
	@Test(priority = 2, description = "To Investigate", groups = "JIRA")
	public void ToInvestigate() throws InterruptedException {
		System.out.println("To Investigate");
		Thread.sleep(1000);
		// Verify Status 'Open' - 'To Investigate' button displays
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'To Investigate')]")));
		element.click();
		System.out.println("Clicked To Investigate button");
		// Verify Status 'In Progress' - 'Implement' button DOES NOT display
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Back to Open')]")));
		System.out.println("Status: In Progress");
	}
	
	@Test(priority = 3, description = "Back to Open", groups = "JIRA")
	public void BackToOpen1() throws InterruptedException {
		System.out.println("Back to Open");
		Thread.sleep(1000);
		// Wait until 'Back to Open' button displays
		element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Back to Open')]")));
		// Click 'Back to Open' button
		element.click();
		System.out.println("Clicked Back to Open");
		// Verify Status 'Open' - NOTE: 'IMPLEMENT' button is ONLY available when
		// Status:Open
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Implement')]")));
		System.out.println("Status: Open");
		
	}
	
	@Test(priority = 4, description = "Open to Implement", groups = "JIRA")
	public void Implement1() throws InterruptedException {
		System.out.println("Open to Implement");
		Thread.sleep(1000);
		// Navigate to 'Implement' button and click (Note: Implement button is ONLY available if Status:Open)
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Implement')]")));
		element.click();
		System.out.println("Clicked Implement button");
		// Verify Status change from Open to IMPLEMENT(NOTE: 'Back to Open' button ONLY
		// available if Status:IMPLEMENT)
		element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Back to Open')]")));
		System.out.println("Status: IMPLEMENT");
	}


	@Test(priority = 5, description = "In Review", groups = "JIRA")
	public void InReview() throws InterruptedException {
		System.out.println("IMPLEMENT to REVIEW");
		Thread.sleep(1000);
		// Wait until 'In Review' button is displayed
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'In Review')]")));
		element.click();
		System.out.println("Clicked In Review button");
		// Verify Status 'REVIEW' - 'To Test' button displays
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'To Test')]")));
		System.out.println("Status: REVIEW");

	}

	@Test(priority = 6, description = "REVIEW to TEST", groups = "JIRA")
	public void ToTest() throws InterruptedException {
		System.out.println("REVIEW to TEST");
		Thread.sleep(1000);
		// Verify Status 'REVIEW' - 'To Test' button displays
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'To Test')]")));
		element.click();
		System.out.println("Clicked To Test button");
		// Verify Status 'TEST' - 'Tested' button displays
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Tested')]")));
		System.out.println("Status: TEST");
	}

	@Test(priority = 7, description = "TEST to DONE", groups = "JIRA")
	public void Tested() throws InterruptedException {
		System.out.println("TEST to DONE");
		Thread.sleep(1000);
		// Verify 'Tested' button displays
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Tested')]")));
		element.click();
		System.out.println("Clicked Tested button");
		// Verify Status 'DONE' - 'Reopen Issue' button displays
		element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Reopen Issue')]")));
		System.out.println("Status: DONE");

	}

	@Test(priority = 8, description = "Reopen Issue", groups = "JIRA")
	@Parameters({ "Reason", "Comment" })
	public void ReopenIssue(String Reason, String Comment) throws InterruptedException {
		System.out.println("DONE to Reopen Issue");
		Thread.sleep(1000);
		// Verify 'Reopen Issue' button displays
		element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Reopen Issue')]")));
		// Click 'Reopen Issue' button
		element.click();
		System.out.println("Clicked Reopen Issue Button");

		// Dialog box 'Reopen Issue' displays (Reason & Comment fields)
		// Wait for and populate 'Reason'
		Thread.sleep(1000);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='customfield_10808']")));
		element.sendKeys(Reason);
		System.out.println("Reason Sent");
		
		// Populate 'Comment'
		element = driver.findElement(By.xpath("//form[@class='aui']//textarea[@name='comment']"));
		element.click();
		element.sendKeys(Comment);
		Thread.sleep(1000);
		
				
		// Click 'Reopen Issue' button with Dialog box
		element = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='issue-workflow-transition-submit']")));
		element.click();
		System.out.println("Clicked Reopen Issue button in dialog box");
		// Verify Status is: 'REOPENED' - 'Back to Done' button displays
		Thread.sleep(1000);
		element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Back to Done')]")));
		System.out.println("Status is: REOPENED");

	}

	@Test(priority = 9, description = "Back to Done", groups = "JIRA")
	@Parameters({ "Reason", "Comment" })
	public void BackToDone(String Reason, String Comment) throws InterruptedException {
		System.out.println("Back to Done");
		Thread.sleep(1000);
		// Verify 'Back to Done' button displays
		element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Back to Done')]")));
		System.out.println("Back to Done button displays");
		// Click 'Back to Done' button
		element.click();
		System.out.println("Back to Done button clicked");

		// Dialog box 'Back to Done' displays (Reason & Comment fields)
		// Wait for and populate 'Reason'
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='customfield_10808']")));
		element.clear();
		element.sendKeys(Reason);
		// Populate 'Comment'
		
		// Populate 'Comment'
				element = driver.findElement(By.xpath("//form[@class='aui']//textarea[@name='comment']"));
				element.click();
				element.sendKeys(Comment);
				Thread.sleep(1000);
				
		// Verify 'Back to Done' button displays within Dialog box
		element = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='issue-workflow-transition-submit']")));
		System.out.println("Back to Done button displays within Dialog box");
		// Click 'Back to Done' within Dialog box
		element.click();
		System.out.println("Back to Done button clicked within Dialog box");
		// Verify Status: DONE - 'Reopen Issue' button displays
		element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Reopen Issue')]")));
		System.out.println("Status is: DONE");
	}
	
	
	

}
