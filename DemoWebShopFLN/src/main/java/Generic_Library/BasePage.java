package Generic_Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {


	public  WebDriver driver;

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(linkText ="Register")
	private WebElement Registerlink;

	@FindBy(partialLinkText ="Log in")
	private WebElement Loginlink;

	@FindBy(partialLinkText ="Shopping cart")
	private WebElement ShoppingCartlink;
	
	@FindBy(partialLinkText ="Wishlist")
	private WebElement WishListlink;

	@FindBy(xpath ="//input[@value='Search']")
	private WebElement SearchButton ;

	@FindBy(linkText ="BOOKS")
	private WebElement BooksLink ;

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
	
	public WebElement getLogout() {
		return Logout;
	}

}
