package com.C2TA.natural.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.baseclasses.BaseClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ShoppingCartPage extends BaseClass{
	
	
	@AndroidFindBy(xpath="//android.view.View[@text='basket 2 My Cart']")
	WebElement basket;
	@AndroidFindBy(xpath="//android.widget.Image[@text='add circle']")
	WebElement add;
	@AndroidFindBy(xpath="//android.widget.Button[@text='PROCEED']")
	WebElement proceed;
	AndroidDriver<AndroidElement> driver;
	public ShoppingCartPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;
	}

}
