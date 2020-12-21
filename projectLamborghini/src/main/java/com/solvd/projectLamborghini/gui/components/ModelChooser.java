package com.solvd.projectLamborghini.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class ModelChooser extends AbstractUIObject{

	@FindBy(xpath="//*[@id=\"families-gallery-texts\"]/div/div[1]/div[1]")
	private ExtendedWebElement tag;
	
	@FindBy(xpath="//*[@id=\"families-gallery-texts\"]/div/div[1]/div[2]/button[1]")
	private ExtendedWebElement buttonPrev;
	
	@FindBy(xpath="//*[@id=\"families-gallery-texts\"]/div/div[1]/div[2]/button[2]")
	private ExtendedWebElement buttonNext;
	
	public ModelChooser(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

}
