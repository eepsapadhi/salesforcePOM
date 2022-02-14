package com.salesforce.test;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.salesforce.utility.Commmonutilities;

public class UsermenuDropdownTest extends BaseTest {
	
	
	@Test
	public void TC05() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		usermenu.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
		usermenu.enterIntoPassword(password);
		usermenu.clcikLoginButton();
		Thread.sleep(3000);
		//usermenu.closeDialogBox();	
		usermenu.getuserNavbutton().click();
		Thread.sleep(1000);
		String getUserNavmenuItems = usermenu.getUserNavmenuItems();
		//System.out.println(getUserNavmenuItems);
		Assert.assertTrue(getUserNavmenuItems.contains("My ProfileMy SettingsDeveloper Console"));
		Assert.assertTrue(getUserNavmenuItems.contains("Logout"));		
	}
	@Test
	public void TC06() throws InterruptedException, AWTException {
		String username=Commmonutilities.getApplicationProperty("username");
		usermenu.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
		usermenu.enterIntoPassword(password);
		usermenu.clcikLoginButton();
		Thread.sleep(3000);
		//usermenu.closeDialogBox();	
		usermenu.getuserNavbutton().click();
		Thread.sleep(1000);
		usermenu.getprofile().click();
		usermenu.geteditprofile().click();
		usermenu.getContactInfoContentId().click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']")));		
		usermenu.getAbout().click();
		usermenu.getLastName().clear();
		usermenu.getLastName().sendKeys("abcd");
        usermenu.getSave().click();
		driver.switchTo().defaultContent();
		usermenu.getPost().click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, publisherRichTextEditor']")));
		Thread.sleep(500);
		usermenu.getbody().sendKeys("hello");
		driver.switchTo().defaultContent();
        usermenu.getsharebutton().click();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		usermenu.getfile().click();
		Thread.sleep(1000);
		usermenu.getUploadFileAction().click();
		Thread.sleep(3000);

		WebElement chooseFileButton = driver.findElement(By.xpath(" //input[@id='chatterFile']"));
		System.out.println(chooseFileButton.getAttribute("name"));
		usermenu.setClipBoardData("/Users/eepsapadhi/Desktop/image.jpeg");
		WebDriverWait wait3 = new WebDriverWait(driver, 30);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //input[@id='chatterFile']")));
		Thread.sleep(1000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", chooseFileButton);

		Robot robot = new Robot();
		Thread.sleep(2000);

		// Cmd + Tab is needed since it launches a Java app and the browser looses focus
		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_META);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(500);
		// Open Goto window
		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_META);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_G);
		// Paste the clipboard value
		robot.keyPress(KeyEvent.VK_META);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_META);
		robot.keyRelease(KeyEvent.VK_V);
		// Press Enter key to close the Goto window and Upload window
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
		
		
		
		
	}
	@Test
	public static void profilePicture() throws InterruptedException, AWTException {
		String username=Commmonutilities.getApplicationProperty("username");
		usermenu.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
		usermenu.enterIntoPassword(password);
		usermenu.clcikLoginButton();
		Thread.sleep(3000);
		//usermenu.closeDialogBox();	
		usermenu.getuserNavbutton().click();
		Thread.sleep(1000);
		usermenu.getprofile().click();
		Thread.sleep(3000);
		WebElement myProfilePhoto = driver.findElement(By.xpath("//span[@class='profileImage chatter-avatarFull chatter-avatar']"));
		Actions action = new Actions(driver);
		action.moveToElement(myProfilePhoto).build().perform();
		driver.findElement(By.xpath("//a[@id='uploadLink']")).click();
		driver.switchTo().frame("uploadPhotoContentId");
		WebElement uploadPicture = driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile"));		
		uploadPicture.sendKeys("/Users/eepsapadhi/Desktop/image.jpeg");
		System.out.println("Reached Here");		
		//driver.switchTo().frame(driver.findElement(By.id("uploadPhotoContentId")));
		driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadBtn']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@id='j_id0:j_id7:save']")).click();
		// driver.findElement(By.id("j_id0:j_id7:save")).click();
		Thread.sleep(20000);
		System.out.println("You have uploaded an image!");
		  driver.close();
	}
	@Test
	public static void TC07() throws InterruptedException, AWTException {
		String username=Commmonutilities.getApplicationProperty("username");
		usermenu.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
		usermenu.enterIntoPassword(password);
		usermenu.clcikLoginButton();
		Thread.sleep(3000);	
		usermenu.getuserNavbutton().click();
		Thread.sleep(1000);
		usermenu.getSettings().click();
		usermenu.getfont().click();
		usermenu.getLoginHistory().click();
		usermenu.getTextContain().click();
		usermenu.getDisplayAndLayout().click();
		Robot robot = new Robot();
		robot.mouseWheel(2);
		Thread.sleep(5000);
		usermenu.getCustomizeTabs().click();
		Select text = new Select(driver.findElement(By.id("p4")));
		text.selectByVisibleText("Salesforce Chatter");
		Thread.sleep(3000);
		Select report = new Select(driver.findElement(By.xpath("//select[@id='duel_select_1']")));
		report.selectByVisibleText("Chatter");
		Thread.sleep(3000);
		usermenu.getRemove().click();
		usermenu.getAdd().click();
		usermenu.getSave1().click();
		//System.out.println(driver.findElement(By.id("Chatter_Tab")).getText());
		assertEquals("Chatter",driver.findElement(By.id("Chatter_Tab")).getText()); 
	

	}
	@Test
	public static void TC07email() throws InterruptedException {

		String username=Commmonutilities.getApplicationProperty("username");
		usermenu.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
		usermenu.enterIntoPassword(password);
		usermenu.clcikLoginButton();
		Thread.sleep(3000);
		//usermenu.closeDialogBox();	
		usermenu.getuserNavbutton().click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('EmailSetup');\"]")).click();
		driver.findElement(By.xpath("//span[@id='EmailSettings_font']")).click();
		Thread.sleep(2000);
		// provide email name in Email name field
		driver.findElement(By.id("sender_name")).clear();
		driver.findElement(By.id("sender_name")).sendKeys("Eepsa");
		Thread.sleep(2000);
		// Email address in Email address field
		driver.findElement(By.id("sender_email")).clear();
		driver.findElement(By.id("sender_email")).sendKeys("eepsa.padhi09@gmail.com");
		Thread.sleep(3000);
        // Select automatic BCC radio button
		driver.findElement(By.id("auto_bcc1")).click();
		List<WebElement> li = driver.findElements(By.xpath("//input[@name='auto_bcc']"));
		System.out.println(li.get(0).isSelected());
		System.out.println(li.get(1).isSelected());
		Thread.sleep(5000);
		// Clicked on save button
		driver.findElement(By.name("save")).click();
		Thread.sleep(5000);
		assertEquals("Your settings have been successfully saved.",driver.findElement(By.xpath("//div[@class='messageText']")).getText()); 
		
	}
	@Test
	public static void TC07calendar() throws InterruptedException {
		String username=Commmonutilities.getApplicationProperty("username");
		usermenu.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
		usermenu.enterIntoPassword(password);
		usermenu.clcikLoginButton();
		Thread.sleep(3000);	
		usermenu.getuserNavbutton().click();
		Thread.sleep(1000);
		usermenu.getSettings().click();
		// Clicked on Calender and Reminders tab
        usermenu.getCalendarAndReminders().click();
		// clicked on Activity Remainders link.
        usermenu.getRemindersfont().click();
		// On Remainders page click on Open a test Remainder button
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		usermenu.gettestbtn().click();
		Thread.sleep(4000);
		driver.switchTo().window(windows.get(0));
		Thread.sleep(4000);
		
		 
	}
	@Test
	public static void TC08() throws InterruptedException, AWTException {
		String username=Commmonutilities.getApplicationProperty("username");
		usermenu.enterIntoUsername(username);
		String password=Commmonutilities.getApplicationProperty("password");
		usermenu.enterIntoPassword(password);
		usermenu.clcikLoginButton();
		Thread.sleep(3000);
		usermenu.getuserNavbutton().click();
		usermenu.getDeveloperConsole().click();
        ArrayList<String> Ws = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(Ws.size());
		driver.switchTo().window(Ws.get(1));
		Thread.sleep(2000);
		



	}
     @Test
	public static void TC09() throws InterruptedException {
    	 String username=Commmonutilities.getApplicationProperty("username");
 		usermenu.enterIntoUsername(username);
 		String password=Commmonutilities.getApplicationProperty("password");
 		usermenu.enterIntoPassword(password);
 		usermenu.clcikLoginButton();
 		Thread.sleep(3000);
 		usermenu.getuserNavbutton().click();
 		usermenu.getLogout().click();
 		assertEquals("https://tekarch4-dev-ed.my.salesforce.com/secur/logout.jsp",driver.getCurrentUrl()); 
	}
	
	
	
}
