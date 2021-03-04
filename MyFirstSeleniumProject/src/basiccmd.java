import java.util.List;
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
public class basiccmd {

	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\SELVA\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement( By.name("q")).sendKeys("selenium");
		//Thread.sleep();
		driver.findElement(By.name("btnk")).click();
	//	driver.navigate().to("https://www.gmail.com/");
		// TODO Auto-generated method stub

	}

}
