package Element_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Library.BasePage;


public class RegisterPage extends BasePage {
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
		
@FindBy(id = "gender-female")	
private WebElement gender;

@FindBy(id = "FirstName")
private WebElement FirstName;

@FindBy(id = "LastName")
private WebElement lastName;

@FindBy(id = "Email")
private WebElement Emailtextbox;

@FindBy(id = "Password")
private WebElement passwordtextbox;


@FindBy(id = "ConfirmPassword")
private WebElement confirmpasswordtextbox;

@FindBy(id="register-button")
private WebElement registerbutton;

public WebElement getGender() {
	return gender;
}

public WebElement getFirstName() {
	return FirstName;
}

public WebElement getLastName() {
	return lastName;
}

public WebElement getEmailtextbox() {
	return Emailtextbox;
}

public WebElement getPasswordtextbox() {
	return passwordtextbox;
}

public WebElement getConfirmpasswordtextbox() {
	return confirmpasswordtextbox;
}

public WebElement getRegisterbutton() {
	return registerbutton;
}
}
