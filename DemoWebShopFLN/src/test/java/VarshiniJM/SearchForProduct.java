package VarshiniJM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Element_Repo.LoginPage;
import Generic_Library.BaseClass;

public class SearchForProduct extends BaseClass {

	@Test
	public void SearchProduct()
	{
		LoginPage logObj=new LoginPage(driver);
		logObj.Login_Actions("nehal@gmail.com", "nehal@123");
		//driver.findElement(By.name("q")).sendKeys("laptop");
		//logObj.getSearchButton().click();
		logObj.getApparelshoesLink().click();
		List<WebElement> allElements = driver.findElements(By.xpath("//h2[@class='product-title']"));
		for(WebElement ele:allElements)
		{
			ele.getText();
			Reporter.log(ele.getText(),true);
		}
	}
}
