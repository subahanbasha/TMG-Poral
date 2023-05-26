package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);
	
	}

	@FindBy(id="//input[@id='mui-15']")
	private WebElement emailField;
	
	@FindBy(id="//input[@id='mui-16']")
	private WebElement passwordField;
	
	@FindBy(xpath="//button[@id='button']")
	private WebElement SigninButton;
	
	public void enterEmailAddress(String emailText) {
		
		emailField.sendKeys(emailText);
		
	}
	
	public void enterPassword(String passwordText) {
		
		passwordField.sendKeys(passwordText);
		
	}
	
	public AccountPage clickOnLoginButton() {
		
		SigninButton.click();
		return new AccountPage(driver);
		
	}
}
