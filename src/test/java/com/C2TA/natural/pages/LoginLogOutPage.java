package com.C2TA.natural.pages;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclasses.BaseClass;
import com.utilities.Utility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import junit.framework.Assert;

public class LoginLogOutPage extends BaseClass{
	@AndroidFindBy(xpath="//android.view.View[@class='android.view.View']")
	List< AndroidElement> noOfViewsinLogin;
	
	@AndroidFindBy(xpath="//android.view.View[@resource-id='tab-button-settings']")
	AndroidElement myaccount;
	  
	@AndroidFindBy(xpath="//android.view.View[@text='login & Register']")
	AndroidElement loginRegister;
	
	@AndroidFindBy(className="android.widget.EditText")
	List<AndroidElement> loginFields;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='LOGIN ']")
	  AndroidElement login;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='LOG OUT ']")
	AndroidElement btnLogOut;
	
  
	
	AndroidDriver<AndroidElement> driver;
	Utility util;
       public LoginLogOutPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver=driver;
	}
	
	
	
	public void clickAccount() throws InterruptedException {
		//Thread.sleep(9000);
		util = new Utility();
		util.Explicitlywait(driver, myaccount);
		myaccount.click();
		Thread.sleep(3000);
		
	}

	public void clickLoginAndRegister() throws InterruptedException {
		//util = new Utility();
		util.Explicitlywait(driver, loginRegister);
		loginRegister.click();
		//Thread.sleep(3000);
		
	}
	public void enterEmail() throws InterruptedException {
		//util = new Utility();
		util.ExplicitlywaitForElements(driver, By.className("android.widget.EditText"));
		loginFields.get(0).sendKeys("automationtesting@gmail.com");
		//Thread.sleep(2000);
	}
	
	public void enterPassword() throws InterruptedException{
		loginFields.get(1).sendKeys("selenium2020");
		//Thread.sleep(2000);
		
	}
	
	
	public void clickLoginbtn() throws InterruptedException {
		//util = new Utility();
		util.Explicitlywait(driver,login);
		login.click();
		//Thread.sleep(3000);
		
	}
	
	public void verifyLogin() {
		//util = new Utility();
		util.Explicitlywait(driver,btnLogOut);
		//Verifying with logout button
		Assert.assertEquals(true, btnLogOut.isDisplayed());
		
		//System.out.println("No of views"+noOfViewsinLogin.size());
			
	}
	
	public void clickOnLogout() {
		//util = new Utility();
		util.Explicitlywait(driver,btnLogOut);
		btnLogOut.click();
	}
	
	public void verifyLogout() {
		//util = new Utility();
		util.Explicitlywait(driver,loginRegister);
		Assert.assertEquals(true, loginRegister.isDisplayed());
	}
}
