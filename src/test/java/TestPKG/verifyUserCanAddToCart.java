package TestPKG;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pomClasses.CartPage;
import pomClasses.FirstProductInfoPage;
import pomClasses.MainPage;
import pomClasses.ProductPage;

public class verifyUserCanAddToCart {
	
	WebDriver driver;
	MainPage mp;
	ProductPage pp;
	FirstProductInfoPage fip;
	CartPage cp;
	
	@BeforeClass
	public void beforeClass()
	{
		driver = BaseClass.getDriver("chrome");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		mp = new MainPage(driver);
		pp = new ProductPage(driver);
		fip = new FirstProductInfoPage(driver);
		cp = new CartPage(driver);
	}
	@Test
	public void productAddToCart()
	{
		mp.enterText();
		pp.clickOnFirstProduct();
		fip.clickOnAddToCart();
		Assert.assertEquals("Realme", cp.cartProductName());
	}

}
