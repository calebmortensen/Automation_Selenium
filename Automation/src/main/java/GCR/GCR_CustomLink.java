package GCR;


import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class GCR_CustomLink extends browser.Browsers {

	// NOTE: When logged in: 'My' & 'People' links become available

	
	@Test(priority = 1, description = "GCR_CustomLink", groups = "GCR")
	public void LinkNavigation() {

		// Gerrit Code Review (<<<<Link: Accessible as Footer of Every Page>>>>)
		System.out.println("Gerrit Code Review");
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Gerrit Code Review')]")));
		element.click();

		
		System.out.println("Switch back to Base URL");

		String base = driver.getWindowHandle();
		System.out.println("base: " + base);
		Set<String> set = driver.getWindowHandles();
		System.out.println("set: " + set);

		// Figure out how to close 2nd tab

		// ArrayList tabs = new ArrayList (driver.getWindowHandles());
		// System.out.println(tabs.size());
		// driver.switchTo().window((String) tabs.get(0));

		driver.switchTo().window(base);

		
	}
		

}
