package GCR;

import org.testng.annotations.DataProvider;


public class GCR_DataProvider {

	@DataProvider(name = "Credentials")
	public static Object[][] Credentials() {
			return new Object[][] {
			{ "val-develop", "" }/*,
			{ "val-admin", "Z" },
			{ "val-test", "" },
			{ "val-projectmanager", "" },*/
			    
		};
	}
	
		
	@DataProvider(name = "gcr-url")
	public static Object[][] gcrUrl() {
		return new Object[][] {
			{ "https://review.ngai.alerehive.com"}
						    
		};
	}

} 