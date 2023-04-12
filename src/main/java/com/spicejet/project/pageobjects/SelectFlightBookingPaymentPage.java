package com.spicejet.project.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SelectFlightBookingPaymentPage {

	public WebDriver driver;
	
	public SelectFlightBookingPaymentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// One Way
	@FindBy (xpath="//div[contains(text(),'one way')]")
	WebElement onewaybutton;
	
	@FindBy (xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement boardingFrom;
	
	@FindBy (xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement destination;
	
	@FindBy (xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[1]")
	WebElement departuredate;
	
	@FindBy (xpath="//div[@data-testid='home-page-flight-cta']")
	WebElement SearchFlightbtn;
	
	@FindBy (xpath = "//div[@data-testid='continue-search-page-cta']")
	WebElement selectflightcontinuebutton;
	
	@FindBy (xpath = "//div[@data-testid='title-contact-detail-card']")
	WebElement title;
	
	@FindBy (xpath = "(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar'])[1]")
	WebElement mr;
	
	@FindBy (xpath = "(//input[@type='text'])[1]")
	WebElement firstname;
	
	@FindBy (xpath = "(//input[@type='text'])[2]")
	WebElement lastname;
	
	@FindBy (xpath = "(//input[@type='text'])[3]")
	WebElement contactnumber;
	
	@FindBy (xpath = "(//input[@type='text'])[4]")
	WebElement emailaddress;
	
	@FindBy (xpath = "(//input[@type='text'])[5]")
	WebElement townorcity;
	
	@FindBy (xpath = "//div[contains(text(),'I am flying as the primary passenger')]")
	WebElement checkbox;
	
	@FindBy (xpath = "//div[@data-testid='traveller-info-continue-cta']")
	WebElement passengerscontinuebutton;
	
	@FindBy (xpath = "(//div[@data-testid='add-ons-continue-footer-button'])[3]")
	WebElement addonscontinuebutton;
	
	@FindBy (xpath = "//input[@id='card_number']")
	WebElement cardnumber;
	
    @FindBy (xpath = "//input[@id='name_on_card']")
    WebElement cardholdername;
    
    @FindBy (xpath = "//input[@id='card_exp_month']")
    WebElement expirymonth;
    
    @FindBy (xpath = "//input[@id='card_exp_year']")
    WebElement expiryyear;
    
    @FindBy (xpath = "//input[@id='security_code']")
    WebElement cvv;
    
    @FindBy (xpath = "//div[@data-testid='common-proceed-to-pay']")
    WebElement proceedtopay;
    
    @FindBy (xpath = "//div[contains(text(),'Trip Summary')]")
    WebElement tripsummary;
	
	public void OneWayButton() {
		onewaybutton.click();
	}
	
	public void clickBoardingFrom() {
		boardingFrom.click();
	}
	
	public void onBoardingFrom(String Boarding) {
		boardingFrom.sendKeys(Boarding);
	}
	
	public void clickDestinationTo() {
		destination.click();
	}
	
	public void destination(String Destination) throws Exception {
		Thread.sleep(3000);
		destination.sendKeys(Destination);;
	}
	
	public void DepartDate() {
		departuredate.click();
	}
	
	public void SearchFlight() {
		SearchFlightbtn.click();
	}
	
	public void clickonselectflightcontinue() {
		selectflightcontinuebutton.click();
	}
	
	public void clickontitle() {
		title.click();
	}
	
	public void clickonmr() {
		mr.click();
	}
	
	public void clickonfirstname() {
		firstname.click();
	}
	
	public void enterfirstname(String FirstName) {
		firstname.sendKeys(FirstName);
	}
	
	public void clickonlastname() {
		lastname.click();
	}
	
	public void enterlastname(String LastName) {
		lastname.sendKeys(LastName);
	}
	
	public void clickoncontactnumber() {
		contactnumber.click();
	}
	
	public void entercontactnumber(String ContactNumber) {
		contactnumber.sendKeys(ContactNumber);
	}
	
	public void clickonemailaddress() {
		emailaddress.click();
	}
	
	public void enteremailaddress(String EmailAddress) {
		emailaddress.sendKeys(EmailAddress);
	}
	
	public void clickontownorcity() {
		townorcity.click();
	}
	
	public void entertownorcity(String TownorCity) {
		townorcity.sendKeys(TownorCity);
	}
	
	public void clickoncheckbox() {
		checkbox.click();
	}
	
	public void clickonpassengerscontinuebutton() {
		passengerscontinuebutton.click();
	}
	
	public void clickonaddonscontinuebutton() {
		addonscontinuebutton.click();
	}
	
	public void clickoncardnumber() {
		cardnumber.click();
	}
	
	public void entercardnumber(String CardNumber) {
		cardnumber.sendKeys(CardNumber);
	}
	
	public void clickoncardholdername() {
		cardholdername.click();
	}
	
	public void entercardholdername(String CardHolderName) {
		cardholdername.sendKeys(CardHolderName);
	}
	
	public void clickonexpirymonth() {
		expirymonth.click();
	}
	
	public void enterexpirymonth(String ExpiryMonth) {
		expirymonth.sendKeys(ExpiryMonth);
	}
	
	public void clickonexpiryyear() {
		expiryyear.click();
	}
	
	public void enterexpiryyear(String ExpiryYear) {
		expiryyear.sendKeys(ExpiryYear);
	}
	
	public void clickoncvv() {
		cvv.click();
	}
	
	public void entercvv(String CVV) {
		cvv.sendKeys(CVV);
	}
	
	public void clickonproceedtopay() {
		proceedtopay.click();
	}
	
	public void verifytripsummary() {
		String ExpectedText = "Trip Summary";
		Assert.assertEquals(ExpectedText, tripsummary.getText());
	}

}