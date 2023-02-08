package test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PimTest extends CommonTest{
	
	
	@Test(priority=4,groups= {"smoke","regession"})
	public void verifyPIMpageTitle() {
		pimpage.clickPimPageLink();
	String verifytitleofPim	= pimpage.getPimPageTitle();
	Assert.assertEquals(verifytitleofPim, "PIM");
		}
	
	@Test(priority=7,groups= {"smoke","regession"})
	public void verifyaddButton() {
		pimpage.clickaddbutton();
	String verifyaddbuttn= pimpage.verifyaddbutton();
	Assert.assertEquals(verifyaddbuttn, "Add Employee");

}
	@Test(priority=5,groups= {"smoke","regession"})
public void verifyEmployname() {
		pimpage.setemplyName("Alice");
		pimpage.clickSearchBtn();
		String verifycorrectdataem= pimpage.getserchdataempname("Alice");
	Assert.assertEquals(verifycorrectdataem, "Alice");
	}
	@Test(priority=6,groups= {"smoke","regession"})
	public void verifyEmpSearchEmpId() {
		pimpage.setPimPageEmpId("0221");
		pimpage.clickSearchBtn();
		String verifyEmpIdAppeared= pimpage.getEmpIdFromSearchedResults("0221");
		Assert.assertEquals(verifyEmpIdAppeared, "0221");
	}

}