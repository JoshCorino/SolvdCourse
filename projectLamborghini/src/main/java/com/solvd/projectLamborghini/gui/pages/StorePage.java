package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class StorePage extends LamborghiniAbstractPage{
	
	@FindBy(xpath="//*[@id=\"block-lambo-content\"]/section/a[2]")
	private ExtendedWebElement goToStoreButton;
	
	@FindBy(xpath="//*[@id=\"ariacontent\"]/section[3]/div[2]/div/div/div/div[2]")
	private ExtendedWebElement storeData;
	
	@FindBy(xpath="//*[@id=\"ariacontent\"]/section[4]/div[2]/div/a")
	private ExtendedWebElement companiesButton;
	
	@FindBy(xpath="//*[@id=\"ariacontent\"]/section[4]/div[1]/div/a")
	private ExtendedWebElement modelsButton;
	
	
	public StorePage(WebDriver driver) {
		super(driver);
	}


	public ExtendedWebElement getGoToStoreButton() {
		return goToStoreButton;
	}


	public ExtendedWebElement getStoreData() {
		return storeData;
	}


	public ExtendedWebElement getCompaniesButton() {
		return companiesButton;
	}


	public ExtendedWebElement getModelsButton() {
		return modelsButton;
	}
	
	

}
