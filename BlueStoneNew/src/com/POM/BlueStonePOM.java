package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.libraryBstone.BasePageBstone;

public class BlueStonePOM  extends BasePageBstone{
	WebDriverWait wait;
	public BlueStonePOM(WebDriver driver){
		super(driver);
		wait.until(ExpectedConditions.titleContains("Online Jewellery Shopping Store India | Buy Gold and Diamond jewellery with Latest Designs 2017 | BlueStone.com"));
	}
		@FindBy(xpath="//span[text()='Signup']")
		private WebElement Singup;
	
	    @FindBy(id="userName")
	    private WebElement usrnm;
	    
	    @FindBy(id="email")
	    private WebElement eml;
	    
	    @FindBy(id="customer_phone")
	    private WebElement phne;
	    
	    @FindBy(id="newsletter")
	    private WebElement chckbx;
	    
	    @FindBy(id="terms_condition")
	    private WebElement tc;
	    
	    @FindBy(id="edit-create-account")
	    private WebElement crtac;
	    
		@FindBy(xpath="//span[contains(text(),'Log In')]")
		private WebElement Login;
		
		@FindBy(id="email-id")
		private WebElement ide;
		
		@FindBy(id="password")
		private WebElement pswd;
		
		@FindBy(id="edit-login-account")
		private WebElement singin;
		
		@FindBy(xpath="//a[contains(text(),'Forgot Password')]")
		private WebElement fpwsd;
		
		@FindBy(xpath="//a[contains(text(),'Sign Up')]")
		private WebElement sgnup;
		
		@FindBy(xpath="//a[@class='btn btn-blue btn-block btn-b-icon']")
		private WebElement lgnwthfb;
		
		@FindBy(id="email")
		private WebElement lgnwtfb;
		
		@FindBy(id="pass")
		private WebElement fbpwd;
		
		@FindBy(id="u_0_0")
		private WebElement lgn;
		
		@FindBy(xpath="//span[contains(text(),'Sign Out')]")
		private WebElement sgnout;
		
		
		
		/*@FindBy(id="forgot-password-link")
		private WebElement fgtact;
		
		@FindBy(xpath="//a[@class='_42ft _4jy0 _4jy3 _4jy2 selected _51sy']")
		private WebElement crtenwac;*/
		
		public void singnup1(String usrn, String email, CharSequence ch ){
			Singup.click();
			usrnm.sendKeys(usrn);
			eml.sendKeys(email);
			phne.sendKeys(ch);
			chckbx.click();
			tc.click();
			crtac.click();
		}
		public void login1(String us, String pw){
			Login.click();
			ide.sendKeys(us);
			pswd.sendKeys(pw);
			singin.click();	
		}		
		public void fogetpswd1(String us1){
			Login.click();
			ide.sendKeys(us1);
			fpwsd.click();
		}
		public void fblogin1(String ur1, String pw2){
			lgnwtfb.sendKeys(ur1);
			fbpwd.sendKeys(pw2);
			lgn.click();
		}
		public void logout1(){
			sgnout.click();
		}
}



