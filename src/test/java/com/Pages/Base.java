package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class Base {
	static WebDriver driver;
	
	public WebDriver GetdriverInit() {
		System.out.println("===============Base class");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("Application//index.html");
		
		
		
		return driver;
	}
	
	
	
	

}
