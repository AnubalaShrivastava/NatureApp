package com.utilities;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Utility {
	
	public void scrollToDown(AndroidDriver<AndroidElement> driver) {
		 TouchAction t= new TouchAction(driver);
		 Dimension size	=driver.manage().window().getSize();
		 int width=size.width;
		 int height=size.height;				
		 int middleOfX=width/2;
		 int startYCoordinate= (int)(height*.8);
		 //int endYCoordinate= (int)(height*.001);
		 int endYCoordinate=0;
		 				
		 t.press(PointOption.point(middleOfX, startYCoordinate))
		 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		 .moveTo(PointOption.point(middleOfX, endYCoordinate)).release().perform();
		
	}
	public void scrollingThroughAutomator(AndroidDriver<AndroidElement> driver,String elementView) {
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
		
	}
	//Explicit wait for clickable
		public void Explicitlywait(AndroidDriver<AndroidElement> driver,AndroidElement element) {
			WebDriverWait wait=new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			
		}
	//Explicit wait for clickable group of elelemnts
		public void ExplicitlywaitForElements(AndroidDriver<AndroidElement> driver,By byLocator) {
			WebDriverWait wait=new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(byLocator));
					
		}
	
		
	public static void captureScreenShot(WebDriver driver,String screenShotName) {
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source,new File("src/test/resources/ScreenShots/"+screenShotName+".png"));
			System.out.println("ScreenShot Taken");
			
			
		}catch(Exception e) {
			System.out.println("Exception during taking screenshot ");
		
			
		}
		
	}

}
