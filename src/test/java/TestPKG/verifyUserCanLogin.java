package TestPKG;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMClass.homePage;
import POMClass.loginPage;
import baseClass.BaseClass;

public class verifyUserCanLogin {
	WebDriver driver;
	loginPage lp;
	homePage hp;
	
	
	@BeforeClass
	public void beforeClass() {
		
		driver = BaseClass.getDriver("edge")  ;
	}
	
	@BeforeMethod
	public void beforeMethod() {
		lp =new loginPage(driver);
		hp = new  homePage(driver);
	}
	@Test
	public void verifyUserOnLoginPage() throws IOException, Exception {
		lp.clickOnSignIn();
		lp.insertData();
		Assert.assertTrue(hp.isSuccessfullyLogin());
	}

}
