package com.solvd.projectLamborghini.services;

import org.openqa.selenium.WebDriver;

import com.solvd.projectLamborghini.gui.pages.EuropeTrofeoPage;
import com.solvd.projectLamborghini.gui.pages.HomePage;
import com.solvd.projectLamborghini.gui.pages.MisanoPage;
import com.solvd.projectLamborghini.gui.pages.MotorsportPage;
import com.solvd.projectLamborghini.gui.pages.SuperTrofeoPage;

public interface GoToMisanoPageService {

	default MisanoPage openMisanoPage(WebDriver driver) {
		HomePage homePage = new HomePage(driver);
		homePage.open();
		homePage.getDisclaimerCookie().clickAgreeButton(0);
		MotorsportPage motorsportPage = homePage.clickMotorsportButton(0);
		SuperTrofeoPage superPage = motorsportPage.clickSuperTrofeoButton(0);
		EuropeTrofeoPage europePage = superPage.clickEuropeChampionshipButton(0);
		return  europePage.clickFirstResultButton(0);
	}
}
