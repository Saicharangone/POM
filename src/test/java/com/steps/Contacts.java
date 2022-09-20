package com.steps;

import com.Pages.ContactPage;

import io.cucumber.java.en.Then;

public class Contacts {
	ContactPage contackPage=new ContactPage();
	@Then("Click on contact")
	public void click_on_contact() {
		contackPage.clickContactPage();
	    
	}
	
	
}
