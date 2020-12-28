package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class DealerLocatorPage extends LamborghiniAbstractPage{

	
	@FindBy(xpath="//*[@id=\"locator\"]/div[4]/div[1]/div[1]")
	private ExtendedWebElement dealerTypes;
	
	@FindBy(xpath="//*[@id=\"locator\"]/div[4]/div[1]/div[2]")
	private ExtendedWebElement searchBar;
	
	@FindBy(xpath="//*[@id=\"locator\"]/div[4]/div[2]")
	private ExtendedWebElement results;
	
	@FindBy(id="map")
	private ExtendedWebElement map;
	
	
	public DealerLocatorPage(WebDriver driver) {
		super(driver);
	}

}
