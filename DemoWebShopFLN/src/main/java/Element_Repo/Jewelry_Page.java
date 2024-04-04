package Element_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Library.BasePage;

public class Jewelry_Page extends BasePage {
	
	public Jewelry_Page(WebDriver driver) {
		super(driver);
	
	}

	@FindBy(xpath="//a[text()='Black & White Diamond Heart']/../../..//input")
	private WebElement Clickonaddtocart;

	public WebElement getClickonaddtocart() {
		return Clickonaddtocart;
	}
	
    @FindBy(name="termsofservice")
    private WebElement checkbox;

	public WebElement getCheckbox() {
		return checkbox;
	}
	
	@FindBy(id="checkout")
	private WebElement checkoutbutton;

	public WebElement getCheckoutbutton() {
		return checkoutbutton;
	}
	
	

}
