import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 

import java.net.MalformedURLException;
import java.net.URL;

//import org.junit.Assert;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSeleniumProgram {
	  public static void main(String[] args) {
    // declaration and instantiation of objects/variables
	//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	//WebDriver driver = new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver","D:\\SELVA\\chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours/");
    String baseUrl = "http://demo.guru99.com/test/newtours/";
    driver.get(baseUrl);

    String expectedTitle = "Welcome: Mercury Tours";
    String actualTitle = "";

    // launch Fire fox and direct it to the Base URL
    
    // get the actual value of the title
    actualTitle = driver.getTitle();

    /*
     * compare the actual title of the page with the expected one and print
     * the result as "Passed" or "Failed"
     */
    if (actualTitle.contentEquals(expectedTitle)){
        System.out.println("Test Passed!");
    } else {
        System.out.println("Test Failed");
    }
   
    //close Fire fox
    driver.close();
   
}

}