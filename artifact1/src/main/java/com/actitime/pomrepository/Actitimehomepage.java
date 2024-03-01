package com.actitime.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitimehomepage {
WebDriver driver;
public  Actitimehomepage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	
	
	@FindBy(xpath = "//div[text()='Users']")
	private WebElement users;
	public WebElement getUsers() {
		return users;
	}
	@FindBy(xpath = "//div[@class='userList_manageButtons_component_manageGroupsButton']/div[text()='  Departments']")
	private WebElement departments;
	public WebElement getDepartments() {
		return departments;
	}
	@FindBy(xpath = "//td[@id='groupManagementLightBox_userGroupNameCell_8']//div[text()='Quality Control']")
	private WebElement qualitycontrol;
	
	public WebElement getQualitycontrol() {
		return qualitycontrol;
	}


	@FindBy(xpath = "//div[@id='groupManagementLightBox_closeLightbox']")
	private WebElement closebutton;
	public WebElement getClosebutton() {
		return closebutton;
	}
	@FindBy(xpath = "//a[text()='Logout']")
	private  WebElement logout;
	public WebElement getLogout() {
		return logout;
	}
	@FindBy(xpath = "//input[@id='groupManagementLightBox_userCheckbox_21']")
	private WebElement checkbox;
	public WebElement getCheckbox() {
		return checkbox;
	}
	

}
