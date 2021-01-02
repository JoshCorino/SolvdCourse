package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class DesignPage extends LamborghiniAbstractPage{

	@FindBy(xpath="//*[@id=\"block2\"]/div[1]/div/p[2]")
	private ExtendedWebElement designDNAText;
	
	@FindBy(xpath="//*[@id=\"block1-skew-1-text\"]/div/p[2]")
	private ExtendedWebElement hexagonAndYText;
	
	@FindBy(xpath="//*[@id=\"block4\"]/div[1]/div/p[2]")
	private ExtendedWebElement centroStileText;
	
	@FindBy(xpath="//*[@id=\"block4-skew-1-text\"]/div/p[2]")
	private ExtendedWebElement processText;
	
	@FindBy(xpath="//*[@id=\"block3-title\"]/div[2]/div/p")
	private ExtendedWebElement sketchesText;
	
	@FindBy(xpath="//*[@id=\"gallery\"]/section/div[1]/div[1]")
	private ExtendedWebElement gallery;
	
	public DesignPage(WebDriver driver) {
		super(driver);
	}

	public String getdDesignDNAText() {
		return designDNAText.getText();
	}
	
	public String getHexagonAndYText() {
		return hexagonAndYText.getText();
	}	
	
	public String getCentroStileText() {
		return centroStileText.getText();
	}	
	
	public String getProcessText() {
		return processText.getText();
	}	
	
	public String getSketchesText() {
		return sketchesText.getText();
	}
	
}
