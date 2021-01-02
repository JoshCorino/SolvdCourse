package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class ModelsPage extends LamborghiniAbstractPage{
	
	@FindBy(xpath="//*[@class='top row align-items-stretch']/div/div/div/div/p")
	private ExtendedWebElement aventadorText; 
	
	@FindBy(xpath="//*[@class='top row align-items-stretch']/div/div/div/div/div[2]")
	private ExtendedWebElement aventadorButtons; 
	
	@FindBy(xpath="//*[@class='bottom row align-items-stretch']/div/div/div/div/p")
	private ExtendedWebElement huracanText; 
	
	@FindBy(xpath="//*[@class='bottom row align-items-stretch']/div/div/div/div/div[2]")
	private ExtendedWebElement huracanButtons; 
	
	@FindBy(xpath="//*[@id='images-sx-texts-dx']/div[1]/div/div[1]/div/div/p")
	private ExtendedWebElement urusText; 
	
	@FindBy(xpath="//*[@id='images-sx-texts-dx']/div[1]/div/div[1]/div/div/div[2]")
	private ExtendedWebElement urusButtons; 
	
	@FindBy(xpath="//*[@id='images-s']/div[2]/div[1]/div/div/p")
	private ExtendedWebElement limitedSeriesText;
	
	@FindBy(xpath="//*[@id='images-s']/div[2]/div[1]/div/div/div")
	private ExtendedWebElement limitedSeriesButtons;
	
	@FindBy(xpath="//*[@id='images-s--2']/div[2]/div[2]/div/div/p")
	private ExtendedWebElement conceptText;
	
	@FindBy(xpath="//*[@id='images-s--2']/div[2]/div[2]/div/div/div")
	private ExtendedWebElement conceptButtons;
	
	@FindBy(xpath="//*[@class='row']/div[1]/a/div[1]")
	private ExtendedWebElement companyButton;
	
	@FindBy(xpath="//*[@class='row']/div[2]/a/div[1]")
	private ExtendedWebElement adPersonamButton;
	
	//Emmissions banner
	@FindBy(xpath="//*[@class='emissions-banner fixed-bottom text-center']")
	private ExtendedWebElement bannerText;  
	
    public ModelsPage(WebDriver driver) {
		super(driver);
	}
    
	public String getAventadorText() {
		return aventadorText.getText();
	}
	
	public String getHuracanText() {
		return huracanText.getText();
	}
	
	public String getUrusText() {
		return urusText.getText();
	}
	
	public String getLimitedSeriesText() {
		return limitedSeriesText.getText();
	}
	
	public String getConceptText() {
		return conceptText.getText();
	}
    
	public void clickCompanyButton(long i) {
		companyButton.click(i);
	}
	
	public void clickAdPersonamButton(long i) {
		adPersonamButton.click(i);
	}
	
    
    
}
