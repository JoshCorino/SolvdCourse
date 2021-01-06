package com.solvd.projectLamborghini.services;

import org.openqa.selenium.WebDriver;

import com.solvd.projectLamborghini.gui.pages.HomePage;


public interface OpenHomeAndAgreeCookiesService {

	default HomePage openHomeAndAgreeCockies(WebDriver driver) {
		HomePage hp = new HomePage(driver);
		hp.open();
		hp.getDisclaimerCookie().clickAgreeButton(0);
		return hp;
	}
}
