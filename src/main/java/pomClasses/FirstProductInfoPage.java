package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstProductInfoPage {
	
WebDriver driver;
	
	@FindBy(xpath="//a[@id='isCartBtn_btn']")
	private WebElement addToCart;
	
	public FirstProductInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}
	public void clickOnAddToCart()
	{
		addToCart.click();
	}

}
