package com.spicejet.project.testcases;

import org.testng.annotations.Test;

import com.spicejet.project.pageobjects.SearchforflightsOneWayPage;

import base.BaseClass;


public class SearchforflightsOneWayTripTest extends BaseClass {
	
	@Test
	public void verifyOneWaySearchFlight() throws Exception {
		SearchforflightsOneWayPage oneway = new SearchforflightsOneWayPage(driver);
		oneway.OneWayButton();
		oneway.clickBoardingFrom();
		oneway.onBoardingFrom(prop.getProperty("From"));
		oneway.clickDestinationTo();
		oneway.destination(prop.getProperty("To"));
		oneway.DepartDate();
		oneway.SearchFlight();
	}

}