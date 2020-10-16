package com.C2TA.natural.stepdefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import com.baseclasses.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ServiceHooks extends BaseClass{
	
		Logger log = Logger.getLogger(ServiceHooks.class);
		@Before
		public void initializeTest() {
		log.info("Initializing test");
		
		}
		
		@After
		public void endTest(Scenario scenario) {
		 boolean temp = scenario.isFailed();
		 String temp1 = scenario.getName();
		  if (scenario.isFailed()) {
		  try { 
				log.info(scenario.getName() + " is Failed");
				//final byte[] screenshot = ((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.BYTES);
				byte[] screenshot = ((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.BYTES);
				// scenario.embed(screenshot, ); // ... and embed it in
				scenario.attach(screenshot, "image/png", "name");
	          } catch (WebDriverException e) 
		        { 
			       e.printStackTrace();
		  
		         }
     	      } 
          else {
		   try {
				log.info(scenario.getName() + " is pass");
				 byte[] screenshot1 = ((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot1, "image/png", "name");
								
			   } catch (Exception e)
		      { 
			    e.printStackTrace();
	     	  }
		      }
		  
		 		}
		
}
