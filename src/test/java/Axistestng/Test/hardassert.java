package Axistestng.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class hardassert {
  @Test
  public void testhardassert() throws InterruptedException {
	  

	  
	  WebDriver driver =new ChromeDriver() ;
	  
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  String actualtittle = driver.getTitle();
	  String expectedtitle = "Orange";
	  
	
	  Assert.assertEquals(actualtittle, expectedtitle);
	  
	  Thread.sleep(500);
	  
	  driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Admin");
	  driver.close();
	  
  }
  }
