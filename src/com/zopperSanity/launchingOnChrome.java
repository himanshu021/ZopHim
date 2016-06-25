package com.zopperSanity;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObjet.ZopperWebConstants;

public class launchingOnChrome extends BaseTest {
	
	
	/*--------------Launching Zopper site on chrome browser---------------- */
	
	
	 //WebDriver driver;
	
	@Test
	public void zopperTestOnChrome() {
	
		   //static String driverPath = "D:\Softwares\";
		   
		 
		    System.out.println("*******************");
			System.out.println("launching chrome browser");
			System.setProperty("webdriver.chrome.driver", "D:/Softwares/chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		
			//driver.navigate().to("http://mstage.zopper.com:9900/");
			driver.navigate().to("https://secure.yatra.com/social/common/yatra/signin");
			String strPageTitle = driver.getTitle();
			System.out.println("Page title: - "+strPageTitle);
		
//			driver.findElement(By.xpath(ZopperWebConstants.selectDelhiLoc)).click();
//			driver.findElement(By.xpath(ZopperWebConstants.selectLocalityDelhi)).click();
//			Assert.assertEquals(strPageTitle, driver.getTitle());
			
			clickXpath(ZopperWebConstants.fbLogin);
			Set <String> set1=driver.getWindowHandles();
			Iterator <String> win1=set1.iterator();
			String parent=win1.next();
			String child=win1.next();
			driver.switchTo().window(child);
				
		
		    sendKeysForXpath(ZopperWebConstants.fbEmail, "rajanish.A345@gmail.com");
		    sendKeysForXpath(ZopperWebConstants.fbPass, "ariose@345");
		    clickXpath(ZopperWebConstants.logInButton);
		    
		    driver.switchTo().window(parent);
		
	}

}
