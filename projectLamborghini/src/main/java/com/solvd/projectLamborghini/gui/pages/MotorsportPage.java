package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class MotorsportPage extends LamborghiniAbstractPage{

		
	@FindBy(xpath="//*[@id=\"partners\"]/div/div/div/div[2]/div")
	private ExtendedWebElement partnersList; 
	
	public MotorsportPage(WebDriver driver) {
		super(driver);
	}

	public ExtendedWebElement getPartnersList() {
		return partnersList;
	}

	
}
