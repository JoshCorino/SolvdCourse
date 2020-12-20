package com.solvd.projectLamborghini.gui.components;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.resources.L10N;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class Header extends AbstractUIObject{
	
    @FindBy(xpath="/html/body/div/header/nav/a/img")
	private ExtendedWebElement logo;
    
    @FindBy(xpath="/html/body/div/header/nav/ul[1]")
	private List<ExtendedWebElement> leftList;
    
    @FindBy(xpath="/html/body/div/header/nav/ul[2]")
	private List<ExtendedWebElement> rightList;
    
    @FindBy(xpath="/html/body/div/header/nav/div[1]")
	private List<ExtendedWebElement> rightButtons;
	
	public Header(WebDriver driver) {
		super(driver);
	}

	public List<String> getLeftListNames(){
		ArrayList<String> result = new ArrayList<String>();
        if (!leftList.isEmpty()) {
            for (ExtendedWebElement link : leftList) {
                result.add(link.getAttribute("span"));
            }
        }
		return result;
	}
	
	public List<String> getRightListNames(){
		ArrayList<String> result = new ArrayList<String>();
        if (!rightList.isEmpty()) {
            for (ExtendedWebElement link : rightList) {
                result.add(link.getAttribute("span"));
            }
        }
		return result;
	}
}
