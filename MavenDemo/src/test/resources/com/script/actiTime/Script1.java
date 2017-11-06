package com.script.actiTime;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.library.actiTime.BaseTest;

import com.po.actiTime.ActiTimeLogin;
import com.po.actiTime.ActiTime_HomePage;

public class Script1 extends BaseTest {
	
	
	@Test
	public void validLogin(){
		
		try {
			
			String expected="actiTIME - Login";
			ActiTimeLogin l=new ActiTimeLogin(driver);
			l.login("sinha.vishal292", "8eraDEge");
			ActiTime_HomePage h=new ActiTime_HomePage(driver);
			h.verifyTitle(expected);
			h.Logout(); 
			Reporter.log("Valid Login is Pass",true);
		} catch (Exception e) {
			Reporter.log("Valid Login is Failed", true);
			Assert.fail();
		}
	}
}
