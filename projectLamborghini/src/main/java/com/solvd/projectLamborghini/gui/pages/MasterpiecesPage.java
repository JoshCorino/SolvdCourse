package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class MasterpiecesPage extends LamborghiniAbstractPage{

	@FindBy(xpath="//*[@id=\"select-models\"]")
	private ExtendedWebElement selectModel;
	
	@FindBy(xpath="//*[@id=\"breadcrumbs\"]/li[1]/a")
	private ExtendedWebElement homeButton;
	
	@FindBy(xpath="//*[@id=\"breadcrumbs\"]/li[2]/a")
	private ExtendedWebElement brandButton;
	
	@FindBy(xpath="//*[@id=\"block-lambo-content\"]/section/div[2]/div[2]/div[2]/div/div[1]/div")
	private ExtendedWebElement selectedYear;
	
	@FindBy(xpath="//*[@id=\"block-lambo-content\"]/section/div[3]/div[1]/div/div/div[1]/div")
	private ExtendedWebElement carsOfTheYear;
	
	@FindBy(className ="years-menu")
	private ExtendedWebElement timeLine;
	
	public MasterpiecesPage(WebDriver driver) {
		super(driver);
	}

	public ExtendedWebElement getSelectModel() {
		return selectModel;
	}

	public ExtendedWebElement getHomeButton() {
		return homeButton;
	}

	public ExtendedWebElement getBrandButton() {
		return brandButton;
	}

	public ExtendedWebElement getSelectedYear() {
		return selectedYear;
	}

	public ExtendedWebElement getCarsOfTheYear() {
		return carsOfTheYear;
	}

	public ExtendedWebElement getTimeLine() {
		return timeLine;
	}

	
}
