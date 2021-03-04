import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
 

import java.net.MalformedURLException;
import java.net.URL;

//import org.junit.Assert;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

//	public static void main(String[] args) {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","D:\\SELVA\\chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://gmail.com");
		   // String baseUrl = "http://gmail.com";
		 //   driver.get(baseUrl);
			//driver.navigate().forward();
		//	driver.navigate().back();
			driver.navigate().refresh();
		   String actualTitle = driver.getTitle();
		   WebElement firstnameTextbox = driver.findElement(By.name("first name"));
		   firstnameTextbox.sendKeys("firstname");
		   firstnameTextbox.clear();

		    String expectedTitle = "gmail";
		    if (actualTitle.contentEquals(expectedTitle)){
		        System.out.println("Test Passed!");
		    } else {
		        System.out.println("Test Failed");
		    }
		   
		    //close Fire fox
		    driver.close();
		   
		// TODO Auto-generated method stub

	}

}
