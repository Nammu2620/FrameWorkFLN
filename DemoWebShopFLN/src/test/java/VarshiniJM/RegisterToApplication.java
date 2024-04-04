package VarshiniJM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Generic_Library.BasePage;

public class RegisterToApplication extends BasePage {

	public RegisterToApplication(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@Test
	public void Register()
	{
		getRegisterlink().click();
	}
}
