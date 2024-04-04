package Element_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Library.BasePage;

public class Book_Page extends BasePage {

	public Book_Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[text()=\"Computing and Internet\"]/../../../..//input")
	private WebElement clickOnAddtocartButton;

	public WebElement getClickOnAddtocartButton() {
		return clickOnAddtocartButton;
	}
	
	@FindBy(xpath="//input[@name='continueshopping']")
	private WebElement continueshoppingbutton;

	public WebElement getContinueshoppingbutton() {
		return continueshoppingbutton;
	}
	
}
