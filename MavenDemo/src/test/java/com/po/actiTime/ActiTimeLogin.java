package com.po.actiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.library.actiTime.BasePage;

public class ActiTimeLogin extends BasePage {

	public ActiTimeLogin(WebDriver driver) {
		super(driver);		
		wait.until(ExpectedConditions.titleContains("Login"));
	}
	@FindBy(id="username")
	private WebElement unTxtBx;
	
	@FindBy(name="pwd")
	private WebElement pwTxtBx;
	
	@FindBy(xpath="//div[contains(text(),'Login')]")
	private WebElement loginbtn;
	
	@FindBy(id="KeepLoggedInCheckBox")
	private WebElement KeepLoggedInChkBx;
	
	public void loginwithRememberMe(String un, String pw){
		unTxtBx.sendKeys(un);
		pwTxtBx.sendKeys(pw);
		loginbtn.click();
	}
	public void login(String un,String pw){
		unTxtBx.sendKeys(un);
		pwTxtBx.sendKeys(pw);
		loginbtn.click();
	}
}