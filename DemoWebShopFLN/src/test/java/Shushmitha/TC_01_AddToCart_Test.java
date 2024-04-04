package Shushmitha;

import org.testng.annotations.Test;

import Element_Repo.ComputerPage;
import Element_Repo.LoginPage;
import Generic_Library.BaseClass;

public class TC_01_AddToCart_Test extends BaseClass{

	@Test
	 public void TC01Test() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.Login_Actions("shushmithagowda2000@gmail.com", "Shushmitha@2029");
	    loginpage.getComputerLink().click();
        ComputerPage computerpage = new ComputerPage(driver);
        computerpage.getDesktopsPage().click();
		computerpage.getExpensiveComputerCartButton().click();
		computerpage.getExpensiveComputerPageAddToCart().click();
	    loginpage.getShoppingCartlink().click();
	    	
	}
}
