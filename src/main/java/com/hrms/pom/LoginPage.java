package com.hrms.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement UserNameField;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement PasswordField;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Loginbtn;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	



	public void SetLogin(String username, String Password) {
		
		UserNameField.sendKeys(username);
		PasswordField.sendKeys(Password);
		Loginbtn.click();
		
	}
	

}
