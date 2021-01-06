package com.solvd.projectLamborghini;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.projectLamborghini.gui.pages.HomePage;
import com.solvd.projectLamborghini.services.OpenHomeAndAgreeCookiesService;

public class HomePageTest extends AbstractTest implements OpenHomeAndAgreeCookiesService{
	
    private final String EMISSIONS_BANNER_EXPECTED_TEXT= "Fuel consumption and emission values of all vehicles promoted on this page -Fuel consumption and emission: 18.8 - 12,7 l/100km ; CO2-emissions combined: 499 g/km - 325 g/km (WLTP)";
    private final String GALLERY_TAG_EXPECTED_TEXT= "MODELS";
    private final String CAR_CONFIGURATOR_EXPECTED_URL= "https://www.lamborghini.com/en-en/";
    private final String DEALER_LOCATOR_EXPECTED_URL= "https://www.lamborghini.com/en-en/dealer-locator";
    private final String SEE_NEWS_EXPECTED_URL= "https://www.lamborghini.com/en-en/news";
      
    
    @Test
	@MethodOwner(owner ="Joshua Corino")
	public void galleryTagText() {
    	
		HomePage hp = openHomeAndAgreeCockies(getDriver());

		String text = hp.getGalleryTagText();
		Assert.assertEquals(text, GALLERY_TAG_EXPECTED_TEXT);

	}
    
    @Test
	@MethodOwner(owner ="Joshua Corino")
	public void carConfiguratorButton() {
    	
    	HomePage hp = new HomePage(getDriver());
		hp.open();
		hp.clickCarConfiguratorButton(0);
		Assert.assertEquals(getDriver().getCurrentUrl(),CAR_CONFIGURATOR_EXPECTED_URL);		 
		
	}
    
    @Test
	@MethodOwner(owner ="Joshua Corino")
	public void dealerLocatorButton() {
    	
		HomePage hp = openHomeAndAgreeCockies(getDriver());

		hp.clickDealerLocatorButton(0);
		Assert.assertEquals(getDriver().getCurrentUrl(),DEALER_LOCATOR_EXPECTED_URL);		 
		
	}
    
    @Test
	@MethodOwner(owner ="Joshua Corino")
	public void seeAllNewsButton() {
    	
		HomePage hp = openHomeAndAgreeCockies(getDriver());

		hp.clickSeeAllNewsButton(0);
		Assert.assertEquals(getDriver().getCurrentUrl(),SEE_NEWS_EXPECTED_URL);		 
		
	}

	
    @Test
	@MethodOwner(owner ="Joshua Corino")
	public void testEmissionsBannerText() {
    	
		HomePage hp = openHomeAndAgreeCockies(getDriver());

		String text = hp.getEmissionsBannerText();
		Assert.assertEquals(text, EMISSIONS_BANNER_EXPECTED_TEXT);

	}
}
