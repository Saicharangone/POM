package com.steps;

import com.Pages.AboutPage;

import io.cucumber.java.en.Then;

public class About {

	AboutPage aboutPage=new AboutPage();

	@Then("Click on About")
	public void click_on_about() {
		aboutPage.clickAbout();

	}



}
