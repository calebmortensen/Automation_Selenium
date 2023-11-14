import org.testng.annotations.Test;

public class TestDependency {
	static string trackingNumber = null;
//Note: even if priorities are set with dependencies, priorities are ignored
	//@Ignore //Nothing will run
	@Test(priority = 1)
	public void CreateShipment() {
		//System.out.println(5/0); //this will throw exception and remaining code will NOT be run
		System.out.println("CreateShipment");
		trackingNumber = "ABC12YH"
	}

	@Test(priority = 2, dependsOnMethods = { "CreateShipment" }, alwaysRun = true) //alwaysRun still runs even with dependency
	public void TrackShipment throws Exception() {
		if (trackingNumber != null)
			System.out.println("TrackShipment");
	}else throw new Exception("Invalid Tracking Number")

	
	@Test(priority = 3, dependsOnMethods = { "CreateShipment", "TrackShipment" }, ignoreMissingDependencies = true)
	public void CancelShipment throws Exception() {
		if (trackingNumber != null)
			System.out.println("CancelShipment");
	}else throw new Exception("Invalid Tracking Number")

}
