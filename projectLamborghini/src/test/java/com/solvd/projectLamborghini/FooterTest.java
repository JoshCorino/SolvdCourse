package com.solvd.projectLamborghini;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.projectLamborghini.gui.components.*;
import com.solvd.projectLamborghini.gui.pages.HomePage;
import com.solvd.projectLamborghini.services.OpenHomeAndAgreeCookiesService;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FooterTest  extends AbstractTest implements OpenHomeAndAgreeCookiesService{
    private final String EXPECTED_TEXT= "COMPANYCAREERSCONTACT USMEDIA CENTERPRIVACY & LEGALSITEMAPNEWSLETTER";
    private final String EXPECTED_MAIN_TEXT= "Copyright © 2021 Automobili Lamborghini S.p.A. a sole shareholder company part of Audi Group.All rights reserved. VAT no. IT 00591801204";
	
    @Test
	@MethodOwner(owner ="Joshua Corino")
	public void testFooterText() {

		HomePage hp = openHomeAndAgreeCockies(getDriver());
		Footer footer = hp.getFooterMenu();
		String namesList = footer.getLinkListText();
		Assert.assertEquals(namesList, EXPECTED_TEXT);
		
		String text= footer.getMainText().replaceAll("\n", "");
		Assert.assertEquals(text,EXPECTED_MAIN_TEXT);
		
	}
}
