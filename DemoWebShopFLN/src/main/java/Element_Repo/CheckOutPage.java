package Element_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Library.BasePage;

public class CheckOutPage extends BasePage{

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "BillingNewAddress_FirstName")
	private WebElement firstNameTextBox;
	
	@FindBy(id = "BillingNewAddress_LastName")
	private WebElement lastNameTextBox;
	
	@FindBy(id = "BillingNewAddress_Email")
	private WebElement emailAddressTextBox;
	
	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement countrydropdown;
	
	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}

	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}

	public WebElement getEmailAddressTextBox() {
		return emailAddressTextBox;
	}

	public WebElement getCountrydropdown() {
		return countrydropdown;
	}

	public WebElement getCityTextBox() {
		return cityTextBox;
	}

	public WebElement getAddress1TextBox() {
		return address1TextBox;
	}

	public WebElement getZipCodeTextBox() {
		return zipCodeTextBox;
	}

	public WebElement getPhoneNumberTextBox() {
		return phoneNumberTextBox;
	}

	public WebElement getBillingcontinueButton() {
		return billingcontinueButton;
	}

	public WebElement getBillingAddressdropdown() {
		return billingAddressdropdown;
	}

	public WebElement getShippingContinueButton() {
		return shippingContinueButton;
	}

	public WebElement getShippingMethodRadioButton() {
		return shippingMethodRadioButton;
	}

	public WebElement getShippingMethodContinueButton() {
		return shippingMethodContinueButton;
	}

	public WebElement getPaymentMethodRadioButton() {
		return paymentMethodRadioButton;
	}

	public WebElement getPaymentMethodContinueButton() {
		return paymentMethodContinueButton;
	}

	public WebElement getPaymentInfoContinueButton() {
		return paymentInfoContinueButton;
	}

	public WebElement getConfirmButton() {
		return confirmButton;
	}

	public WebElement getConfirmMsg() {
		return confirmMsg;
	}
	@FindBy(id = "BillingNewAddress_City")
	private WebElement cityTextBox;
	
	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement address1TextBox;
	
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement zipCodeTextBox;
	
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement phoneNumberTextBox;
	
	@FindBy(xpath = "//div[@id='billing-buttons-container']/input")
	private WebElement billingcontinueButton;

	@FindBy(id = "billing-address-select")
	private WebElement billingAddressdropdown;

	@FindBy(xpath = "//div[@id='shipping-buttons-container']/input")
	private WebElement shippingContinueButton;
	
	@FindBy(id = "shippingoption_2")
	private WebElement shippingMethodRadioButton;
	
	@FindBy(xpath = "//input[@class='button-1 shipping-method-next-step-button']")
	private WebElement shippingMethodContinueButton;
	
	@FindBy(id = "paymentmethod_0")
	private WebElement paymentMethodRadioButton;
	
	@FindBy(xpath = "//input[@class='button-1 payment-method-next-step-button']")
	private WebElement paymentMethodContinueButton;
	
	@FindBy(xpath = "//input[@class='button-1 payment-info-next-step-button']")
	private WebElement paymentInfoContinueButton;
	
	@FindBy(xpath = "//input[@class='button-1 confirm-order-next-step-button']")
	private WebElement confirmButton;
	
	@FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")
	private WebElement confirmMsg;
	
}
