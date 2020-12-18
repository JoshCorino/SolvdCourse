package com.solvd.projectLamborghini.gui.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class DisclaimerCookie extends AbstractUIObject{

	@FindBy(xpath="//*[@id=\"disclaimer-cookie\"]/div/div[1]/p")
	private ExtendedWebElement text;
	
	@FindBy(xpath="//*[@id=\"disclaimer-cookie\"]/div/div[1]/p/a")
	private ExtendedWebElement buttonCookies;
		
	@FindBy(xpath="//*[@id=\"disclaimer-cookie\"]/div/div[2]/button")
	private ExtendedWebElement buttonAgree;
	
	public DisclaimerCookie(WebDriver driver) {
		super(driver);
	}

}
