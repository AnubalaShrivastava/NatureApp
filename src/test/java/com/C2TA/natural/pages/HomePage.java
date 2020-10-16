package com.C2TA.natural.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.baseclasses.BaseClass;
import com.utilities.Utility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import junit.framework.Assert;

public class HomePage extends BaseClass{
	@AndroidFindBy(xpath="//android.view.View[@class='android.view.View']")
	List< AndroidElement> noOfViewsinHome;
	@AndroidFindBy(xpath="//android.view.View[@resource-id='tab-button-home4']")
	AndroidElement home;
	@AndroidFindBy(xpath="//android.view.View[@text='Fresh Fruits']")
	AndroidElement freshfruit;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Organic Vegetables']")
	AndroidElement orgveg;
	@AndroidFindBy(xpath="//android.view.View[@text='Snacks']")
	AndroidElement snacks;
	@AndroidFindBy(xpath="//android.view.View[@text='Meats']")
	AndroidElement meat;
	
	AndroidDriver<AndroidElement> driver;
	Utility util;
	public HomePage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver=driver;
	}
	
	 public void clickonHome() throws InterruptedException {
		 util = new Utility();
		 util.Explicitlywait(driver,home);
		 //Thread.sleep(3000);
		 home.click();
		 
	 }
	 
	 //To-Do Implement with different categories...pass as parameter
	 public void chooseCategory() throws InterruptedException {
		 //Thread.sleep(3000);
		 util.Explicitlywait(driver,freshfruit);
		 freshfruit.click();
		 
	 }
	 
	 
	 public void verifycategoryPage() {
		Assert.assertEquals(true, freshfruit.isDisplayed());
		//System.out.println("No of views"+noOfViewsinHome.size());
		 
	 }

}
