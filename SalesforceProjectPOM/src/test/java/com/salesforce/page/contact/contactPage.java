package com.salesforce.page.contact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.utility.BasePage;

public class contactPage extends BasePage {
		public contactPage(WebDriver driver){
			super(driver);
		}
	@FindBy(id="username") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(id ="Login") WebElement btnLogin;
	@FindBy(id ="tryLexDialogX") WebElement tryLexDialogX;	
	@FindBy(xpath = "//a[normalize-space()='Contacts']") WebElement contact;
	@FindBy(name ="new") WebElement newbtn;
	@FindBy(id ="name_lastcon2") WebElement lname;
	@FindBy(id ="con4") WebElement accname;
	@FindBy(xpath = "(//input[@name='save'])[2]") WebElement save;
	@FindBy(xpath ="//a[normalize-space()='Create New View']") WebElement newview;
	@FindBy(xpath ="//input[@id='fname']") WebElement newname;
	@FindBy(xpath ="//input[@id='devname']") WebElement uniquename;
	@FindBy(xpath ="(//input[@name='save'])[2]") WebElement save1;
	@FindBy(xpath ="//tr[contains(@class,'dataRow even first')]//a[contains(text(),'Padhi')]") WebElement contactname;
	@FindBy(xpath ="(//input[@title='Cancel'])[1]") WebElement cancel;

	
	public WebElement getcancel() {
		waitUntilVisible(cancel);
		return cancel;
		}
	public WebElement getcontactname() {
		waitUntilVisible(contactname);
		return contactname;
		}
	public WebElement getsave1() {
		waitUntilVisible(save1);
		return save1;
		}
	public WebElement getuniquename() {
		waitUntilVisible(uniquename);
		return uniquename;
		}
	public WebElement getnewname() {
		waitUntilVisible(newname);
		return newname;
		}
	public WebElement getnewview() {
		waitUntilVisible(newview);
		return newview;
		}
	public WebElement getsave() {
		waitUntilVisible(save);
		return save;
		}
	public WebElement getaccname() {
		waitUntilVisible(accname);
		return accname;
		}
	public WebElement getlname() {
		waitUntilVisible(lname);
		return lname;
		}
	public WebElement getnewbtn() {
		waitUntilVisible(newbtn);
		return newbtn;
		}
	public WebElement getcontact() {
		waitUntilVisible(contact);
		return contact;
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
