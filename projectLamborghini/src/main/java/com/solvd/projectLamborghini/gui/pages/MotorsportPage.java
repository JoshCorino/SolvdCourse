package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class MotorsportPage extends LamborghiniAbstractPage{

		
	@FindBy(id="partners")
	private ExtendedWebElement partnersList; 
	
	public MotorsportPage(WebDriver driver) {
		super(driver);
	}

	
}
