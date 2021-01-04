package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class EuropeTrofeoPage extends LamborghiniAbstractPage{
	   
	
	@FindBy(xpath="//*[@id='calendar-results']/div[1]/div[1]/div/div[3]/a")
	private ExtendedWebElement firstResultButton;
	
	public EuropeTrofeoPage(WebDriver driver) {
		super(driver);
	}
	public MisanoPage clickOfficialEntryListDownloadButton(long l) {
		//firstResultButton.click(l);
		//doubt: firstResultButton.click() doesnt work. I use JavaScript Click and work but i don't know why. I use WebElement instead ExtendedWebElement
		
		WebElement ele = driver.findElement((firstResultButton.getBy()));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);
		return new MisanoPage(driver);
	}
}