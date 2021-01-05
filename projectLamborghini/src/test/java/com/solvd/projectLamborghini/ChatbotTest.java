package com.solvd.projectLamborghini;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.projectLamborghini.gui.pages.ChatbotPage;
import com.solvd.projectLamborghini.gui.pages.HomePage;

public class ChatbotTest extends AbstractTest {

	@DataProvider(name = "velocitiesQuestionsAndAnswers")
	public Object[][] createRightData() {
		 return new Object[][] 
		   {{ "What is the top speed of the Huracan?","The top speed of Huracán EVO is more than 325 km/h."},
			 {"What is the top speed of the Aventador?","The top speed of Aventador SVJ is more than 350 km/h."}};		 
	}
	
    @Test(dataProvider = "velocitiesQuestionsAndAnswers")
	@MethodOwner(owner ="Joshua Corino")
	public void testVelocitiesQuestions(String question, String expectedResponse) {
    	HomePage hp = new HomePage(getDriver());
		hp.open();
		hp.getDisclaimerCookie().clickAgreeButton(0);
		ChatbotPage cp= hp.clickChat(0);
		TakesScreenshot scrShot =((TakesScreenshot)getDriver());
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("src/test/resources/test.png");
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cp.fillTextArea(question);
		cp.clickSubmitButton();
		Assert.assertEquals(cp.getLastResponseText(),expectedResponse);
    }
}
