package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class ChatbotPage extends AbstractPage{

	@FindBy(xpath="//*[@id='input_text']")
	private ExtendedWebElement textArea;

	@FindBy(xpath="//*[@id=\"submit-btn\"]")
	private ExtendedWebElement submitButton;

	//@FindBy(xpath="(//*[@id=\"card_body\"]/div/div/span)[last()]")
	@FindBy(xpath="//*[@id=\"card_body\"]/div[6]/div")
	private ExtendedWebElement lastResponse;
	
	public ChatbotPage(WebDriver driver) {
		super(driver);
	}

	public void fillTextArea(String text) {
		/*WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(
			    ExpectedConditions.visibilityOfElementLocated(textArea.getBy())
			);
		element.sendKeys(text);
		
		WebElement ele = driver.findElement(By.xpath("//*[@id='input_text']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].sendKeys("+text+")", ele);
		//driver.findElement(textArea.getBy()).sendKeys(text);*/
		if(textArea.isElementPresent(120)) {
			textArea.type(text);
		}
	}
	
	public void clickSubmitButton() {
		/*WebElement ele = driver.findElement(submitButton.getBy());
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);*/
		if(submitButton.isElementPresent(120)) {
			WebElement ele = driver.findElement(submitButton.getBy());
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click()", ele);
		}
	}
	
	public String getLastResponseText() {
		if(lastResponse.isElementPresent(200)) {
			return lastResponse.getText();
		}
		return "a";
	}
}
