package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMLoginPage {
	
	WebDriver driver;
	By UserName = By.name("username");
	By Password = By.name("password");
	By LoginBtn = By.className("oxd-button");
	
	public OrangeHRMLoginPage(WebDriver driver) { //constructor
		this.driver = driver;
	}
	
	//set the username in textbox
		public void setUserName(String strUserName) {
			driver.findElement(UserName).sendKeys(strUserName);
		}
		
		//set the password in textbox
		public void setPassword(String strPassword) {
			driver.findElement(Password).sendKeys(strPassword);
		}
		
		//Click on Login button
		public void clickLogin() {
			driver.findElement(LoginBtn).click();
		}
		
		//get the message of login page
//		public String getLoginText() {
//			return driver.findElement(message).getText();
//		}
		
		// this POM method will be used in test cases to do the login
		public void loginToApplication(String strUserName,String strPassword) {
			//fill user name
			this.setUserName(strUserName);
			this.setPassword(strPassword); //to fill password
			this.clickLogin(); // to click login button
		}
}
