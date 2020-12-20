package com.projectLamborghini;



import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.projectLamborghini.gui.components.Header;
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

public class ComponentsTest extends AbstractTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(ComponentsTest.class);

    @Test
    public void testHeader() {

        Header header = new Header(getDriver());
        String info= header.getLeftListNames().toString();
        LOGGER.info(info);        
        Assert.assertEquals(header.getLeftListNames().toString(), "[\"MODELS\",\"OWNERSHIP\",\"MOTORSPORT\",\"PRE-OWNED\" ]");
    }

}