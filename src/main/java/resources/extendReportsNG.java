package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportsNG {
	
	ExtentReports extent;
	
	public static ExtentReports getExtentReportsObject() {
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("Automation Report");
		report.config().setDocumentTitle("Automation");
		ExtentReports extent = new ExtentReports();
		extent.setSystemInfo("Tester", "Danish");
		extent.attachReporter(report);
		extent.setSystemInfo("User", System.getProperty("user.name"));
		extent.setSystemInfo("OS", System.getProperty("os.name"));
		extent.setSystemInfo("Version", System.getProperty("os.version"));
		extent.setSystemInfo("Architecture", System.getProperty("os.arch"));
		extent.setSystemInfo("Java Version", System.getProperty("java.specification.version"));
		return extent;
		
	}

}
