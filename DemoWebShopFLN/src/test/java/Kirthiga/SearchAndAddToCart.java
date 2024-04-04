package Kirthiga;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Element_Repo.Home_Page;
import Element_Repo.LoginPage;
import Generic_Library.BaseClass;

public class SearchAndAddToCart extends BaseClass {
	
	@Test
	public void shoppingCart() {
		
		//Login
		LoginPage lp=new LoginPage(driver);	
		lp.Login_Actions("kirthigagnanasekar2001@gmail.com","Keerthika@2505");
		
		//searching product 
		WebElement searchBar = driver.findElement(By.id("small-searchterms"));
		searchBar.sendKeys("laptop");
		lp.getSearchButton().click();
		
		//adding product to cart
		WebElement laptop = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[@value='Add to cart']"));
		laptop.click();
		
		//To view shopping cart
		lp.getShoppingCartlink().click();
		
		//To change quantity in shopping cart
		WebElement quantity = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[@class='qty-input']"));
		quantity.clear();
		quantity.sendKeys("2");
		
		//To Remove product from cart
		WebElement removeLaptop = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[@name=\"removefromcart\"]"));
		removeLaptop.click();
		WebElement updateCartButton = driver.findElement(By.name("updatecart"));
		updateCartButton.click();
		
	
		
	}

}
