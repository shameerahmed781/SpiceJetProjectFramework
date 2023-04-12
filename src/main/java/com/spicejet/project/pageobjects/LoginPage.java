package com.spicejet.project.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73'])[1]")
	WebElement loginkey;
	
	@FindBy (xpath="(//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa'])[4]")
	WebElement emailbutton;
	
	@FindBy (xpath="//input[@type='email']")
	WebElement enteremailid;
	
	@FindBy (xpath="//input[@type='email']")
	WebElement enterinvalidemailid;
	
	@FindBy (xpath="//input[@type='password']")
	WebElement enterpassword;
	
	@FindBy (xpath="//input[@type='password']")
	WebElement enterinvalidpassword;
	
	@FindBy (xpath="//div[@data-testid='login-cta']")
	WebElement loginbutton;
	
	public void Login() {
		loginkey.click();
	}
	
	public void EmailButton() {
		emailbutton.click();
	}
	
	public void EmailId(String EmailId) {
		enteremailid.sendKeys(EmailId);
	}
	
	public void invaliEmailId(String invalidEmailId) {
		enteremailid.sendKeys(invalidEmailId);
	}
	
	public void Password(String Password) {
		enterpassword.sendKeys(Password);
	}
	
	public void invalidPassword(String invalidPassword) {
		enterpassword.sendKeys(invalidPassword);
	}
	
	public void LoginButton() {
		loginbutton.click();
	}

}
