package com.C2TA.natural.stepdefinitions;

import java.io.IOException;
import java.net.MalformedURLException;

import com.C2TA.natural.pages.CheckOutDetailsPage;
import com.C2TA.natural.pages.FreshFruitPage;
import com.C2TA.natural.pages.HomePage;
import com.C2TA.natural.pages.LoginLogOutPage;
import com.C2TA.natural.pages.Page;
import com.C2TA.natural.pages.ShoppingCartPage;
import com.baseclasses.BaseClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ShoppingSteps extends BaseClass{
public static AndroidDriver<AndroidElement> driver;
	LoginLogOutPage lPage;
	HomePage hPage;
	FreshFruitPage fFtPage;
	ShoppingCartPage sCtPage;
	CheckOutDetailsPage cDtPage;
	CheckOutDetailsPage chkOutPage;
	Page page;
	@Given("I have app")
	public void i_have_app() throws IOException, InterruptedException {
		 startServer();
		Thread.sleep(9000);
		startEmulator();
		Thread.sleep(9000);
		//startServer();
		//Thread.sleep(9000);
		 driver=capability();
		 Thread.sleep(3000);
	    
	}

	@When("I click on my account")
	public void i_click_on_my_account() throws InterruptedException {
		lPage = new LoginLogOutPage(driver);
		Thread.sleep(3000);
		lPage.clickAccount();
	    
	}

	@When("click on login and Register text")
	public void click_on_login_and_Register_text() throws InterruptedException {
		Thread.sleep(3000);
		lPage.clickLoginAndRegister();
	    
	}

	@When("I enter email")
	public void i_enter_email() throws InterruptedException {
		Thread.sleep(3000);
		lPage.enterEmail();
	    
	}

	@When("I enter password")
	public void i_enter_password() throws InterruptedException {
		Thread.sleep(3000);
		lPage.enterPassword();
	    
	}

	@When("I click login button")
	public void i_click_login_button() throws InterruptedException {
		Thread.sleep(3000);
		lPage.clickLoginbtn();
	    
	}

	@Then("I am successfully login")
	public void i_am_successfully_login() throws InterruptedException {
		Thread.sleep(3000);
		lPage.verifyLogin();
	    
	}

	@Given("I am on Home page")
	public void i_am_on_Home_page() throws InterruptedException {
		 hPage = new HomePage(driver);
		 hPage.clickonHome();
	    
	}

	@When("I choose Category")
	public void i_choose_Category() throws InterruptedException {
		Thread.sleep(3000);
		hPage.chooseCategory();
	    
	}

	@Then("I navigated to category page")
	public void i_navigated_to_category_page() throws InterruptedException {
		Thread.sleep(3000);
		hPage.verifycategoryPage();
	    
	}

	@Given("I am on fresh fruits product page")
	public void i_am_on_fresh_fruits_product_page() throws InterruptedException {
	 fFtPage = new FreshFruitPage(driver);
	 Thread.sleep(3000);
	    
	}

	@When("I select cucumber from Ambikastore")
	public void i_select_cucumber_from_Ambikastore() throws InterruptedException {
		Thread.sleep(3000);
		fFtPage.selectProduct();
	    
	}

	@When("add to cart")
	public void add_to_cart() throws InterruptedException {
		fFtPage.addToCart();
	    
	}

	@Then("shopping cart should be updated")
	public void shopping_cart_should_be_updated() throws InterruptedException {
		Thread.sleep(3000);
		fFtPage.verifyUpdateInCart();
	    
	}

	@Given("I proceed to check out")
	public void i_proceed_to_check_out() throws InterruptedException {
		chkOutPage = new CheckOutDetailsPage(driver);
		chkOutPage.clickOnProceed();
	    
	}

	@Then("I navigated to shipping address")
	public void i_navigated_to_shipping_address() {
	 
		 
	}

	@When("I enter valid shipping entries")
	public void i_enter_valid_shipping_entries() throws InterruptedException {
		chkOutPage.fillingForm();
	    
	}

	@When("submit the form")
	public void submit_the_form() throws InterruptedException {
		chkOutPage.clickonNext();
	    
	}

	@When("I choose same shipping address")
	public void i_choose_same_shipping_address() {

		chkOutPage.chooseBillingAddress();
	}

	@When("I choose Free Shipping option")
	public void i_choose_Free_Shipping_option() {
		chkOutPage.chooseForShippingType();
	    
	}

	@When("choose Cash On delivery Payment option")
	public void choose_Cash_On_delivery_Payment_option() throws InterruptedException {

		chkOutPage.choosePaymetOption();
	}

	@When("complete the shopping")
	public void complete_the_shopping() throws InterruptedException {
		chkOutPage.clickOnContinue();
	    
	}

	@When("I click on  account")
	public void i_click_on_account() throws InterruptedException {
		lPage = new LoginLogOutPage(driver);
		lPage.clickAccount();
	    
	}

	@When("click on logout")
	public void click_on_logout() throws InterruptedException {
		
		lPage.clickOnLogout();
		
	}

	@Then("I should be successfully log out")
	public void i_should_be_successfully_log_out() throws IOException, InterruptedException {
    lPage.verifyLogout();
        //driver.quit();
       //stopEmulator();
       //stopServer();   
	}



}
