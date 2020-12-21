package com.solvd.projectLamborghini.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class New extends AbstractUIObject{

    @FindBy(className="image img-loaded")
    private ExtendedWebElement img;
    
    @FindBy(xpath="//*[@id=\"news\"]/section/div/div/div/div/div")
    private ExtendedWebElement date;
    
    @FindBy(xpath="//*[@id=\"news\"]/section/div/div/div/div/div/a/h2")
    private ExtendedWebElement title;
    
    @FindBy(xpath="//*[@id=\"news\"]/section/div/div/div/div/a")
    private ExtendedWebElement readMoreButton;
    
	public New(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

}
