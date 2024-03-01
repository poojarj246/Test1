package com.actitime.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitimeloginpage {
	WebDriver driver;
	public  Actitimeloginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
		private WebElement usernametextfield;
	
	
	public WebElement getUsernametextfield() {
		return usernametextfield;
	}

	@FindBy(css = "input[name='pwd']")
		private WebElement passwordtextfield;
	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}
	@FindBy(id = "loginButton")
		private WebElement loginbutton1;
	public  WebElement loginbutton1() {
		return loginbutton1;
	}
	}


