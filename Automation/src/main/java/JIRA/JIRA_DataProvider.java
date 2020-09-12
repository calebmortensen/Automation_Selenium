package JIRA;

import org.testng.annotations.DataProvider;

public class JIRA_DataProvider {
	
	@DataProvider(name = "Credentials")
	public static Object[][] Credentials() {
		return new Object[][] {
			{ "val-develop", "" }/*,
			{ "val-admin", "" },
			{ "val-test", "" },
			{ "val-projectmanager", "" },*/
			    
		};
	}
	
	
	@DataProvider(name = "Jira-Url")
	public static Object[][] jiraUrl() {
		return new Object[][] {
			{ "https://jira-URL.com" }
						    
		};
	}
	
	@DataProvider(name = "Issue-Types")
	public static Object[][] IssueTypes() {
		return new Object[][] {
			{ "Defect" },
			/*{ "Request" },
			{ "Task" },
			{ "Story" },
			{ "Epic" }*/
						    
		}; 
	}


}
