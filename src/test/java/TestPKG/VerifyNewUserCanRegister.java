package TestPKG;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMClass.registrationPage;
import baseClass.BaseClass;

public class VerifyNewUserCanRegister {
	WebDriver driver;
	registrationPage rp ;
	
	
	@BeforeClass
	public void beforeClass() {
		
		driver = BaseClass.getDriver("edge")  ;
	}
	
	@BeforeMethod
	public void beforMethod() {
		rp= new registrationPage(driver);
		
	}
	@Test
	public void userCanAddData() throws IOException, Exception {
		
		rp.clickOnRegister();
	//	Assert.assertTrue(rp.isOnRegistrationPage());
		rp.insertRegisterData();
		
	}

}
