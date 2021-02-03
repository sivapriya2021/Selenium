package com.Selenium.AppScripts;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class AppTestScripts 
{
   public static WebDriver driver;
	public static String expurl = "https://www.mycontactform.com/";
	
	
	
    @Test
    public void launchbrowser() throws InterruptedException
    
    
    {
       
    	
    	
    	System.setProperty("webdriver.chrome.driver","./mydrivers/chromedriver.exe");
    	driver = new ChromeDriver();
    	
    	driver.get(expurl);
    	Thread.sleep(3000);
    	
    	if(expurl.equals(driver.getCurrentUrl())) {
    	
    		System.out.println("Verified URL");
    	}
    	else
    	{
    	System.out.println("Does not verified");
    }
    	
    	driver.close();
    }
}