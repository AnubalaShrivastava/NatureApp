package com.C2TA.natural.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.baseclasses.BaseClass;
import com.utilities.Utility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CheckOutDetailsPage extends BaseClass{
	@AndroidFindBy(xpath="//android.widget.Button[@text='PROCEED ']")
	AndroidElement proceed;
	@AndroidFindBy(className="android.widget.EditText")
	List<AndroidElement> formFields;
	@AndroidFindBy(xpath="//android.view.View[@text='First Name']")
	WebElement fname;
	@AndroidFindBy(xpath="//android.view.View[@text='Last Name']")
	WebElement lname;
	@AndroidFindBy(xpath="//android.view.View[@text='Address']")
	WebElement address;
	@AndroidFindBy(xpath="//android.view.View[@text='Post code']")
	AndroidElement postalCode;
	@AndroidFindBy(xpath="//android.view.View[@text='636007']")
	AndroidElement postalCodeNo;
	@AndroidFindBy(xpath="//android.widget.Button[@text='NEXT ']")
	AndroidElement btnNext;
	@AndroidFindBy(xpath="//android.view.View[@resource-id='ion-cb-4-lbl']")
	AndroidElement chkSameShipping;
	@AndroidFindBy(xpath="//android.view.View[@text='Free Shipping ---- 0 INR']")
	AndroidElement optionFreeShipping;
	@AndroidFindBy(xpath="//android.view.View[@text='Payment']")
	AndroidElement drpdownPayment;
	@AndroidFindBy(xpath="//android.view.View[@text='Cash on Delivery']")
	AndroidElement OptionCashOnDelivery;
	@AndroidFindBy(xpath="//android.widget.Button[@text='CONTINUE ']")
	AndroidElement btnContinue;
	@AndroidFindBy(xpath="//android.view.View[@text='Thank You']")
	AndroidElement msgThankYou;
	@AndroidFindBy(xpath="//android.widget.Button[@text='LOG OUT ']")
	AndroidElement btnLogOut;
	
	AndroidDriver<AndroidElement> driver;
	Utility util;
	public CheckOutDetailsPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver=driver;
	}
	
	public void clickOnProceed() throws InterruptedException {
		//Thread.sleep(3000);
		util = new Utility();
		util.Explicitlywait(driver, proceed);
		proceed.click();
	}
  public void  fillingForm() throws InterruptedException {
	  //Thread.sleep(5000);
	    util.ExplicitlywaitForElements(driver, By.className("android.widget.EditText"));
		formFields.get(0).sendKeys("Anubala");
		formFields.get(1).sendKeys("Shrivastava");
		formFields.get(2).sendKeys("301 L.T. Whitefield");
		postalCode.click();
		util.Explicitlywait(driver,postalCodeNo);
		postalCodeNo.click();
		formFields.get(7).sendKeys("9557332806");
//		Actions actions = new Actions(driver);
//		
//		actions.doubleClick(postalCodeNo).perform();
				  
  }
  public void clickonNext() throws InterruptedException {
	  util.Explicitlywait(driver, btnNext);
	  btnNext.click();
		Thread.sleep(5000);
  }
  
  
  //To-do code for flexible billing address
  public void chooseBillingAddress() {
	  util.Explicitlywait(driver,chkSameShipping);
	  chkSameShipping.click();
		btnNext.click();
	  
  }
  
  //To-Do add code for flexible shipping type
  public void chooseForShippingType() {
	  optionFreeShipping.click();
		btnNext.click();
		
  }
  
  //To-Do add code for flexible payment options
  public void choosePaymetOption() throws InterruptedException {
	    Thread.sleep(5000);
	    util = new Utility();
	    util.scrollToDown(driver);
	    util.Explicitlywait(driver,drpdownPayment);
	    drpdownPayment.click();
	    util.Explicitlywait(driver,OptionCashOnDelivery);
	    //Thread.sleep(3000);
		OptionCashOnDelivery.click();
		util.Explicitlywait(driver,btnContinue);
		btnContinue.click();
		//btnContinue.click();
		Thread.sleep(5000);
	  
  }
  
  public void clickOnContinue() throws InterruptedException {
	  //btnContinue.click();
		btnContinue.click();
		Thread.sleep(5000);
	  
  }
}
