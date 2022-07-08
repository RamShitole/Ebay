package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
WebDriver driver;
	
	@FindBy(xpath="//span[@class='BOLD']")
	private WebElement isVisible;
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}
	public String cartProductName()
	{
		
		return isVisible.getText();
	}

}
