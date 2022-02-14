package com.salesforce.page.leads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.utility.BasePage;

public class Leadspage extends BasePage {
	public Leadspage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(id="username") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(id ="Login") WebElement btnLogin;
	@FindBy(id ="tryLexDialogX") WebElement tryLexDialogX;	
	@FindBy(xpath ="//a[normalize-space()='Leads']") WebElement Leads;	
	@FindBy(id ="fcf") WebElement viewdd;
	@FindBy(xpath = "//a[normalize-space()='Logout']") WebElement Logout ;
	@FindBy(xpath = "//input[@title='Go!']") WebElement go ;
	@FindBy(id ="userNavButton") WebElement userNavbutton;
	@FindBy(id ="00B8c00000D5DCd_listSelect") WebElement listSelect ;
	@FindBy(name="new") WebElement New;
	@FindBy(name="name_lastlea2") WebElement Lname;
	@FindBy(id ="lea3") WebElement company;
	@FindBy(xpath = "(//input[@name='save'])[2]") WebElement save ;


	
	public WebElement getsave() {
		return save;
		
	}
	
	public WebElement getcompany() {
		return company;
		
	}
	public WebElement getLname() {
		return Lname;
		
	}
	public WebElement getNew() {
		waitUntilVisible(New);
		return New;
		
	}
	public WebElement getlistSelect() {
		return listSelect;
		
	}
	public WebElement getuserNavbutton() {
		return userNavbutton;
		
	}
	public  WebElement getgo() {
		return go;
	}
	public  WebElement getLogout() {
		return Logout;
	}
	public WebElement getviewdd() {
		waitUntilVisible(viewdd);
		return viewdd;
		
	}
	public WebElement getLeads() {
		waitUntilVisible(Leads);
		return Leads;
		
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
