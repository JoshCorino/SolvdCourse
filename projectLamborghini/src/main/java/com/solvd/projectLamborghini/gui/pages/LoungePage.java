package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class LoungePage extends LamborghiniAbstractPage{
	
	@FindBy(xpath="//*[@class='subtitle ng-binding']")
	private ExtendedWebElement title;
	
	@FindBy(xpath="//section[1]/div[1]/p[2]")
	private ExtendedWebElement mainText;
	
	@FindBy(xpath="//section[2]/div[1]/p[2]")
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
