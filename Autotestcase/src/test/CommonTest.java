package test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class CommonTest extends BaseTest {
	@BeforeClass
	public void login() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginPage.setUserName("Admin");
		loginPage.setPassword("admin123");
		loginPage.clickloginBtn();
		String titleofDash = dashBoardPage.titleofDashboardpage();
		Assert.assertEquals(titleofDash, "Dashboard");
	}

}
