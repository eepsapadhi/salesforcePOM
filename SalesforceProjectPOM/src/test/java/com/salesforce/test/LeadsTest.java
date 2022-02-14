package com.salesforce.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.salesforce.utility.Commmonutilities;

public class LeadsTest extends BaseTest {
	
	
	@Test
	public static void TC20() throws InterruptedException {
		
		String username=Commmonutilities.getApplicationProperty("username");
		leads.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
	    leads.enterIntoPassword(password);
		leads.clcikLoginButton();
		leads.getLeads().click();
		leads.closeDialogBox();
	}
	
	@Test
	public static void TC21() throws InterruptedException {

		String username=Commmonutilities.getApplicationProperty("username");
		leads.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
	    leads.enterIntoPassword(password);
		leads.clcikLoginButton();
		leads.getLeads().click();
		leads.closeDialogBox();
		Select view = new Select(driver.findElement(By.id("fcf")));
		List<WebElement> options = view.getOptions();
		for (WebElement element : options) {
			System.out.println(element.getText());
	}

}
	
	@Test
	public static void TC22() throws InterruptedException {

		String username=Commmonutilities.getApplicationProperty("username");
		leads.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
	    leads.enterIntoPassword(password);
		leads.clcikLoginButton();
		leads.getLeads().click();
		leads.closeDialogBox();
		leads.getviewdd().click();
	    Select lead = new Select(driver.findElement(By.id("fcf")));
        lead.selectByValue("00B8c00000D5DCd");
        Thread.sleep(2000);
        leads.getuserNavbutton().click();
        leads.getLogout().click();
        leads.enterIntoUsername(username);
	    leads.enterIntoPassword(password);
		leads.clcikLoginButton();
		leads.getLeads().click();
		leads.getgo().click();
			
	}
	
	@Test
	public static void TC23() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		leads.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
	    leads.enterIntoPassword(password);
		leads.clcikLoginButton();
		leads.getLeads().click();
		leads.closeDialogBox();
		leads.getviewdd().click();
	    Select lead = new Select(driver.findElement(By.id("fcf")));
	    lead.selectByValue("00B8c00000D5DCd");
		//Thread.sleep(3000);
	   System.out.println("testcase pass");
		}
	
	@Test
	public static void TC24() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		leads.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
	    leads.enterIntoPassword(password);
		leads.clcikLoginButton();
		leads.getLeads().click();
		leads.closeDialogBox();
		leads.getNew().click();
		leads.getLname().sendKeys("eepsa");
		leads.getcompany().sendKeys("comp");
		// Click save button
		leads.getsave().click();
	   System.out.println("new lead should be saved and the newly created lead view page is opened");
		System.out.println("test case is passed");
		driver.close();
	}
	

}
