package com.salesforce.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.salesforce.test.BaseTest;
import com.salesforce.utility.Commmonutilities;

public class LoginTest extends BaseTest{
	
	@Test
	public void invalidLoginTest() {
		System.out.println("entering to logintest @test");
		String username=Commmonutilities.getApplicationProperty("username");
		loginPage.enterIntoUsername(username);
		loginPage.enterIntoPassword("");
		loginPage.clcikLoginButton();
		//loginPage.handleAlert();
		String error = loginPage.getLoginError();
		System.out.println("Error : " + error);
		Assert.assertEquals(error,"Please enter your password.");		
	}
	
	@Test
	public void validLoginTest() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		loginPage.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
		loginPage.enterIntoPassword(password);
		loginPage.clcikLoginButton();
		Thread.sleep(2000);
		String title=homePage.getTitleOfTheHomePage();
		Assert.assertEquals(title,"Home Page ~ Salesforce - Devloper Edition");
		
	}
	
	@Test
	public void rememberMeLoginTest() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		loginPage.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
		loginPage.enterIntoPassword(password);
		loginPage.clickRemeberme();
		loginPage.clcikLoginButton();
		Thread.sleep(2000);
		//loginPage.closeDialogBox();	
		Thread.sleep(1000);
		loginPage.logOut();
		Thread.sleep(2000);		
		String remberme = loginPage.getRememberMe();
		System.out.println("Remeber Me : " + remberme);
		Assert.assertEquals(remberme,"on");
	}
	
	@Test
	public static void ForgotPassword4A() throws InterruptedException {
		
		loginPage.ForgotPassword();
		loginPage.enteremailid("eepsa.padhi09@force.com");
		
		Thread.sleep(2000);
		loginPage.Continue();
		String  Continue = loginPage.getContent();
		//System.out.println("continue :"+ Continue );
		Assert.assertTrue(Continue.contains("We’ve sent you an email with a link to finish resetting your password."));
	}
	
	@Test
	public static void ForgotPassword4B() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		loginPage.enterIntoUsername("435456");
		String password=Commmonutilities.getApplicationProperty("password");
		loginPage.enterIntoPassword("1234");
		loginPage.clcikLoginButton();
		Thread.sleep(2000);
		String error = loginPage.getLoginError();
		System.out.println("Error : " + error);
		Assert.assertEquals(error,"Please check your username and password. If you still can't log in, contact your Salesforce administrator.");

		
	}
		  

}

