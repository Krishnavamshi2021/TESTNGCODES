package Axistestng.Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Listeners(Listenerclass.class)

public class listenertestclass {


	@Test
	public void invokechrome() {
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumdev/");
		
		
		
		
		
		
	}
	
	
	

}