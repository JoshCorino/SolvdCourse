package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class ModelsPage extends LamborghiniAbstractPage{
	
	@FindBy(xpath="//*[@id=\"images-s1\"]/div[2]/div[2]/div[1]/div/div/div/p")
	private ExtendedWebElement aventadorText; 
	
	@FindBy(xpath="//*[@id=\"images-s1\"]/div[2]/div[2]/div[1]/div/div/div/div[2]/div[2]/div")
	private ExtendedWebElement aventadorButtons; 
	
	@FindBy(xpath="//*[@id=\"images-s1\"]/div[2]/div[3]/div[2]/div/div/div/p")
	private ExtendedWebElement huracanText; 
	
	@FindBy(xpath="//*[@id=\"images-s1\"]/div[2]/div[3]/div[2]/div/div/div/div[2]/div[2]/div")
	private ExtendedWebElement huracanButtons; 
	
	@FindBy(xpath="//*[@id=\"images-sx-texts-dx\"]/div[1]/div/div[1]/div/div/p")
	private ExtendedWebElement urusText; 
	
	@FindBy(xpath="//*[@id=\"images-sx-texts-dx\"]/div[1]/div/div[1]/div/div/div[2]")
	private ExtendedWebElement urusButtons; 
	
	@FindBy(xpath="//*[@id=\"images-s\"]/div[2]/div[1]/div/div/p")
	private ExtendedWebElement limitedSeriesText;
	
	@FindBy(xpath="//*[@id=\"images-s\"]/div[2]/div[1]/div/div/div")
	private ExtendedWebElement limitedSeriesButtons;
	
	@FindBy(xpath="//*[@id=\"images-s--2\"]/div[2]/div[2]/div/div/p")
	private ExtendedWebElement conceptText;
	
	@FindBy(xpath="//*[@id=\"images-s--2\"]/div[2]/div[2]/div/div/div")
	private ExtendedWebElement conceptButtons;
	
	@FindBy(xpath="//*[@id=\"crosslinks-endpage\"]/div/div[1]/a")
	private ExtendedWebElement companyButton;
	
	@FindBy(xpath="//*[@id=\"crosslinks-endpage\"]/div/div[2]/a")
	private ExtendedWebElement adPersonamButton;
	
	//Emmissions banner
	@FindBy(xpath="/html/body/div/div[3]")
	private ExtendedWebElement bannerText;  
	
    public ModelsPage(WebDriver driver) {
		super(driver);
	}


    
    
}
