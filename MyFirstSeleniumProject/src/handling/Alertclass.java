package handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertclass {

	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver","D:\\SELVA\\chrome\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://demo.guru99.com/test/delete_customer.php");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
				driver.findElement(By.xpath("//input[@name='submit']")).click();
				Alert a = driver.switchTo().alert();
				System.out.println(a.getText());
				a.accept();
				Alert a1 = driver.switchTo().alert();
				System.out.println(a1.getText());
				a1.accept();
				
			
		// TODO Auto-generated method stub

	}

}
