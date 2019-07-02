package module2_casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignement {

	public static void main(String[] args) {
		//Open Browser
		System.setProperty("webdriver.chrome.driver","/selenium training/selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.edureka.co/");
		
		driver.manage().window().maximize(); // To maximize the browser
		
		//Locators
			/*	//ID
				driver.findElement(By.id("search-inp")).sendKeys("Course");
				
				//Name
				driver.findElement(By.name("user_v1[query]")).sendKeys("Course");
				
				//Xpath
				
				driver.findElement(By.xpath("//*[@id='search-inp']")).sendKeys("Course");
				
				//Class Name
				
				driver.findElement(By.className("search_inp")).sendKeys("Course");
				*/
				
				//Css Locator
		
				driver.findElement(By.cssSelector("#search-inp")).sendKeys("Course");
		
	
		
	/*	//Firefox
		
		System.setProperty("webdriver.gecko.driver","/selenium training/selenium/drivers/geckodriver");
		WebDriver driver1 = new FirefoxDriver();
		
		driver1.get("https://www.edureka.co/");
		
		driver1.manage().window().maximize(); // To maximize the browser 
	*/	
		

	}

}
