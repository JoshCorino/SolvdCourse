package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class PeoplePage extends LamborghiniAbstractPage{

	@FindBy(xpath="//*[@id=\"block-lambo-content\"]/section/div[3]/p")
	private ExtendedWebElement mainText;
	
	@FindBy(xpath="//*[@id=\"block0\"]/div[1]/div/p")
	private ExtendedWebElement ferruccioText;
	
	@FindBy(xpath="//*[@id=\"block0\"]/div[1]/div/a")
	private ExtendedWebElement ferruccioButton;
	
	@FindBy(xpath="//*[@id=\"block1\"]/div[1]/p[2]")
	private ExtendedWebElement talentText;
	
	@FindBy(xpath="//*[@id=\"ariacontent\"]/section[3]/div[1]/div/a")
	private ExtendedWebElement accesoriesButton;
	
	@FindBy(xpath="//*[@id=\"ariacontent\"]/section[3]/div[2]/div/a")
	private ExtendedWebElement modelsButton;
	
	@FindBy(xpath="//*[@id=\"ariacontent\"]/section[3]/div[3]/div/a")
	private ExtendedWebElement storeButton;
	
	public PeoplePage(WebDriver driver) {
		super(driver);
	}



}
