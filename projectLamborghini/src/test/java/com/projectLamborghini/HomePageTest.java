package com.projectLamborghini;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.projectLamborghini.gui.pages.HomePage;

public class HomePageTest extends AbstractTest {
	
	private final String DEALER_EXPECTED_URL= "https://www.lamborghini.com/en-en/dealer-locator";
	private final String DEALER_EXPECTED_TITLE= "DEALER LOCATOR";
	private final String DEALER_EXPECTED_DESCRIPTION= "FIND YOUR COUNTRY DEALER";
    private final String EMISSIONS_BANNER_EXPECTED_TEXT= "Fuel consumption and emission values of all vehicles promoted on this page -Fuel consumption and emission: 18.8 - 12,7 l/100km ; CO2-emissions combined: 499 g/km - 325 g/km (WLTP)";

    @Test
	@MethodOwner(owner ="Joshua Corino")
	public void testDealerLocatorButton() {

		HomePage hp = new HomePage(getDriver());
		hp.open();
		ExtendedWebElement button = hp.getDealerLocatorButton();
		button.click(0);
		Assert.assertEquals(getDriver().getCurrentUrl(),DEALER_EXPECTED_URL);		 
		
	}

	
    @Test
	@MethodOwner(owner ="Joshua Corino")
	public void testEmissionsBannerText() {

		HomePage hp = new HomePage(getDriver());
		hp.open();
		String text = hp.getEmissionsBanner().getText();
		Assert.assertEquals(text, EMISSIONS_BANNER_EXPECTED_TEXT);

	}
}
