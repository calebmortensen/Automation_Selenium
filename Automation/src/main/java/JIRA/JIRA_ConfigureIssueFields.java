package JIRA;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class JIRA_ConfigureIssueFields extends browser.Browsers {

	@Test(priority = 0, description = "Create an issue", groups = "JIRA")
	public void Create() {
		System.out.println("Begin Create An Issue");

		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='create_link']")));
		// Click Create Button
		element.click();
		System.out.println("Create Issue Dialog displays");

	}

	@Test(priority = 1, description = "Configure Fields", groups = "JIRA")
	public void ConfigureFields() {
		System.out.println("Begin Configure Fields");

		element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='qf-field-picker-trigger']")));
		// Click Configure Fields Button
		element.click();
		System.out.println("Configure Fields droplists of checkboxes displays");
		// Click Custom
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//dd[contains(text(),'Custom')]")));
		element.click();

	}
	// <<<<<<<<<<<<Select ALL Check Boxes>>>>>>>>>>>>>>
	// USING TRY/CATCH, but should put in an UL/LI Array
	// NOTE LOGIC: the element assigned above DOES NOT equal != the findElement
	// below(Whether the system FINDS the element below or not), but IF the element
	// IS found, a PrintLine will occur, then
	// IF the element IS NOT found, the check box will be checked.

	// Assignee
	@Test(priority = 2, description = "Configure Fields - Assignee", groups = "JIRA")
	public void CF_Assignee() {
		try {
			if (element != driver
					.findElement(By.xpath("//a[@title='Assignee' and @class='qf-picker-button qf-active']"))) {
				System.out.println("Assignee is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//a[@title='Assignee']"));
			element.click();
		}

	}

	// Attachment
	@Test(priority = 3, description = "Configure Fields - Attachment", groups = "JIRA")
	public void CF_Attachment() {
		try {
			if (element != driver
					.findElement(By.xpath("//a[@title='Attachment' and @class='qf-picker-button qf-active']"))) {
				System.out.println("Attachment is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//a[@title='Attachment']"));
			element.click();
		}
	}

	// Classification
	@Test(priority = 4, description = "Configure Fields - Classification", groups = "JIRA")
	public void CF_Classification() {
		try {
			if (element != driver
					.findElement(By.xpath("//a[@title='Classification' and @class='qf-picker-button qf-active']"))) {
				System.out.println("Classification is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//a[@title='Classification']"));
			element.click();
		}
	}

	// Component/s
	@Test(priority = 5, description = "Configure Fields - Component/s", groups = "JIRA")
	public void CF_Components() {
		try {
			if (element != driver
					.findElement(By.xpath("//a[@title='Component/s' and @class='qf-picker-button qf-active']"))) {
				System.out.println("Component/s is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//a[@title='Component/s']"));
			element.click();
		}
	}

	// Description
	@Test(priority = 6, description = "Configure Fields - Description", groups = "JIRA")
	public void CF_Description() {
		try {
			if (element != driver
					.findElement(By.xpath("//a[@title='Description' and @class='qf-picker-button qf-active']"))) {
				System.out.println("Description is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//a[@title='Description']"));
			element.click();
		}
	}

	// Due Date
	@Test(priority = 7, description = "Configure Fields - Due Date", groups = "JIRA")
	public void CF_DueDate() {
		try {
			if (element != driver
					.findElement(By.xpath("//a[@title='Due Date' and @class='qf-picker-button qf-active']"))) {
				System.out.println("Due Date is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//a[@title='Due Date']"));
			element.click();
		}
	}

	// Epic Link
	@Test(priority = 8, description = "Configure Fields - Epic Link", groups = "JIRA")
	public void CF_EpicLink() {
		try {
			if (element != driver
					.findElement(By.xpath("//a[@title='Epic Link' and @class='qf-picker-button qf-active']"))) {
				System.out.println("Epic Link is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//a[@title='Epic Link']"));
			element.click();
		}
	}

	// Fix Version/s
	@Test(priority = 9, description = "Configure Fields - Fix Version/s", groups = "JIRA")
	public void CF_FixVersions() {
		try {
			if (element != driver
					.findElement(By.xpath("//a[@title='Fix Version/s' and @class='qf-picker-button qf-active']"))) {
				System.out.println("Fix Version/s is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//a[@title='Fix Version/s']"));
			element.click();
		}
	}

	// Labels
	@Test(priority = 10, description = "Configure Fields - Labels", groups = "JIRA")
	public void CF_Labels() {
		try {
			if (element != driver
					.findElement(By.xpath("//a[@title='Labels' and @class='qf-picker-button qf-active']"))) {
				System.out.println("Labels is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//a[@title='Labels']"));
			element.click();
		}
	}

	// Log Work
	@Test(priority = 11, description = "Configure Fields - Log Work", groups = "JIRA")
	public void CF_LogWork() {
		try {
			if (element != driver
					.findElement(By.xpath("//a[@title='Log Work' and @class='qf-picker-button qf-active']"))) {
				System.out.println("Log Work is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//a[@title='Log Work']"));
			element.click();
		}
	}

	// Build
	@Test(priority = 12, description = "Configure Fields - Build", groups = "JIRA")
	public void CF_Build() {
		try {
			if (element != driver
					.findElement(By.xpath("//a[@title='Build' and @class='qf-picker-button qf-active']"))) {
				System.out.println("Build is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//a[@title='Build']"));
			element.click();
		}
	}

	// Probability Of Harm
	@Test(priority = 13, description = "Configure Fields - Probability Of Harm", groups = "JIRA")
	public void CF_ProbabilityOfHarm() {
		try {
			if (element != driver.findElement(
					By.xpath("//a[@title='Probability Of Harm' and @class='qf-picker-button qf-active']"))) {
				System.out.println("Probability Of Harm is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//a[@title='Probability Of Harm']"));
			element.click();
		}
	}

	// Justification
	@Test(priority = 14, description = "Configure Fields - Justification", groups = "JIRA")
	public void CF_Justification() {
		try {
			if (element != driver
					.findElement(By.xpath("//a[@title='Justification' and @class='qf-picker-button qf-active']"))) {
				System.out.println("Justification is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//a[@title='Justification']"));
			element.click();
		}
	}

	// Story Points
	@Test(priority = 15, description = "Configure Fields - Story Points", groups = "JIRA")
	public void CF_StoryPoints() {
		try {
			if (element != driver
					.findElement(By.xpath("//a[@title='Story Points' and @class='qf-picker-button qf-active']"))) {
				System.out.println("Story Points is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//a[@title='Story Points']"));
			element.click();
		}
	}

	// Severity
	@Test(priority = 16, description = "Configure Fields - Severity", groups = "JIRA")
	public void CF_Severity() {
		try {
			if (element != driver
					.findElement(By.xpath("//a[@title='Severity' and @class='qf-picker-button qf-active']"))) {
				System.out.println("Severity is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//a[@title='Severity']"));
			element.click();
		}
	}

	// On Market
	@Test(priority = 17, description = "Configure Fields - On Market", groups = "JIRA")
	public void CF_OnMarket() {
		try {
			if (element != driver
					.findElement(By.xpath("//a[@title='On Market' and @class='qf-picker-button qf-active']"))) {
				System.out.println("On Market is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//a[@title='On Market']"));
			element.click();
		}
	}

	// Priority
	@Test(priority = 18, description = "Configure Fields - Priority", groups = "JIRA")
	public void CF_Priority() {
		try {
			if (element != driver
					.findElement(By.xpath("//a[@title='Priority' and @class='qf-picker-button qf-active']"))) {
				System.out.println("Priority is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//a[@title='Priority']"));
			element.click();
		}
	}

	// Time Tracking (Displays Original Estimate & Remaining Estimate fields)
	@Test(priority = 19, description = "Configure Fields - Time Tracking", groups = "JIRA")
	public void CF_TimeTracking() {
		try {
			if (element != driver
					.findElement(By.xpath("//a[@title='Time Tracking' and @class='qf-picker-button qf-active']"))) {
				System.out.println("Time Tracking is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//a[@title='Time Tracking']"));
			element.click();
		}

	}

	// Sprint
	@Test(priority = 20, description = "Configure Fields - Sprint", groups = "JIRA")
	public void CF_Sprint() {
		try {
			if (element != driver
					.findElement(By.xpath("//a[@title='Sprint']' and @class='qf-picker-button qf-active']"))) {
				System.out.println("Sprint is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//a[@title='Sprint']"));
			element.click();
		}

	}

	// Linked Issues
	@Test(priority = 21, description = "Configure Fields - Linked Issues", groups = "JIRA")
	public void CF_LinkedIssues() {
		try {
			if (element != driver
					.findElement(By.xpath("//a[@title='Linked Issues']' and @class='qf-picker-button qf-active']"))) {
				System.out.println("Linked Issues is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//a[@title='Linked Issues']"));
			element.click();
		}

	}

	// Environment
	@Test(priority = 22, description = "Configure Fields - Environment", groups = "JIRA")
	public void CF_Environment() {
		try {
			if (element != driver
					.findElement(By.xpath("//a[@title='Environment']' and @class='qf-picker-button qf-active']"))) {
				System.out.println("Environment is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//a[@title='Environment']"));
			element.click();
		}

	}

	// Sub Component
	@Test(priority = 23, description = "Configure Fields - Sub Component", groups = "JIRA")
	public void CF_SubComponent() {
		try {
			if (element != driver
					.findElement(By.xpath("//a[@title='Sub Component']' and @class='qf-picker-button qf-active']"))) {
				System.out.println("Sub Component is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//a[@title='Sub Component']"));
			element.click();
		}

	}

	// Summary
	@Test(priority = 24, description = "Configure Fields - Summary", groups = "JIRA")
	public void CF_Summary() {
		try {
			if (element != driver
					.findElement(By.xpath("//a[@title='Summary' and @class='qf-picker-button qf-active']"))) {
				System.out.println("Summary is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//a[@title='Summary']"));
			element.click();
		}
	}

	// Reference ID
	@Test(priority = 25, description = "Configure Fields - Reference ID", groups = "JIRA")
	public void CF_ReferenceID() {
		try {
			if (element != driver
					.findElement(By.xpath("//a[@title='Reference ID' and @class='qf-picker-button qf-active']"))) {
				System.out.println("Reference ID is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//a[@title='Reference ID']"));
			element.click();
		}
	}
	
	// Reporter
		@Test(priority = 26, description = "Configure Fields - Reporter", groups = "JIRA")
		public void CF_Reporter() {
			try {
				if (element != driver
						.findElement(By.xpath("//a[@title='Reporter' and @class='qf-picker-button qf-active']"))) {
					System.out.println("Reporter is already checked");
				}
			} catch (Exception e) {
				element = driver.findElement(By.xpath("//a[@title='Reporter']"));
				element.click();
			}
		}

	@Test(priority = 27, description = "Cancel", groups = "JIRA")
	public void Cancel() {
		// Click Cancel link (outside of Configure Fields UI & within Create Issue UI)
		element = driver.findElement(By.xpath("//a[@title='Press undefined+` to cancel']"));
		element.click();
	}

}
