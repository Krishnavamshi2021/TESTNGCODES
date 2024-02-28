package Axistestng.Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paralleltstng {
	
		  @Test
		  @Parameters("browser")
		  public void parameterizedtest(String browser) {
			  if (browser.equals("chrome")) {
	
				  System.setProperty("webdriver.chrome.driver",
							"C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");

				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.selenium.dev/");
			}else {
			  
		  
				System.setProperty("webdriver.edge.driver", 
						"C:\\Program Files\\Java\\msedgedriver.exe");

				EdgeDriver driver = new EdgeDriver();
				driver.get("https://www.selenium.dev/"); 

		 }
			  
		  }

		}