package com.zopperSanity;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class BaseTest {
	
	
	protected ChromeDriver driver= null;
	protected WebElement element;
	
	ExtentReports report;
	ExtentTest logg;
	
	public boolean isEnabled() {
		return true;
	}
	
	public WebElement findElementByClassName(String className) {
		return (WebElement) driver.findElement(By.className(className));
	}

	public WebElement findElementById(String id) {
		return (WebElement) driver.findElement(By.id(id));
	}
	
	public WebElement findByName(String name) {
		return (WebElement) driver.findElement(By.name(name));
	}
	public WebElement findByXpath(String xpath){
		return (WebElement) driver.findElement(By.xpath(xpath));
	}

	public void clickClassName(String className) {
		findElementByClassName(className).click();
	}
	

	public void clickName(String name) {
		findByName(name).click();
	}

	public void clickId(String id) {
		findElementById(id).click();
	}
	
	public void clickXpath(String xpath){
		findByXpath(xpath).click();
	}
	public void sendKeysForID(String id, String keyword){
		findElementById(id).sendKeys(keyword);
	}
	public void sendKeysForName(String name, String keyword){
		findByName(name).sendKeys(keyword);
	}
	public void sendKeysForXpath(String xpath, String keyword){
		findByXpath(xpath).sendKeys(keyword);
	}
	

	public void navigateToBack() {
		driver.navigate().back();
	}
	
	public void loginToWeb(){
		
		
	}
	
	
	public void launchZopper(){
		
		
		
		
	}
	
	public void failScnShot(ITestResult result)
	{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		try {
			
	 
	String screenshot_path= Utility.captureScreenshot(driver, result.getName());
	String image= logg.addScreenCapture(screenshot_path);
	logg.log(LogStatus.FAIL, "Placed order scenario not verified.", image);
		}
		catch(Exception e)
		{
			 
			System.out.println("Exception while taking screenshot "+e.getMessage());
			} 
	 
	}
	 
	report.endTest(logg);
	report.flush();
	 
	driver.get("D:\\workspace\\ZopperWebSanity\\Reports\\LearnAutomation.html");
	
	}
	
	

}
