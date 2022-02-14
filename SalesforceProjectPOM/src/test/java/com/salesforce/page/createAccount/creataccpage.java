package com.salesforce.page.createAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesforce.utility.BasePage;

public class creataccpage extends BasePage{
	public creataccpage(WebDriver driver){
		super(driver);
	}
		@FindBy(id="username") WebElement username;
		@FindBy(id="password") WebElement password;
		@FindBy(id ="Login") WebElement btnLogin;
		@FindBy(id ="tryLexDialogX") WebElement tryLexDialogX;	
		@FindBy(xpath ="//a[normalize-space()='Accounts']") WebElement createaccount;
		@FindBy(xpath ="//input[@title='New']") WebElement New;
		@FindBy(name = "acc2") WebElement acc;
		@FindBy(xpath ="//td[@id='topButtonRow']//input[@title='Save']") WebElement Save;
		@FindBy(xpath = "//a[normalize-space()='Create New View']") WebElement CreateView;
		@FindBy(name = "fname") WebElement fname;
		@FindBy(xpath = "(//input[@title='Save'])[1]") WebElement Save1;
		@FindBy(xpath = "//a[contains(text(),'Edit')]") WebElement Edit;
		@FindBy(id ="fval2") WebElement Value;
		@FindBy(xpath = "//a[normalize-space()='Merge Accounts']") WebElement MergeAccounts;
		@FindBy(xpath = "//input[@id='srch']") WebElement Search;
		@FindBy(xpath = "//div[@class='pbWizardBody']//input[2]") WebElement entr;
		@FindBy(id ="cid0") WebElement Btn1;
		@FindBy(id ="cid1") WebElement Btn2;
		@FindBy(xpath = "//div[contains(@class,'pbTopButtons')]//input[contains(@title,'Next')]") WebElement topButton;
		@FindBy(xpath = "//div[@class='pbTopButtons']//input[@title='Merge']") WebElement Merge;
		@FindBy(xpath = "//a[normalize-space()='Accounts with last activity > 30 days']") WebElement lastactivity;
		@FindBy(xpath = "//img[@id='ext-gen154']") WebElement Date;
		@FindBy(xpath = "//input[@id='ext-gen20']") WebElement DateField;
		@FindBy(xpath = "//div[contains(text(),'Created Date')]") WebElement CreateDate;
		@FindBy(xpath = "//img[@id='ext-gen154']") WebElement selectDate;
        @FindBy(xpath = "(//button[normalize-space()='Today'])[1]") WebElement todaydate;
        @FindBy(xpath = "(//button[normalize-space()='Save'])[1]") WebElement save3;
        @FindBy(xpath = "//input[@id='saveReportDlg_reportNameField']") WebElement reportNameField;
        @FindBy(id= "saveReportDlg_DeveloperName") WebElement DeveloperName;
        @FindBy(xpath = "//table[@id='dlgSaveReport']/tbody[1]/tr[2]/td[2]") WebElement SaveReport;

        
        
        
        public  WebElement getSaveReport() {
			 waitUntilVisible(SaveReport);
	 			return SaveReport;
	 		}
        public  WebElement getDeveloperName() {
			 waitUntilVisible(DeveloperName);
	 			return DeveloperName;
	 		}
        public  WebElement getreportNameField() {
 			return reportNameField;
 		}
        public  WebElement getsave3() {
 			return save3;
 		}
        public  WebElement gettodaydate() {
 			return todaydate;
 		}
		public  WebElement getselectDate() {
			 waitUntilVisible(selectDate);
	 			return selectDate;
	 		}
		public  WebElement getCreateDate() {
			 waitUntilVisible(DateField);
	 			return DateField;
	 		}
		 public  WebElement getDateField() {
			 waitUntilVisible(DateField);
	 			return DateField;
	 		}
		 public  WebElement getDate() {
			 waitUntilVisible(Date);
	 			return Date;
	 		}
		public  WebElement getlastactivity() {
 			return lastactivity;
 		}
		 public  WebElement getMerge() {
			 waitUntilVisible(Merge);
	 			return Merge;
	 		}
		 public  WebElement gettopButton() {
	 			return topButton;
	 		}
		  public  WebElement getBtn2() {
	 			return Btn2;
	 		}
          public  WebElement getBtn1() {
 			waitUntilVisible(Btn1);
 			return Btn1;
          }
          public  WebElement getentr() {
			waitUntilVisible(entr);
			return entr;
		}
		public  WebElement getSearch() {
			return Search;
		}
		public  WebElement getMergeAccounts() {
			waitUntilVisible(MergeAccounts);
			return MergeAccounts;
		}
		public  WebElement getValue() {
			waitUntilVisible(Value);
			return Value;
		}
		public  WebElement getEdit() {
			return Edit;
		}

		public  WebElement getSave1() {
			return Save1;
		}
		public  WebElement getfname() {
			return fname;
		}
		
		public  WebElement getCreateView() {
			return CreateView;
		}
		public  WebElement getSave() {
			return Save;
		}
		public  WebElement getacc() {
			return acc;
			}
		public  WebElement getNew() {
			return New;
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
		public void createAccount() {
			clickElement(createaccount);
		}
}
		



		
	


