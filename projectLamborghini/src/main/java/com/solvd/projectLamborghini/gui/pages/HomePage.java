package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.solvd.projectLamborghini.gui.components.CarConfigurator;
import com.solvd.projectLamborghini.gui.components.DealerLocator;
import com.solvd.projectLamborghini.gui.components.DisclaimerCookie;
import com.solvd.projectLamborghini.gui.components.EmissionsBanner;
import com.solvd.projectLamborghini.gui.components.Footer;
import com.solvd.projectLamborghini.gui.components.Gallery;
import com.solvd.projectLamborghini.gui.components.Header;
import com.solvd.projectLamborghini.gui.components.NewsContainer;

public class HomePage extends MyAbstractPage{
    private static final Logger LOGGER = LoggerFactory.getLogger(HomePage.class);
    
    @FindBy(xpath="/html/body/div/header") 
    private Header header;
    
    @FindBy(id="families-gallery") 
    private Gallery gallery;
    
    @FindBy(id="model-chooser") 
    private CarConfigurator carConfigurator;
    
    @FindBy(id="banner")
    private DealerLocator dealerLocator;
    
    @FindBy(id="news")
    private NewsContainer newsContainer;
    
    @FindBy(className="container-fluid")
    private Footer footerMenu;
  
    @FindBy(id="disclaimer-cookie")
    private DisclaimerCookie disclaimerCookie;
    
    @FindBy(xpath="//div[@class='emissions-banner fixed-bottom text-center']")
    private EmissionsBanner emissionsBanner;
    
	public HomePage(WebDriver driver) {
		super(driver);
	}

}
