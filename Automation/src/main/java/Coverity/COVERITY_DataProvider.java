package Coverity;

import org.testng.annotations.DataProvider;

public class COVERITY_DataProvider {
	
	@DataProvider(name = "Credentials")
	public static Object[][] Credentials() {
			return new Object[][] {
			{ "develop", "" }/*,
			{ "admin", "" },
			{ "test", "" },
			{ "projectmanager", "" },*/
			    
		};
	}
	
		
	@DataProvider(name = "Coverity-Url")
	public static Object[][] gbUrl() {
		return new Object[][] {
			{ "https://coverity-connect.URL.com/"}
						    
		};
	}

}
