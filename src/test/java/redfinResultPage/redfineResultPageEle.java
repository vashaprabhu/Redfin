package redfinResultPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import redfinUtils.TestBase;

public class redfineResultPageEle extends TestBase{
	
  public WebDriver driver;

	public redfineResultPageEle(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//form[@class='SearchBoxForm']//div[@class='textContent']")
	WebElement cityTag;
	
	public String getSerachingCity() {
		return driver.getCurrentUrl();
		
	}
	public WebElement getSearchCity() throws InterruptedException {
		String actualTag = cityTag.getText();
		
		return cityTag;
		
	}
	
	@FindBy(xpath = "//span[@class='field select Select quickMinPrice withFlyout withOptions mounted selected clickable optional']/span[@class='input']")
	WebElement minPrice;
	
	public void getSelectedMinPrice(String value) throws InterruptedException {
			minPrice.click();
			Thread.sleep(3000);
			int minPriceIndex = Integer.parseInt(value);
			JavascriptExecutor je = (JavascriptExecutor)driver;
			je.executeScript("document.getElementsByClassName('option')["+minPriceIndex+"].click();" );
			
			
	}
	
	@FindBy(xpath = "//span[@class='field select Select quickMaxPrice withFlyout withOptions mounted selected clickable optional']/span[@class='input']")
	WebElement maxPrice;
	
	public void getSelectedMaxPrice(String value) throws InterruptedException {
		maxPrice.click();
		Thread.sleep(3000);
		int maxPriceIndex = Integer.parseInt(value);
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("document.getElementsByClassName('option')["+maxPriceIndex+"].click();" );
		
		
	}
	
	@FindBy(xpath = "//div[@class='homecards']//a")
	List<WebElement> homeAddressList;
	
	public void getAddressList(String splace) throws InterruptedException {
		Thread.sleep(3000);
		if(homeAddressList.size() >= 1)
		for(WebElement homes : homeAddressList )
		{
			boolean b;
			if(homes.getAttribute("href").contains(splace))
			{
				b = true;
				
			}
			else {
				b = false;
				break;
			}
			
		}
		else {
			System.out.println("No data for thr requirement");
			
		}
		
	}

}
