package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class InnovationAndExellencePage extends LamborghiniAbstractPage{

	
	@FindBy(xpath="//*[@id=\"block0\"]/div[1]/p[2]//*[@id=\"block0\"]/div[1]/p[2]")
	private ExtendedWebElement terzoMilenioText; 
	
	@FindBy(xpath="//*[@id=\"block0\"]/div[1]/a")
	private ExtendedWebElement terzoMilenioButton; 
		
	@FindBy(xpath="//*[@id=\"block0\"]/div[2]/ul/li/h5/a")
	private ExtendedWebElement futureCarsButton; 
	
	@FindBy(xpath="//*[@id=\"block1\"]/div[1]/p[2]")
	private ExtendedWebElement forgedCompositesText; 
	
	@FindBy(xpath="//*[@id=\"block1\"]/div[1]/a")
	private ExtendedWebElement forgedCompositesButton; 
	
	@FindBy(xpath="//*[@id=\"block2\"]/div[1]/p[2]")
	private ExtendedWebElement carbonFiberText; 
	
	@FindBy(xpath="//*[@id=\"block2\"]/div[1]/a")
	private ExtendedWebElement carbonFiberButton; 
	
	public InnovationAndExellencePage(WebDriver driver) {
		super(driver);
	}

	public ExtendedWebElement getTerzoMilenioText() {
		return terzoMilenioText;
	}

	public ExtendedWebElement getTerzoMilenioButton() {
		return terzoMilenioButton;
	}

	public ExtendedWebElement getFutureCarsButton() {
		return futureCarsButton;
	}

	public ExtendedWebElement getForgedCompositesText() {
		return forgedCompositesText;
	}

	public ExtendedWebElement getForgedCompositesButton() {
		return forgedCompositesButton;
	}

	public ExtendedWebElement getCarbonFiberText() {
		return carbonFiberText;
	}

	public ExtendedWebElement getCarbonFiberButton() {
		return carbonFiberButton;
	}
	
	
}
