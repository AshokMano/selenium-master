package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MusafirMaven {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\SELVA\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.musafir.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 20);
	}

	@Test
	public void page1() {
		WebElement drop = driver.findElement(By.xpath("//input[@name='Origin']"));
		drop.sendKeys("TRV");

		WebElement from = driver.findElement(By.xpath("//li[text()='Thiruvananthapuram, India (']"));
		from.click();

		WebElement drop1 = driver.findElement(By.xpath("//input[@name='Destination']"));
		drop1.sendKeys("MAA");

		WebElement to = driver.findElement(By.xpath("//li[text()='Chennai, India (']"));
		to.click();

		WebElement drop2 = driver.findElement(By.xpath("//input[@name='StartDate']"));
		drop2.click();

		WebElement start = driver.findElement(By.xpath("//li[@date='2021-03-30']"));
		start.click();

		WebElement drop3 = driver.findElement(By.xpath("//input[@name='EndDate']"));
		drop3.click();

		WebElement end = driver.findElement(By.xpath("//li[@date='2021-03-31']"));
		end.click();

		WebElement drop4 = driver.findElement(By.xpath("//select[@name='AdultsFlight']"));
		drop4.click();

		Select s = new Select(drop4);
		s.selectByIndex(0);
		drop4.click();

		WebElement drop5 = driver.findElement(By.xpath("//select[@name='ChildrenFlight']"));
		drop5.click();

		Select s1 = new Select(drop5);
		s1.selectByIndex(0);
		drop5.click();

		WebElement drop6 = driver.findElement(By.xpath("//select[@name='InfantsFlight']"));
		drop6.click();

		Select s2 = new Select(drop6);
		s2.selectByIndex(0);
		drop6.click();

		WebElement drop7 = driver.findElement(By.xpath("//i[contains(text(),'Find flights')]"));
		drop7.click();
	}

@Test
public void page2()
{
	WebElement button = driver.findElement(By.xpath("//i[text()='Book']"));
	button.click();
}
@Test
public void page3()

{
WebElement drop8 = driver.findElement(By.xpath("(//select[@data-value-rule='required'])[1]"));
	drop8.click();

Select s3 = new Select(drop8);
	s3.selectByIndex(1);
	drop8.click();
	
	WebElement button1 = driver.findElement(By.xpath("//input[@placeholder='First name']"));
	button1.sendKeys("ASHOK");
	
	WebElement button2 = driver.findElement(By.xpath("//input[@placeholdevalue='Last name']"));
	button2.sendKeys("KUMAR");
	
	WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email address']"));
    email.sendKeys("ashokkumarm0007@gmail.com");
	
	WebElement phone = driver.findElement(By.xpath("//input[@placeholder='Phone number']"));
	phone.sendKeys("9965990445");
	

	WebElement continueclick = driver.findElement(By.xpath("//*[@id='btnContinue']"));
	continueclick.click();
}
}



