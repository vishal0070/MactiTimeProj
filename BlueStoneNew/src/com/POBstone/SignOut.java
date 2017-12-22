package com.POBstone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignOut {
	private WebElement logout;
	public SignOut(WebDriver driver){
		logout=driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]"));
	}
public void Logout(){
	logout.click();
}
}


