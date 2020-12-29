package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class MuseumPage extends LamborghiniAbstractPage{
	
	
	@FindBy(xpath="//*[@id=\"block3\"]/div/div/div[4]/div[1]")
	private ExtendedWebElement planeButton; 
	
	@FindBy(xpath="//*[@id=\"block3\"]/div/div/div[4]/div[2]")
	private ExtendedWebElement carButton; 
	
	@FindBy(xpath="//*[@id=\"block3\"]/div/div/div[4]/div[3]")
	private ExtendedWebElement busButton; 
	
	@FindBy(xpath="	//*[@id=\"block2\"]/div/div")
	private ExtendedWebElement information; 
	
	@FindBy(xpath="//*[@id=\"partners\"]/div")
	private ExtendedWebElement partners; 

	public MuseumPage(WebDriver driver) {
		super(driver);
	}
	
}
