package com.projectLamborghini;



import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.projectLamborghini.gui.components.DealerLocator;
import com.solvd.projectLamborghini.gui.components.Header;
import com.solvd.projectLamborghini.gui.pages.HomePage;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This sample shows how create Web Localization test with Resource Bundle.
 *
 * @author qpsdemo
 */

public class DealerLocatorTest extends AbstractTest {

	private final String EXPECTED_URL= "https://www.lamborghini.com/en-en/dealer-locator";
	private final String EXPECTED_TITLE= "DEALER LOCATOR";
	private final String EXPECTED_DESCRIPTION= "FIND YOUR COUNTRY DEALER";
	
    @Test
	@MethodOwner(owner ="Joshua Corino")
	public void testButton() {

		HomePage hp = new HomePage(getDriver());
		hp.open();
		DealerLocator dl = hp.getDealerLocator();
		ExtendedWebElement button = dl.getButton(); 
		button.click(0);
		
		Assert.assertEquals(getDriver().getCurrentUrl(),EXPECTED_URL);		 
		
	}
    


}