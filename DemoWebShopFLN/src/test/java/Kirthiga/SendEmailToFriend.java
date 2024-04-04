package Kirthiga;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Element_Repo.LoginPage;
import Generic_Library.BaseClass;

public class SendEmailToFriend extends BaseClass{

	@Test
	public void emailAFriend() {
		
		//Login
		LoginPage lp=new LoginPage(driver);	
		lp.Login_Actions("kirthigagnanasekar2001@gmail.com","Keerthika@2505");

		//finding product
		lp.getBooksLink().click();
		WebElement fictionBook = driver.findElement(By.linkText("Fiction"));
		fictionBook.click();
		
		//email a friend
		WebElement emailButton = driver.findElement(By.xpath("//input[@value='Email a friend']"));
		emailButton.click();
		
		WebElement friendEmailTB = driver.findElement(By.id("FriendEmail"));
		friendEmailTB.clear();
		friendEmailTB.sendKeys("kirthigag25@gmail.com");
		
		WebElement yourEmailTB = driver.findElement(By.id("YourEmailAddress"));
		yourEmailTB.clear();
		yourEmailTB.sendKeys("kirthigagnanasekar2001@gmail.com");
		
		WebElement sendEmailButton = driver.findElement(By.name("send-email"));
		sendEmailButton.click();
		
	}
}
