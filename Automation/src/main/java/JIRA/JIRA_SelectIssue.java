package JIRA;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testNGReferences.ScreenCapture;

public class JIRA_SelectIssue extends browser.Browsers {

	@Test(priority = 1, description = "Display Most Recent Issues", groups = "JIRA")
	@Parameters({ "Summary", "Sort"})
	public void SelectRecentOpenIssue(String Summary, String Sort) throws Exception {
		System.out.println("Display Most Recent Issue");
		Thread.sleep(2000);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Search for issues and view recent issues'] | //a[@id='find_link'] | //a[contains(text(),'Issues')]")));
		// Click Issues drop list
		Thread.sleep(1000);
		element.click();
		System.out.println("Issues drop list displays");
		Thread.sleep(2000);
		//Click 'My Open Issues' - using OR operator (Depending on if drop list is compressed to half page)
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='filter-link'][contains(text(),'My open issues')] | //a[@id='filter_lnk_my_lnk']")));
		element.click();
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='advanced-search']")));
		element.clear();
		//Send Search String 'Sort'
		element.sendKeys(Sort);
		//Click Search
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='aui-icon aui-icon-small aui-iconfont-search']")));
		element.click();
		//Get JIRA Issue ID
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='issue-link']")));
		String JiraID = element.getText();
		System.out.println("Jira ID: "+JiraID);
		//TAKE SCREEN SHOT
		ScreenCapture.takeScreenshot("ReqID-01", "TC-01");
	}

		@Test(priority = 2, description = "Copy Issue ID from Most Recent Issue & Write to File", groups = "JIRA")
	public void CopyIssueID() {
		System.out.println("Copy Issue ID from Most Recent Issue");
		//Date date = null;
		FileOutputStream fos = null;
		//Writer writer = null;
		File file = null;
	
		// Select Issue ID from Most Recent Issue (Test/Delete following: )
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='issue-link']")));
		String JiraID = element.getText();

		// Find the value and write it to the text file JiraIssueID
		try {
			file = new File("./tempFiles/JiraID.txt");
			fos = new FileOutputStream(file);
			// This logic will check whether the file exists or not. If the file is not
			// found at the specified location it would create a new file
			if (!file.exists()) {
				file.createNewFile();
			}

			// String content cannot be directly written into a file. It needs to be
			// converted into bytes
			byte[] bytesArray = JiraID.getBytes();
			fos.write(bytesArray);
			fos.flush();
			System.out.println("File Written Successfully");

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (Exception ioe) {
				System.out.println("Error in closing the Stream");

			}
		}

	}

	
}
