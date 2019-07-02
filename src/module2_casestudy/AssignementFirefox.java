package module2_casestudy;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignementFirefox {

	public static void main(String[] args) {
		//Open Browser
		
		System.setProperty("webdriver.gecko.driver","/selenium training/selenium/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
				
		driver.get("https://www.edureka.co/");
				
		driver.manage().window().maximize(); // To maximize the browser 
				
				//Locators
		
						//ID
					
						driver.findElement(By.id("search-inp")).sendKeys("selenium");
						
						/*//Name
						driver.findElement(By.name("user_v1[query]")).sendKeys("selenium");
						
						//Xpath
						
						driver.findElement(By.xpath("//*[@id='search-inp']")).sendKeys("selenium");
						
						//Class Name
						
						driver.findElement(By.className("search_inp")).sendKeys("selenium");
						
						//Css Locator
				
						driver.findElement(By.cssSelector("#search-inp")).sendKeys("selenium");
						
						//Linktext
						
						driver.findElement(By.linkText("Log In")).click();
						
						//PartialLinktext
						
						driver.findElement(By.partialLinkText("g I")).click();
						
						//TagName
						List<WebElement> taglist = driver.findElements(By.tagName("Search for a Course"));
						
						System.out.println(taglist.size());
						
						*/

	}

}
