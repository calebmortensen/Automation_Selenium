package Git;


import org.testng.annotations.DataProvider;

public class GIT_DataProvider {
	

		
		@DataProvider(name = "Credentials")
		public static Object[][] Credentials() {
				return new Object[][] {
				{ "develop", "" }/*,
				{ "admin", "" },
				{ "test", "" },
				{ "projectmanager", "" },*/
				    
			};
		}
		
			
		@DataProvider(name = "git-url")
		public static Object[][] gitUrl() {
			return new Object[][] {
				{ "https://URL.com/"}
							    
			};
		}

}
