package com.spicejet.project.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignUpPage {

	public WebDriver driver;
	
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="(//div[@class='css-76zvg2 r-jwli3a r-ubezar'])[2]")
	WebElement signupkey;
	
	@FindBy (xpath="(//option[@value='MR'])[1]")
	WebElement title;
	
	@FindBy (xpath="//input[@id='first_name']")
	WebElement firstname;
	
	@FindBy (xpath="//input[@id='last_name']")
	WebElement lastname;
	
	@FindBy (xpath="//select[@class='form-control form-select']")
	WebElement country;
	
	@FindBy (xpath="//input[@id='dobDate']")
	WebElement dateofbirth;
	
	@FindBy (xpath="//input[@type='tel']")
	WebElement mobilenumber;
	
	@FindBy (xpath="//input[@id='email_id']")
	WebElement email;
	
	@FindBy (xpath="//input[@id='new-password']")
	WebElement password;
	
	@FindBy (xpath="//input[@id='c-password']")
	WebElement confirmpassword;
	
//	@FindBy (xpath="//input[@id='defaultCheck1']")
//	WebElement agreementcheck;
//	
//	@FindBy (xpath="//a/button[@type='button']")
//	WebElement submitbutton; 
	
	public void Signup() {
		signupkey.click();
	}
	
	public void validatesignuppage() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "SpiceClub - The frequent flyer program of SpiceJet";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}
	
	public void SelectTitle() {
		title.click();
	}
	
	public void Firstname(String FirstName) {
		firstname.sendKeys(FirstName);
	}
	
	public void Lastname(String LastName) {
		lastname.sendKeys(LastName);
	}
	
	public void EnterCountry(String Country) {
		country.sendKeys(Country);
	}

	public void DateofBirth(String DOB) {
		dateofbirth.sendKeys(DOB);
	}
	
	public void MobileNumber(String MobileNumber) {
		mobilenumber.sendKeys(MobileNumber);
	}
	
	public void Emailid(String Email) {
		email.sendKeys(Email);
	}
	
	public void EnterPassword(String Password) {
		password.sendKeys(Password);
	}
	
	public void ConfirmPassword(String ConfirmPassword) {
		confirmpassword.sendKeys(ConfirmPassword);
	}
	
//	public void agreementCheck() {
//		agreementcheck.click();
//	}
//	
//	public void signupSubmitForm() {
//		submitbutton.click();
//	}

}
