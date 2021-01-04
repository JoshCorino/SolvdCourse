package com.solvd.projectLamborghini.gui.components;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.projectLamborghini.gui.pages.MotorsportPage;

public class Header extends AbstractUIObject{

    @FindBy(xpath="./nav/a/img")
	private ExtendedWebElement logo;
    
    @FindBy(xpath="./nav/ul[1]")
	private ExtendedWebElement leftList;
    
    @FindBy(xpath="./nav/ul[2]")
	private ExtendedWebElement rightList;
    
    @FindBy(xpath="./nav/div[1]")
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
	
	public MotorsportPage clickMotorsport(long i) {
		leftList.findExtendedWebElement(By.xpath("./li[3]/a")).click(i);
		return new MotorsportPage(driver);
	}
}
