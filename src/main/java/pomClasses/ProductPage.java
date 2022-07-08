package pomClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	WebDriver driver;
	
	@FindBy(xpath="(//h3[@class='s-item__title'])[2]")
	private WebElement clickOnProduct;
	@FindBy(xpath="//h3[@class='s-item__title']")
	private WebElement proList;
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}
	public void clickOnFirstProduct()
	{
		clickOnProduct.click();
	}
	public void listOfSearchProduct()
	{
		List <WebElement> product = driver.findElements(By.xpath("//h3[@class='s-item__title']"));
		product.size();
		for(int i=0; i<product.size(); i++)
		{
		
		}
	}
	

}
