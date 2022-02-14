package com.salesforce.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.salesforce.utility.Commmonutilities;

public class CreateaccountTest extends BaseTest{
	@Test
	public static void TC10() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		account.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
		account.enterIntoPassword(password);
		account.clcikLoginButton();
		Thread.sleep(3000);
		account.createAccount();
		account.closeDialogBox();
		account.getNew().click();;
        account.getacc().clear();
        account.getacc().sendKeys("abcd");
       account.getSave().click();
       
     
	}
	@Test
	public static void TC11() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		account.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
		account.enterIntoPassword(password);
		account.clcikLoginButton();
		Thread.sleep(3000);
		account.createAccount();
		account.closeDialogBox();
		account.getCreateView().click();;
		account.getfname().sendKeys("hello");
        account.getSave1().click();


	}
	@Test
	public static void TC12() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		account.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
		account.enterIntoPassword(password);
		account.clcikLoginButton();
		Thread.sleep(3000);
		account.createAccount();
		account.closeDialogBox();
        Select se = new Select(driver.findElement(By.id("fcf")));
        se.selectByVisibleText("hello");
        account.getEdit().click();
        Select accname = new Select(driver.findElement(By.id("fcol2")));
        accname.selectByVisibleText("Account Name");
        Select operator = new Select(driver.findElement(By.id("fop2")));
        operator.selectByVisibleText("contains");
        Thread.sleep(4000);
        account.getValue().sendKeys("ba");
		account.getSave1().click();
		//driver.findElement(By.xpath("(//input[@name='save'])[3]")).click();
		Thread.sleep(3000);
		
	}
	@Test
	public static void TC13() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		account.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
		account.enterIntoPassword(password);
		account.clcikLoginButton();
		Thread.sleep(3000);
		account.createAccount();
		account.closeDialogBox();       
		account.getMergeAccounts().click();; 
        account.getSearch().sendKeys("a*");
        account.getentr().click();
        //account.getBtn1().click();
       // account.getBtn2().click();
        account.gettopButton().click();
        account.getMerge().click();
 		Alert wind = driver.switchTo().alert();
 		Thread.sleep(5000);
 	    wind.accept();
 			
	}
	
	@Test
	public static void TC14() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		account.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
		account.enterIntoPassword(password);
		account.clcikLoginButton();
		Thread.sleep(3000);
		account.createAccount();
		account.closeDialogBox(); 
		account.getlastactivity().click();
		account.getDate().click();
		account.getDateField().click();
		account.getCreateDate().click();
		account.getselectDate().click();
		account.gettodaydate().click();
		account.getsave3().click();
		account.getreportNameField().sendKeys("eepsa");
		account.getDeveloperName().sendKeys("doc");
		account.getSaveReport().click();

	
	}

}
