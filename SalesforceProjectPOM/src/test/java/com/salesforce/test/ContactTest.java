package com.salesforce.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.salesforce.utility.Commmonutilities;

public class ContactTest extends BaseTest {

	@Test
	public static void TC25() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		contact.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
	    contact.enterIntoPassword(password);
		contact.clcikLoginButton();
		contact.getcontact().click();
		contact.closeDialogBox();
		System.out.println("Contact Home page is displayed");
		contact.getnewbtn().click();
		contact.getlname().sendKeys("Padhi");
		contact.getaccname().sendKeys("abcd");
		System.out.println("Account name isdisplayed in account name field");
		// Click on Save button
		contact.getsave().click();
		System.out.println("New contact is created");
	}
	
	@Test
	public static void TC26() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		contact.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
	    contact.enterIntoPassword(password);
		contact.clcikLoginButton();
		contact.getcontact().click();
		contact.closeDialogBox();
		contact.getnewview().click();
		System.out.println("New View Page is displayed");
		contact.getnewname().sendKeys("test");
		contact.getuniquename().click();
        contact.getsave1().click();
        System.out.println("test case passed");
	
	}
	
	@Test
	public static void TC27() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		contact.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
	    contact.enterIntoPassword(password);
		contact.clcikLoginButton();
		contact.getcontact().click();
		contact.closeDialogBox();
        Select recent = new Select(driver.findElement(By.id("hotlist_mode")));
	    recent.selectByVisibleText("Recently Created");
        System.out.println("Recently created contacts is displayed");
				
	}
	
	@Test
	public static void TC28() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		contact.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
	    contact.enterIntoPassword(password);
		contact.clcikLoginButton();
		contact.getcontact().click();
		contact.closeDialogBox();
		Select cont = new Select(driver.findElement(By.id("fcf")));
		cont.selectByVisibleText("My Contacts");
		System.out.println("My contacts View is displayed");
		Thread.sleep(2000);
		
	}
	
	@Test
	public static void TC29() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		contact.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
	    contact.enterIntoPassword(password);
		contact.clcikLoginButton();
		contact.getcontact().click();
		contact.closeDialogBox();
		contact.getcontactname().click();
		System.out.println("test case passed");
		
	}
	@Test
	public static void TC30() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		contact.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
	    contact.enterIntoPassword(password);
		contact.clcikLoginButton();
		contact.getcontact().click();
		contact.closeDialogBox();
		contact.getnewview().click();
		System.out.println("Create New View page is opened.");
		contact.getnewname().sendKeys("test");
		contact.getuniquename().click();	
		contact.getsave1().click();
		System.out.println("Error message is appeared under the View Name field. The Error message appears as \"Error: You must enter a value\"..");
				
	}
	
	@Test
	public static void TC31() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		contact.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
	    contact.enterIntoPassword(password);
		contact.clcikLoginButton();
		contact.getcontact().click();
		contact.closeDialogBox();
		contact.getnewview().click();
		System.out.println("Create New View page is opened.");
		contact.getnewname().sendKeys("test");
		contact.getuniquename().sendKeys("ing");
		contact.getcancel().click();
        System.out.println("Contacts Home page is displayed and the View Better is not be created.");
	
	}
	
	@Test
	public static void TC32() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		contact.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
	    contact.enterIntoPassword(password);
		contact.clcikLoginButton();
		contact.getcontact().click();
		contact.closeDialogBox();
		contact.getnewbtn().click();
		System.out.println("New Contact home page is displayed");
		contact.getlname().sendKeys("Indian");
		System.out.println("Last name should be enterd in Last name field");
		contact.getaccname().sendKeys("Selenium");
		System.out.println("Account name isdisplayed in account name field");
		contact.getsave().click();
		System.out.println("New contact is created");
				
	}
	
	
}
