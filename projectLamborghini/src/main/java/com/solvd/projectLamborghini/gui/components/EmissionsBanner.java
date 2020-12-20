package com.solvd.projectLamborghini.gui.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class EmissionsBanner extends AbstractUIObject{
	
	@FindBy(xpath="/html/body/div/div[3]")
	private ExtendedWebElement bannerText;
	
	public EmissionsBanner(WebDriver driver) {
		super(driver);
	}

}