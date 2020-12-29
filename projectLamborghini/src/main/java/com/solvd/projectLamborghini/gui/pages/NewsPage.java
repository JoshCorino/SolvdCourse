package com.solvd.projectLamborghini.gui.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.projectLamborghini.gui.components.New;

public class NewsPage extends LamborghiniAbstractPage{

	@FindBy(id="news")
	private List<New> news; 
	
	public NewsPage(WebDriver driver) {
		super(driver);
	}

	public List<New> getNews() {
		return news;
	}

	
}
