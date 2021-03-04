import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
 

import java.net.MalformedURLException;
import java.net.URL;

//import org.junit.Assert;
//import org.testing.Assert;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logincheck {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\SELVA\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
	WebElement username=driver.findElement(By.id("identifierId"));
	//WebElement password=driver.findElement(By.id("password"));
	//WebElement login=driver.findElement(By.xpath("//button[text()='sign in']"));
	  //  String actualTitle = "";
	username.sendKeys("ashok@gmail.com");
	//password.sendKeys("password");
	//login.click();
	
	String actualurl="https://gmail.com";
	String expectedurl=driver.getCurrentUrl();
	
//	Assert.(expectedurl,actualurl);
	 if (actualurl.contentEquals(expectedurl)){
	        System.out.println("Test Passed!");
	    } else {
	        System.out.println("Test Failed");
	    }
	

		// TODO Auto-generated method stub

	}

}
