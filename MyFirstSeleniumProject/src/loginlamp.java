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
public class loginlamp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\SELVA\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
        driver.manage().window().maximize();
                
        driver.get("https://accounts.lambdatest.com/login");
                
        WebElement email_field=driver.findElement(By.name("email"));
                
        email_field.sendKeys("ashokkumarm0007@gmail.com");
        
          WebElement password_field=driver.findElement(By.name("password"));
                
         password_field.sendKeys("ashok");
        
         WebElement login_button=driver.findElement(By.xpath("//button[text()='LOGIN']"));
             
        login_button.click();
        
         driver.findElement(By.xpath("//*[@id='app']/header/aside/ul/li[4]/a/span")).click();
        
          List <WebElement> radio_button=driver.findElements(By.name("radio"));
        
         radio_button.get(1).findElement(By.xpath("//span")).click();
                
        driver.close();
}
        
        //Closing the window
      //  driver.close();
        
        //Clicking on the 'login' button
		// TODO Auto-generated method stub

	}


