package demo;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_Test {
	public static void main(String[] args) {
		
	
   //create the sparkReport
		ExtentSparkReporter spark =new ExtentSparkReporter("./AdvanceREports/report.html");
		
		//configure the SparkReport Information
		spark.config().setDocumentTitle("Regression Testing for the LearningPage");
		spark.config().setReportName("RegressionSuite||Verfication ");
		spark.config().setTheme(Theme.DARK);

		//Create the Extent Report
		ExtentReports report= new ExtentReports();
		
		//Attach the spark Report and ExtentReport
		report.attachReporter(spark);
		
		
		//configure the system information in extent Report
		report.setSystemInfo("DeviceName:", "urmila");
		report.setSystemInfo("OperatingSystem:", "WINDOWS 11");
		report.setSystemInfo("Browser.","Chrome");
		report.setSystemInfo("BrowserVersion","Chrome-128.0.6613.85");
	}
	@AfterSuite
	public void suiteTerminate() {
		//Flush the Report Information
		report.flush();
		
		//create the Test Information
		ExtentTest test =report.createTest("Regression");
		
		//steps information
		test.log(Status.INFO,"step1: Launching The Browser Sucessful");
		
		test.log(Status.INFO, "step2: Navigating To Application via URL sucessfull");
		
		test.log(Status.PASS,"step3:Verified the WebPage sucessful");
		
		if("urmila".equals("urmila")) {
			test.log(Status.PASS, "step4:verified the WebElementis Diaplayed");
		}else {
			test.log(Status.FAIL,"step4:verified the WebElementis not Displayed");
			
		}
		 
		//test.log(Status.SKIP,"step5:Elements is hidden");
		
		//Flush the Report information
		
		System.out.println("Execution done");
		}
	}
		
	


