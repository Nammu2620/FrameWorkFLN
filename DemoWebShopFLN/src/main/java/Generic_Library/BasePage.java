package Generic_Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
<<<<<<< HEAD

public class BasePage {

=======

public abstract class BasePage {
>>>>>>> branch 'master' of https://github.com/Nammu2620/FrameWorkFLN.git

	public  WebDriver driver;

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

<<<<<<< HEAD
	public WebDriver getDriver() {
		return driver;
	}
=======
	@FindBy(linkText ="Register")
	private WebElement Registerlink;

	@FindBy(partialLinkText ="Log in")
	private WebElement Loginlink;

	@FindBy(partialLinkText ="Shopping cart")
	private WebElement ShoppingCartlink;
	
	@FindBy(partialLinkText ="Wishlist")
	private WebElement WishListlink;

	@FindBy(xpath = "//input[@value='Search']")
	private WebElement SearchButton;

	@FindBy(linkText = "Books")
	private WebElement BooksLink;

	@FindBy(linkText = "Computers")
	private WebElement ComputerLink;
>>>>>>> branch 'master' of https://github.com/Nammu2620/FrameWorkFLN.git

<<<<<<< HEAD
=======
	@FindBy(linkText = "Electronics")
	private WebElement ElectronicsLink;

	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement apparelshoesLink;

	@FindBy(partialLinkText = "Digital downloads")
	private WebElement digitaldownloadsLink;

	@FindBy(linkText = "Jewelry")
	private WebElement jewelryLink;

	@FindBy(partialLinkText = "Gift Cards")
	private WebElement giftcards;

	@FindBy(partialLinkText = "Log out")
	private WebElement Logout;

>>>>>>> branch 'master' of https://github.com/Nammu2620/FrameWorkFLN.git
	public WebElement getRegisterlink() {
		return Registerlink;
	}

	public WebElement getLoginlink() {
		return Loginlink;
	}

	public WebElement getShoppingCartlink() {
		return ShoppingCartlink;
	}

	public WebElement getWishListlink() {
		return WishListlink;
	}

	public WebElement getSearchButton() {
		return SearchButton;
	}

	public WebElement getBooksLink() {
		return BooksLink;
	}

	public WebElement getComputerLink() {
		return ComputerLink;
	}

	public WebElement getElectronicsLink() {
		return ElectronicsLink;
	}

	public WebElement getApparelshoesLink() {
		return apparelshoesLink;
	}

	public WebElement getDigitaldownloadsLink() {
		return digitaldownloadsLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public WebElement getGiftcards() {
		return giftcards;
	}

	public WebElement getLogout() {
		return Logout;
	}
<<<<<<< HEAD

	@FindBy(linkText ="Register")
	private WebElement Registerlink;

	@FindBy(partialLinkText ="Log in")
	private WebElement Loginlink;

	@FindBy(partialLinkText = "Shopping cart")
	private WebElement ShoppingCartlink;

	@FindBy(partialLinkText = "Wishlist")
	private WebElement WishListlink;

	@FindBy(xpath = "//input[@value='Search']")
	private WebElement SearchButton;

	@FindBy(linkText = "Books")
	private WebElement BooksLink;

	@FindBy(linkText = "Computers")
	private WebElement ComputerLink;

	@FindBy(linkText = "Electronics")
	private WebElement ElectronicsLink;

	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement apparelshoesLink;

	@FindBy(partialLinkText = "Digital downloads")
	private WebElement digitaldownloadsLink;

	@FindBy(linkText = "Jewelry")
	private WebElement jewelryLink;

	@FindBy(partialLinkText = "Gift Cards")
	private WebElement giftcards;

	@FindBy(partialLinkText = "Log out")
	private WebElement Logout;


=======
>>>>>>> branch 'master' of https://github.com/Nammu2620/FrameWorkFLN.git
}

