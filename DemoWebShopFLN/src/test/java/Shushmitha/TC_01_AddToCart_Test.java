package Shushmitha;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Element_Repo.CheckOutPage;
import Element_Repo.ComputerPage;
import Element_Repo.LoginPage;
import Element_Repo.ShoppingCartPage;
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
	    ShoppingCartPage shoppingCartpage = new ShoppingCartPage(driver);
		shoppingCartpage.getTermsAndConditionCheckBox().click();
		shoppingCartpage.getCheckoutButton().click();
		
		CheckOutPage checkOutPage = new CheckOutPage(driver);
		Select sel = new Select(checkOutPage.getBillingAddressdropdown());
		sel.selectByVisibleText("New Address");
		checkOutPage.getFirstNameTextBox().clear();
		checkOutPage.getFirstNameTextBox().sendKeys("Shushmitha");
		checkOutPage.getLastNameTextBox().clear();
		checkOutPage.getLastNameTextBox().sendKeys("Gowda");
		checkOutPage.getEmailAddressTextBox().clear();
		checkOutPage.getEmailAddressTextBox().sendKeys("shushmithashush@gmail.com");
		Select sel1 = new Select(checkOutPage.getCountrydropdown());
		sel1.selectByValue("41");
		checkOutPage.getCityTextBox().sendKeys("Bangalore");
		checkOutPage.getAddress1TextBox().sendKeys("Nelamangala");
		checkOutPage.getZipCodeTextBox().sendKeys("562123");
		checkOutPage.getPhoneNumberTextBox().sendKeys("7874559651");
		checkOutPage.getBillingcontinueButton().click();
		checkOutPage.getShippingContinueButton().click();
		checkOutPage.getShippingMethodRadioButton().click();
		checkOutPage.getShippingMethodContinueButton().click();
		checkOutPage.getPaymentMethodRadioButton().click();
		checkOutPage.getPaymentMethodContinueButton().click();
		checkOutPage.getPaymentInfoContinueButton().click();
		checkOutPage.getConfirmButton().click();
	}
}
