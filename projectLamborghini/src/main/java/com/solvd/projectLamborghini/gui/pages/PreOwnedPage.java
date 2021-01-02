package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class PreOwnedPage extends LamborghiniAbstractPage{

	@FindBy(xpath="//*[@class='col-9 offset-1']/div/p")
	private ExtendedWebElement mainText;
	
	@FindBy(xpath="//*[@class='col-12 col-md-11 offset-md-0']")
	private ExtendedWebElement descriptionText;
	
	@FindBy(xpath="//*[@class='col-12 col-md-8 offset-md-3']/div/p")
	private ExtendedWebElement disclaimerText;
	
	public PreOwnedPage(WebDriver driver) {
		super(driver);
	}
	public String getMainText() {
		return mainText.getText();
	}
	public String getDescriptionText() {
		return descriptionText.getText();
	}
	public String getdisclaimerText() {
		return disclaimerText.getText();
	}

	

}
