/**
 * 
 */
/**
 * @author user
 *
 */
package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 

import java.net.MalformedURLException;
import java.net.URL;

//import org.junit.Assert;
//import org.testing.Assert;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpackage {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
	private  WebDriver driver;
	@FindBy(id="username")
	WebElement username;
	@FindBy(id="password")
	WebElement password ;
	@FindBy(className="btn-info")
	WebElement button;
	
	public   loginpackage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void set_username(String ashok)
	{
		username.clear();
		username.sendKeys(ashok);
	}
	public void set_password(String ashokacs)
	{
		password.clear();
		password.sendKeys(ashokacs);
	}	
	public void click_button()
	{
		button.submit();
	}
	
		
		
	
	
	

	}



