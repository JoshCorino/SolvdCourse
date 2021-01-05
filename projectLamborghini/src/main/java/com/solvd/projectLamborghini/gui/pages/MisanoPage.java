package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class MisanoPage extends LamborghiniAbstractPage{
	   

	//Models 
	@FindBy(xpath="//*[@class='col-12 col-md row no-gutters borders']/div[1]/div[2]")
	private ExtendedWebElement lengthText;
	
	@FindBy(xpath="//*[@class='icon-links col-12 col-md-5 d-none d-md-flex flex-column ']/div[1]/div[3]//a")
	private ExtendedWebElement officialEntryListDownloadButton;
	
	@FindBy(xpath="//*[@class='icon-links col-12 col-md-5 d-none d-md-flex flex-column ']/div[1]/div[4]//a")
	private ExtendedWebElement detailedTimetableButton;
	
	@FindBy(xpath="//*[@class='icon-links col-12 col-md-5 d-none d-md-flex flex-column ']/div[1]/div[5]//a")
	private ExtendedWebElement qualificationOneButton;
	
	@FindBy(xpath="//*[@class='icon-links col-12 col-md-5 d-none d-md-flex flex-column ']/div[1]/div[6]//a")
	private ExtendedWebElement qualificationTwoButton;
	
	@FindBy(xpath="//*[@class='icon-links col-12 col-md-5 d-none d-md-flex flex-column ']/div[1]/div[7]//a")
	private ExtendedWebElement calificationRaceOneButton;
	
	@FindBy(xpath="//*[@class='icon-links col-12 col-md-5 d-none d-md-flex flex-column ']/div[1]/div[8]//a")
	private ExtendedWebElement calificationRaceTwoButton;
	
	public MisanoPage(WebDriver driver) {
		super(driver);
	}

	public void clickdetailedTimetableButtonButton(long l) {
		//detailedTimetableButton.click(l);
		//doubt: detailedTimetableButton.click() doesnt work. I use JavaScript Click and work but i don't know why. I use WebElement instead ExtendedWebElement
		
		WebElement ele = driver.findElement((detailedTimetableButton.getBy()));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);
		
	}
}
