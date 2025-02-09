package listenerclass;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class mylistener implements ITestListener {
	
	public void onTestStart(ITestResult result) {
	    System.out.println("on test start");
	  }
	public void onTestSuccess(ITestResult result) {
		System.out.println("on Test Success");
	  }
	public void onTestFailure(ITestResult result) {
		System.out.println("on Test Failure");
	  }
	public void onTestSkipped(ITestResult result) {
		System.out.println("on Test Skipped");
	  }
	public void onStart(ITestContext context) {
		System.out.println("on start");
	  }
	public void onFinish(ITestContext context) {
		System.out.println("on finish");
	  }

}
