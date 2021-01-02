package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class LoungePage extends LamborghiniAbstractPage{
	
	@FindBy(xpath="//*[@id=\"block-lambo-content\"]/section/div[3]/div/span[2]")
	private ExtendedWebElement title;
	
	@FindBy(xpath="//*[@id=\"ariacontent\"]/section[1]/div[1]/p[2]")
	private ExtendedWebElement mainText;
	
	@FindBy(xpath="//*[@id=\"ariacontent\"]/section[1]/div[1]/p[2]")
	private ExtendedWebElement secondaryText;
	
	public LoungePage(WebDriver driver) {
		super(driver);
	}
	public String getTitleText() {
		return title.getText();
	}
	public String getMainTextText() {
		return mainText.getText();
	}
	public String getSecondaryText() {
		return secondaryText.getText();
	}
	
}
