package com.steps;

import com.Pages.Base;

import io.cucumber.java.Before;

public class Basestep {
	
	Base base=new Base();
	
	@Before
	public void baseinit() {
		base.GetdriverInit();
		
	}
	

}
