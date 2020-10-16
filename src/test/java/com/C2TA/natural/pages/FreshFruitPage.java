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
import junit.framework.Assert;

public class FreshFruitPage extends BaseClass{
	
	@AndroidFindBy(xpath="//android.view.View[@class='android.view.View']")
	List< AndroidElement> noOfViewsinFreshFruit;
	@AndroidFindBy(xpath="//android.view.View[@text='Fresh Fruits']")
	AndroidElement freshfruit;
	@AndroidFindBy(xpath="//android.view.View[@text='Cucumber']")
	List< AndroidElement> cucumbers;
    @AndroidFindBy(xpath="//android.view.View[@text='Store: Ambika Store']")
    AndroidElement cucumberFromAmbikstore;
    @AndroidFindBy(xpath="//android.widget.Button[@text='ADD TO CART ']")
    AndroidElement addtocart;
 	@AndroidFindBy(xpath="//android.view.View[@resource-id='tab-button-cart']")
   	AndroidElement basket;
 	@AndroidFindBy(xpath="//android.view.View[@resource-id='tab-button-home4']")
	AndroidElement home;
	
//	@AndroidFindBy(xpath="//android.view.View[@text='Cucumber']")
//	WebElement cucumber;
//	@AndroidFindBy(xpath="//android.view.View[@text='text 500 g']")
//	WebElement gm500;
//	@AndroidFindBy(xpath="//android.widget.Button[@text='ADD TO CART']")
//	WebElement addtocart;
//	@AndroidFindBy(xpath="//android.widget.Button[@text='arrow back']")
//	WebElement arrowback;
//	@AndroidFindBy(xpath="//android.view.View[@text='HJEIy24812']")
//	WebElement banana;
 	int noOfProducts =0;
	
	AndroidDriver<AndroidElement> driver;
	Utility util;
	public FreshFruitPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver=driver;
	}
	
	public void selectProduct() throws InterruptedException {
		 util = new Utility();
		 util.ExplicitlywaitForElements(driver, By.xpath("//android.view.View[@text='Cucumber']"));
		 util.scrollToDown(driver);
		 //Thread.sleep(9000);
		
		//cucumberFromAmbikstore.click();
		cucumbers.get(1).click();
	}
	
	public void addToCart() throws InterruptedException {
		util.Explicitlywait(driver,basket);
		noOfProducts=Integer.parseInt(basket.getText().substring(7, 8));
		util.Explicitlywait(driver,addtocart);
		//Thread.sleep(3000);
		addtocart.click();
		
	}
	
	
	public void verifyUpdateInCart() throws InterruptedException {
		//Thread.sleep(3000);
		util.Explicitlywait(driver,basket);
		basket.click();
		try {
			Thread.sleep(3000);
			String basketText=basket.getText().substring(7,8);
			int productAdded =Integer.parseInt(basketText);
			boolean isProductCountIncreased = productAdded>noOfProducts;
			//System.out.println(noOfProducts+" no of roducts#####"+productAdded);
     	    Assert.assertEquals(true, isProductCountIncreased);
		}catch(Exception e) {
			//to-do log exception here
			
		}
     	
	
		
	}

}
