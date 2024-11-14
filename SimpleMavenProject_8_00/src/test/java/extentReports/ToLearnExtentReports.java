package extentReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReports {
	@Test
	public void report()
	{
		//step 1:create an instance of Extent Reports
		ExtentSparkReporter  spark = new ExtentSparkReporter("./HTML_report/extentReports.html");
		
		
		//step 2:create an instance of ExtentReports
		ExtentReports extReport = new ExtentReports();
		
		//step 3: attach an instance of extentsparkReportter to extentReporters
		
		extReport.attachReporter(spark);
		
		//step 4: create an instance of extentTest
		ExtentTest test = extReport.createTest("report");
		
		
		//step 5:call log() to provide status and log message 
		test.log(Status.PASS, "Log message entered into extent report");
		
		// step 6: call flush() to write message into destination
		extReport.flush();
			
	
		
		
		
		
		
	}

}
