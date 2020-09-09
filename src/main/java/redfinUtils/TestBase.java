package redfinUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	public WebDriver driver;
	public static Properties prop;
	
	
	public WebDriver openBrowser() throws IOException {
		 
		prop = new Properties();
//		String filePath = "data.properties";
		String filePath = System.getProperty("user.dir")+"\\data.properties";
		FileInputStream fi = new FileInputStream(filePath);
		prop.load(fi);
		String sBrowser = prop.getProperty("browser");
		if(sBrowser.contains("ch"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	
	public String getURL() throws IOException {
		prop = new Properties();
		String filePath = System.getProperty("user.dir")+"\\data.properties";
		FileInputStream fi = new FileInputStream(filePath);
		prop.load(fi);
		String sURL = prop.getProperty("webAddress");
		return sURL;
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	public static void loadLog4j(String sLogfilePath) throws Exception {
		prop = new Properties();
		FileInputStream fileIn = new FileInputStream(sLogfilePath);
		prop.load(fileIn);
		PropertyConfigurator.configure(prop);
		
	}
	
	public String screenShot(String sTestName, WebDriver driver) throws Exception {
		TakesScreenshot takepic = (TakesScreenshot)driver;
		File source = takepic.getScreenshotAs(OutputType.FILE);
		String destinationPath = System.getProperty("user.dir")+"\\Screenshot\\"+sTestName+".png";
		File destinFile = new File(destinationPath);
		FileUtils.copyFile(source, destinFile);
		return destinationPath;
	}
	
   
}
