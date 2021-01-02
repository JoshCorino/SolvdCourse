package com.solvd.projectLamborghini.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class DisclaimerCookie extends AbstractUIObject{

	@FindBy(xpath="//*[@id=\"disclaimer-cookie\"]/div/div[1]/p")
	private ExtendedWebElement termsText;
	
	@FindBy(xpath="//*[@id=\"disclaimer-cookie\"]/div/div[1]/p/a")
	private ExtendedWebElement cookiesButton;
		
	@FindBy(xpath="//*[@id=\"disclaimer-cookie\"]/div/div[2]/button")
	private ExtendedWebElement agreeButton;
	
	public DisclaimerCookie(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

	public String getTermsText(){
		return termsText.getText();
	}
	
	public void clickAgreeButton(long timeOut) {
		agreeButton.click(timeOut);
	}
	
	public void clickCookiesButton(long timeOut) {
		cookiesButton.click(timeOut);
	}
}
