package ReportListeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import redfinUtils.TestBase;

public class listener extends TestBase implements ITestListener{
	
	public static String sMethodName;
	public WebDriver driver;

//	static String reportFilePath = System.getProperty("user.dir")+"\\ExtentReport\\redfinReport.html";
	static String reportFilePath = "C:\\Users\\varsh\\Documents\\TekArch_Training\\Redfin_Cucumber\\ExtentReport\\redfinReport.html";

	public static ExtentReports reports= new ExtentReports(reportFilePath) ;
	public static ExtentTest test;
	

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		sMethodName = result.getMethod().getMethodName();
		test = reports.startTest(sMethodName);
	
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(LogStatus.PASS, "Test Pass");
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String sMethodName = result.getMethod().getMethodName();
		test.log(LogStatus.FAIL, result.getThrowable() );
		
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch(Exception e) {
			System.out.println("Exception" +e);
		}
		
		try {
			test.log(LogStatus.FAIL, test.addScreenCapture(screenShot(sMethodName, driver)));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		reports.flush();
		
	}

}
