package Generic_Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

<<<<<<< HEAD
	public  WebDriver driver;
=======
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText ="Register")
	private WebElement Registerlink;

	@FindBy(partialLinkText ="Log in")
	private WebElement Loginlink;

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

	
>>>>>>> branch 'master' of https://github.com/Nammu2620/FrameWorkFLN.git

<<<<<<< HEAD
	public BasePage(WebDriver driver) {
		//this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(linkText = "Register")
	private WebElement Registerlink;

	@FindBy(partialLinkText = "Log in")
	private WebElement Loginlink;

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
=======
	@FindBy(partialLinkText ="Shopping cart")
	private WebElement ShoppingCartlink;
>>>>>>> branch 'master' of https://github.com/Nammu2620/FrameWorkFLN.git

	public WebElement getDigitaldownloadsLink() {
		return digitaldownloadsLink;
	}

<<<<<<< HEAD
	public WebElement getJewelryLink() {
		return jewelryLink;
	}
=======
	@FindBy(partialLinkText ="Wishlist")
	private WebElement WishListlink;
>>>>>>> branch 'master' of https://github.com/Nammu2620/FrameWorkFLN.git

	public WebElement getGiftcards() {
		return giftcards;
	}

<<<<<<< HEAD
	@FindBy(partialLinkText = "Shopping cart")
	private WebElement ShoppingCartlink;
=======
	@FindBy(xpath ="//input[@value='Search']")
	private WebElement SearchButton ;
>>>>>>> branch 'master' of https://github.com/Nammu2620/FrameWorkFLN.git

	@FindBy(partialLinkText = "Wishlist")
	private WebElement WishListlink;

<<<<<<< HEAD
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement SearchButton;
=======
	@FindBy(linkText ="BOOKS")
	private WebElement BooksLink ;
>>>>>>> branch 'master' of https://github.com/Nammu2620/FrameWorkFLN.git

	@FindBy(linkText = "Books")
	private WebElement BooksLink;

<<<<<<< HEAD
	@FindBy(linkText = "Computers")
	private WebElement ComputerLink;
=======
	@FindBy(linkText ="COMPUTERS")
	private WebElement  ComputerLink;

	@FindBy(linkText ="ELECTRONICS")
	private WebElement  ElectronicsLink;

	@FindBy(partialLinkText ="APPAREL & SHOES")
	private WebElement apparelshoesLink;

	@FindBy(partialLinkText ="DIGITAL DOWNLOADS")
	private WebElement digitaldownloadsLink;

	@FindBy(linkText ="JEWELRY")
	private WebElement jewelryLink;

	@FindBy(partialLinkText ="GIFT CARDS")
	private WebElement giftcards;

	@FindBy(partialLinkText = "Log out")
	private WebElement Logout;

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
>>>>>>> branch 'master' of https://github.com/Nammu2620/FrameWorkFLN.git

	@FindBy(linkText = "Electronics")
	private WebElement ElectronicsLink;

<<<<<<< HEAD
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
	public WebElement getLogout() {
		return Logout;
	}

}
