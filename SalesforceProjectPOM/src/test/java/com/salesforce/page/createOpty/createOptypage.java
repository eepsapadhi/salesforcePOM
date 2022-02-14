package com.salesforce.page.createOpty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.utility.BasePage;

public class createOptypage extends BasePage {
	public createOptypage(WebDriver driver){
		super(driver);
	}
	@FindBy(id="username") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(id ="Login") WebElement btnLogin;
	@FindBy(id ="tryLexDialogX") WebElement tryLexDialogX;	
	@FindBy(xpath = "//a[normalize-space()='Opportunities']") WebElement opportunities;	
	@FindBy(xpath = "//input[@title='New']") WebElement New;	
	@FindBy(id ="opp3") WebElement oppname;	
	@FindBy(id ="opp4") WebElement accname;	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[2]/td[4]/div[1]/span[1]/span[1]/a[1]") WebElement closedate;
	@FindBy(xpath = "//input[@id='opp12']") WebElement probability;	
	@FindBy(xpath = "(//input[@name='save'])[2]") WebElement save;	
	@FindBy(xpath = "//a[normalize-space()='Opportunity Pipeline']") WebElement pipeline;	
	@FindBy(xpath = "//a[normalize-space()='Stuck Opportunities']") WebElement stuckopp;	
	@FindBy(xpath = "(//input[@name='go'])[2]") WebElement runreport;	

	
	
	
	public WebElement getrunreport() {
		waitUntilVisible(runreport);
		return runreport;
		}
	public WebElement getstuckopp() {
		waitUntilVisible(stuckopp);
		return stuckopp;
		}
	public WebElement getpipeline() {
		waitUntilVisible(pipeline);
		return pipeline;
		}
	public WebElement getsave() {
		waitUntilVisible(save);
		return save;
		}
	public WebElement getprobability() {
		return probability;
		}
	public WebElement getclosedate() {
		waitUntilVisible(closedate);
		return closedate;
		}
	public WebElement getaccname() {
		waitUntilVisible(accname);
		return accname;
		}
	public WebElement getoppname() {
		waitUntilVisible(oppname);
		return oppname;
		}
	public WebElement getNew() {
		waitUntilVisible(New);
		return New;
		}
	public WebElement getopportunities() {
		return opportunities;
		}
	public void enterIntoUsername(String usrName) {
		enterText(username, usrName);
		}
	public void enterIntoPassword(String passwrd) {
		enterText(password, passwrd);
	}
	public void clcikLoginButton() {
		clickElement(btnLogin);
	}
	public void closeDialogBox() {
		clickElement(tryLexDialogX);
	}	

}
