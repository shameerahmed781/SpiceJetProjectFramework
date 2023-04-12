package com.spicejet.project.testcases;

import org.testng.annotations.Test;

import com.spicejet.project.pageobjects.SignUpPage;

import base.BaseClass;

public class SignUpTest extends BaseClass {
		
		@Test
		public void verifySignup() {
			SignUpPage signup = new SignUpPage(driver);
			signup.Signup();
			Switchwindow();
			signup.validatesignuppage();
			signup.SelectTitle();
			signup.Firstname(prop.getProperty("FirstName"));
			signup.Lastname(prop.getProperty("LastName"));
			signup.EnterCountry(prop.getProperty("Country"));
			signup.DateofBirth(prop.getProperty("DOB"));
			signup.MobileNumber(prop.getProperty("MobileNumber"));
			signup.Emailid(prop.getProperty("Email"));
			signup.EnterPassword(prop.getProperty("Password"));
			signup.ConfirmPassword(prop.getProperty("Confirmpassword"));
//			signup.agreementCheck();
//			signup.signupSubmitForm();
		}
		
}	