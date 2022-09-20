package com.steps;

import com.Pages.GalleryPage;

import io.cucumber.java.en.Then;


public class Gallery {
	GalleryPage galleryPage =new GalleryPage();
	
	@Then("Click on Gallery")
	public void click_on_gallery() {
	    // Write code here that turns the phrase above into concrete actions
		 galleryPage.clickGalleryPage();
	}
	@Then("Click the button")
	public void click_the_button() {
	    // Write code here that turns the phrase above into concrete actions
	    galleryPage.clickButton();
	   
	    
	    
	}


}
