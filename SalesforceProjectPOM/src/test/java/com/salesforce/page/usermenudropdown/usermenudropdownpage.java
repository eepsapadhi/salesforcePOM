package com.salesforce.page.usermenudropdown;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.utility.BasePage;

public class usermenudropdownpage extends BasePage{

	public usermenudropdownpage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(id="username") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(id ="Login") WebElement btnLogin;
	@FindBy(id ="tryLexDialogX") WebElement tryLexDialogX;	
	@FindBy(id ="userNavButton") WebElement userNavbutton;
	@FindBy(id ="userNav-menuItems") WebElement userNavmenuItems;
	@FindBy(id ="lastName") WebElement lastName;
	@FindBy(xpath = "//a[normalize-space()='My Profile']") WebElement profile;
	@FindBy(xpath = "//img[@alt='Edit Profile']") WebElement editprofile;
	@FindBy(xpath = "//iframe[@id='contactInfoContentId']") WebElement contactInfoContentId;
	@FindBy(xpath = "//a[contains(text(),'About')]") WebElement About;
	@FindBy(xpath = "//input[@value='Save All']") WebElement Save ;
	@FindBy(xpath = "//a[@id='publisherAttachContentPost']") WebElement File ;
	@FindBy(xpath = "//a[@id='publisherAttachTextPost']") WebElement Post ;
	@FindBy(tagName =  "body") WebElement body ;
	@FindBy(xpath = "//input[@id='publishersharebutton']") WebElement clicksharebutton ;	
	@FindBy(xpath = "//a[@id='chatterUploadFileAction']") WebElement UploadFileAction ;
	@FindBy(xpath = "//a[contains(text(),'My Settings')]") WebElement Settings ;
	@FindBy(xpath = "//span[@id='PersonalInfo_font']") WebElement font;
	@FindBy(xpath = "//a[@id='LoginHistory_font']") WebElement LoginHistory;
	@FindBy(xpath = "//a[contains(text(),'Download login history for last six months, includ')]") WebElement TextContain;
	@FindBy(xpath = "//span[@id='DisplayAndLayout_font']") WebElement DisplayAndLayout;
	@FindBy(xpath = "//span[@id='CustomizeTabs_font']") WebElement CustomizeTabs;
	@FindBy(xpath = "//select[@id='p4']") WebElement p4;
	@FindBy(xpath = "//img[@title='Remove']") WebElement Remove;
	@FindBy(xpath = "//img[@title='Add']") WebElement Add;
	@FindBy(xpath = "//input[@title='Save']") WebElement Save1;
	@FindBy(xpath = "//a[normalize-space()='Logout']") WebElement Logout ;
	@FindBy(xpath = "//a[normalize-space()='Developer Console']") WebElement DeveloperConsole ;
	@FindBy(id =  "CalendarAndReminders_font") WebElement CalendarAndReminders ;
	@FindBy(xpath = "//span[@id='Reminders_font']") WebElement Remindersfont ;
	@FindBy(id =  "testbtn") WebElement testbtn ;

	
		
	public  WebElement gettestbtn() {
		//waitUntilVisible(testbtn);
		return testbtn;
	}
	public  WebElement getRemindersfont() {
		//waitUntilVisible(Remindersfont);
		return Remindersfont;
	}
	
	public  WebElement getDeveloperConsole() {
		waitUntilVisible(DeveloperConsole);
		return DeveloperConsole;
	}
	public  WebElement getLogout() {
		return Logout;
	}
	public  WebElement getSave1() {
		waitUntilVisible(Save1);
		return Save1;
	}
	public  WebElement getAdd() {
		return Add;
	}
	public  WebElement getRemove() {
		return Remove;
		}
	public  WebElement getp4() {
		return p4;
		}
	public  WebElement getCustomizeTabs() {
		return CustomizeTabs;
		}
	public  WebElement getDisplayAndLayout() {
		return DisplayAndLayout;
		}
	public  WebElement getTextContain() {
		waitUntilVisible(TextContain);
		return TextContain;
	}
	public  WebElement getLoginHistory() {
		waitUntilVisible(LoginHistory);
		return LoginHistory;
	}
	public  WebElement getfont() {
		waitUntilVisible(font);
		return font;
	}
	public  WebElement getSettings() {
		waitUntilVisible(Settings);
		return Settings;
		}
	public  WebElement getUploadFileAction() {
		waitUntilVisible(UploadFileAction);
		return UploadFileAction;
		}
	public  WebElement getfile() {
		waitUntilVisible(File);
		return File;
		}
	public  WebElement getsharebutton() {
		return clicksharebutton;
		
	}
	public WebElement getbody() {
		return body;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getSave() {
		waitUntilVisible(Save);
		return Save;
	}
	public WebElement getPost() {
		waitUntilVisible(Post);
		return Post;
	}
	
	public WebElement getAbout() {
		waitUntilVisible(About);
		return About;
	}
	public WebElement getContactInfoContentId() {
		return contactInfoContentId;
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
	public String getUserNavmenuItems() {
		return getDivText(userNavmenuItems);
		
	}
	public WebElement getuserNavbutton() {
		return userNavbutton;
		
	}
	public static void setClipBoardData(String string) {
		StringSelection s = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
	}
	public WebElement getprofile() {
		return profile;
		
	}
	public WebElement geteditprofile() {
		return editprofile;
		
	}
	public WebElement getCalendarAndReminders() {
		return CalendarAndReminders;
	}
	
	
	
}
