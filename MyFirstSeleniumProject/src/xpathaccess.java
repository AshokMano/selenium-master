import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpathaccess {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\SELVA\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/index");
		// TODO Auto-generated method stub
//self
	WebElement w=driver.findElement(By.xpath("//a[text()=\"Learn Ajax\"]"));
	System.out.print("child:"+w.getTagName());
		System.out.println(w.getText());
		
//parent
	WebElement r=driver.findElement(By.xpath("//a[text()=\"Learn Ajax\"]/parent::li"));
	System.out.println("Parent:"+r.getTagName());
	System.out.println(r.getText());

	}

}
