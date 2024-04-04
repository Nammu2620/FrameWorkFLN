package tanuja;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Element_Repo.Home_Page;
import Element_Repo.LoginPage;
import Generic_Library.BaseClass;

public class TC02_BuyFromCartCOD extends BaseClass{
	@Test
	public void buyProduct() {
		LoginPage lp=new LoginPage(driver);
		Home_Page hp=lp.Login_Actions("sonawaletanuja55@gmail.com","Tanuja@0803");
		hp.getJewelryLink().click();
		driver.findElement(By.linkText("Black & White Diamond Heart")).click();
		driver.findElement(By.xpath("//input[contains(@id,'button-14')]")).click();
		hp.getShoppingCartlink().click();
//		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
//		driver.findElement(By.linkText("Shopping cart")).click();
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.xpath("//div[contains(@id,'billing')]/..//input[@title='Continue']")).click();
		driver.findElement(By.xpath("//div[contains(@id,'shipping')]/..//input[@title='Continue']")).click();
		driver.findElement(By.xpath("//div[contains(@id,'shipping-method-buttons-container')]/..//input[@value='Continue']")).click();
		driver.findElement(By.xpath("//div[contains(@id,'payment-method-buttons-container')]/../..//input[@value='Continue']")).click();
		driver.findElement(By.xpath("//div[contains(@id,'payment-info-buttons-container')]/../..//input[@value='Continue']")).click();
		driver.findElement(By.xpath("//div[contains(@id,'confirm-order-buttons-container')]/../..//input[@value='Confirm']")).click();
	}
}
