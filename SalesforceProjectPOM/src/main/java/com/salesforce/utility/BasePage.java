package com.salesforce.utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected static WebDriver driver;
	protected static JavascriptExecutor js;	
	protected static WebDriverWait wait;
	protected static GenerateReports report=GenerateReports.getInstance();
	
	
	public BasePage(WebDriver driver1) {
		driver=driver1;
		js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver1, this);
	}
	
	
	public static void closeDriver() {
		driver.close();
	}
	
	public static void closeAllDriver() {
		driver.quit();
	}
	/* name of the method:   enterText
	 * BriefDescription  :   entering textvalue for textbox
	 * Arguments         :  element-->web element
	 *                      text--->to be entered 
	 *            
	 *  createdby        :  Automation team 
	 *  created date     :01/20/22 
	 *  LastModified Date:01/20/22          
	 */
	public static void enterText(WebElement element,String text) {
		waitUntilVisible(element);
		if(element.isDisplayed()) {
			String code = "arguments[0].value = '" + text + "';";	
			js.executeScript(code, element);
			System.out.println("JS text entered");
			report.logTestInfo("JS text entered");
		}
		else {
			System.out.println("JS fail: element not displayed");
		}
	}
	public static String getText(WebElement element) {
		waitUntilVisible(element);
		String text = null;
		if(element.isDisplayed()) {
			String code = "return arguments[0].value;";	
			text = (String) js.executeScript(code,element);
			System.out.println("JS : text received : " + text);
			report.logTestInfo("JS : text received : " + text);
		}
		else {
			System.out.println("JS fail: element not displayed");
		}
		return text;
	}
	public static String getDivText(WebElement element) {
		waitUntilVisible(element);
		String text = null;
		if(element.isDisplayed()) {
			String code = "return arguments[0].textContent;";	
			text = (String) js.executeScript(code,element);
			//System.out.println("JS : text received : " + text);
			//report.logTestInfo("JS : text received : " + text);
		}
		else {
			System.out.println("JS fail: element not displayed");
		}
		return text;
	}
	public static void clickElement(WebElement element) {
		if(element.isDisplayed()) {			
			js.executeScript("arguments[0].click();", element);
			System.out.println("JS : element clicked");
		}
		else {
			System.out.println("JS fail: element not displayed");
		}
	}
	
	public static void clearElement(WebElement element) {
		if(element.isDisplayed()) {
			js.executeScript("arguments[0].value = '';", element);
			System.out.println("JS : element cleared");
		}
		else {
			System.out.println("JS fail: element not displayed");
		}
	}
	
	public static void waitUntilVisible(WebElement element) {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(element));
		System.out.println("Waiting for Tag : " + element.getTagName() + " Text: " + element.getText());
		report.logTestInfo("waiting for the element to be visible");
	}
	public static void waitUntilAlertIsPresent() {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static void mouseOver(WebElement element) {
		waitUntilVisible(element);
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	public static void AcceptAlert() {
		waitUntilAlertIsPresent();
		Alert alert=driver.switchTo().alert();
		System.out.println("alert text="+alert.getText());
		alert.accept();
		
	}
	public static void dissmisAlert() {
		waitUntilAlertIsPresent();
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
		
	}
	public static void selectByTextData(WebElement element,String text) {
		Select selectCity = new Select(element);
		selectCity.selectByVisibleText(text);
		report.logTestInfo("selectByTextData method selected the data");
	}
	public static void selectByIndexData(WebElement element,int index) {
		Select selectCity = new Select(element);
		selectCity.selectByIndex(index);
	}
	public static void selectByValueData(WebElement element,String text) {
		Select selectCity = new Select(element);
		selectCity.selectByValue(text);
	}
	
	public static String getTitleOfThePage() {
		return driver.getTitle();
	}

}