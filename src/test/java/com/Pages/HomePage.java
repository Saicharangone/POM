package com.Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//button[text()='Home']")
	WebElement homePage;
	@FindBy(xpath="//input[@class='email']")
	WebElement email;
	@FindBy(xpath="//input[@class='passw']")
	WebElement password;
	WebDriver driver =Base.driver;


	public HomePage() {
		PageFactory.initElements(Base.driver, this);

	}
	public  void clickHomePAge() {
		// TODO Auto-generated method stub
		homePage.click();

	}

	public void enterPassword() {
		// TODO Auto-generated method stub
		password.clear();
		password.sendKeys("password");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterEmail() {
		// TODO Auto-generated method stub
		
		email.clear();
		email.sendKeys("Xyz@gmail.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void quit() {
		// TODO Auto-generated method stub
		driver.close();
		driver.quit();
		
	}








}
