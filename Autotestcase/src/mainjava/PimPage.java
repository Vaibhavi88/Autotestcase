package mainjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class PimPage extends BaseTest {
	@FindBy(xpath="//*[text()='PIM']")
	WebElement setPIMPage ;
	
	@FindBy(xpath="//h6[text()='PIM']")
	WebElement titleofPimPage;
	
	@FindBy(xpath="//i[@class=\"oxd-icon bi-plus oxd-button-icon\"]")
	WebElement clickaddbutton;
	
	@FindBy(xpath="//input[@placeholder=\"Type for hints...\"]")
     WebElement Employnametxtbox;
	//@FindBy(xpath="//input[@placeholder=\"Type for hints...\"]")
//	WebElement verifyemdata;
//	WebElement Employ
//WebElement target = driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-plus oxd-button-icon\"]"));
//	Actions act = new Actions(driver);
//	act.moveToElement(target).perform();

	@FindBy(xpath="//h6[text()='Add Employee']")
	WebElement addbuttonverify;
	
	@FindBy(xpath="//div[@class='oxd-form-row']//input[@class='oxd-input oxd-input--active']")
	WebElement setEmpId;

	@FindBy(xpath="//button[@type='submit']")
	WebElement clickSearch;
	
	@FindBy(xpath="//*[@class='orangehrm-container']")
	WebElement searchedRecordId;
	@FindBy(xpath="//*[@class='orangehrm-container']")
	WebElement searchedRecordName;
	
public PimPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
/*
 * Author : Vaibhavi Nighvekar
 * Date : 06 Feb 2023
 * Description : This test method use to click on Pim Page 
 */
public void clickPimPageLink() {
	setPIMPage.click();
}
/*
* Author : Vaibhavi Nighvekar
* Date : 06 Feb 2023
* Description : This test method use to return Pim Page text
* parameter= string
*/
public String getPimPageTitle() {
return titleofPimPage.getText();

}
/*
* Author : Vaibhavi Nighvekar
* Date : 06 Feb 2023
* Description : This test method use to click Add button
*/

public void clickaddbutton() {
	clickaddbutton.click();
}
/*
* Author : Vaibhavi Nighvekar
* Date : 06 Feb 2023
* Description : This test method use to verify Add button 
*/

public String verifyaddbutton() {
return addbuttonverify.getText();
}
/*
* Author : Vaibhavi Nighvekar
* Date : 06 Feb 2023
* Description : This test method use to verify employnametextbox accepting alphabate
*/
public void setemplyName(String empName) {
	Employnametxtbox.sendKeys(empName);
}
/*
* Author : Vaibhavi Nighvekar
* Date : 06 Feb 2023
* Description : This test method use to return employeename text form search results
* parameter= string
*/
public String getserchdataempname(String empName ) {
	clickSearch.click();
	return searchedRecordName.findElements(By.xpath("//div[text()='"+empName+"']")).get(0).getText();
}

/*
 * Author : Vaibhavi Nighvekar
 * Date : 06 Feb 2023 
 * Description : This test method use to set emp id  
 */
public void setPimPageEmpId(String empId) {
	setEmpId.sendKeys(empId);
}
/*
 * Author : Vaibhavi Nighvekar 
 * Date : 06 Feb 2023 
 * Description : This test method use to click search button  
 */
public void clickSearchBtn() {
	clickSearch.click();
}

/*
 * Author : Vaibhavi Nighvekar
 * Date : 06 Feb 2023 
 * Description : This test method use to get emp id from searched results
 * Parameter: String  
 */
public String getEmpIdFromSearchedResults(String empId) {
	clickSearch.click();
	return searchedRecordId.findElements(By.xpath("//div[text()='"+empId+"']")).get(0).getText();
}
}