package com.projectLamborghini;

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

public class DetailedTimetablePdfTest extends AbstractTest {
	
	private static Logger log = LogManager.getLogger(DetailedTimetablePdfTest.class);

	
    @Test
	@MethodOwner(owner ="Joshua Corino")
	public void testPdf() {
		HomePage homePage = new HomePage(getDriver());
		homePage.open();
		MotorsportPage motorsportPage = homePage.clickMotorsportButton(0);
		SuperTrofeoPage superPage = motorsportPage.clickSuperTrofeoButton(0);
		EuropeTrofeoPage europePage = superPage.clickEuropeChampionshipButton(0);
		MisanoPage misanoPage = europePage.clickFirstResultButton(0);
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
}