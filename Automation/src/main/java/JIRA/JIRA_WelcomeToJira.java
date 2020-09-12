package JIRA;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class JIRA_WelcomeToJira extends browser.Browsers {

	@Test(priority = 1, description = "Explore the Current Projects", groups = "JIRA")
	public void ExploreCurrentProjects() {

		// If the default landing page has not been set and the URL lands on: https://*
		// */secure/WelcomeToJIRA.jspa
		String WelcomeToJira = "WelcomeToJira";
		String current = driver.getCurrentUrl();
		if (current.contains(WelcomeToJira.toLowerCase())) {
			// Click 'Explore the current projects' link
			element = driver.findElement(By.xpath("//div[contains(text(),'Explore the current projects')]"));
			element.click();
		} else {
			System.out.println(
					"The current url DOES NOT contain WelcomeToJIRA, thus No option to click Explore the current projects");
		}

	}

	@Test(priority = 2, description = "Create an issue", groups = "JIRA")
	public void CreateAnIssue() {

		// If the default landing page has not been set and the URL lands on: https://*
		// */secure/WelcomeToJIRA.jspa
		String WelcomeToJira = "WelcomeToJira";
		String current = driver.getCurrentUrl();
		if (current.contains(WelcomeToJira.toLowerCase())) {
			// Click 'Create an issue' link
			element = driver.findElement(By.xpath("//div[contains(text(),'Create an issue')]"));
			element.click();
		} else {
			System.out
					.println("The current url DOES NOT contain WelcomeToJIRA, thus No option to click Create an issue");
		}
	}

	@Test(priority = 3, description = "Search for issues", groups = "JIRA")
	public void SearchForIssues() {

		// If the default landing page has not been set and the URL lands on: https://*
		// */secure/WelcomeToJIRA.jspa
		String WelcomeToJira = "WelcomeToJira";
		String current = driver.getCurrentUrl();
		if (current.contains(WelcomeToJira.toLowerCase())) {
			// Click 'Search for issues' link
			element = driver.findElement(By.xpath("//div[contains(text(),'Search for issues')]"));
			element.click();
		} else {
			System.out.println(
					"The current url DOES NOT contain WelcomeToJIRA, thus No option to click Search for issues");
		}

	}
	

}
