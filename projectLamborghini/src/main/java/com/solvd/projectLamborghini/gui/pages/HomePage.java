package com.solvd.projectLamborghini.gui.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.projectLamborghini.gui.components.New;

public class HomePage extends LamborghiniAbstractPage{
	
    private static final Logger LOGGER = LoggerFactory.getLogger(HomePage.class);
    
    //Models 
	@FindBy(xpath="//*[@id=\"families-gallery-texts\"]/div/div[1]/div[1]")
	private ExtendedWebElement galleryTag;
	
	@FindBy(xpath="//*[@id=\"families-gallery-texts\"]/div/div[1]/div[2]/button[1]")
	private ExtendedWebElement galleryPrevButton;
	
	@FindBy(xpath="//*[@id=\"families-gallery-texts\"]/div/div[1]/div[2]/button[2]")
	private ExtendedWebElement galleryNextButton;
		
	@FindBy(xpath="//*[@id=\"families-gallery-texts\"]/div/div[2]/div[2]/button")
	private ExtendedWebElement galleryExploreMoreButton;
	
	//Car configurator
	@FindBy(xpath = "//*[@id=\"model-chooser\"]/div[1]/div[1]/div/div[1]/div[1]/h3/div")
	private ExtendedWebElement carConfiguratorTitle;
	
	@FindBy(xpath = "//*[@id=\"model-chooser\"]/div[1]/div[1]/div/div[1]/div[1]/h2")
	private ExtendedWebElement carConfiguratorDescription;
	
	@FindBy(xpath = "//*[@id=\"model-chooser\"]/div[1]/div[1]/div/div[1]/div[1]/a")
	private ExtendedWebElement carConfiguratorButton;
	
	@FindBy(xpath ="//*[@id=\"model-chooser\"]/div[1]/div[1]/div/div[2]")
	private List<ExtendedWebElement> carConfiguratorLinks;
    
    //Dealer locator
	@FindBy(xpath = "//*[@id=\"banner\"]/div/div[2]/h4")
	private ExtendedWebElement dealerLocatorTitle;
	
	@FindBy(xpath = "//*[@id=\"banner\"]/div/div[2]/h2")
	private ExtendedWebElement dealerLocatorDescription;
	
	@FindBy(xpath = "//*[@id=\"banner\"]/div/div[2]/a")
	private ExtendedWebElement dealerLocatorButton;
    
	//News
	@FindBy(xpath = "//div[@id='news']//section")
	private List<New> news;
	
	@FindBy(xpath="//div/a[@class='btn boxed dark']")
    private ExtendedWebElement seeAllNewsButton;
      
    //Emmissions banner
	@FindBy(xpath="/html/body/div/div[3]")
	private ExtendedWebElement bannerText;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
    
	public HomePage(WebDriver driver) {
		super(driver);
	}


	public ExtendedWebElement getDealerLocatorTitle() {
		return dealerLocatorTitle;
	}


	public ExtendedWebElement getDealerLocatorDescription() {
		return dealerLocatorDescription;
	}

	public ExtendedWebElement getDealerLocatorButton() {
		return dealerLocatorButton;
	}

	public ExtendedWebElement getEmissionsBanner() {
		return bannerText;
	}


	public static Logger getLogger() {
		return LOGGER;
	}


	public ExtendedWebElement getGalleryTag() {
		return galleryTag;
	}


	public ExtendedWebElement getGalleryExploreMoreButton() {
		return galleryExploreMoreButton;
	}


	public ExtendedWebElement getCarConfiguratorTitle() {
		return carConfiguratorTitle;
	}


	public ExtendedWebElement getCarConfiguratorDescription() {
		return carConfiguratorDescription;
	}


	public ExtendedWebElement getCarConfiguratorButton() {
		return carConfiguratorButton;
	}


	public List<ExtendedWebElement> getCarConfiguratorLinks() {
		return carConfiguratorLinks;
	}


	public List<New> getNews() {
		return news;
	}


	public ExtendedWebElement getSeeAllNewsButton() {
		return seeAllNewsButton;
	}


	public ExtendedWebElement getBannerText() {
		return bannerText;
	}
	
}
