package com.solvd.projectLamborghini.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class Gallery extends AbstractUIObject{

	@FindBy(xpath="//*[@id=\"families-gallery-texts\"]/div/div[1]")
	private ModelChooser modelsChooser;
	
	@FindBy(xpath="//*[@id=\"families-gallery-texts\"]/div/div[2]/div[1]/h2")
	private ExtendedWebElement name;
	
	@FindBy(xpath="/html/body/div/div[1]/div/section[2]/div/div/div/div[1]/div/div[2]/div[1]/h3")
	private ExtendedWebElement description;
	
	@FindBy(xpath="//*[@id=\"families-gallery-texts\"]/div/div[2]/div[2]/a[1]")
	private ExtendedWebElement linkToMore;
	
	
	public Gallery(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

}	
