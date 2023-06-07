package pages;

import org.openqa.selenium.WebDriver;

public class OrangeHRM_HomePage {
	
	WebDriver driver;
	
	public OrangeHRM_HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}

}
