package com.zopperSanity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.pageObjet.ZopperWebConstants;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyTitle {
	
	
	
	ExtentReports report;
	ExtentTest logg; 
	WebDriver driver;
	 
	 
	@Test (enabled=true)
	public void verifyBlogTitle()
	{
	report=new ExtentReports("D:\\workspace\\ZopperWebSanity\\Reports\\LearnAutomation.html");
	 
	logg=report.startTest("VerifyBlogTitle");
	 
//	driver=new FirefoxDriver();
//	driver.manage().window().maximize();
	System.setProperty("webdriver.chrome.driver", "D:/Softwares/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();

	//driver.navigate().to("http://mstage.zopper.com:9900/");
	 
	logg.log(LogStatus.INFO, "Browser started ");
	 
	driver.get("http://mstage.zopper.com:9900/");
	 
	logg.log(LogStatus.INFO, "Application is up and running");
	 
	String title=driver.getTitle();
	System.out.println(title);
	 
	Assert.assertTrue(title.contains("Online")); 
	 
	logg.log(LogStatus.PASS, "Title verified");
	}
	
	
	@Test (enabled=true)
	public void verifyMyAccount()
	            {
	                               report=new ExtentReports("D:\\workspace\\ZopperWebSanity\\Reports\\LearnAutomation.html");
	 
	                               logg=report.startTest("verifyMyAccount");
	 
                                  //	driver=new FirefoxDriver();
                                   //	driver.manage().window().maximize();
	                               System.setProperty("webdriver.chrome.driver", "D:/Softwares/chromedriver.exe");
	                               driver = new ChromeDriver();
	                               driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	                               driver.manage().window().maximize();

	                               //driver.navigate().to("http://mstage.zopper.com:9900/");
	 
	                               logg.log(LogStatus.INFO, "Browser started ");
	 
	                               driver.get("http://mstage.zopper.com:9900/");
	 
	                               logg.log(LogStatus.INFO, "Application is up and running");
	                               
	                              // clickXpath(ZopperWebConstants.tapOnRegisterUser);
	                               driver.findElement(By.xpath(ZopperWebConstants.tapOnRegisterUser)).click();
	                               logg.log(LogStatus.INFO, "Registred screen open.");
	                               //clickXpath(ZopperWebConstants.selectSignInTab);
	                               driver.findElement(By.xpath(ZopperWebConstants.selectSignInTab)).click();
	                               //sendKeysForXpath(ZopperWebConstants.selectEmailPhonne, "himanshu123@zop.com");
	                               driver.findElement(By.xpath(ZopperWebConstants.selectEmailPhonne)).sendKeys("himanshu123@zop.com");
	                               
	                               logg.log(LogStatus.INFO, "User Name entred");
	                              // sendKeysForXpath(ZopperWebConstants.selectPassword, "qwerty");
	                               driver.findElement(By.xpath(ZopperWebConstants.selectPassword)).sendKeys("qwerty");
	                               logg.log(LogStatus.INFO, "Password entred");
	                               //clickXpath(ZopperWebConstants.tapOnSignButton);
	                               driver.findElement(By.xpath(ZopperWebConstants.tapOnSignButton)).click();
	                               
	                               logg.log(LogStatus.INFO, "Clicked on Sign In button");
	                               
	                               //clickXpath(ZopperWebConstants.tapOnMyAccount);
	                               driver.findElement(By.xpath(ZopperWebConstants.tapOnMyAccount)).click();
	                               logg.log(LogStatus.INFO, "My account selected");
	 
	                               String title= driver.findElement(By.xpath("//span[contains(.,'Orders')]")).getText();
	                               System.out.println(title);
	 
	                               Assert.assertTrue(title.contains("Orders")); 
	 
	                               logg.log(LogStatus.PASS, "My Account verified");
	             }
	 
	 
	 
	 
	@AfterMethod
	public void tearDown(ITestResult result)
	{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		try {
			
	 
	String screenshot_path= Utility.captureScreenshot(driver, result.getName());
	String image= logg.addScreenCapture(screenshot_path);
	logg.log(LogStatus.FAIL, "Verification failed ", image);
		}
		catch(Exception e)
		{
			 
			System.out.println("Exception while taking screenshot "+e.getMessage());
			} 
	 
	}
	 
	report.endTest(logg);
	report.flush();
	driver.close();
	 
	//driver.get("D:\\workspace\\ZopperWebSanity\\Reports\\LearnAutomation.html");
	
	}
	 
	 
	}


