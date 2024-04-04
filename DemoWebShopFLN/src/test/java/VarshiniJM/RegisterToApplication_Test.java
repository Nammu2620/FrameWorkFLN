package VarshiniJM;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import Element_Repo.LoginPage;
import Element_Repo.RegisterPage;
import Generic_Library.BaseClass;

public class RegisterToApplication_Test extends BaseClass
{
	
	//BasePage obj=new BasePage(driver);
	
	//BaseClass base=new BaseClass();
	
	@Test
	public void Register()
	{
		LoginPage loginObject=new LoginPage(driver);
		loginObject.getRegisterlink().click();
		//loginObject.getLoginlink().click();
		RegisterPage regObj=new RegisterPage(driver);
		regObj.getGender().click();
		regObj.getFirstName().sendKeys("Varshini");
		regObj.getLastName().sendKeys("JM");
		regObj.getEmailtextbox().sendKeys("nehal@gmail.com");
		regObj.getPasswordtextbox().sendKeys("nehal@123");
		regObj.getConfirmpasswordtextbox().sendKeys("nehal@123");
		regObj.getRegisterbutton().click();
		
		String confirmText = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).getText();
		Reporter.log(confirmText,true);
		
	}
}
