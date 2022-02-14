package com.salesforce.page.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.utility.BasePage;

public class LoginPage extends BasePage{
	public LoginPage(WebDriver driver){
		super(driver);

    }
	
	@FindBy(id="username") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(id ="Login") WebElement btnLogin;
	@FindBy(id ="rememberUn") WebElement remberme;
	@FindBy(id ="tryLexDialogX") WebElement tryLexDialogX;	
	@FindBy(id ="error") WebElement error;
	@FindBy(id="forgot_password_link")WebElement forgotpassword;
	@FindBy(id="un")WebElement enteremail;
	@FindBy(name="continue")WebElement Continue;
	@FindBy(id="content")WebElement content;
	
	public void ForgotPassword() {
		clickElement(forgotpassword);
	}
	public void enteremailid(String email) {
		enterText(enteremail, email);
		
	}
	public void Continue() {
		clickElement(Continue);
	}
	
	public void clcikLoginButton() {
		clickElement(btnLogin);
	}
	public void handleAlert() {
		AcceptAlert();
	}
	public void clickRemeberme() {
		clickElement(remberme);
	}
	public void closeDialogBox() {
		clickElement(tryLexDialogX);
	}	
	public void logOut() throws InterruptedException {
		WebElement nav = driver.findElement(By.id("userNavButton"));
		clickElement(nav);
		Thread.sleep(1000);
		WebElement logout = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
		clickElement(logout);
	}	
	public String getRememberMe() {
		return getText(remberme);
	}
	public String getLoginError() {
		return getDivText(error);
	}
	public String getContent() {
		return getDivText(content);
		
	}
	
	public void enterIntoUsername(String usrName) {
		enterText(username, usrName);
		
	}
	public void enterIntoPassword(String passwrd) {
		enterText(password, passwrd);
	}
	
}
