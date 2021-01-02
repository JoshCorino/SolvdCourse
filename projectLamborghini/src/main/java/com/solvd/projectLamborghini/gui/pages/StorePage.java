package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class StorePage extends LamborghiniAbstractPage{
	
	@FindBy(xpath="//*[@class='carousel-top ng-scope']/a[2]")
	private ExtendedWebElement goToStoreButton;
	
	@FindBy(xpath="//*[@class='column ten reset ']/div/div/div/div[2]")
	private ExtendedWebElement storeData;
	
	@FindBy(xpath="//*[@class='stripe blockbottom row-content fullwidth']/div[2]/div/a")
	private ExtendedWebElement companiesButton;
	
	@FindBy(xpath="//*[@class='stripe blockbottom row-content fullwidth']/div[1]/div/a")
	private ExtendedWebElement modelsButton;
	
	
	public StorePage(WebDriver driver) {
		super(driver);
	}

	public String getStoreDataText() {
		return storeData.getText();
	}
	
	public void clickGoToStoreButton(long i) {
		goToStoreButton.click(i);
	}
	public void clickCompaniesButton(long i) {
		companiesButton.click(i);
	}
	public void clickModelsButton(long i) {
		modelsButton.click(i);
	}
	

}
