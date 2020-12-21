package com.solvd.projectLamborghini.gui.components;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class Header extends AbstractUIObject{

    @FindBy(xpath="/html/body/div/header/nav/a/img")
	private ExtendedWebElement logo;
    
    @FindBy(xpath="/html/body/div/header/nav/ul[1]")
	private ExtendedWebElement leftList;
    
    @FindBy(xpath="/html/body/div/header/nav/ul[2]")
	private ExtendedWebElement rightList;
    
    @FindBy(xpath="/html/body/div/header/nav/div[1]")
	private ExtendedWebElement rightButtons;
	
	public Header(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

	public List<String> getLeftListNames(){
		return Arrays.asList(leftList.getText().split("\\r?\\n"));
	}
	
	public List<String> getRightListNames(){
        
		return Arrays.asList(rightList.getText().split("\\r?\\n"));
	}
	
	
}
