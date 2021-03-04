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
public class mailcheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\SELVA\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("ashokkumarm0007@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("ashokdeepika");
		driver.findElement(By.name("login")).click();
	//	driver.close();
		// TODO Auto-generated method stub
	}
;
}
