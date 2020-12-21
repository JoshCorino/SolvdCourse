package com.projectLamborghini;



import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.projectLamborghini.gui.components.*;
import com.solvd.projectLamborghini.gui.pages.HomePage;

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
    public void testHeader() {

    	HomePage hp = new HomePage(getDriver());
    	hp.open();
        Header header = hp.getHeader();
        String leftInfo= header.getLeftListNames().toString();
        /*LOGGER.info(leftInfo);        
        Assert.assertEquals(leftInfo, "[[MODELS,OWNERSHIP,MOTORSPORT,PRE-OWNED]]");
        String rightInfo= header.getRightListNames().toString();
        LOGGER.info(rightInfo);        
        Assert.assertEquals(rightInfo, "[[DEALERSHIPS,MUSEUM,STORE]]");*/
        LOGGER.info("entro");
        for(ExtendedWebElement e: header.getLeftList()) {
        	LOGGER.info(e.toString());
        }
    }


}