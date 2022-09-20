package com.Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class AboutPage {
	
	
	@FindBy(xpath="//button[text()='About']")
	
	WebElement aboutpage;
	WebDriver driver=Base.driver;
	
	public AboutPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	
	public void clickAbout() {
		aboutpage.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
