package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class MotorsportPage extends LamborghiniAbstractPage{

	
	@FindBy(xpath="//*[@class='top row align-items-end']//a")
	private ExtendedWebElement superTrofeoButton;
	
	@FindBy(xpath="//*[@class='bottom row align-items-start']//a")
	private ExtendedWebElement gt3ChampionshipButton;
	
	@FindBy(xpath="//*[@class='block-img-s two-rows']/div[2]//div[1]/div/a")
	private ExtendedWebElement raceCarsButton;
	
	@FindBy(xpath="//*[@class='block-img-s two-rows']/div[2]//div[2]/div/a")
	private ExtendedWebElement oneOffButton;
	
	@FindBy(xpath="//*[@class='d-flex align-items-center h-100']//a\r\n")
	private ExtendedWebElement lamborghiniExperienceButton;
	
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
