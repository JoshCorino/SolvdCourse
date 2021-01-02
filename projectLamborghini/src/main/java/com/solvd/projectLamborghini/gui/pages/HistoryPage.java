package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class HistoryPage extends LamborghiniAbstractPage{
	
	@FindBy(xpath="//*[@id=\"block-lambo-content\"]/section/div[1]/div[2]")
	private ExtendedWebElement horizontalTimeLine;
	
	@FindBy(xpath="//*[@id=\"block-lambo-content\"]/section/div[2]/div[2]/ul")
	private ExtendedWebElement verticalTimeLine;
	
	@FindBy(xpath="//*[@id=\"block-lambo-content\"]/section/div[2]/div[3]/div[1]/div[1]/img")
	private ExtendedWebElement mainImg;
	
	@FindBy(xpath="//*[@id=\"block-lambo-content\"]/section/div[2]/div[3]/div[1]/div[2]/div")
	private ExtendedWebElement mainText;
	
	@FindBy(xpath="//*[@id=\"block-lambo-content\"]/section/div[2]/div[3]/div[2]/div[1]/img")
	private ExtendedWebElement secondaryImg;
	
	@FindBy(xpath="//*[@id=\"block-lambo-content\"]/section/div[2]/div[3]/div[2]/div[2]/img")
	private ExtendedWebElement thirdImg;
	
	
	public HistoryPage(WebDriver driver) {
		super(driver);
	}

	public String getVerticalTimelineText() {
		return verticalTimeLine.getText();
	}	
	
	public String getHorizontalTimelineText() {
		return horizontalTimeLine.getText();
	}	
	public String getMainText() {
		return mainText.getText();
	}	


	
}
