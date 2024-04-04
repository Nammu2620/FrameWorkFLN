package Element_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Library.BasePage;

public class ShoppingCartPage extends BasePage {

	public WebElement getTermsAndConditionCheckBox() {
		return termsAndConditionCheckBox;
	}

	public WebElement getRemoveCheckBox() {
		return removeCheckBox;
	}

	public WebElement getUpdateCartButton() {
		return updateCartButton;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "termsofservice")
	private WebElement termsAndConditionCheckBox;

	@FindBy(xpath = "//a[text()='Fiction']/../../td[1]/input")
	private WebElement removeCheckBox;
	
	@FindBy(name = "updatecart")
	private WebElement updateCartButton;
	
	@FindBy(id = "checkout")
	private WebElement checkoutButton;

	
}
