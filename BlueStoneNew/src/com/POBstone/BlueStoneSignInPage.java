package com.POBstone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.POM.BlueStonePOM;



public class BlueStoneSignInPage {
		WebDriver driver;
		WebDriverWait wait;
	  @BeforeMethod
	  public void launchBrowser(){
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		   }
	  @Test
	  public void singup1() throws Exception{
		  driver.get("https://www.bluestone.com/");
		 BlueStonePOM bsp=new BlueStonePOM(driver);
		 
		 Long l = new Long(9015525930l);
		 String str=l.toString();
		 CharSequence ch=str.subSequence(0, str.length());
		 bsp.singnup1("VISHAL", "sinha.vishal292@gmail.com", ch);
		 Thread.sleep(3000);
		 driver.quit();
	  }
	}

