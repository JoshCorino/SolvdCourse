package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class OwnershipPage extends AbstractUIObject{

	@FindBy(xpath="//*[@id=\"preowned\"]/div/p[2]")
	private ExtendedWebElement poloText;
	
	@FindBy(xpath="//*[@id=\"preowned\"]/div/a")
	private ExtendedWebElement poloButton;
	
	@FindBy(xpath="//*[@id=\"accessories\"]/div[1]/p[2]")
	private ExtendedWebElement accesoriesText;
	
	@FindBy(xpath="//*[@id=\"accessories\"]/div[1]/a")
	private ExtendedWebElement accesoriesButton;
	
	@FindBy(xpath="//*[@id=\"accessories\"]/div[2]/ul/li[1]/h5/a")
	private ExtendedWebElement serviceLocatorButton;
	
	@FindBy(xpath="//*[@id=\"accessories\"]/div[2]/ul/li[2]/h5/a")
	private ExtendedWebElement sparePartsButton;
	
	@FindBy(xpath="//*[@id=\"accessories\"]/div[2]/ul/li[3]/h5/a")
	private ExtendedWebElement originalAccesoriesButton;
	
	@FindBy(xpath="//*[@id=\"accessories\"]/div[2]/ul/li[4]/h5/a")
	private ExtendedWebElement financialServiceButton;
	
	@FindBy(xpath="//*[@id=\"ariacontent\"]/section[4]/div[1]/div/a")
	private ExtendedWebElement modelsButton;
	
	@FindBy(xpath="//*[@id=\"ariacontent\"]/section[4]/div[2]/div/a")
	private ExtendedWebElement museumButton;
	
	public OwnershipPage(WebDriver driver) {
		super(driver);
	}

	public ExtendedWebElement getPoloText() {
		return poloText;
	}

	public ExtendedWebElement getPoloButton() {
		return poloButton;
	}

	public ExtendedWebElement getAccesoriesText() {
		return accesoriesText;
	}

	public ExtendedWebElement getAccesoriesButton() {
		return accesoriesButton;
	}

	public ExtendedWebElement getServiceLocatorButton() {
		return serviceLocatorButton;
	}

	public ExtendedWebElement getSparePartsButton() {
		return sparePartsButton;
	}

	public ExtendedWebElement getOriginalAccesoriesButton() {
		return originalAccesoriesButton;
	}

	public ExtendedWebElement getFinancialServiceButton() {
		return financialServiceButton;
	}

	public ExtendedWebElement getModelsButton() {
		return modelsButton;
	}

	public ExtendedWebElement getMuseumButton() {
		return museumButton;
	}

	
}
