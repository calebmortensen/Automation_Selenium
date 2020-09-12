package GCR;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;


public class GCR_CustomFilter extends browser.Browsers {

	// NOTE: When logged in: 'My' & 'People' links become available!

	@Test(priority = 1, description = "GCR_MainSearch", groups = "GCR")
	@Parameters({ "searchMain" })
	public void MainSearch(String searchMain) {

		// MAIN SEARCH PANEL <Enter Data>
		System.out.println("Search Panel");
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='searchPanel']//input[@type='text']")));
		element.clear();
		element.sendKeys(searchMain);
		
	}
	   @Test(priority = 2, description = "GCR_MainSearch", groups = "GCR")
	   public void SearchButton() {

		// SEARCH BUTTON <Click>
		System.out.println("Search Button");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button']")));
		element.click();
	}
	   
	   
	   @Test(priority = 3, description = "GCR_SearchDropListDocs", groups = "GCR")
	   public void SearchDropListDocs() {
  
		// SEARCH (Drop List) <Docs>
		System.out.println("Search Drop Down <Docs>");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@class='searchDropdown']")));
		element.click();
		element.clear();
		Select drpDown = new Select(driver.findElement(By.xpath("//select[@class='searchDropdown']")));
		drpDown.selectByVisibleText("Docs");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button']")));
		element.click();

			
	   }
	   
	   @Test(priority = 4, description = "GCR_SearchDropListChanges", groups = "GCR")
	   public void SearchDropListChanges() {
  
	   
		// SEARCH DROP DOWN <Changes>
		System.out.println("Search Drop Down <Changes>");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@class='searchDropdown']")));
		element.click();
		Select dropDown = new Select(driver.findElement(By.xpath("//select[@class='searchDropdown']")));
		dropDown.selectByVisibleText("Changes");
		element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button']")));
		element.click();

	}


}
