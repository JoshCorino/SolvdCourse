package com.solvd.projectLamborghini;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Set;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.projectLamborghini.gui.pages.EuropeTrofeoPage;
import com.solvd.projectLamborghini.gui.pages.HomePage;
import com.solvd.projectLamborghini.gui.pages.MisanoPage;
import com.solvd.projectLamborghini.gui.pages.MotorsportPage;
import com.solvd.projectLamborghini.gui.pages.SuperTrofeoPage;
import com.solvd.projectLamborghini.services.GoToMisanoPageService;

public class MisanoPageTest extends AbstractTest implements GoToMisanoPageService{
	
	private final String EXPECTED_LENGTH = "4,2 km";
	private final String EXPECTED_DESCRIPTION = "The Misano World Circuit Marco Simoncelli is located near the town of Misano Adriatico"
												+ ", in the Province of Rimini. It was opened in 1972. Since the 1990s, it has served as a venue for top motorcycle racing, "
												+ "Grand Prix Motorcycle Racing and Superbike events, attracting up to 100,000 spectators at a time. "
												+ "It is one of the most popular circuits among motorsport fans thanks to a lighting system that enables "
												+ "it to host breathtaking night races, not to mention its 70,000 m² paddock and the nearby attractions of the Romagna Riviera. ";
	private Logger log = LogManager.getLogger(MisanoPageTest.class);

	
    @Test
	@MethodOwner(owner ="Joshua Corino")
	public void testDetailedTimetablePdf() {
    	
		MisanoPage misanoPage = openMisanoPage(getDriver());
		String window1Handler = getDriver().getWindowHandle();
		misanoPage.clickdetailedTimetableButtonButton(0);
		Set<String> windows = getDriver().getWindowHandles();
		for (String string : windows) {
			if(!string.equals(window1Handler)) {
				getDriver().switchTo().window(string);
			}
		}
		InputStream in =null;
		BufferedInputStream bf=null;
		PDDocument doc=null;
		try {
			
			URL pdfUrlGetted = new URL(getDriver().getCurrentUrl());
			in = pdfUrlGetted.openStream();
			bf = new BufferedInputStream(in);
			doc = PDDocument.load(bf);
			String contentGetted = new PDFTextStripper().getText(doc);
			
			URL pdfUrlExpected = new URL("src/test/resources/2020_GT_World_Challenge_Misano_Detailed_Timetable_Draft_4.pdf");
			in = pdfUrlExpected.openStream();
			bf = new BufferedInputStream(in);
			doc = PDDocument.load(bf);
			String contentExpected = new PDFTextStripper().getText(doc);
			
			//doubt I need to check the hole pdf or only some content?"
			Assert.assertEquals(contentGetted,contentExpected);
			Assert.assertEquals(doc.getNumberOfPages(),3);

		} catch (Exception e) {
			log.info(e);
		}finally {
			try {
				in.close();
				bf.close();
				doc.close();
			} catch (IOException e) {
				log.info(e);
			}
		}
    }
    
    @Test
	@MethodOwner(owner ="Joshua Corino")
	public void testLength() {
    	
    	MisanoPage misanoPage = openMisanoPage(getDriver());
    	Assert.assertEquals(misanoPage.getLenghtText(),EXPECTED_LENGTH);
    	
    }
    
    @Test
	@MethodOwner(owner ="Joshua Corino")
	public void testDescription() {
    	
    	MisanoPage misanoPage = openMisanoPage(getDriver());
    	Assert.assertEquals(misanoPage.getDescriptionText(),EXPECTED_DESCRIPTION);
    	
    }
}
