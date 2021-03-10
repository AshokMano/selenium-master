/**
 * 
 */
/**
 * @author user
 *
 */
package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
import Pages.loginpackage;

import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URL;

//import org.junit.Assert;
//import org.testing.Assert;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.tes


	


public class LoginTest
{
	static WebDriver driver = new ChromeDriver();
	static loginpackage login=new loginpackage(driver);
	
	 static void setup1()
	 {
		System.setProperty("webdriver.chrome.driver","D:\\SELVA\\chrome\\chromedriver.exe");
		
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
	}
	 static void setup2() 
	 {
		
		login.set_username("ashok");
		login.set_password("ashokacs");
		login.click_button();
		
	}
	
	
public static void main(String[] args) 
{
	try
	{
	setup1();
	setup2();
	System.out.println("deepik");

	}
	catch(Exception e) {
		System.out.print(e.toString());
		
	}
	
}

//private static void setup() {
	// TODO Auto-generated method stub
	
}
