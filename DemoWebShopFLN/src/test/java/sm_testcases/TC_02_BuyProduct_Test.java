package sm_testcases;

import org.testng.annotations.Test;

import Element_Repo.Book_Page;
import Element_Repo.Jewelry_Page;
import Element_Repo.LoginPage;
import Generic_Library.BaseClass;

public class TC_02_BuyProduct_Test extends BaseClass {
	
	@Test
	public void buyproduct() {
		LoginPage lp=new LoginPage(driver);
		//lp.Login_Actions("varshj@gmail.com", "Varsh@123");
		lp.getJewelryLink().click();
		Jewelry_Page jp=new Jewelry_Page(driver);
		jp.getClickonaddtocart().click();
		lp.getShoppingCartlink().click();
		jp.getCheckbox().click();
		jp.getCheckoutbutton().click();
		
		
		
		
	}

}
