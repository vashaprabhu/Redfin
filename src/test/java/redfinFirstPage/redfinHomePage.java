package redfinFirstPage;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.WebElementHandler;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.messages.internal.com.google.common.base.Functions;
import redfinResultPage.redfineResultPageEle;
import redfinUtils.TestBase;

public class redfinHomePage 
    extends TestBase{
	
	public WebDriver driver;
	
	public redfinHomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[contains(@class,'searchInputNode')]")
	WebElement citySearch;
	
	public WebElement getCitySearch() {
		return citySearch;
	}
	
	@FindBy(xpath = "//div[contains(@class,'SearchBox showResults')]//input[@id='search-box-input']")
	WebElement textBox;
	
	public WebElement getTextBox() {
		return textBox;
	}
	
	@FindBy(xpath = "//div[@class='SearchBox showResults']//button")
	WebElement searchButton;
	
	public WebElement getSearchButton() {
		return searchButton;
	}
	
	@FindBy(xpath = "//div[@class='guts']//h3")
	WebElement searchConfirmation;
	
	public void getSearchConfirmation() {
		WebDriverWait wait =new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(searchConfirmation));
		Assert.assertTrue(searchConfirmation.isDisplayed());

	
	}
	
	
	@FindBy(tagName = "a")
	List<WebElement> desiredCity;

     public redfineResultPageEle getDesiredCity(String city) throws InterruptedException {
    	 List<WebElement> cityInList = desiredCity;
     	for(WebElement lic : cityInList)
     	{
     		String scity = lic.getAttribute("href");
     		if(city.equals(scity)) {
     			JavascriptExecutor executor = (JavascriptExecutor)driver;
 			    executor.executeScript("arguments[0].click();", lic);
 			    break;
     		}
     	}
     	
     	return new redfineResultPageEle(driver);
     	

     }

	
}
