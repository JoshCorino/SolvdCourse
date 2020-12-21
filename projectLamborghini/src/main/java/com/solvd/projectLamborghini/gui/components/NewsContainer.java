package com.solvd.projectLamborghini.gui.components;

import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class NewsContainer extends AbstractUIObject{

	@FindBy(xpath = "//div[@id='news']//section")
	private List<New> news;
	
	@FindBy(xpath="//div/a[@class='btn boxed dark']")
    private ExtendedWebElement seeAllButton;
    
	public NewsContainer(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

}
