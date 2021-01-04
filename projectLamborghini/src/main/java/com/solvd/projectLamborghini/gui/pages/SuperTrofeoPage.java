package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class SuperTrofeoPage extends LamborghiniAbstractPage{
	   
	
	@FindBy(xpath="//*[@id='images-s']/div[2]/div[2]/div[1]/div/div/div[1]/div/div/div/a")
	private ExtendedWebElement europeChampionshipButton;
	
    public SuperTrofeoPage(WebDriver driver) {
		super(driver);
	}

	public EuropeTrofeoPage clickEuropeChampionshipButton(long l) {
		//europeChampionshipButton.click(l);
		//doubt: europeChampionshipButton.click() doesnt work. I use JavaScript Click and work but i don't know why. I use WebElement instead ExtendedWebElement
		
		WebElement ele = driver.findElement((europeChampionshipButton.getBy()));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);
		
		return new EuropeTrofeoPage(driver);
	}
}
