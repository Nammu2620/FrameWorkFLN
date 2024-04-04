package scripts_of_praneetha;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Element_Repo.Home_Page;
import Element_Repo.LoginPage;
import Generic_Library.BaseClass;
import Generic_Library.BasePage;

public class AddToComparelist extends BaseClass {
	@Test
	public void addToComparelist() {
		LoginPage lp=new LoginPage(driver);
		lp.Login_Actions("praneethakoushik22@gmail.com","Pranee@168");
		
		lp.getJewelryLink().click();
		
		driver.findElement(By.linkText("Diamond Tennis Bracelet")).click();
		driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
		
		lp.Logout();
	}
}
