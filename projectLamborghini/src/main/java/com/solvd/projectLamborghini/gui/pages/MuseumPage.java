package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class MuseumPage extends LamborghiniAbstractPage{
	
	
	@FindBy(className="air active")
	private ExtendedWebElement planeButton; 
	
	@FindBy(className="taxi")
	private ExtendedWebElement carButton; 
	
	@FindBy(className="bus")
	private ExtendedWebElement busButton; 
	
	@FindBy(className="column small-eight small-push-two  reset last reachuscontent")
	private ExtendedWebElement information; 
	
	@FindBy(xpath="//*[@id='partners']/div")
	private ExtendedWebElement partners; 

	public MuseumPage(WebDriver driver) {
		super(driver);
	}
	
	public String getInformationText() {
		return information.getText();
	}
    
	public void clickPlaneButton(long i) {
		planeButton.click(i);
	}
	
	public void clickCarButton(long i) {
		carButton.click(i);
	}
	
	public void clickBusButton(long i) {
		busButton.click(i);
	}
}
