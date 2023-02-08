package mainjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class DashBoardPage extends BaseTest {
	// All the locators of page
		@FindBy(xpath = "//h6[text()='Dashboard']")
		WebElement titleDashboard ;
		@FindBy(css=".oxd-userdropdown i")
		WebElement clickLogoutDrpDown;
		
		@FindBy(xpath="//*[text()='Logout']")
		WebElement clickLogoutText;
		//Initialization of locators/variables
		public DashBoardPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this); //*
		}
		
		
		// methods required to performs test steps
		/*
		 * Author : Vaibhavi Nighvekar
		 * Date : 05 Feb 2023
		 * Description : This test method use to verify DashBoard page title
		 * Parameter return : string
		 */
		public String titleofDashboardpage() {
			return titleDashboard.getText();
			
}
		/*
		 * Author : Vaibhavi Nighvekar
		 * Date : 05 Feb 2023
		 * Description : This test method use to logout
		 */
		public void Clickonlogout() {
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.navigate().refresh();
			clickLogoutDrpDown.click();
			clickLogoutText.click();
}
}