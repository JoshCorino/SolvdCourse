package com.projectLamborghini;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.projectLamborghini.gui.components.*;
import com.solvd.projectLamborghini.gui.pages.HomePage;


import org.testng.Assert;
import org.testng.annotations.Test;

public class FooterTest  extends AbstractTest {
    private final String EXPECTED_TEXT= "COMPANYCAREERSCONTACT USMEDIA CENTERPRIVACY & LEGALSITEMAPNEWSLETTER";
    private final String EXPECTED_MAIN_TEXT= "Copyright © 2020 Automobili Lamborghini S.p.A. a sole shareholder company part of Audi Group.All rights reserved. VAT no. IT 00591801204";
	
    @Test
	@MethodOwner(owner ="Joshua Corino")
	public void testFooterNames() {

		HomePage hp = new HomePage(getDriver());
		hp.open();
		
		Footer footer = hp.getFooterMenu();
		String namesList = footer.getLinkListText();
		Assert.assertEquals(namesList, EXPECTED_TEXT);
		
		String text= footer.getMainText();
		Assert.assertEquals(text.replaceAll("\n", ""),EXPECTED_MAIN_TEXT);
		
	}
}
