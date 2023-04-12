package com.spicejet.project.testcases;

import org.testng.annotations.Test;

import com.spicejet.project.pageobjects.SelectFlightBookingPaymentPage;

import base.BaseClass;

public class SelectFlightBookingPaymentTest extends BaseClass {
	
	@Test
	public void verifySelectFlightBookingPayment() throws Exception {
		SelectFlightBookingPaymentPage bookingoneway = new SelectFlightBookingPaymentPage(driver);
		bookingoneway.OneWayButton();
		bookingoneway.clickBoardingFrom();
		bookingoneway.onBoardingFrom(prop.getProperty("From"));
		bookingoneway.clickDestinationTo();
		bookingoneway.destination(prop.getProperty("To"));
		bookingoneway.DepartDate();
		bookingoneway.SearchFlight();
		bookingoneway.clickonselectflightcontinue();
		bookingoneway.clickontitle();
		bookingoneway.clickonmr();
		bookingoneway.clickonfirstname();
		bookingoneway.enterfirstname(prop.getProperty("FirstName"));
		bookingoneway.clickonlastname();
		bookingoneway.enterlastname(prop.getProperty("LastName"));
		bookingoneway.clickoncontactnumber();
		bookingoneway.entercontactnumber(prop.getProperty("MobileNumber"));
		bookingoneway.clickonemailaddress();
		bookingoneway.enteremailaddress(prop.getProperty("Email"));
		bookingoneway.clickontownorcity();
		bookingoneway.entertownorcity(prop.getProperty("City"));
		bookingoneway.clickoncheckbox();
		bookingoneway.clickonpassengerscontinuebutton();
		bookingoneway.clickonaddonscontinuebutton();
		Thread.sleep(10000);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(0);
		bookingoneway.clickoncardnumber();
		bookingoneway.entercardnumber(prop.getProperty("CardNumber"));
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		bookingoneway.clickoncardholdername();
		bookingoneway.entercardholdername(prop.getProperty("CardHolderName"));
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		bookingoneway.clickonexpirymonth();
		bookingoneway.enterexpirymonth(prop.getProperty("ExpiryMonth"));
		driver.switchTo().parentFrame();
		driver.switchTo().frame(3);
		bookingoneway.clickonexpiryyear();
		bookingoneway.enterexpiryyear(prop.getProperty("ExpiryYear"));
		driver.switchTo().parentFrame();
		driver.switchTo().frame(4);
		bookingoneway.clickoncvv();
		bookingoneway.entercvv(prop.getProperty("CVV"));
		driver.switchTo().parentFrame();
		bookingoneway.clickonproceedtopay();
		bookingoneway.verifytripsummary();
	}
}