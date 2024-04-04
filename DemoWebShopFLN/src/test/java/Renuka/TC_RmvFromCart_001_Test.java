package Renuka;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Element_Repo.LoginPage;
import Generic_Library.BaseClass;

public class TC_RmvFromCart_001_Test extends BaseClass{
	
	@Test
	public void rmvProdCart()
	{
		
		LoginPage log=new LoginPage(driver);
		
		log.Login_Actions("ubalerenuka2001@gmail.com", "abcd@1234");
		Reporter.log("Logged in successfully", true);
		
		driver.findElement(By.partialLinkText("BOOKS")).click();
		Reporter.log("Clicked on books Category", true);
		driver.findElement(By.linkText("Computing and Internet")).click();
		Reporter.log("Clicked on product link", true);
		driver.findElement(By.xpath("//input[contains(@id,'add-to-cart-button')]")).click();
		Reporter.log("Clicked on Add to Cart button", true);
		driver.findElement(By.id("topcartlink")).click();
		Reporter.log("Clicked on Shopping Cart button", true);
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
		Reporter.log("Clicked on Remove check box", true);
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		Reporter.log("Clicked on Update Shopping Cart", true);
		
		
		
	}
}
