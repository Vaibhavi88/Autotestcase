package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest{
	// All the locators of page
	@FindBy(xpath = "//*[text()='Login']")
	WebElement txtLoginPage ;
	@FindBy(name="username")
	WebElement userName;
	@FindBy(name="password")
	WebElement pass;
	@FindBy(tagName="button")
	WebElement btnlogin ;
//Initialization of locators/variables
	public LoginPage(WebDriver driver ) {
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	// methods required to performs test steps
	/*
	 * Author : Vaibhavi Nighvekar
	 * Date : 05 Feb 2023
	 * Description : This test method use to verify login page title
	 * Parameter return : string
	 */
	public String titleofLoginPage() {
		return txtLoginPage.getText();
		
	}
		/*
		 * Author : Vaibhavi Nighvekar
		 * Date : 05 Feb 2023
		 * Description : This test method use to verify current url of page
		 * Parameter return : string
		 */
	public String urlofPage() {
		return driver.getCurrentUrl();	
	}
	/*
	 * Author : Vaibhavi Nighvekar
	 * Date : 05 Feb 2023
	 * Description : This test method use to set usernameValue
	 */
	public void setUserName(String usrName) {
		userName.sendKeys(usrName);
	}
	/*
	 * Author : Vaibhavi Nighvekar
	 * Date : 05 Feb 2023
	 * Description : This test method use to set passwordValue
	 */
	public void setPassword(String password) {
		pass.sendKeys(password);
}
	/*
	 * Author : Vaibhavi Nighvekar
	 * Date : 05 Feb 2023
	 * Description : This test method use to click on login button
	 */
	public void clickloginBtn() {
		btnlogin.click();
}
	/*
	 * Author : Vaibhavi Nighvekar
	 * Date : 05 Feb 2023
	 * Description : This test method use to get title of build 
	 * Parameter return : string
	 */
public String getBuildTitle() {
	return driver.getTitle();
}
}