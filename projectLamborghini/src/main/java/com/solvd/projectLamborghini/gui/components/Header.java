package com.solvd.projectLamborghini.gui.components;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.projectLamborghini.HeaderTest;
import com.qaprosoft.carina.core.foundation.utils.resources.L10N;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class Header extends AbstractUIObject{
    private static final Logger LOGGER = LoggerFactory.getLogger(Header.class);

    @FindBy(xpath="/html/body/div/header/nav/a/img")
	private ExtendedWebElement logo;
    
    @FindBy(xpath="/html/body/div/header/nav/ul[1]")
	private List<ExtendedWebElement> leftList;
    
    @FindBy(xpath="/html/body/div/header/nav/ul[2]")
	private List<ExtendedWebElement> rightList;
    
    @FindBy(xpath="/html/body/div/header/nav/div[1]")
	private List<ExtendedWebElement> rightButtons;
	
	public Header(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	public List<ExtendedWebElement> getLeftList() {
		return leftList;
	}
	public List<String> getLeftListNames(){
		ArrayList<String> result = new ArrayList<String>();
		result.add("hola");
		result.add("hola");
        if (!leftList.isEmpty()) {
            for (ExtendedWebElement link : leftList) {
          
            	result.add(link.getText());
            }
        }
		return result;
	}
	
	public List<String> getRightListNames(){
		ArrayList<String> result = new ArrayList<String>();
        if (!rightList.isEmpty()) {
            for (ExtendedWebElement link : rightList) {
            	LOGGER.info(link.toString());
                result.add(link.getAttribute("span"));
            }
        }
		return result;
	}
}
