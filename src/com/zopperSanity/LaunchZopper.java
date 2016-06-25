package com.zopperSanity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.pageObjet.ZopperWebConstants;

public class LaunchZopper 

{
	
@Test	
	
public void testZopperTitle() {
		
		WebDriver driver  = new FirefoxDriver();
		driver.navigate().to(ZopperWebConstants.ZopperURL);
		String appTitle = driver.getTitle();
		System.out.println("Application title is :: "+appTitle);
		//driver.findElement(By.xpath(ZopperWebConstants.SelectBanglore)).click();
		//driver.findElement(By.xpath(ZopperWebConstants.selectLocalityBanglore)).click();
		driver.manage().window().maximize();
		//driver.quit();
	}

}
