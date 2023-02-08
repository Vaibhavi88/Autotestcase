package test;

import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginTest extends BaseTest {
	@Test(priority = 0,groups = {"smoke","regession"})
	public void verifyTitleofloginpage() {
		String verifytitleofpge =loginPage.titleofLoginPage(); 
		Assert.assertEquals(verifytitleofpge, "Login");
	}
	@Test(priority = 1,groups = {"smoke","regession"})
	public void verifyCurrentUrlofPage() {
		String verifyurlPage =loginPage.urlofPage();
		Assert.assertEquals(verifyurlPage, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(priority = 2,groups = {"smoke","regession"})
	public void verifyloginwithcorrectcredentials() {
		loginPage.setUserName("Admin");
		loginPage.setPassword("admin123");
		loginPage.clickloginBtn();
		String titleofDash = dashBoardPage.titleofDashboardpage();
		Assert.assertEquals(titleofDash, "Dashboard");
	}
	@Test(priority = -1,groups = {"smoke","regession"})
	public void verifyBuildTitlename() {
		String verifyTitlofBuid = loginPage.getBuildTitle();
		Assert.assertEquals(verifyTitlofBuid, "OrangeHRM");
}
}