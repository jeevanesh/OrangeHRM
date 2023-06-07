package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pages.OrangeHRMLoginPage;
import pages.OrangeHRM_HomePage;

public class OrangeHRMLoginTest {
	
	WebDriver driver;
	OrangeHRMLoginPage objLoginPage;
	OrangeHRM_HomePage objHomePage;
	
	@BeforeTest
	public void Setup() {	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
	}
	
	@Test
	public void loginTest() {
		
		objLoginPage = new OrangeHRMLoginPage(driver);
		objLoginPage.loginToApplication("Admin", "admin123");
		
		objHomePage = new OrangeHRM_HomePage(driver);
		Assert.assertTrue(objHomePage.getHomePageTitle().contains("OrangeHRM"));
		
	}
}
