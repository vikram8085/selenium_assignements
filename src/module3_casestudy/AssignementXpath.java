package module3_casestudy;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignementXpath {

	public static void main(String[] args) {
		// Open Browser
		
		System.setProperty("webdriver.chrome.driver","/selenium training/selenium/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // pageload timeout
				
		driver.get("https://www.edureka.co/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  // Implicit Wait for 20 seconds
		
	    driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS); // Script time out
	    
	    

		

	}

}
