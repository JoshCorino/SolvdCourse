package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class InnovationAndExellencePage extends LamborghiniAbstractPage{

	
	@FindBy(xpath="//*[@id='block0']/div[1]/p[2]")
	private ExtendedWebElement terzoMilenioText; 
	
	@FindBy(xpath="//*[@id='block0']/div[1]/a")
	private ExtendedWebElement terzoMilenioButton; 
		
	@FindBy(xpath="//*[@class='sub']/li/h5/a")
	private ExtendedWebElement futureCarsButton; 
	
	@FindBy(xpath="//*[@id='block1']/div[1]/p[2]")
	private ExtendedWebElement forgedCompositesText; 
	
	@FindBy(xpath="//*[@id='block1']/div[1]/a")
	private ExtendedWebElement forgedCompositesButton; 
	
	@FindBy(xpath="//*[@id='block2']/div[1]/p[2]")
	private ExtendedWebElement carbonFiberText; 
	
	@FindBy(xpath="//*[@id='block2']/div[1]/a")
	private ExtendedWebElement carbonFiberButton; 
	
	public InnovationAndExellencePage(WebDriver driver) {
		super(driver);
	}

	public String getTerzoMilenioText() {
		return terzoMilenioText.getText();
	}

	public void clickTerzoMilenioButton(long i) {
		terzoMilenioButton.click(i);
	}
	
	public void clickFutureCarsButton(long i) {
		futureCarsButton.click(i);
	}
	
	public String getForgedCompositesText() {
		return forgedCompositesText.getText();
	}

	public void clickForgedCompositesButton(long i) {
		forgedCompositesButton.click(i);
	}
	
	public String getCarbonFiberText() {
		return carbonFiberText.getText();
	}

	public void clickCarbonFiberButton(long i) {
		carbonFiberButton.click(i);
	}
}
