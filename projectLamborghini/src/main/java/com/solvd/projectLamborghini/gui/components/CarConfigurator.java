package com.solvd.projectLamborghini.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;


public class CarConfigurator extends AbstractUIObject{

	@FindBy(xpath = "//*[@id=\"model-chooser\"]/div[1]/div[1]/div/div[1]/div[1]/h3/div")
	private ExtendedWebElement title;
	
	@FindBy(xpath = "//*[@id=\"model-chooser\"]/div[1]/div[1]/div/div[1]/div[1]/h2")
	private ExtendedWebElement description;
	
	@FindBy(xpath = "//*[@id=\"model-chooser\"]/div[1]/div[1]/div/div[1]/div[1]/a")
	private ExtendedWebElement button;
	
	@FindBy(xpath = "//*[@id=\"model-chooser\"]/div[1]/div[1]/div/div[2]")
	private ButtonsPagination pagination;
	
	public CarConfigurator(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

}
