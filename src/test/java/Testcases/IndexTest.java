package Testcases;
import org.testng.annotations.Test;
import AutomationDemo.DemoSite.BrowserLaunch;
import PageObject.IndexPO;

public class IndexTest extends BrowserLaunch {

	@Test
	public void testone() 
	{
		
		IndexPO ip = new IndexPO(driver);
		ip.clicksignin();
		
	}
}
	
