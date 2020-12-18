package com.solvd.projectLamborghini.gui.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class DealerLocator extends AbstractUIObject{

	@FindBy(xpath = "//*[@id=\"banner\"]/div/div[2]/h4")
	private ExtendedWebElement title;
	@FindBy(xpath = "//*[@id=\"banner\"]/div/div[2]/h2")
	private ExtendedWebElement description;
	@FindBy(xpath = "//*[@id=\"banner\"]/div/div[2]/a")
	private ExtendedWebElement button;
	
	public DealerLocator(WebDriver driver) {
		super(driver);
	}

}
