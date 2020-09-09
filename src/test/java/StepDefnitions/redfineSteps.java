package StepDefnitions;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.WebElementHandler;

import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import redfinFirstPage.redfinHomePage;
import redfinResultPage.redfineResultPageEle;
import redfinUtils.TestBase;

public class redfineSteps extends TestBase{
	
//	redfinHomePage  redfinPage;
	
	redfineResultPageEle redfinResult;
	Logger log = Logger.getLogger(getClass().getSimpleName());
	
	
	public void setting_log4j() throws Exception {

		loadLog4j("C:\\Users\\varsh\\Documents\\TekArch_Training\\Redfin_Cucumber\\src\\main\\java\\Resources\\log4j.properties");
		
	}
	
	@Given("^Connect to \"([^\"]*)\"$")
    public void connect_to_something(String sBrowser) throws Throwable {
		driver = openBrowser();
		log.info("Browser Opened");
		
    }

    @When("^open \"([^\"]*)\" website$")
    public void open_something_website(String sURL) throws Throwable {
    	String appAddress = getURL();
    	driver.get(appAddress);
    	log.info("Application opened");

    }

    @Then("^enter \"([^\"]*)\" to search$")
    public void enter_something_to_search(String place) throws Throwable {
    	redfinHomePage  redfinPage = new redfinHomePage (driver);
    	redfinPage.getCitySearch().click();
    	redfinPage.getTextBox().sendKeys(place);
    	
    }
    
    @Then("^click on search$")
    public void click_on_search() throws Throwable {
    	redfinHomePage  redfinPage = new redfinHomePage (driver);
    	redfinPage.getSearchButton().click();
    	

    }
    
    @Then("^Did you mean dialogbox pops up$")
    public void did_you_mean_dialogbox_pops_up() throws Throwable {
    	redfinHomePage  redfinPage = new redfinHomePage (driver);
    	redfinPage.getSearchConfirmation();
    }

    @Then("^select \"([^\"]*)\" you want$")
    public void select_something_you_want(String city) throws Throwable {
    	redfinHomePage redfinPage = new redfinHomePage (driver);
    	redfinResult = redfinPage.getDesiredCity(city);
    
    }
	
    
    @Then("^Check the displayedCity is same as entered \"([^\"]*)\"$")
    public void check_the_displayedCity_is_same_as_entered(String enteredCity) throws Throwable {
    	redfinResult = new redfineResultPageEle(driver);
        String str = redfinResult.getSearchCity().getText();
        Assert.assertTrue("Entered City and Displayed City are same", enteredCity.equalsIgnoreCase(str));

    }
    
    @Then("^Enter \"([^\"]*)\" and \"([^\"]*)\" in the list$")
    public void enter_and_in_the_list(String minVal, String maxVal) throws Throwable {
    	redfinResult = new redfineResultPageEle(driver);
    	redfinResult.getSelectedMinPrice(minVal);
    	redfinResult.getSelectedMaxPrice(maxVal);
    }
    
    @Then("^check listed homes are from the \"([^\"]*)\"$")
    public void check_listed_homes_are_from_the(String splace) throws Throwable {
    	redfinResult = new redfineResultPageEle(driver);
    	redfinResult.getAddressList(splace);
    	closeBrowser();
    }


}
