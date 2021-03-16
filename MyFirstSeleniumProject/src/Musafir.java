import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Musafir {

	public static void main(String[] args)  throws InterruptedException, IOException {
		
		Properties obj = new Properties();
		FileInputStream a = new FileInputStream(System.getProperty("user.dir")+"\\src\\musafir.properties");
		obj.load(a);
		
		
		System.setProperty("webdriver.chrome.driver",obj.getProperty("driver"));
		WebDriver driver = new ChromeDriver();
		driver.get(obj.getProperty("url"));
		WebElement drop = driver.findElement(By.xpath(obj.getProperty("from")));
		drop.sendKeys("TRV");
		Thread.sleep(1000);
		
		WebElement f2 = driver.findElement(By.xpath(obj.getProperty("To")));
		f2.sendKeys("MAA");
		
		WebElement f3 = driver.findElement(By.xpath(obj.getProperty("Leave")));
		f3.click();
		Thread.sleep(1000);
		
		WebElement f4 = driver.findElement(By.xpath(obj.getProperty("Start")));
		f4.click();
		
		WebElement f5 = driver.findElement(By.xpath(obj.getProperty("Return")));
		f5.click();
		Thread.sleep(1000);
		
		WebElement f6 = driver.findElement(By.xpath(obj.getProperty("End")));
		f6.click();
		
		WebElement f7 = driver.findElement(By.xpath(obj.getProperty("Adult")));
		f7.click();
		Thread.sleep(1000);
		Select s = new Select(f7);
		s.selectByIndex(2);
		f7.click();
		
		WebElement f8 = driver.findElement(By.xpath(obj.getProperty("Children")));
		f8.click();
		Thread.sleep(1000);
		Select s1 = new Select(f8);
		s1.selectByIndex(4);
		f8.click();
		
		WebElement f9 = driver.findElement(By.xpath(obj.getProperty("Infants")));
		f9.click();
		Thread.sleep(1000);
		Select s2 = new Select(f9);
		s2.selectByVisibleText("1 infant");
		f9.click();
	//	Thread.sleep(1000);
		
		WebElement f10 = driver.findElement(By.xpath(obj.getProperty("Find")));
		f10.click();
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}
	}

