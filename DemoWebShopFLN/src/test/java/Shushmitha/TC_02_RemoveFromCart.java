package Shushmitha;

import org.testng.annotations.Test;

import Element_Repo.Book_Page;
import Element_Repo.ComputerPage;
import Element_Repo.LoginPage;
import Element_Repo.ShoppingCartPage;
import Generic_Library.BaseClass;

public class TC_02_RemoveFromCart extends BaseClass {

	@Test
	public void TC02Test() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.Login_Actions("shushmithagowda2000@gmail.com", "Shushmitha@2029");
		loginpage.getComputerLink().click();
		ComputerPage computerpage = new ComputerPage(driver);
		computerpage.getDesktopsPage().click();
		computerpage.getExpensiveComputerCartButton().click();
		computerpage.getExpensiveComputerPageAddToCart().click();
		loginpage.getShoppingCartlink().click();
		ShoppingCartPage shoppingCartpage = new ShoppingCartPage(driver);
		shoppingCartpage.getRemoveCheckBox().click();
 		shoppingCartpage.getUpdateCartButton().click();
	}
}