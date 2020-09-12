package JIRA;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class JIRA_VerifyIssueStatus extends browser.Browsers{
	
	//NOT TESTED
	
	@Test(priority = 0, description = "New", groups = "JIRA")
	public void New() {
		System.out.println("Begin Verify: NEW");
		try {
			assertEquals(driver.findElement(By.xpath(
					"//span[contains(@class,'jira-issue-status-lozenge aui-lozenge jira-issue-status-lozenge-blue-gray jira-issue-status-lozenge-new jira-issue-status-lozenge-max-width-medium')]"))
					.getText(), "NEW");
			System.out.println("Status is: NEW");

		} catch (Exception e) {
			System.out.println("Status is: NOT NEW");

		}

	}
	
	@Test(priority = 1, description = "IMPLEMENT", groups = "JIRA")
	public void Implement() {
		System.out.println("Begin Verify: IMPLEMENT");
		try {
			assertEquals(driver.findElement(By.xpath(
					"//span[contains(@class,'jira-issue-status-lozenge aui-lozenge jira-issue-status-lozenge-green jira-issue-status-lozenge-done jira-issue-status-lozenge-max-width-medium')]"))
					.getText(), "IMPLEMENT");
			System.out.println("Status is: IMPLEMENT");

		} catch (Exception e) {
			System.out.println("Status is: NOT IMPLEMENT");

		}

	}
	
	
	@Test(priority = 2, description = "REVIEW", groups = "JIRA")
	public void Review() {
		System.out.println("Begin Verify: REVIEW");
		try {
			assertEquals(driver.findElement(By.xpath(
					"//span[contains(@class,'jira-issue-status-lozenge aui-lozenge jira-issue-status-lozenge-green jira-issue-status-lozenge-done jira-issue-status-lozenge-max-width-medium')]"))
					.getText(), "REVIEW");
			System.out.println("Status is: REVIEW");

		} catch (Exception e) {
			System.out.println("Status is: NOT REVIEW");

		}

	}
	
	
	@Test(priority = 2, description = "TEST", groups = "JIRA")
	public void TEST() {
		System.out.println("Begin Verify: TEST");
		try {
			assertEquals(driver.findElement(By.xpath(
					"//span[contains(@class,'jira-issue-status-lozenge aui-lozenge jira-issue-status-lozenge-green jira-issue-status-lozenge-done jira-issue-status-lozenge-max-width-medium')]"))
					.getText(), "TEST");
			System.out.println("Status is: TEST");

		} catch (Exception e) {
			System.out.println("Status is: NOT TEST");

		}

	}
	
	
	
	@Test(priority = 2, description = "DONE", groups = "JIRA")
	public void DONE() {
		System.out.println("Begin Verify: DONE");
		try {
			assertEquals(driver.findElement(By.xpath(
					"//span[contains(@class,'jira-issue-status-lozenge aui-lozenge jira-issue-status-lozenge-green jira-issue-status-lozenge-done jira-issue-status-lozenge-max-width-medium')]"))
					.getText(), "DONE");
			System.out.println("Status is: DONE");

		} catch (Exception e) {
			System.out.println("Status is: NOT DONE");

		}

	}
	
		
}
