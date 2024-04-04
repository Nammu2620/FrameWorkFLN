package scripts_of_praneetha;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Element_Repo.LoginPage;
import Generic_Library.BaseClass;

public class AddToWishlist extends BaseClass{
	@Test
	public void addToWishlist() {
		LoginPage lp=new LoginPage(driver);
		lp.Login_Actions("praneethakoushik22@gmail.com","Pranee@168");
		
		lp.getGiftcards().click();
		driver.findElement(By.linkText("$100 Physical Gift Card")).click();
		
		driver.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys("praneetha");
		
		driver.findElement(By.xpath("//input[@value='Add to wishlist']")).click();
		
		lp.getGiftcards().click();
		driver.findElement(By.linkText("$50 Physical Gift Card")).click();
		
		driver.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys("praneetha");
		
		driver.findElement(By.xpath("//input[@value='Add to wishlist']")).click();
		
		lp.getWishListlink().click();
		
		lp.Logout();
}
}
