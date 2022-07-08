package TestPKG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pomClasses.MainPage;
import pomClasses.ProductPage;

public class search {
	
	WebDriver driver;
	MainPage mp;
	ProductPage pp;
	
	@BeforeClass
	public void beforeClass()
	{
		driver = BaseClass.getDriver("chrome");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		mp= new MainPage(driver);
		pp = new ProductPage(driver);
		
	}
	@Test
	public void searchList()
	{
		mp.enterText();
		
	}

}
