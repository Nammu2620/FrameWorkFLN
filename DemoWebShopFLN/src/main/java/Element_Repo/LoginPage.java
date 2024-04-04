package Element_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Library.BasePage;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(partialLinkText = "Log in")
	private WebElement Loginlink;
	
	@FindBy(id = "Email")
	private WebElement emailtextbox;

	@FindBy(id = "Password")
	private WebElement passwordtextbox;

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
