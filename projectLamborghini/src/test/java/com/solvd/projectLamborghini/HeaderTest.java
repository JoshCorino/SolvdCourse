package com.solvd.projectLamborghini;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.projectLamborghini.gui.components.*;
import com.solvd.projectLamborghini.gui.pages.HomePage;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class HeaderTest extends AbstractTest {
	
	private final String EXPECTED_LEFT_TEXT_1= "MODELS";
	private final String EXPECTED_LEFT_TEXT_2= "OWNERSHIP";
	private final String EXPECTED_LEFT_TEXT_3= "MOTORSPORT";
	private final String EXPECTED_LEFT_TEXT_4= "PRE-OWNED";
	private final String EXPECTED_RIGHT_TEXT_1= "DEALERSHIPS";
	private final String EXPECTED_RIGHT_TEXT_2= "MUSEUM";
	private final String EXPECTED_RIGHT_TEXT_3= "STORE";

	
	@Test
	@MethodOwner(owner ="Joshua Corino")
	public void testHeaderLeftText() {

		HomePage hp = new HomePage(getDriver());
		hp.open();
		Header header = hp.getHeader();
		List<String> expectedNames = new ArrayList<String>();
		expectedNames.add(EXPECTED_LEFT_TEXT_1);
		expectedNames.add(EXPECTED_LEFT_TEXT_2);
		expectedNames.add(EXPECTED_LEFT_TEXT_3);
		expectedNames.add(EXPECTED_LEFT_TEXT_4);
		
		List<String> leftNames = header.getLeftListNames();
		Assert.assertTrue(leftNames.containsAll(expectedNames));
		
	}
	
	@Test
	@MethodOwner(owner ="Joshua Corino")
	public void testHeaderRightText() {

		HomePage hp = new HomePage(getDriver());
		hp.open();
		Header header = hp.getHeader();
		List<String> expectedNames = new ArrayList<String>();
		expectedNames.add(EXPECTED_RIGHT_TEXT_1);
		expectedNames.add(EXPECTED_RIGHT_TEXT_2);
		expectedNames.add(EXPECTED_RIGHT_TEXT_3);
		
		List<String> rightNames= header.getRightListNames(); 
		Assert.assertTrue(rightNames.containsAll(expectedNames));		 
		
	}

}