package com.solvd.projectLamborghini.gui.components;


import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class Footer extends AbstractUIObject{

    @FindBy(xpath="//*[@id=\"scroll-container\"]/footer/div/div/div/div/div[1]/div[1]/ul")
    private ExtendedWebElement linksList;
    
    @FindBy(xpath="//*[@id=\"scroll-container\"]/footer/div/div/div/div/div[1]/div[3]/p")
    private ExtendedWebElement text;
    
    @FindBy(xpath="//*[@id=\"scroll-container\"]/footer/div/div/div/div/div[2]")
    private List<ExtendedWebElement> socialLinksList;
    
	public Footer(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

	public String getLinkListText(){

		return linksList.getText();
	}
	
	public String getMainText() {
		return text.getText();
	}
	
}
