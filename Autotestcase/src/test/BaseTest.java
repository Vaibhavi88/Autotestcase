package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.BaseClass;
import mainjava.DashBoardPage;
import mainjava.LoginPage;
import mainjava.PimPage;

public class BaseTest extends BaseClass {
	@BeforeSuite
	public void initBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
@BeforeClass
public void pageobjects() {
	loginPage = new LoginPage(driver);
	dashBoardPage = new DashBoardPage(driver);
	pimpage = new PimPage(driver);

}

@AfterClass
public void teardownLogout() {
	dashBoardPage.Clickonlogout();
}
@AfterSuite
public void tearDownEnvirnment() {
	driver.quit();
}
}

