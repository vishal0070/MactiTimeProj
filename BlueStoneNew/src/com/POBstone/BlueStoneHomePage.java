package com.POBstone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.libraryBstone.BasePageBstone;

public class BlueStoneHomePage  extends BasePageBstone{
	private WebElement logout;
	public BlueStoneHomePage(WebDriver driver) {
		super(driver);
		wait.until(ExpectedConditions.titleContains("Online Jewellery Shopping Store India"));
	}
		public void Logout(){
			logout.click();
		}
		
		public void verifyTitle(String expected) {
			String st="";
			System.out.println(st);
		}
		 
		}
		




