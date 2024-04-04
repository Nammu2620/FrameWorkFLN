package Element_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Library.BasePage;

public class BookPage extends BasePage{

	public BookPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//a[text()='Fiction']//../../div[3]/div[2]/input")
	private WebElement frictionBook;
	
	public WebElement getFrictionBook() {
		return frictionBook;
	}
}
