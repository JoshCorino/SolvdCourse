package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class MisanoPage extends LamborghiniAbstractPage{
	   

	//Models 
	@FindBy(xpath="//*[@id='links-and-text']/div/div/div/div/div[1]/div[1]/div[3]/a")
	private ExtendedWebElement officialEntryListDownloadButton;
	
	public MisanoPage(WebDriver driver) {
		super(driver);
	}

	public void clickOfficialEntryListDownloadButton(long l) {
		//officialEntryListDownloadButton.click(l);
		//doubt: officialEntryListDownloadButton.click() doesnt work. I use JavaScript Click and work but i don't know why. I use WebElement instead ExtendedWebElement
		
		WebElement ele = driver.findElement((officialEntryListDownloadButton.getBy()));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);
		
	}
}
