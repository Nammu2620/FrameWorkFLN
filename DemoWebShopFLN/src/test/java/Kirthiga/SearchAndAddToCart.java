package Kirthiga;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Element_Repo.Home_Page;
import Element_Repo.LoginPage;
import Element_Repo.ShoppingCart_Page;
import Generic_Library.BaseClass;

public class SearchAndAddToCart extends BaseClass {
	
	@Test
	public void shoppingCart() {
		
		//Login
		LoginPage lp=new LoginPage(driver);	
		lp.Login_Actions("kirthigagnanasekar2001@gmail.com","Keerthika@2505");
		
		//searching product 
		lp.getSearchBar().sendKeys("laptop");
		lp.getSearchButton().click();
		
		//adding product to cart
		ShoppingCart_Page sc=new ShoppingCart_Page(driver);
		sc.getLap_AddToCart().click();
		
		//To view shopping cart
		lp.getShoppingCartlink().click();
		
		//To change quantity in shopping cart
		sc.getQuantityTB().clear();
		sc.getQuantityTB().sendKeys("2");
		
		//To Remove product from cart
		sc.getRemoveLap().click();
		sc.getUpdateCartButton().click();
		
		
	}

}
