package Element_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Library.BasePage;

public class ComputerPage extends BasePage{

	public ComputerPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(partialLinkText =  "Desktops")
	private WebElement desktopsPage;
	
	@FindBy(xpath = "//a[text()='Build your own expensive computer']/../../div[3]/div[2]/input")
	private WebElement expensiveComputerCartButton;

	@FindBy(xpath = "//h1[contains(text(),'expensive computer')]/../../div[8]/div/input[2]")
	private WebElement expensiveComputerPageAddToCart;

	public WebElement getDesktopsPage() {
		return desktopsPage;
	}

	public WebElement getExpensiveComputerCartButton() {
		return expensiveComputerCartButton;
	}

	public WebElement getExpensiveComputerPageAddToCart() {
		return expensiveComputerPageAddToCart;
	}
}
