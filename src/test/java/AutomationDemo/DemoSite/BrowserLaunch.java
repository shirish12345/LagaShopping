package AutomationDemo.DemoSite;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserLaunch {
	
	
	public static WebDriver driver;
	@Test
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shiridix\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
}
