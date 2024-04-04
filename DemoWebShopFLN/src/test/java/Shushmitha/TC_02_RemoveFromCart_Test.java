package Shushmitha;

import org.testng.annotations.Test;

import Element_Repo.BookPage;
import Element_Repo.LoginPage;
import Element_Repo.ShoppingCartPage;
import Generic_Library.BaseClass;


public class TC_02_RemoveFromCart_Test extends BaseClass{

	@Test
	 public void TC02Test() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.Login_Actions("shushmithagowda2000@gmail.com", "Shushmitha@2029");
	    loginpage.getBooksLink().click();
	    BookPage bookpage = new BookPage(driver);
	    bookpage.getFrictionBook().click();
	    loginpage.getShoppingCartlink().click();
	    ShoppingCartPage shoppingCartpage = new ShoppingCartPage(driver);
		shoppingCartpage.getRemoveCheckBox().click();
 		shoppingCartpage.getUpdateCartButton().click();
	    	
	}
}
