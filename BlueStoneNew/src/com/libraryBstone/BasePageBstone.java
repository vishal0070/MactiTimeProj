package com.libraryBstone;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class BasePageBstone {
	public WebDriver driver;
	public WebDriverWait wait;
	
	public BasePageBstone(WebDriver driver){
		this.driver=driver;
		wait=new WebDriverWait(driver,20);
		PageFactory.initElements(driver, this);
	}
		
		public void verifyTitle(String title){
			try {
				wait.until(ExpectedConditions.titleIs(title));
				Reporter.log("Title Verified",true);
			} catch (TimeoutException e) {
				Reporter.log("Title is not Matching", true);
				Assert.fail();
			}
		}
		public void verifyElement(WebElement element){
			try {
				wait.until(ExpectedConditions.visibilityOf(element));
				Reporter.log("Element Verified", true);
			} catch (TimeoutException e) {
				Reporter.log("Element Not Present", true);
				Assert.fail();
			}
	}

}
