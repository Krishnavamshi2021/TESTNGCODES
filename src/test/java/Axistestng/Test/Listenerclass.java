package Axistestng.Test;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;


public class Listenerclass implements ITestListener {
		  @Test
		  public void onTestStart(ITestResult result) {
			  System.out.println("Testcase execution is started");
		  }
		  public void onTestSuccess(ITestResult result) {
			  System.out.println("Testcase execution is completed successfully");
		  }
		  public void onTestFailure(ITestResult result) {
			  System.out.println("Testcase is failed");
		  }
		  public void onTestSkipped(ITestResult result) {
			  System.out.println("Testcase is skipped");
		  }
		  public void onTest(ITestResult result) {
			  System.out.println("Testcase execution is started");
		  }
		  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
				
				System.out.println("Testcase failed with few steps passed");
		}
}

	




	


