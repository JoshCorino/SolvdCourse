package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class MasterpiecesPage extends LamborghiniAbstractPage{

	@FindBy(xpath="//*[@id='select-models']")
	private ExtendedWebElement selectModel;
	
	@FindBy(xpath="//*[@id='breadcrumbs']/li[1]/a")
	private ExtendedWebElement homeButton;
	
	@FindBy(xpath="//*[@id='breadcrumbs']/li[2]/a")
	private ExtendedWebElement brandButton;
	
	@FindBy(xpath="//*[@class='year ng-scope center']/div/div/div[1]")
	private ExtendedWebElement selectedYear;
	
	@FindBy(xpath="//*[@class='scroller']")
	private ExtendedWebElement carsOfTheYear;
	
	@FindBy(xpath="//*[@class='years-menu']")
	private ExtendedWebElement timeLine;
	
	public MasterpiecesPage(WebDriver driver) {
		super(driver);
	}

	public void clickHomeButton(long i) {
		homeButton.click(i);
	}
	
	public void clickBrandButton(long i) {
		brandButton.click(i);
	}
	
	public String getSelectedYearText() {
		return selectedYear.getText();
	}
	
	public String getTimelineText() {
		return timeLine.getText();
	}
}
