package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class MotorsportPage extends LamborghiniAbstractPage{

	
	@FindBy(xpath="//*[@id='images-s']/div[2]/div[1]/div[1]/div/div/div/div[2]/div/div/a")
	private ExtendedWebElement superTrofeoButton;
	
	@FindBy(id="partners")
	private ExtendedWebElement partnersList; 
	
	public MotorsportPage(WebDriver driver) {
		super(driver);
	}

	public SuperTrofeoPage clickSuperTrofeoButton(long l) {
		
		//doubt: superTrofeoButton.click() doesnt work. I use JavaScript Click and work but i don't know why. I use WebElement instead ExtendedWebElement
		
		WebElement ele = driver.findElement((superTrofeoButton.getBy()));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);
		return new SuperTrofeoPage(driver);
	}
}
