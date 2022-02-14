package com.salesforce.page.randomscenario;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.utility.BasePage;

public class randomscenarioaPage extends BasePage {
	public randomscenarioaPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(id="username") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(id ="Login") WebElement btnLogin;
	@FindBy(id ="tryLexDialogX") WebElement tryLexDialogX;	
    @FindBy(css = "h1[class='currentStatusUserName'] a") WebElement FnLn;
	@FindBy(xpath = "//a[normalize-space()='Home']") WebElement Home;
	@FindBy(xpath = "//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']") WebElement editprofile;
	@FindBy(xpath = "//a[contains(text(),'About')]") WebElement About;
	@FindBy(xpath = "//input[@id='firstName']") WebElement Fname;
	@FindBy(xpath = "//input[contains(@class,'zen-btn zen-primaryBtn')]") WebElement Saveall;
	@FindBy(xpath = "//img[@title='All Tabs']") WebElement Alltab;
	@FindBy(xpath = "//input[@title='Customize My Tabs']") WebElement Customize;
	@FindBy(xpath = "//option[@value='Contact']") WebElement Contact;
    @FindBy(className = "rightArrowIcon") WebElement RightArrow;
    @FindBy(className = "leftArrowIcon") WebElement LeftArrow;
    @FindBy(name  = "save") WebElement save;
    @FindBy(xpath = "//a[normalize-space()='Logout']") WebElement Logout ;
    @FindBy(id ="userNavButton") WebElement userNavbutton;
   // @FindBy(css = "a[href='/00U/c?md3=40&md0=2022']") WebElement Currentdate;
    @FindBy(xpath = "(//a[normalize-space()='8:00 PM'])[1]") WebElement selecttime ;
    @FindBy(xpath = "//img[@alt='Subject Combo (New Window)']") WebElement NewWindow ;
    @FindBy(xpath = "//a[text()='Other']") WebElement Other ;
	@FindBy(id="EndDateTime_time") WebElement EndDateTimetime;
	@FindBy(id="timePickerItem_42") WebElement timePickerItem;
    @FindBy(xpath ="(//input[@name='save'])[2]") WebElement Save1 ;
    @FindBy(xpath ="//a[normalize-space()='4:00 PM']") WebElement selecttime1 ;
    @FindBy(id="timePickerItem_38") WebElement timePickerItem1;
    @FindBy(xpath ="//input[@id='IsRecurrence']") WebElement IsRecurrence ;
    @FindBy(id="rectypeftw") WebElement rectypeftw;
    @FindBy(id="RecurrenceEndDateOnly") WebElement EndDate;
    @FindBy(xpath ="//td[@id='topButtonRow']//input[@title='Save']") WebElement Topsave ;
    @FindBy(xpath ="//img[@title='Month View']") WebElement MonthView ;
    
    public WebElement getMonthView() {
    	waitUntilVisible(MonthView);
    	return MonthView;
    }
    public WebElement getTopsave() {
    	waitUntilVisible(Topsave);
    	return Topsave;
    }
    public WebElement getEndDate() {
    	waitUntilVisible(EndDate);
    	return EndDate;
    }
    public WebElement getrectypeftw() {
    	waitUntilVisible(rectypeftw);
    	return rectypeftw;
    }
    public WebElement getIsRecurrence() {
	     waitUntilVisible(IsRecurrence);
	     return IsRecurrence;
    }
    public WebElement gettimePickerItem1() {
		return timePickerItem1;
		}
    public WebElement getselecttime1() {
		waitUntilVisible(selecttime1);
		return selecttime1;
	}
    public WebElement getSave1() {
		waitUntilVisible(Save1);
		return Save1;
	}
	 public WebElement gettimePickerItem() {
			return timePickerItem;
			}
	 public WebElement getEndDateTimetime() {
			return EndDateTimetime;
			}
    public WebElement getOther() {
		waitUntilVisible(Other);
		return Other;
	}
    public WebElement getNewWindow() {
		waitUntilVisible(NewWindow);
		return NewWindow;
	}
    public WebElement getselecttime() {
		waitUntilVisible(selecttime);
		return selecttime;
	}
//    public WebElement getCurrentdate() {
//		waitUntilVisible(Currentdate);
//		return Currentdate;
//	}
    public WebElement getuserNavbutton() {
		return userNavbutton;
		}
	public  WebElement getLogout() {
		return Logout;
	}
    public WebElement getsave() {
		return save;
	}
    public WebElement getLeftArrow() {
		waitUntilVisible(LeftArrow);
		return LeftArrow;
	}
    public WebElement getRightArrow() {
		waitUntilVisible(RightArrow);
		return RightArrow;
	}
	public WebElement getContact() {
		waitUntilVisible(Contact);
		return Contact;
	}
	public WebElement getCustomize() {
		waitUntilVisible(Customize);
		return Customize;
	}
	public WebElement getAlltab() {
		waitUntilVisible(Alltab);
		return Alltab;
	}
	public WebElement getSaveall() {
		waitUntilVisible(Saveall);
		return Saveall;
	}
	public WebElement getFname() {
		waitUntilVisible(Fname);
		return Fname;
	}
	public WebElement getAbout() {
		waitUntilVisible(About);
		return About;
	}
	public WebElement geteditprofile() {
		waitUntilVisible(editprofile);
		return editprofile;
		}
	public WebElement getHome() {
		waitUntilVisible(Home);
		return Home;
		}
    public WebElement getFnLn() {
		waitUntilVisible(FnLn);
		return FnLn;
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
