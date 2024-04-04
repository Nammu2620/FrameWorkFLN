package Element_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Library.BasePage;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/Nammu2620/FrameWorkFLN.git
	@FindBy(partialLinkText = "Log in")
	private WebElement Loginlink;
<<<<<<< HEAD
	
	@FindBy(id = "Email")
	private WebElement emailtextbox;
=======

	@FindBy(id = "Email")
	private WebElement emailtextbox;

	@FindBy(id = "Password")
	private WebElement passwordtextbox;

	@FindBy(id = "RememberMe")
	private WebElement remembermetextbox;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement Login;

	@FindBy(id = "small-searchterms")
	private WebElement searchBar;

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getEmailtextbox() {
		return emailtextbox;
	}

	public WebElement getPasswordtextbox() {
		return passwordtextbox;
	}

	public WebElement getRemembermetextbox() {
		return remembermetextbox;
	}
>>>>>>> branch 'master' of https://github.com/Nammu2620/FrameWorkFLN.git

<<<<<<< HEAD
	@FindBy(id = "Password")
	private WebElement passwordtextbox;
=======
	public WebElement getLogin() {
		return Login;
	}
>>>>>>> branch 'master' of https://github.com/Nammu2620/FrameWorkFLN.git

<<<<<<< HEAD
	@FindBy(id = "RememberMe")
	private WebElement remembermetextbox;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement Login;

	public WebElement getEmailtextbox() {
		return emailtextbox;
	}

	public WebElement getPasswordtextbox() {
		return passwordtextbox;
	}

	public WebElement getRemembermetextbox() {
		return remembermetextbox;
	}

	public WebElement getLogin() {
		return Login;
	}

=======
>>>>>>> branch 'master' of https://github.com/Nammu2620/FrameWorkFLN.git
	public WebElement getLoginlink() {
		return Loginlink;
	}

	public Home_Page Login_Actions(String username, String password) {

		getLoginlink().click();
		emailtextbox.sendKeys(username);
		passwordtextbox.sendKeys(password);
		getLogin().click();
		return new Home_Page(super.driver);

	}

	public void Logout() {
		getLogout().click();

	}
}
