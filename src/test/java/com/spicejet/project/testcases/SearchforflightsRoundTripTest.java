package com.spicejet.project.testcases;

import org.testng.annotations.Test;

import com.spicejet.project.pageobjects.SearchforflightsRoundTripPage;

import base.BaseClass;

public class SearchforflightsRoundTripTest extends BaseClass {
	
	@Test
	public void verifySearchforflightsRoundTrip() throws Exception {
		SearchforflightsRoundTripPage roundtrip = new SearchforflightsRoundTripPage(driver);
		roundtrip.RoundTripButton();
		roundtrip.clickBoardingFrom();
		roundtrip.onBoardingFrom(prop.getProperty("From"));
		roundtrip.clickDestinationTo();
		roundtrip.destination(prop.getProperty("To"));
		roundtrip.DepartDate();
		roundtrip.ReturnDate();
		roundtrip.clickonReturnDate();
		roundtrip.SearchFlight();
	}

}