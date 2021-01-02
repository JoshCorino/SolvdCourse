package com.solvd.projectLamborghini.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.projectLamborghini.gui.components.DisclaimerCookie;
import com.solvd.projectLamborghini.gui.components.Footer;
import com.solvd.projectLamborghini.gui.components.Header;

public abstract class LamborghiniAbstractPage extends AbstractPage{

    @FindBy(xpath="/html/body/div/header") 
    private Header header;
    
    @FindBy(className="container-fluid")
    private Footer footerMenu;
    
    @FindBy(id="disclaimer-cookie")
    private DisclaimerCookie disclaimerCookie;
    
	public LamborghiniAbstractPage(WebDriver driver) {
		super(driver);
	}
	
	public Header getHeader() {
		return header;
	}
	
	public Footer getFooterMenu() {
		return footerMenu;
	}

	public DisclaimerCookie getDisclaimerCookie() {
		return disclaimerCookie;
	}

}
