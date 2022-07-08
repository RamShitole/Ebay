package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	WebDriver driver;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement inputText;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement enterButton;
	@FindBy(xpath="(//h3[@class='s-item__title'])[2]")
	private WebElement clickOnProduct;
	
	public MainPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}
	
	public void enterText()
	{
		
		inputText.sendKeys("Realme");
		enterButton.click();
		
	}
	
	
}
