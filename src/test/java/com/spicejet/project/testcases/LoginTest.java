package com.spicejet.project.testcases;

import org.testng.annotations.Test;

import com.spicejet.project.pageobjects.LoginPage;

import base.BaseClass;


public class LoginTest extends BaseClass {
	
	@Test(priority = 1)
	public void LoginwithValidCredentials() {
		LoginPage login = new LoginPage(driver);
		login.Login();
		login.EmailButton();
		login.EmailId(prop.getProperty("Email"));
		login.Password(prop.getProperty("Password"));
		login.LoginButton();
	}
	
	@Test(priority = 2)
	public void LoginwithInValidCredentials() {
		LoginPage login = new LoginPage(driver);
		login.Login();
		login.EmailButton();
		login.EmailId(prop.getProperty("InvalidEmail"));
		login.invalidPassword(prop.getProperty("InvalidPassword"));
		login.LoginButton();
	}

}
