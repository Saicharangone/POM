package com.steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.Pages.Base;
import com.Pages.HomePage;

import io.cucumber.java.en.*;

public class Home {
	
	HomePage homePage=new HomePage();
	
	@Given("Click on Home page")
	public void click_on_home_page() {
	    homePage.clickHomePAge();
	}
	@When("Enter email and password")
	public void enter_email_and_password() {
	    
		homePage.enterEmail();
		
		homePage.enterPassword();
		
	}
	@Then("Quit the browser")
	public void quit() {
		// TODO Auto-generated method stub
		homePage.quit();

	}

}
