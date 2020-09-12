package Jenkins;

import org.testng.annotations.DataProvider;

public class JENKINS_DataProvider {
	

	@DataProvider(name = "Credentials")
	public static Object[][] Credentials() {
			return new Object[][] {
			{ "develop", "" }/*,
			{ "admin", "" },
			{ "test", "" },
			{ "projectmanager", "" },*/
			    
		};
	}
	
		
	@DataProvider(name = "jenkins-url")
	public static Object[][] jenkinsUrl() {
		return new Object[][] {
			{ "https://jenkins.URL.com/"}
						    
		};
	}
		
			

}
