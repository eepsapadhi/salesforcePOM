package com.salesforce.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.salesforce.utility.Commmonutilities;

public class RandomscenarioTest extends BaseTest {
	
	@Test
	public static void TC33() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		randomSc.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
		randomSc.enterIntoPassword(password);
		randomSc.clcikLoginButton();
		System.out.println("Verify that the FirstName LastName of the account holder is displayed at the top left hand side of the page,");
		randomSc.getHome().click();
		System.out.println("FirstName LastName' page is displayed.");
	}
	@Test
	public static void TC34() throws InterruptedException {
		
		String username=Commmonutilities.getApplicationProperty("username");
		randomSc.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
		randomSc.enterIntoPassword(password);
		randomSc.clcikLoginButton();
		randomSc.getHome().click();
		randomSc.getFnLn().click();
		// Click on the 'Edit Profile' icon near Contact
		randomSc.geteditprofile().click();
    	//Click on the 'About' tab in the popup.
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']")));
		randomSc.getAbout().click();
		// Clicked on First name through sendkeys
		randomSc.getFname().clear();
		randomSc.getFname().sendKeys("eepsa");
		// Clicked on save all button
		randomSc.getSaveall().click();

	}
	
	@Test
	public static void TC35() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		randomSc.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
		randomSc.enterIntoPassword(password);
		randomSc.clcikLoginButton();
		//+ button clicked
		randomSc.getAlltab().click();
		//customize my tabs button clicked
		randomSc.getCustomize().click();		
		// Clicked in Contact tab
		randomSc.getContact().click();
		// Clicked in Add button
		randomSc.getRightArrow().click();
		// Clicked in Remove button
		randomSc.getLeftArrow().click();
		System.out.println("The Assets is removed from the 'Selected Tabs' section and is moved to the 'Available Tabs' section.");
		// Click on Save button
		randomSc.getsave().click();
		randomSc.getuserNavbutton().click();
		randomSc.getLogout().click();
		randomSc.enterIntoUsername(username);
		randomSc.enterIntoPassword(password);
		randomSc.clcikLoginButton();
		System.out.println("login successfully");
	}
	
	@Test
	public static void TC36() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		randomSc.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
		randomSc.enterIntoPassword(password);
		randomSc.clcikLoginButton();
		randomSc.getHome().click();
		randomSc.closeDialogBox();
		// Click on the current date link
		//randomSc.getCurrentdate().click();
		 String pattern = "EEEEE MMMMM dd, yyyy";
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	    String date = simpleDateFormat.format(new Date());
	    date = "//a[normalize-space()='" + date + "']";
	    System.out.println("Curretn Date" + date); 
	    driver.findElement(By.xpath(date)).click();
		 System.out.println("The 'Calendar for FirstName LastName' page is displayed.");
		// Click on '8:00PM' link
		randomSc.getselecttime().click();
		// Click on 'Subject Combo' icon next to Subject field.
		randomSc.getNewWindow().click();
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windows.size());
	    driver.switchTo().window(windows.get(1));
		Thread.sleep(2000);
		randomSc.getOther().click();
		driver.switchTo().window(windows.get(0));
		randomSc.getEndDateTimetime().click();
		randomSc.gettimePickerItem().click();
		//Click Save button
        randomSc.getSave1().click();
				
	}
	
	@Test
	public static void TC37() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		randomSc.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
		randomSc.enterIntoPassword(password);
		randomSc.clcikLoginButton();
		randomSc.getHome().click();
		randomSc.closeDialogBox();
		// Click on the current date link
		//randomSc.getCurrentdate().click();
		String pattern = "EEEEE MMMMM dd, yyyy";
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	    String date = simpleDateFormat.format(new Date());
	    date = "//a[normalize-space()='" + date + "']";
	    System.out.println("Curretn Date" + date); 
	    driver.findElement(By.xpath(date)).click();
		// Click on '4:00PM' link
		randomSc.getselecttime1().click();
		// Click on 'Subject Combo' icon next to Subject field.
		randomSc.getNewWindow().click();
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windows.size());
		driver.switchTo().window(windows.get(1));
		Thread.sleep(2000);
		randomSc.getOther().click();
		driver.switchTo().window(windows.get(0));
		randomSc.getEndDateTimetime().click();
		randomSc.gettimePickerItem1().click();
		randomSc.getIsRecurrence().click();
		// Select 'Weekly' radiobutton
		randomSc.getrectypeftw().click();
		// Click date
		randomSc.getEndDate().sendKeys("2/23/2022");
		// Click Save button
		randomSc.getTopsave().click();
		// Click 'Month View' icon
		randomSc.getMonthView().click();
		System.out.println("The 'Calendar for FirstName LastName - Month View' page should be displayed.");
				
				
	}


}
