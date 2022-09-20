package com.Pages;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GalleryPage {
	
	@FindBy(xpath="//button[text()='Gallery']")
	WebElement galleryPage;
	@FindBy(xpath="//button[text()='Click me!']")
	WebElement button;
	WebDriver driver =Base.driver;
	
	
	public GalleryPage() {
		PageFactory.initElements(Base.driver, this);
		
	}

	public void clickGalleryPage() {
		// TODO Auto-generated method stub
		galleryPage.click();
		
		
	}

	public void clickButton() {
		// TODO Auto-generated method stub
		button.click();
		driver.switchTo().alert().accept();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
