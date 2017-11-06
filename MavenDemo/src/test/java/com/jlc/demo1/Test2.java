package com.jlc.demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Test2 extends Test1{
	@Test
	public void searchSelenium(){
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
	}
}
