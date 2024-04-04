package Generic_Library;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass  {

//	public BaseClass() {
//		//super(driver);
//		// TODO Auto-generated constructor stub
//	}


	public WebDriver driver;
	public WebDriverWait explicitWait;
	public String Url = "https://demowebshop.tricentis.com/";

	//BasePage baseObj = new BasePage(driver);
	@BeforeMethod
	public void beforeclass() {
		// Launch the browser
		driver = new ChromeDriver();
		Reporter.log("Browser launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Enter the Url
		driver.get(Url);
		Reporter.log("URL is entered");
	}

	@AfterMethod
<<<<<<< HEAD

	public void afterclass() {
		
		driver.quit();
=======
	public void afterclass() {
	driver.quit();
		//close browser
>>>>>>> branch 'master' of https://github.com/Nammu2620/FrameWorkFLN.git
	}
}
