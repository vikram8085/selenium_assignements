package module3_casestudy;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignementXpath {

	public static void main(String[] args) {
		// Open Browser
		
		System.setProperty("webdriver.chrome.driver","/selenium training/selenium/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); // pageload timeout
				
		driver.get("https://www.edureka.co/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // Implicit Wait for 20 seconds
		
	    driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS); // Script time out
	    
	    driver.findElement(By.xpath("//*[@id='search-inp']")).sendKeys("Selenium"); //xpath for search box
	    
	    WebElement searchIcon = driver.findElement(By.xpath("//*[@id='remote']/span[2]"));//xpath for search button
	    
	    searchIcon.click();
	    
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    
	    wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Selenium Certification Training"))).click(); //Added explicit wait for page to navigate to selenium course
	    
	    String Apptitle = driver.getTitle();//Capture the Title of the Page  
		System.out.println(Apptitle);  
		
		boolean Result = Apptitle.equals("Selenium Certification | Selenium Training | Selenium Course - Edureka"); // Title Validation
		
		System.out.println(Result);
		
		driver.navigate().back(); // TO Navigate to previous page
	   
	    FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)  //Fluent wait
	 	       .withTimeout(10, TimeUnit.SECONDS)
	 	       .pollingEvery(2, TimeUnit.SECONDS)
	 	       .ignoring(NoSuchElementException.class);
	    
	    driver.findElement(By.xpath("//*[@id='navbar']/ul/li[2]/a")).click();// All Courses from the menu

	    driver.quit();
	    System.out.println("The Browser closed succesfully");

	}

}
