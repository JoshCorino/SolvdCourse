package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class SuperTrofeoPage extends LamborghiniAbstractPage{
	   
	
	@FindBy(xpath="//*[@class='offset-1 offset-lg-2 col-8 col-lg-7 col-xl-6 multi']/div[1]//a")
	private ExtendedWebElement europeChampionshipButton;
	
	@FindBy(xpath="//*[@class='offset-1 offset-lg-2 col-8 col-lg-7 col-xl-6 multi']/div[2]//a")
	private ExtendedWebElement asiaChampionshipButton;
	
	@FindBy(xpath="//*[@class='offset-3 offset-lg-4 col-8 col-lg-7 col-xl-6 multi']/div//a")
	private ExtendedWebElement northAmericaChampionshipButton;
	
	@FindBy(xpath="//*[@class='row align-items-center h-100']//a")
	private ExtendedWebElement teamsListButton;
	
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
