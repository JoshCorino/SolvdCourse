package com.projectLamborghini;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.projectLamborghini.gui.components.*;
import com.solvd.projectLamborghini.gui.pages.HomePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EmissionsBannerTest extends AbstractTest{
    private final String EXPECTED_TEXT= "Fuel consumption and emission values of all vehicles promoted on this page -Fuel consumption and emission: 18.8 - 12,7 l/100km ; CO2-emissions combined: 499 g/km - 325 g/km (WLTP)";

	
    @Test
	@MethodOwner(owner ="Joshua Corino")
	public void testBannerText() {

		HomePage hp = new HomePage(getDriver());
		hp.open();
		
		EmissionsBanner eb = hp.getEmissionsBanner();
		String text = eb.getText();
		Assert.assertEquals(text, EXPECTED_TEXT);

		
	}
}
