package Gitblit;

import org.testng.annotations.DataProvider;

public class GB_DataProvider {
	
	@DataProvider(name = "Credentials")
	public static Object[][] Credentials() {
			return new Object[][] {
			{ "develop", "" }/*,
			{ "admin", "" },
			{ "test", "" },
			{ "projectmanager", "" },*/
			    
		};
	}
	
		
	@DataProvider(name = "gb-url")
	public static Object[][] gbUrl() {
		return new Object[][] {
			{ "https://git.URL.com/"}
						    
		};
	}

}
