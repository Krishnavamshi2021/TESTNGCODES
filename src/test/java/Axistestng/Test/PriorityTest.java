package Axistestng.Test;

import org.testng.annotations.Test;

public class PriorityTest {
  @Test(enabled = false)
  public void testcase1() {
	  
	  System.out.println("First Test Case");
	  
  }
  
  @Test(priority = 2)
  public void testcase2() {
	  
	  System.out.println("second Test Case");
	  
	  
  }
  
  @Test(priority = 1)
  public void testcase3() {
	  
	  System.out.println("Third Test Case");
  }
	  
	  @Test(priority = 3)
	  public void testcase4() {
		  
		  System.out.println("fourth Test Case");
	  
	  
  }
	  @Test(dependsOnMethods = "testcase2" )
	  public void testcase5() {
		  
		  System.out.println("fifth Test Case");
	  }
	  
}
