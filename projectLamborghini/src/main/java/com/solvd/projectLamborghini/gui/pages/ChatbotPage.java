package com.solvd.projectLamborghini.gui.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class ChatbotPage extends AbstractPage{

	@FindBy(xpath="//*[@id='input_text']")
	private ExtendedWebElement textArea;

	@FindBy(xpath="//*[@id='submit-btn']")
	private ExtendedWebElement submitButton;

	@FindBy(xpath="(//*[@id='card_body']/div/div/span)[last()]")
	private ExtendedWebElement lastResponse;
	
	public ChatbotPage(WebDriver driver) {
		super(driver);
	}

	public void fillTextArea(String text) {

		if(textArea.isElementPresent(30)) {
			
			textArea.type(text);
		}
	}
	
	public void clickSubmitButton() {

		submitButton.clickIfPresent(30);

	}
	
	public String getLastResponseText() {
		if(lastResponse.isElementPresent(30)) {
			return lastResponse.getText();
		}
		return "a";
	}
}
