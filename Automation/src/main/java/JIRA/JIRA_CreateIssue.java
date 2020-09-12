package JIRA;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class JIRA_CreateIssue extends browser.Browsers {

	@Test(priority = 0, description = "Create an issue", groups = "JIRA")
	public void Create() {
		System.out.println("Begin Create An Issue");
		
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='create_link']")));
		// Click Create Button
		element.click();
		System.out.println("Create Issue Dialog displays");

	}

	// <<<<<<<<<The Below methods are for Create Issue field selection:>>>>>>>>>>>

	@Test(priority = 15, description = "Project", groups = "JIRA")
	@Parameters({ "Project" })
	public void Project(String Project) {
		//DO NOT LIKE HOW THIS WORKS (NEED TO REVISIT)
		// Project (Drop List)
		System.out.println("Project (Drop List)");
		element = driver.findElement(By.xpath("//input[@id='project-field']"));
		element.click();
		element.sendKeys(Project);
		//Change focus - Click 'Configure Fields'
		element = driver.findElement(By.xpath("//button[@id='qf-field-picker-trigger']"));
		element.click();
		element.click();
		
		//new Actions(driver).moveToElement(element).click().perform();
	    /*assertNotNull(driver.findElement(By.xpath("//*[contains(text(), "+Project+")]")));
	    String findSelection=driver.findElement(By.xpath("//*[contains(text(), "+Project+")]")).getAttribute(Project);
	    assertTrue(findSelection.equalsIgnoreCase(Project));*/
		/*element.sendKeys(Keys.DOWN);
		element.sendKeys(Keys.RETURN);*/
				
	}

	@Test(priority = 16, description = "Issue Type", groups = "JIRA")
	@Parameters({ "IssueType" })
	public void IssueType(String IssueType) {

		// Issue Type (Drop List)
		System.out.println("Issue Type (Drop List)");
		element = driver.findElement(By.xpath("//input[@id='issuetype-field']"));
		element.click();
		element.clear();
		element.sendKeys(IssueType);
		
		//Change focus - Click 'Configure Fields'
		element = driver.findElement(By.xpath("//button[@id='qf-field-picker-trigger']"));
		element.click();
		element.click();
		
	}
	
	@Test(priority = 26, description = "Summary", groups = "JIRA")
	@Parameters({ "Summary" })
	public void Summary(String Summary) {

		// Summary (Dialog Box)
		element = driver.findElement(By.xpath("//input[@id='summary']"));
		element.clear();
		element.sendKeys(Summary);
		element = driver.findElement(By.xpath("//button[@id='qf-field-picker-trigger']"));
		element.click();
		element.click();
	}
			

	@Test(priority = 17, description = "Classification", groups = "JIRA")
	@Parameters({ "Classification" })
	public void Classification(String Classification) {

		System.out.println("Classification (Drop List)");
		element = driver.findElement(By.id("customfield_10805"));
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(Classification);
		
		//Change focus - Click 'Configure Fields'
		element = driver.findElement(By.xpath("//button[@id='qf-field-picker-trigger']"));
		element.click();
		element.click();
		

	}

	@Test(priority = 18, description = "HowFound", groups = "JIRA")
	@Parameters({ "HowFound" })
	public void HowFound(String HowFound) {

		System.out.println("How Found (Drop List)");
		element = driver.findElement(By.xpath("//select[@id='customfield_10806']"));
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(HowFound);
		
		//Change focus - Click 'Configure Fields'
		element = driver.findElement(By.xpath("//button[@id='qf-field-picker-trigger']"));
		element.click();
		element.click();

	}

	@Test(priority = 19, description = "OnMarket", groups = "JIRA")
	@Parameters({ "OnMarket" })
	public void OnMarket(String OnMarket) {

		System.out.println("On Market (Drop List)");
		element = driver.findElement(By.xpath("//select[@id='customfield_10903']"));
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(OnMarket);
		//Change focus - Click 'Configure Fields'
		element = driver.findElement(By.xpath("//button[@id='qf-field-picker-trigger']"));
		element.click();
		element.click();

	}

	@Test(priority = 20, description = "PhaseFound", groups = "JIRA")
	@Parameters({ "PhaseFound" })
	public void PhaseFound(String PhaseFound) {
		// Phase Found (Drop List)
		System.out.println("Phase Found (Drop List)");
		element = driver.findElement(By.xpath("//select[@id='customfield_10807']"));
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(PhaseFound);
		//Change focus - Click 'Configure Fields'
		element = driver.findElement(By.xpath("//button[@id='qf-field-picker-trigger']"));
		element.click();
		element.click();

	}

	@Test(priority = 21, description = "AffectsVersion", groups = "JIRA")
	@Parameters({ "AffectsVersions" })
	public void AffectsVersions(String AffectsVersions) {

		// Affects Versions (Drop List)
		System.out.println("Affects Versions (Drop List)");
		element = driver.findElement(By.xpath("//textarea[@id='versions-textarea']"));
		element.click();
		element.sendKeys(AffectsVersions);
		
		//Change focus - Click 'Configure Fields'
		element = driver.findElement(By.xpath("//button[@id='qf-field-picker-trigger']"));
		element.click();
		element.click();

	}

	@Test(priority = 22, description = "Components", groups = "JIRA")
	@Parameters({ "Components" })
	public void Components(String Components) {

		// Component/s (Drop List)
		System.out.println("Components (Drop List)");
		element = driver.findElement(By.xpath("//textarea[@id='components-textarea']"));
		element.click();
		element.sendKeys(Components);
		//Change focus - Click 'Configure Fields'
		element = driver.findElement(By.xpath("//button[@id='qf-field-picker-trigger']"));
		element.click();
		element.click();
	}

	@Test(priority = 23, description = "Severity", groups = "JIRA")
	@Parameters({ "Severity" })
	public void Severity(String Severity) {
		// Severity (Drop List)
		System.out.println("Severity(Drop List)");
		element = driver.findElement(By.xpath("//select[@id='customfield_10800']"));
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(Severity);
		//Change focus - Click 'Configure Fields'
		element = driver.findElement(By.xpath("//button[@id='qf-field-picker-trigger']"));
		element.click();
		element.click();

	}

	@Test(priority = 24, description = "Probability Of Harm", groups = "JIRA")
	@Parameters({ "ProbabilityOfHarm" })
	public void ProbabilityOfHarm(String ProbabilityOfHarm) {

		// Probability of Harm (Drop List)
		System.out.println("Probability of Harm (Drop List)");
		element = driver.findElement(By.xpath("//select[@id='customfield_10904']"));
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(ProbabilityOfHarm);
		//Change focus - Click 'Configure Fields'
		element = driver.findElement(By.xpath("//button[@id='qf-field-picker-trigger']"));
		element.click();
		element.click();
	}

	@Test(priority = 25, description = "Justification", groups = "JIRA")
	@Parameters({ "Justification" })
	public void Justification(String Justification) {

		// Justification (Dialog Box)
		System.out.println("Justification (Dialog Box)");
		element = driver.findElement(By.xpath("//textarea[@id='customfield_10803']"));
		element.clear();
		element.sendKeys(Justification);
		System.out.println("Justification text");
		
		element = driver.findElement(By.xpath("//button[@id='qf-field-picker-trigger']"));
		element.click();
		element.click();
	}

	

	@Test(priority = 27, description = "Description", groups = "JIRA")
	@Parameters({ "Description" })
	public void Description(String Description) {

		// Description(Dialog Box)
		element = driver.findElement(By.xpath("//textarea[@id='description']"));
		element.clear();
		element.sendKeys(Description);
		
		element = driver.findElement(By.xpath("//button[@id='qf-field-picker-trigger']"));
		element.click();
		element.click();
		
	}

	@Test(priority = 28, description = "FixVersions", groups = "JIRA")
	@Parameters({ "FixVersions" })
	public void FixVersions(String FixVersions) {

		// Fix Versions (Dialog Box)
		System.out.println("Fix Versions (Drop List)");
		element = driver.findElement(By.xpath("//textarea[@id='fixVersions-textarea']"));
		element.click();
		element.sendKeys(FixVersions);
	
		element = driver.findElement(By.xpath("//button[@id='qf-field-picker-trigger']"));
		element.click();
		element.click();
	}

	@Test(priority = 29, description = "Priority", groups = "JIRA")
	@Parameters({ "Priority" })
	public void Priority(String Priority) {

		// Priority (Drop List)
		//System.out.println("Priority (Drop List)");
		element = driver.findElement(By.xpath("//input[@id='priority-field']"));
		element.click();
		element.clear();
		element.sendKeys(Priority);
		/*Select dropdown = new Select(element);
		dropdown.selectByVisibleText(Priority);*/
		System.out.println("Priority Test Input");
		
		//Change focus - Click 'Configure Fields'
		element = driver.findElement(By.xpath("//button[@id='qf-field-picker-trigger']"));
		element.click();
		element.click();

	}

	@Test(priority = 30, description = "Assignee", groups = "JIRA")
	public void Assignee() {

		// Assignee (NOT USING Drop List - Using 'Assign to me' LINK)
		element = driver.findElement(By.xpath("//a[@id='assign-to-me-trigger']"));
		element.click();
		
		element = driver.findElement(By.xpath("//button[@id='qf-field-picker-trigger']"));
		element.click();
		element.click();
	}

	@Test(priority = 31, description = "DueDate", groups = "JIRA")
    @Parameters({ "DueDate" })
	public void DueDate(String DueDate) {

		// Due Date (Using 'Select a date' LINK)
		element = driver
				.findElement(By.xpath("//input[@id='duedate']"));
		element.click();
		element.clear();
		element.sendKeys(DueDate);
		System.out.println("Due Date Input");
		
		element = driver.findElement(By.xpath("//button[@id='qf-field-picker-trigger']"));
		element.click();
		element.click();
	}

	@Test(priority = 32, description = "StoryPoints", groups = "JIRA")
	@Parameters({ "StoryPoints" })
	public void StoryPoints(String StoryPoints) {

		// Story Points(Dialog Box)
		element = driver.findElement(By.xpath("//input[@id='customfield_10006']"));
		element.clear();
		element.sendKeys(StoryPoints);
	}

	// Time Tracking <Configure Fields Check Box> displays Original Estimate Field
	@Test(priority = 33, description = "OriginalEstimate", groups = "JIRA")
	@Parameters({ "OriginalEstimate" })
	public void OriginalEstimate(String OriginalEstimate) {

		// Original Estimate(Dialog Box)
		element = driver.findElement(By.xpath("//input[@id='timetracking_originalestimate']"));
		element.clear();
		element.sendKeys(OriginalEstimate);
	}

	// Time Tracking <Configure Fields Check Box> displays Remaining Estimate Field
	@Test(priority = 34, description = "RemainingEstimate", groups = "JIRA")
	@Parameters({ "RemainingEstimate" })
	public void RemainingEstimate(String RemainingEstimate) {

		// Remaining Estimate(Dialog Box)
		element = driver.findElement(By.xpath("//input[@id='timetracking_remainingestimate']"));
		element.clear();
		element.sendKeys(RemainingEstimate);
		System.out.println("Remaining Estimate input");
	}

	@Test(priority = 35, description = "Attachment", groups = "JIRA")
	public void Attachment() {

		// Attachment (Using 'browse' LINK)
		element = driver.findElement(By.xpath(
				"//div[@class='field-group file-input-list long-field']//button[@type='button'][contains(text(),'browse.')]"));
		// element.click();
		// Set a path/file
	}

	@Test(priority = 36, description = "Labels", groups = "JIRA")
	@Parameters({ "Labels" })
	public void Labels(String Labels) {

		// Labels (Drop List)
		System.out.println("Labels (Drop List)");
		element = driver.findElement(By.xpath("//textarea[@id='labels-textarea']"));
		element.click();
		element.clear();
		element.sendKeys(Labels);
		
		element = driver.findElement(By.xpath("//button[@id='qf-field-picker-trigger']"));
		element.click();
		element.click();
	}

	@Test(priority = 37, description = "EpicLink", groups = "JIRA")
	public void EpicLink() {
		// Epic Link (Drop List)
		System.out.println("Epic Link (Drop List)");
		element = driver.findElement(By.xpath("//input[@id='customfield_10002-field']"));
		element.click();
		driver.findElement(By.xpath("//*[contains(text(), 'Epic Close')]")).click();
	}

	@Test(priority = 37, description = "Environment", groups = "JIRA")
	@Parameters({ "Environment" })
	public void Environment(String Environment) {
		// Environment (Dialog box)
		System.out.println("Environment (Dialog box)");
		element = driver.findElement(By.xpath("//textarea[@id='environment']"));
		element.clear();
		element.sendKeys(Environment);

	}

	@Test(priority = 37, description = "LinkedIssues", groups = "JIRA")
	@Parameters({ "LinkedIssues" })
	public void LinkedIssues(String LinkedIssues) {
		// Linked Issues(Drop List)
		System.out.println("Linked Issues (Drop List)");
		element = driver.findElement(By.xpath("//select[@id='issuelinks-linktype']"));
		element.sendKeys(LinkedIssues);

	}

	@Test(priority = 37, description = "Sprint", groups = "JIRA")
	@Parameters({ "Sprint" })
	public void Sprint(String Sprint) {
		// Sprint (Drop List)
		System.out.println("Sprint (Drop List)");
		element = driver.findElement(By.xpath("//input[@id='customfield_10001-field']"));
		element.sendKeys(Sprint);

	}
	
	//Log Work Check box in Configure Fields displays: Remaining Estimate
	@Test(priority = 37, description = "Log Work", groups = "JIRA")
	@Parameters({ "TimeSpent", "DateStarted", "SetTo", "ReducedBy", "WorkDescription" })
	public void LogWork(String TimeSpent, String DateStarted, String SetTo, String ReducedBy, String WorkDescription) {
		// Log Work (Check Box)
		System.out.println("Log Work (Check Box)");
		
		try {
			if (element != driver
					.findElement(By.xpath("//input[@id='log-work-activate']"))) {
				System.out.println("Log Work is already checked");
			}
		} catch (Exception e) {
			element = driver.findElement(By.xpath("//input[@id='log-work-activate']"));
			element.click();
		}
		//Radio Button <Adjust automatically>
		//Radio Button <Leave estimate unset>
		//Radio Button <Set To> & Input Field
		//Radio Button <Reduced by> & Input Field
		}
	
	
	@Test(priority = 37, description = "Sub Component", groups = "JIRA")
	@Parameters({ "SubComponent" })
	public void SubComponent(String SubComponent) {
		// Sub Component (Drop List)
		System.out.println("Sub Component (Drop List)");
		element = driver.findElement(By.xpath("//select[@id='customfield_10103']"));
		element.sendKeys(SubComponent);

	}

	@Test(priority = 37, description = "Sub Component 1", groups = "JIRA")
	@Parameters({ "SubComponent1" })
	public void SubComponent1(String SubComponent1) {
		// Sub Component 1(Drop List)
		System.out.println("Sub Component 1 (Drop List)");
		element = driver.findElement(By.xpath("//select[@id='customfield_10103:1']"));
		element.sendKeys(SubComponent1);

	}

	@Test(priority = 38, description = "CreateAnother", groups = "JIRA")
	public void CreateAnother() {
		// Click Create Another
		element = driver.findElement(By.xpath("//input[@id='qf-create-another']"));
		element.click();
	}

	@Test(priority = 39, description = "CreateButton", groups = "JIRA")
	public void CreateButton() {
		// Click Create Button
		element = driver.findElement(By.xpath("//input[@id='create-issue-submit']"));
		element.click();
		System.out.println("Create Button clicked");
		//ScreenCapture.takeScreenshot("ReqID-01", "TC-01");
	}
	
	// Navigate to RECENT Jira ID & Open Issue base on Toast Message - THIS IS BROKEN!!!
	@Test(priority = 40, description = "Jira ID Toast Message Open Issue", groups = "JIRA")
	public void JiraIDToastMessageLink() throws InterruptedException {
		
		System.out.println("Begin Toast Message Link ID");
		Thread.sleep(1000);
		//element = driver.findElement(By.xpath("//a[contains(@class,'issue-created-key issue-link')]"));
		String JiraID = driver.findElement(By.xpath("//a[contains(@class,'issue-created-key issue-link')]")).getText();
		System.out.println("JiraID is: " + JiraID);
		element.click();
		}

	@Test(priority = 41, description = "Cancel", groups = "JIRA")
	public void Cancel() {
		// Click Cancel link
		element = driver.findElement(By.xpath("//a[@title='Press undefined+` to cancel']"));
		element.click();
	}
	
	

}
