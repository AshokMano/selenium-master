import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivercmd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\SELVA\\chrome\\chromedriver.exe");
        //Dynamic binding
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/java/index.htm");
		String url = driver.getCurrentUrl();
		String pagesource = driver.getPageSource();
		String pagetitle = driver.getTitle();
		String windowHandle = driver.getWindowHandle();
//		Set window = driver.getWindowHandles();
		
		driver.get ("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.gmail.com");
		driver.navigate().refresh();
		driver.navigate().back();
		
		System.out.println("URL is " + url);
		System.out.println("GET TITLE" + pagetitle );
		System.out.println("WINDOW HANDLE" + windowHandle );
		System.out.println("PAGESOURCE" + pagesource );
		driver.close();
		
		
		
		
		
	}

}
