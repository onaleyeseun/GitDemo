import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testingCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setup Chrome driver    	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Seun Onaleye\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Go to http://www.demo.guru99.com/V4/
		 String baseUrl = "http://www.demo.guru99.com/V4/";
	     driver.get(baseUrl);
        //Day1 ---Day3(wrong login details)
	   //Enter valid userid
	     driver.findElement(By.name("uid")).sendKeys("mngr414506wrg");
	     //Enter valid password
	     driver.findElement(By.name("password")).sendKeys("abezeny");
	     //click login
	    driver.findElement(By.name("btnLogin")).click();
	    //Day2
	    String actualTitle= "";

	}

}
