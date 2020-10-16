package com.C2TA.natural.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasses.BaseClass;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class Page extends BaseClass {
	AndroidDriver<AndroidElement> driver;

	/*
	 * @AndroidFindBy(xpath=
	 * "//android.view.View[@resource-id='tab-button-settings']") AndroidElement
	 * myaccount;
	 * 
	 * @AndroidFindBy(xpath="//android.view.View[@text='login & Register']")
	 * AndroidElement loginRegister;
	 * 
	 * // @AndroidFindBy(xpath=
	 * "//android.view.View[@resource-id='ion-input-19-lbl']") // AndroidElement
	 * loginEmail;
	 * 
	 * // @AndroidFindBy(xpath="//android.view.ViewLOGIN[@text='Password']") //
	 * AndroidElement password;
	 * //@AndroidFindBy(className="android.widget.EditText") //List<AndroidElement>
	 * loginFieldsForintialLogin;
	 * 
	 * @AndroidFindBy(xpath="//android.widget.Button[@text='LOGIN ']")
	 * AndroidElement login;
	 * 
	 * @AndroidFindBy(xpath="//android.view.View[@resource-id='tab-button-home4']")
	 * AndroidElement home;
	 * 
	 * 
	 * @AndroidFindBy(xpath="//android.view.View[@text='Fresh Fruits']")
	 * AndroidElement freshfruit;
	 * 
	 * @AndroidFindBy(xpath="//android.view.View[@text='Organic Vegetables']")
	 * AndroidElement orgveg;
	 * 
	 * @AndroidFindBy(xpath="//android.view.View[@text='Snacks']") AndroidElement
	 * snacks;
	 * 
	 * @AndroidFindBy(xpath="//android.view.View[@text='Meats']") AndroidElement
	 * meat;
	 * 
	 * 
	 * @AndroidFindBy(xpath="//android.view.View[@text='Cucumber']") List<
	 * AndroidElement> cucumbers;
	 * 
	 * @AndroidFindBy(xpath="//android.view.View[@text='Store: Ambika Store']")
	 * WebElement cucumberFromAmbikstore;
	 * 
	 * @AndroidFindBy(xpath="//android.view.View[@text='text 500 g']")
	 * AndroidElement gm500;
	 * 
	 * @AndroidFindBy(xpath="//android.widget.Button[@text='ADD TO CART ']")
	 * WebElement addtocart;
	 * 
	 * @AndroidFindBy(xpath="//android.widget.Button[@text='arrow back']")
	 * AndroidElement arrowback;
	 * 
	 * @AndroidFindBy(xpath="//android.view.View[@text='HJEIy24812']")
	 * AndroidElement banana;
	 * 
	 * @AndroidFindBy(xpath="//android.widget.TabWidget[@index='1']") List<
	 * AndroidElement> containers;
	 * 
	 * @AndroidFindBy(xpath="//android.view.View[@resource-id='tab-button-cart']")
	 * AndroidElement basket;
	 * 
	 * @AndroidFindBy(xpath="//android.widget.Image[@text='add circle']")
	 * AndroidElement add;
	 * 
	 * @AndroidFindBy(xpath="//android.widget.Button[@text='PROCEED ']")
	 * AndroidElement proceed;
	 * 
	 * @AndroidFindBy(xpath="//android.widget.Button[@text='CONTINUE AS A GUEST ']")
	 * AndroidElement continueAsGuest;
	 * 
	 * @AndroidFindBy(className="android.widget.EditText") List<AndroidElement>
	 * formFields;
	 * // @AndroidFindBy(xpath="//android.view.View[@text='First Name']") //
	 * AndroidElement fname;
	 * // @AndroidFindBy(xpath="//android.view.View[@text='Last Name']") //
	 * AndroidElement lname;
	 * // @AndroidFindBy(xpath="//android.view.View[@text='Address']") //
	 * AndroidElement address;
	 * 
	 * @AndroidFindBy(xpath="//android.view.View[@text='Post code']") AndroidElement
	 * postalCode; // @AndroidFindBy(xpath="//android.view.View[@text='Phone']") //
	 * AndroidElement phone;
	 * // @AndroidFindBy(xpath="//android.view.View[@text='Email']") //
	 * AndroidElement email;
	 * 
	 * @AndroidFindBy(xpath="//android.widget.Button[@text='NEXT ']") AndroidElement
	 * btnNext;
	 * 
	 * @AndroidFindBy(xpath="//android.view.View[@text='636007']") AndroidElement
	 * postalCodeNo;
	 * 
	 * @AndroidFindBy(xpath="//android.view.View[@resource-id='ion-cb-4-lbl']")
	 * AndroidElement chkSameShipping;
	 * 
	 * @AndroidFindBy(xpath="//android.view.View[@text='Free Shipping ---- 0 INR']")
	 * AndroidElement optionFreeShipping;
	 * 
	 * @AndroidFindBy(xpath="//android.view.View[@text='Payment']") AndroidElement
	 * drpdownPayment;
	 * 
	 * @AndroidFindBy(xpath="//android.view.View[@text='Cash on Delivery']")
	 * AndroidElement OptionCashOnDelivery;
	 * 
	 * @AndroidFindBy(className="android.widget.EditText") List<AndroidElement>
	 * loginFields;
	 * 
	 * @AndroidFindBy(xpath="//android.widget.Button[@text='CONTINUE ']")
	 * AndroidElement btnContinue;
	 * 
	 * @AndroidFindBy(xpath="//android.view.View[@text='Thank You']") AndroidElement
	 * msgThankYou;
	 * 
	 * @AndroidFindBy(xpath="//android.widget.Button[@text='LOG OUT ']")
	 * AndroidElement btnLogOut;
	 * 
	 * 
	 * public Page(AndroidDriver<AndroidElement> driver) {
	 * PageFactory.initElements(new AppiumFieldDecorator(driver), this); this.driver
	 * = driver; } public void clickAccount() { myaccount.click();
	 * //freshfruit.click();//for test
	 * 
	 * }
	 * 
	 * public void clickLoginAndRegister() throws InterruptedException {
	 * Thread.sleep(5000); loginRegister.click(); Thread.sleep(5000);
	 * loginFields.get(0).sendKeys("automationtesting@gmail.com");
	 * loginFields.get(1).sendKeys("selenium2020"); Thread.sleep(5000);
	 * login.click(); Thread.sleep(5000); home.click(); Thread.sleep(5000);
	 * myaccount.click(); Thread.sleep(5000); btnLogOut.click(); Thread.sleep(5000);
	 * 
	 * 
	 * } public void clickHome() throws InterruptedException { home.click();
	 * Thread.sleep(9000);
	 * 
	 * 
	 * }
	 * 
	 * 
	 * public void chooseCategory() throws InterruptedException {
	 * Thread.sleep(9000); freshfruit.click();
	 * 
	 * } public void selectProduct() throws InterruptedException {
	 * Thread.sleep(7000); //cucumber.click();
	 * 
	 * int i= cucumbers.size(); String s
	 * =cucumbers.get(cucumber.size()-1).getText();
	 * 
	 * 
	 * TouchActions action = new TouchActions(driver); //action.scroll(element, 10,
	 * 100); action.scroll(0, 100); action.perform();
	 * 
	 * 
	 * 
	 * //cucumbers.get(cucumbers.size()-1).click();
	 * 
	 * //System.out.println(driver.
	 * findElementByAndroidUIAutomator("new UiSelector().scrollable(false)").size())
	 * ; //System.out.println(driver.
	 * findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
	 * //driver.
	 * findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Store: Ambika Store\"));"
	 * ); // System.out.println("&&&&&&&&&Passed scrolling"); //Trying scrolling //
	 * MobileElement element1 = driver.findElement(MobileBy.AndroidUIAutomator("" //
	 * + "new UiScrollable(new UiSelector().className(\"android.webkit.WebView\"))"
	 * // +
	 * ".getChildByText(new UiSelector().className(\"android.view.View\"), \"Cucumber\")"
	 * )); // // MobileElement element =
	 * driver.findElement(MobileBy.AndroidUIAutomator( //
	 * "new UiScrollable(new UiSelector().className(\"android.webkit.WebView\"))" //
	 * + ".scrollIntoView(" // +
	 * "new UiSelector().textContains(\"Cucumber\").instance(1))")); // String temp
	 * = element.getText(); //
	 * System.out.println("**********:"+temp+"***************"); // // //
	 * element.click(); // Thread.sleep(9000);
	 * 
	 * //Trying gesture TouchAction t= new TouchAction(driver); Dimension size
	 * =driver.manage().window().getSize(); int width=size.width; int
	 * height=size.height; int middleOfX=width/2; int startYCoordinate=
	 * (int)(height*.8); //int endYCoordinate= (int)(height*.001); int
	 * endYCoordinate=0;
	 * 
	 * t.press(PointOption.point(middleOfX, startYCoordinate))
	 * .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
	 * .moveTo(PointOption.point(middleOfX, endYCoordinate)).release().perform(); //
	 * Thread.sleep(9000); //cucumberFromAmbikstore.click();
	 * cucumbers.get(1).click(); }
	 * 
	 * public void addToCart() throws InterruptedException { Thread.sleep(7000);
	 * addtocart.click();
	 * 
	 * }
	 * 
	 * public void clickOncart() throws InterruptedException { Thread.sleep(5000);
	 * //MobileElement element1=bottomContainer.
	 * findElementByXPath("//android.view.View[@text='basket 2 My Cart ']");
	 * //System.out.println("&&&&&&&&&"+bottomContainer.isDisplayed());
	 * //driver.switchTo().parentFrame(); //basket.click(); //Thread.sleep(9000);
	 * //basket.click(); // WebElement el = driver.findElement(MobileBy.
	 * xpath("//android.view.View[@text='basket 2 My Cart ']")); // can not see full
	 * ID on your second screenshot // TapOptions tapOptions = new
	 * TapOptions().withElement(ElementOption.element(el)); // new
	 * TouchAction(driver).tap(tapOptions).perform();
	 * //driver.findElement(MobileBy.AndroidUIAutomator(String.
	 * format("new UiSelector().textContains(\"basket 2 My Cart \")"))).click();
	 * //containers.size();
	 * //System.out.println("%%%%%%%%%%%%%%"+containers.size());
	 * //containers.get(0).click(); //Taking to home basket.click();
	 * 
	 * 
	 * }
	 * 
	 * public void clickToProceed() throws InterruptedException {
	 * Thread.sleep(5000); proceed.click(); }
	 * 
	 * public void clickToContinueAsGuest() throws InterruptedException {
	 * Thread.sleep(5000); continueAsGuest.click(); proceed.click(); } public void
	 * FillShippingDetails() throws InterruptedException { Thread.sleep(5000);
	 * formFields.get(0).sendKeys("Anubala");
	 * formFields.get(1).sendKeys("Shrivastava");
	 * formFields.get(2).sendKeys("301 L.T. Whitefield"); postalCode.click();
	 * System.out.println(formFields.size()+"##################");
	 * postalCodeNo.click(); // Actions actions = new Actions(driver); // //
	 * actions.doubleClick(postalCodeNo).perform(); Thread.sleep(5000);
	 * formFields.get(7).sendKeys("9557332806");
	 * formFields.get(8).sendKeys("automationtesting@gmail.com"); btnNext.click();
	 * Thread.sleep(5000); chkSameShipping.click(); btnNext.click();
	 * optionFreeShipping.click(); btnNext.click();
	 * 
	 * //loginEmail.sendKeys("automationtesting@gmail.com");
	 * //password.sendKeys("selenium2020");
	 * loginFields.get(0).sendKeys("automationtesting@gmail.com");
	 * loginFields.get(1).sendKeys("selenium2020"); login.click();
	 * Thread.sleep(5000); btnNext.click(); Thread.sleep(5000); TouchAction t= new
	 * TouchAction(driver); Dimension size =driver.manage().window().getSize(); int
	 * width=size.width; int height=size.height; int middleOfX=width/2; int
	 * startYCoordinate= (int)(height*.8); //int endYCoordinate= (int)(height*.001);
	 * int endYCoordinate=0; t.press(PointOption.point(middleOfX, startYCoordinate))
	 * .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
	 * .moveTo(PointOption.point(middleOfX, endYCoordinate)).release().perform();
	 * 
	 * drpdownPayment.click(); OptionCashOnDelivery.click(); btnContinue.click();
	 * btnContinue.click(); Thread.sleep(5000);
	 * 
	 * }
	 * 
	 * 
	 */
}
