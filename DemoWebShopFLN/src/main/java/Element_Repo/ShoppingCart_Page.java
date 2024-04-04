package Element_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Library.BasePage;

public class ShoppingCart_Page extends BasePage{

	public ShoppingCart_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a[text()='14.1-inch Laptop']/../..//input[@value='Add to cart']")
	private WebElement Lap_AddToCart;

	public WebElement getLap_AddToCart() {
		return Lap_AddToCart;
	}
	
	@FindBy(xpath="//a[text()='14.1-inch Laptop']/../..//input[@class='qty-input']")
	private WebElement quantityTB;

	public WebElement getQuantityTB() {
		return quantityTB;
	}

	@FindBy(xpath="//a[text()='14.1-inch Laptop']/../..//input[@name='removefromcart']")
	private WebElement RemoveLap;

	public WebElement getRemoveLap() {
		return RemoveLap;
	}
	
	@FindBy(name="updatecart")
	private WebElement updateCartButton;

	public WebElement getUpdateCartButton() {
		return updateCartButton;
	}
	
}

