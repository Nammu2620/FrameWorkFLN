package sm_testcases;

import org.testng.annotations.Test;

import Element_Repo.Book_Page;
import Element_Repo.LoginPage;
import Generic_Library.BaseClass;
import Generic_Library.BasePage;

public class TC_01_Login_Addticart_Test extends BaseClass {
	
	@Test
	public void ligin() {
		LoginPage lp=new LoginPage(driver);
		lp.Login_Actions("varshj@gmail.com", "Varsh@123");
		lp.getBooksLink().click();
        Book_Page bp=new Book_Page(driver);
		bp.getClickOnAddtocartButton().click();
		lp.getShoppingCartlink().click();
		bp.getContinueshoppingbutton();
	
		
		
		
		
		
		
		
	

}
}
