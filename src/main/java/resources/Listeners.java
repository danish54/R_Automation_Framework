package resources;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends BaseClass implements ITestListener {

	ExtentTest test;
	ExtentReports extent = ExtendReportsNG.getExtentReportsObject();
	static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();

	public static ExtentTest getExtent() {

		return extentTest.get();
	}

	public static Listeners getObject() {
		Listeners lsner = new Listeners();
		return lsner;
	}

	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extentTest.get().log(Status.PASS, "Test Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//WebDriver driver;
		extentTest.get().fail(result.getThrowable());
		try {
			//driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
			//String filepath = captureScreenShot(result.getMethod().getMethodName());
			extentTest.get().addScreenCaptureFromPath(captureScreenShot(result.getMethod().getMethodName()),result.getMethod().getMethodName());
		} catch (Exception e) {
			extentTest.get().info(e.getMessage());
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		extentTest.get().log(Status.SKIP, "Test Skipped");
	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
