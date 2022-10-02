import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class bankTestscript  {
	WebDriver driver;
  @Test
  public void f() {
	//Setup Chrome driver    	
  	//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Seun Onaleye\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
  	String baseUrl = "http://www.demo.guru99.com/V4/";
  	
  	// launch Firefox and direct it to the Base URL
  	driver.get(baseUrl);
  //}
 // @BeforeMethod
 // public void beforeMethod() {
//	  System.out.println("Starting Test On Chrome Browser");
  //}
 // @AfterMethod
 // public void afterMethod() {

	    // Enter username
	    driver.findElement(By.name("uid")).sendKeys("mngr1336");
	    System.out.println("Test1");


	    // Enter Password
	    driver.findElement(By.name("password")).sendKeys("dAnavUq");
	    System.out.println("Test1");

 
	    // Click Login
	    driver.findElement(By.name("btnLogin")).click();
	    System.out.println("Test1");
  }
}
