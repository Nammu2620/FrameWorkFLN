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

	@FindBy(partialLinkText = "Log in")
=======
	
@FindBy(partialLinkText ="Log in")
>>>>>>> branch 'master' of https://github.com/Nammu2620/FrameWorkFLN.git
	private WebElement Loginlink;
<<<<<<< HEAD
=======
	
>>>>>>> branch 'master' of https://github.com/Nammu2620/FrameWorkFLN.git
	@FindBy(id = "Email")
	private WebElement emailtextbox;

	@FindBy(id = "Password")
	private WebElement passwordtextbox;

<<<<<<< HEAD
	@FindBy(id = "RememberMe")
=======
	@FindBy(id="RememberMe")
>>>>>>> branch 'master' of https://github.com/Nammu2620/FrameWorkFLN.git
	private WebElement remembermetextbox;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement Login;

	public WebElement getEmailtextbox() {
		return emailtextbox;
<<<<<<< HEAD
	}

	public WebElement getPasswordtextbox() {
		return passwordtextbox;
=======
	}	
	
	public WebElement getPasswordtextbox() {
	return passwordtextbox;
>>>>>>> branch 'master' of https://github.com/Nammu2620/FrameWorkFLN.git
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

<<<<<<< HEAD
	public Home_Page Login_Actions(String username, String password) {
=======
	public Home_Page Login_Actions(String username, String password)
	{
	
		getLoginlink().click();
		emailtextbox.sendKeys(username);
		passwordtextbox.sendKeys(password);
		getLogin().click();
		return new Home_Page(super.driver);
>>>>>>> branch 'master' of https://github.com/Nammu2620/FrameWorkFLN.git

<<<<<<< HEAD
		getLoginlink().click();
		emailtextbox.sendKeys(username);
		passwordtextbox.sendKeys(password);
		getLogin().click();
		return new Home_Page(super.driver);
=======
	}
>>>>>>> branch 'master' of https://github.com/Nammu2620/FrameWorkFLN.git

<<<<<<< HEAD
	}

	public void Logout() {
		getLogout().click();

=======
	public void Logout()
	{
		getLogout().click();
	
>>>>>>> branch 'master' of https://github.com/Nammu2620/FrameWorkFLN.git
	}
}
