package browser;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class Browsers {
	
	public static WebDriver driver;
	public static WebElement element;
	public static Thread thread;
	public static WebDriverWait wait;
	public static Select select;
	public static boolean checked;
	

	//INTERNET EXPLORER
	@Test(priority=1, description = "Launch Internet Explorer", groups = "Browser")
	public void IELaunch(){

		System.out.println("Launch Internet Explorer");
		// Set path of IEDriverServer.exe
				File file = new File("./lib/IEDriverServer.exe");
				System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
				DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
				
				// Used the following to speed up sendKeys rather than using 32bit driver
				caps.setCapability("requireWindowFocus", true);
				caps.setCapability("nativeEvents", false);
				caps.setCapability("unexpectedAlertBehaviour", "accept");
				caps.setCapability("ignoreProtectedModeSettings", true);
				caps.setCapability("disable-popup-blocking", true);
				caps.setCapability("enablePersistentHover", true);
				caps.setCapability("ignoreZoomSetting", true);
				caps.setCapability("ie.ensureCleanSession", true);
				
				InternetExplorerOptions ieOptions = new InternetExplorerOptions();		
			    ieOptions.requireWindowFocus();
			    						        
				driver = new InternetExplorerDriver(caps);
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				System.out.println("IE Startup Complete");
				
				wait = new WebDriverWait(driver, 10);
		
	}
	
	
	//EDGE
	@Test(priority=2 ,description = "Launch Edge", groups = "Browser")
	public void EdgeLaunch() {

		System.out.println("Launch Edge");
		File file = new File("./lib/MicrosoftWebDriver.exe");
		System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
		EdgeOptions options = new EdgeOptions();
		driver = new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Startup Complete");
		
		wait = new WebDriverWait(driver, 10);

	}

	//chrome.exe --user-data-dir="C://Chrome dev session" --disable-web-security
	//CHROME
	@Test(priority=3, description = "Launch Chrome", groups = "Browser")
	public void ChromeLaunch() {
		
		System.out.println("Chrome Launch");
		File file = new File("./lib/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		//Set Zoom Level to 100%
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--user-data-dir=\"C://Chrome dev session\" --disable-web-security");
		//options.addArguments("--allow-running-insecure-content");
		element = driver.findElement(By.tagName("html"));
		element.sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Startup Complete");
		
		wait = new WebDriverWait(driver, 10);
		
	}
	
	//FIREFOX
	@Test(priority=4, description = "Launch Firefox", groups = "Browser")
	public void FirefoxLaunch() {
		
		System.out.println("Launch Firefox");
		File file = new File("./lib/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Startup Complete");
		
		wait = new WebDriverWait(driver, 10);
				 
	}
	
	
}
