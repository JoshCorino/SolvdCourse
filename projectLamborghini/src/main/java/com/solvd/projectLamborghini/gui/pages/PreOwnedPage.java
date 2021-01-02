package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class PreOwnedPage extends LamborghiniAbstractPage{

	@FindBy(xpath="//*[@id=\"images-sx-texts-dx\"]/div[2]/div/div[2]/div/div/div/p")
	private ExtendedWebElement mainText;
	
	@FindBy(xpath="//*[@id=\"simple-list\"]/div/div")
	private ExtendedWebElement descriptionText;
	
	@FindBy(xpath="//*[@id=\"simple-list--2\"]/div/div/div/p")
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
