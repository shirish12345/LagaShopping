package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPO {

	WebDriver d;

	public IndexPO(WebDriver driver) {
		d = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"btn1\"]")
	WebElement signIn;

	public void clicksignin() {
		signIn.click();
	}

}
