package com.baseclasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass {
	public static Properties properties;
	public static Logger logger;
	public static AppiumDriverLocalService service;
	public static AndroidDriver<AndroidElement> driver;
	public static Process process;
	public static ServerSocket serverSocket;
	//constructor
	public BaseClass() {
	properties = new Properties();
	try {
		  InputStream inputStream = new FileInputStream("src/test/resources/global.properties");
		  try {
			properties.load(inputStream);
			} catch (IOException e) {
			  e.printStackTrace();
			}
		 } catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	 logger = Logger.getLogger(BaseClass.class);
	 PropertyConfigurator.configure("src/test/resources/Log4jProperties/Log4j.property");	
		
	 }
	//Start server
	public AppiumDriverLocalService startServer()
	{
	boolean flag=	checkIfServerIsRunnning(4723);
	if(!flag)
	{
		service=AppiumDriverLocalService.buildDefaultService();
		service.start();
	}
		return service;
	}
	
    public static boolean checkIfServerIsRunnning(int port) {
	boolean isServerRunning = false;
	//ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			
			serverSocket.close();
		} catch (IOException e) {
			//If control comes here, then it means that the port is in use
			isServerRunning = true;
		} finally {
			serverSocket = null;
		}
		return isServerRunning;
	}
    //Stop Server
    
    public void stopServer() {
    	Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("taskkill /F /IM node.exe");
			runtime.exec("taskkill /F /IM cmd.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}

     	//service.stop();
      }
    //start Emulator
   public static void startEmulator() throws IOException, InterruptedException
     {
	   //Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\startEmulator.bat");
	   process = Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\src\\main\\resources\\ResourceFiles\\startEmulator.bat");
	
	    Thread.sleep(6000);
       }
   public static void stopEmulator() throws IOException, InterruptedException {
		/*
		 * process.destroy(); process =
		 * Runtime.getRuntime().exec(System.getProperty("user.dir")+
		 * "\\src\\main\\resources\\ResourceFiles\\stopEmulator.bat");
		 * process.destroy(); Thread.sleep(6000);
		 */
	   
	   String cmdstr="adb -s demo-mobile emu kill";
	   try {
             Runtime.getRuntime().exec(cmdstr);
		    
             Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
		  // System.Diagnostics.Process.Start("CMD.exe",cmdstr);
       } catch (IOException e) {
    	   System.out.println("*********Reached Stop Emulatoe exception********");
           e.printStackTrace();
       }
	   //System.Diagnostics.Process.Start("CMD.exe",cmdstr);
	    
   }
	//Start of app
	public AndroidDriver<AndroidElement> capability() throws MalformedURLException {
		File apppath= new File("C:\\Users\\bala_\\Downloads\\change2.apk");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");//Tried with uiautomator2
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo-Mobile");
		cap.setCapability(MobileCapabilityType.APP,apppath.getAbsolutePath());
		cap.setCapability("autoGrantPermissions", "true");//For popup, need to come from property file
		URL url=new URL("http://localhost:4723/wd/hub");
		driver=new AndroidDriver<AndroidElement>(url,cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	

}
