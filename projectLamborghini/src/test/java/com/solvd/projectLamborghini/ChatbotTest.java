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
import com.solvd.projectLamborghini.services.OpenHomeAndAgreeCookiesService;

public class ChatbotTest extends AbstractTest implements OpenHomeAndAgreeCookiesService{

	@DataProvider(name = "velocitiesQuestionsAndAnswers")
	public Object[][] createRightData() {
		 return new Object[][] 
		   {{ "What is the top speed of the Huracan?","The top speed of Hurac�n EVO is more than 325 km/h."}};
			 //{"What is the top speed of the Aventador?","The top speed of Aventador SVJ is more than 350 km/h."}};		 
	}
	
    @Test(dataProvider = "velocitiesQuestionsAndAnswers")
	@MethodOwner(owner ="Joshua Corino")
	public void testVelocitiesQuestions(String question, String expectedResponse) {
    	HomePage hp = openHomeAndAgreeCockies(getDriver());
		ChatbotPage cp= hp.clickChat(0);  
		/*TakesScreenshot scrShot =((TakesScreenshot)getDriver());
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("src/test/resources/test.png");
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		cp.fillTextArea(question);
		TakesScreenshot scrShot =((TakesScreenshot)getDriver());
		File srcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File destFile=new File("src/test/resources/testAfterFill.png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cp.clickSubmitButton();
		scrShot =((TakesScreenshot)getDriver());
		srcFile=scrShot.getScreenshotAs(OutputType.FILE);
		destFile=new File("src/test/resources/testaftersubmit.png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(cp.getLastResponseText(),expectedResponse);
    }
}
