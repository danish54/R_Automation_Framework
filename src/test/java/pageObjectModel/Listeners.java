package pageObjectModel;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends BaseClass implements ITestListener {

	ExtentReports extentobj = ExtendReportsNG.getExtentReportsObject();
	static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();

	@Override
	public void onTestStart(ITestResult result) {
		extentTest.set(extentobj.createTest(result.getMethod().getMethodName()));
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extentTest.get().log(Status.PASS, "Test Passed");
	}

	
	@Override
	public void onTestFailure(ITestResult result) {
		// ThreadLocal<WebDriver> driver;
		extentTest.get().fail(result.getThrowable());
		try {
			//driver = (ThreadLocal<WebDriver>)
			//result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
			// String filepath = captureScreenShot(result.getMethod().getMethodName());
			//extentTest.get().addScreenCaptureFromPath(captureScreenShot(result.getMethod().getMethodName()),result.getMethod().getMethodName());
			
			extentTest.get().addScreenCaptureFromPath(captureScreenShot(result.getMethod().getMethodName()));
			
			
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
		extentobj.flush();
	}

}
