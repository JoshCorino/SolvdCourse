package com.solvd.projectLamborghini;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.projectLamborghini.gui.components.*;
import com.solvd.projectLamborghini.gui.pages.HomePage;

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

	@DataProvider(name = "testHeaderLeftText")
	public Object[] createLeftData() {
		 return new Object[] 
		   { EXPECTED_LEFT_TEXT_1,EXPECTED_LEFT_TEXT_2,EXPECTED_LEFT_TEXT_3,EXPECTED_LEFT_TEXT_4 };		 
	}
	
	@DataProvider(name = "testHeaderRightText")
	public Object[] createRightData() {
		 return new Object[] 
		   { EXPECTED_RIGHT_TEXT_1,EXPECTED_RIGHT_TEXT_2,EXPECTED_RIGHT_TEXT_3 };		 
	}


	
	@Test(dataProvider = "testHeaderLeftText")
	@MethodOwner(owner ="Joshua Corino")
	public void testHeaderLeftText(String expectedName) {

		HomePage hp = new HomePage(getDriver());
		hp.open();
		Header header = hp.getHeader();
		
		List<String> leftNames = header.getLeftListNames();
		Assert.assertTrue(leftNames.contains(expectedName));
		
	}
	
	@Test(dataProvider = "testHeaderRightText")
	@MethodOwner(owner ="Joshua Corino")
	public void testHeaderRightText(String expectedName) {

		HomePage hp = new HomePage(getDriver());
		hp.open();
		Header header = hp.getHeader();
		
		List<String> rightNames= header.getRightListNames(); 
		Assert.assertTrue(rightNames.contains(expectedName));		 
		
	}

}