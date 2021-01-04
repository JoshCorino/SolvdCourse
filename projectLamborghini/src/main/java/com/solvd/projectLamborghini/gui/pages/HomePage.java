package com.solvd.projectLamborghini.gui.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.projectLamborghini.gui.components.New;

public class HomePage extends LamborghiniAbstractPage{
	
   
    //Models 
	@FindBy(xpath="//*[@class='control-title text-uppercase']")
	private ExtendedWebElement galleryTag;
	
	@FindBy(xpath="//*[@class='on-dark btn-prev prev']")
	private ExtendedWebElement galleryPrevButton;
	
	@FindBy(xpath="//*[@class='on-dark btn-next next']")
	private ExtendedWebElement galleryNextButton;
		
	@FindBy(xpath="//*[@class='on-dark btn-explore explore-models button-wrapper']")
	private ExtendedWebElement galleryExploreMoreButton;
	
	//Car configurator
	@FindBy(xpath = "//*[@class='link-item header-slider active']/h3/div")
	private ExtendedWebElement carConfiguratorTitle;
	
	@FindBy(xpath = "//*[@class='link-item header-slider active']/h2")
	private ExtendedWebElement carConfiguratorDescription;
	
	@FindBy(xpath = "//*[@class='link-item header-slider active']/a")
	private ExtendedWebElement carConfiguratorButton;
	
	@FindBy(xpath="//*[@class='pagination']")
	private List<ExtendedWebElement> carConfiguratorLinks;
    
    //Dealer locator
	@FindBy(xpath = "//*[@class='link offset-sm-1']/h4")
	private ExtendedWebElement dealerLocatorTitle;
	
	@FindBy(xpath = "//*[@class='link offset-sm-1']/h2")
	private ExtendedWebElement dealerLocatorDescription;
	
	@FindBy(xpath = "//*[@class='link offset-sm-1']/a")
	private ExtendedWebElement dealerLocatorButton;
    
	//News
	@FindBy(xpath = "//div[@id='news']//section")
	private List<New> news;
	
	@FindBy(xpath="//div/a[@class='btn boxed dark']")
    private ExtendedWebElement seeAllNewsButton;
      
    //Emmissions banner
	@FindBy(xpath="//*[@class='emissions-banner fixed-bottom text-center']")
	private ExtendedWebElement bannerText;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
    
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public List<New> getNews() {
		return news;
	}

	public String getGalleryTagText() {
		return galleryTag.getText();
	}

	public void clickCarConfiguratorButton(long i) {
		carConfiguratorButton.click(i);
	}

	public void clickDealerLocatorButton(long i) {
		dealerLocatorButton.click(i);
	}

	public void clickSeeAllNewsButton(long i) {
		seeAllNewsButton.click(i);
	}

	public MotorsportPage clickMotorsportButton(long i) {
		return getHeader().clickMotorsport(i);
	}
	
	public String getEmissionsBannerText() {
		
		return bannerText.getText();
	}


}
