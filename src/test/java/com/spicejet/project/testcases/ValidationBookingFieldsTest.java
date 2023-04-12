package com.spicejet.project.testcases;

import org.testng.annotations.Test;

import com.spicejet.project.pageobjects.ValidationBookingFieldsPage;

import base.BaseClass;

public class ValidationBookingFieldsTest extends BaseClass {
	
	@Test
	public void verifycheckinfield() {
		ValidationBookingFieldsPage bookingfields = new ValidationBookingFieldsPage(driver);
		bookingfields.clickoncheckin();
		bookingfields.validatewebcheckin();
	}
	
	@Test
	public void verifyfightstatusfield() {
		ValidationBookingFieldsPage bookingfields = new ValidationBookingFieldsPage(driver);
		bookingfields.clickonflightstatus();
		bookingfields.validateflightstatus();
	}
	
	@Test
	public void verifymanagebookingfield() {
		ValidationBookingFieldsPage bookingfields = new ValidationBookingFieldsPage(driver);
		bookingfields.clickonmanagebooking();
		bookingfields.validatemanagebooking();
	}

}
