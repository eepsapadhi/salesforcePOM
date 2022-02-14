package com.salesforce.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.salesforce.utility.Commmonutilities;

public class CreateOptyTest extends BaseTest{
	
	
	@Test
	public static void TC15() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		otpy.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
		otpy.enterIntoPassword(password);
		otpy.clcikLoginButton();
		Thread.sleep(2000);
		otpy.getopportunities().click();
		otpy.closeDialogBox();
		
	  }
	
	@Test
	public static void TC16() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		otpy.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
		otpy.enterIntoPassword(password);
		otpy.clcikLoginButton();
		Thread.sleep(2000);
		otpy.getopportunities().click();
		otpy.closeDialogBox();
		otpy.getNew().click();
		otpy.getoppname().sendKeys("Software Engineer");
		otpy.getaccname().sendKeys("abcd");
		otpy.getclosedate().click();
	    Select stage =new Select(driver.findElement(By.id("opp11")));
		stage.selectByVisibleText("Qualification");
		Thread.sleep(2000);
		otpy.getprobability().clear();	
		otpy.getprobability().sendKeys("10");	
		Select opp = new Select(driver.findElement(By.id("opp6")));
		opp.selectByValue("Web");
		Thread.sleep(2000);
		otpy.getsave().click();	
		
	}
	@Test
	public static void TC17() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		otpy.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
		otpy.enterIntoPassword(password);
		otpy.clcikLoginButton();
		Thread.sleep(2000);
		otpy.getopportunities().click();
		otpy.closeDialogBox();
		otpy.getpipeline().click();
		
	}
	
	@Test
	public static void TC18() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		otpy.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
		otpy.enterIntoPassword(password);
		otpy.clcikLoginButton();
		Thread.sleep(2000);
		otpy.getopportunities().click();
		otpy.closeDialogBox();
		otpy.getstuckopp().click();
		
	}
	
	@Test
	public static void TC19() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		otpy.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
		otpy.enterIntoPassword(password);
		otpy.clcikLoginButton();
		Thread.sleep(2000);
		otpy.getopportunities().click();
		otpy.closeDialogBox();
		Select interval = new Select(driver.findElement(By.xpath("//select[@id='quarter_q']")));
		interval.selectByVisibleText("Current FQ");
		Thread.sleep(2000);
		Select include = new Select(driver.findElement(By.xpath("//select[@id='open']")));
		include.selectByVisibleText("Open Opportunities");
		Thread.sleep(2000);
		otpy.getrunreport().click();
		
	}
	

}
