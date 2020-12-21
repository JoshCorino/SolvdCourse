package com.projectLamborghini;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.projectLamborghini.gui.components.*;
import com.solvd.projectLamborghini.gui.pages.HomePage;

import java.util.ArrayList;
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

public class HeaderTest extends AbstractTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(HeaderTest.class);

	@Test
	public void testHeaderNames() {

		HomePage hp = new HomePage(getDriver());
		hp.open();
		Header header = hp.getHeader();
		List<String> leftNames = header.getLeftListNames();
		List<String> expectedNames = new ArrayList<String>();
		expectedNames.add("MODELS");
		expectedNames.add("OWNERSHIP");
		expectedNames.add("MOTORSPORT");
		expectedNames.add("PRE-OWNED");
		Assert.assertEquals(leftNames, expectedNames);

		
		List<String> rightNames= header.getRightListNames(); List<String>
		expectedRightNames = new ArrayList<String>();
		expectedRightNames.add("DEALERSHIPS"); 
		expectedRightNames.add("MUSEUM");
		expectedRightNames.add("STORE"); 
		Assert.assertEquals(rightNames,expectedRightNames);
		 

	}

}