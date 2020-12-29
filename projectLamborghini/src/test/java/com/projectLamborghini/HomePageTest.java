package com.projectLamborghini;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.projectLamborghini.gui.pages.HomePage;

public class HomePageTest extends AbstractTest {
	
	private final String DEALER_EXPECTED_URL= "https://www.lamborghini.com/en-en/dealer-locator";
    private final String EMISSIONS_BANNER_EXPECTED_TEXT= "Fuel consumption and emission values of all vehicles promoted on this page -Fuel consumption and emission: 18.8 - 12,7 l/100km ; CO2-emissions combined: 499 g/km - 325 g/km (WLTP)";
    private final String GALLERY_TAG_EXPECTED_TEXT= "MODELS";
    private final String CAR_CONFIGURATOR_EXPECTED_URL= "https://www.lamborghini.com/en-en/";
    private final String DEALER_LOCATOR_EXPECTED_URL= "https://www.lamborghini.com/en-en/dealer-locator";
    private final String SEE_NEWS_EXPECTED_URL= "https://www.lamborghini.com/en-en/news";
    
    private HomePage hp = new HomePage(getDriver());
    
    @Test
	@MethodOwner(owner ="Joshua Corino")
	public void galleryTagText() {

		hp.open();
		String text = hp.getGalleryTag().getText();
		Assert.assertEquals(text, GALLERY_TAG_EXPECTED_TEXT);

	}
    
    @Test
	@MethodOwner(owner ="Joshua Corino")
	public void carConfiguratorButton() {

		hp.open();
		ExtendedWebElement button = hp.getCarConfiguratorButton();
		button.click(0);
		Assert.assertEquals(getDriver().getCurrentUrl(),CAR_CONFIGURATOR_EXPECTED_URL);		 
		
	}
    
    @Test
	@MethodOwner(owner ="Joshua Corino")
	public void dealerLocatorButton() {

		hp.open();
		ExtendedWebElement button = hp.getDealerLocatorButton();
		button.click(0);
		Assert.assertEquals(getDriver().getCurrentUrl(),DEALER_LOCATOR_EXPECTED_URL);		 
		
	}
    
    @Test
	@MethodOwner(owner ="Joshua Corino")
	public void seeAllNewsButton() {

		hp.open();
		ExtendedWebElement button = hp.getSeeAllNewsButton();
		button.click(0);
		Assert.assertEquals(getDriver().getCurrentUrl(),SEE_NEWS_EXPECTED_URL);		 
		
	}

    @Test
	@MethodOwner(owner ="Joshua Corino")
	public void testDealerLocatorButton() {

		hp.open();
		ExtendedWebElement button = hp.getDealerLocatorButton();
		button.click(0);
		Assert.assertEquals(getDriver().getCurrentUrl(),DEALER_EXPECTED_URL);		 
		
	}

	
    @Test
	@MethodOwner(owner ="Joshua Corino")
	public void testEmissionsBannerText() {

		hp.open();
		String text = hp.getEmissionsBanner().getText();
		Assert.assertEquals(text, EMISSIONS_BANNER_EXPECTED_TEXT);

	}
}
