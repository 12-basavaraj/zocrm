package generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+" Test Started",true);
		
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+" Test Passed",true);
		
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+" Test Failed",true);
		
	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+" Test Skipped",true);
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		Reporter.log(context.getName()+" Excecution Started",true);
		
	}

	public void onFinish(ITestContext context) {
		Reporter.log(context.getName()+" Excecution Finished",true);
		
	}
}
