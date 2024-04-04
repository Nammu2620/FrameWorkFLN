package tanuja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Element_Repo.Home_Page;
import Element_Repo.LoginPage;
import Generic_Library.BaseClass;

public class TC01_AddToCart extends BaseClass{
	@Test
	public void addToCart() {
		LoginPage lp=new LoginPage(driver);
		Home_Page hp=lp.Login_Actions("sonawaletanuja55@gmail.com","Tanuja@0803");
		hp.getComputerLink().click();
		driver.findElement(By.partialLinkText("Desktops")).click();
	    driver.findElement(By.linkText("Build your own cheap computer")).click();
		driver.findElement(By.xpath("//input[contains(@id,'button-72')]")).click();
		hp.getApparelshoesLink().click();
		driver.findElement(By.linkText("Blue and green Sneaker")).click();
		driver.findElement(By.xpath("//span[@title='Black']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'button-28')]")).click();
	}
}
