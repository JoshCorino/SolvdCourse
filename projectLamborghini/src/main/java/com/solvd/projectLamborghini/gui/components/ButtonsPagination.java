package com.solvd.projectLamborghini.gui.components;

import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class ButtonsPagination extends AbstractUIObject{

	@FindBy(xpath ="//*[@id=\"model-chooser\"]/div[1]/div[1]/div/div[2]")
	private List<ExtendedWebElement> links;
	
	public ButtonsPagination(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

}
