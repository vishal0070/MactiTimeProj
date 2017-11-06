package com.po.actiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.library.actiTime.BasePage;

public class ActiTime_HomePage  extends BasePage{
	private WebElement logoutLink;
public ActiTime_HomePage(WebDriver driver){
	super(driver);	
	wait.until(ExpectedConditions.titleContains("actiTIME - Login"));
	}
public void Logout(){
	logoutLink.click();
}
public void verifyTitle(String expected) {
String st="";
System.out.println(st);
}
}




