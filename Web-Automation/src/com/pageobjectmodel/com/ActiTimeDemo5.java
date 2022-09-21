package com.pageobjectmodel.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeDemo5 

	{
		public ActiTimeDemo5(WebDriver oBrowser)
		{
			PageFactory.initElements(oBrowser, this);
		}
		private WebElement username;
		public WebElement getusername()
		{
			return username;
		}
		private WebElement pwd;
		public WebElement getpassword()
		{
			return pwd;
		}
		@FindBy(xpath="//*[@id='loginButton']/div")
		private WebElement oLogin ;
		public WebElement getLogin ()
		{
			return oLogin;
		}
		private WebElement gettingStartedShortcutsPanelId;
		public WebElement getFlyoutWindow()
		{
			return gettingStartedShortcutsPanelId;
		}
		@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")
		private WebElement oCreateCustomer;
		public WebElement getCreateCustomer()
		{
			return oCreateCustomer;
		}
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")
		private WebElement oCreateCustomer1;
		public WebElement getCreateCustomer1()
		{
			return oCreateCustomer1;
		}
		@FindBy(xpath="/html/body/div[14]/div[1]")
		private WebElement oCreateCustomer2;
		public WebElement getCreateCustomer2()
		{
			return oCreateCustomer2;
		}
		private WebElement customerLightBox_nameField;
		public WebElement getCreateCustomer3()
		{
			return customerLightBox_nameField;
		}
		private WebElement customerLightBox_descriptionField;
		public WebElement getCreateCustomer4()
		{
			return customerLightBox_descriptionField;
		}
		private WebElement customerLightBox_commitBtn;
		public WebElement getCreateCustomer5()
		{
			return customerLightBox_commitBtn;
		}
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div")
		private WebElement oCreateTask1;
		public WebElement getCreateTask1()
		{
			return oCreateTask1;
		}
		@FindBy(xpath="/html/body/div[13]/div[1]")
		private WebElement oCreateTask2;
		public WebElement getCreateTask2()
		{
			return oCreateTask2;
		}
		@FindBy(xpath="//*[@id=\'ext-comp-1037\']")
		private WebElement oCreateTask3;
		public WebElement getCreateTask3()
		{
			return oCreateTask3;
		}
		@FindBy(xpath="//*[@id=\'ext-gen174\']")
		private WebElement oCreateTask4;
		public WebElement getCreateTask4()
		{
			return oCreateTask4;
		}
		private WebElement createTasksPopup_newCustomer;
		public WebElement getCreateTask5()
		{
			return createTasksPopup_newCustomer;
		}
		private WebElement createTasksPopup_newProject;
		public WebElement getCreateTask6()
		{
			return createTasksPopup_newProject;
		}
		@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
		private WebElement oCreateTask7;
		public WebElement getCreateTask7()
		{
			return oCreateTask7;
		}
		@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[2]/td[1]/input")
		private WebElement oCreateTask8;
		public WebElement getCreateTask8()
		{
			return oCreateTask8;
		}
		private WebElement createTasksPopup_commitBtn;
		public WebElement getCreateTask9()
		{
			return createTasksPopup_commitBtn;
		}
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]")
		private WebElement oDeleteTask1;
		public WebElement getDeleteTask1()
		{
			return oDeleteTask1;
		}
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
		private WebElement oDeleteTask2;
		public WebElement getDeleteTask2()
		{
			return oDeleteTask2;
		}
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")
		private WebElement oDeletTask3;
		public WebElement getDeleteTask3()
		{
			return oDeletTask3;
		}
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
		private WebElement oDeleteTask4;
		public WebElement getDeleteTask4()
		{
			return oDeleteTask4;
		}
		@FindBy(xpath="//*[@id=\'projectPanel_deleteConfirm_submitBtn\']/div")
		private WebElement oDeleteTask5;
		public WebElement getDeleteTask5()
		{
			return oDeleteTask5;
		}
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]")
		private WebElement oDeleteTask6;
		public WebElement getDeleteTask6()
		{
			return oDeleteTask6;
		}
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		private WebElement oDeleteTask7;
		public WebElement getDeleteTask7()
		{
			return oDeleteTask7;
		}
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")
		private WebElement oDeleteTask8;
		public WebElement getDeleteTask8()
		{
			return oDeleteTask8;
		}
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
		private WebElement oDeleteTask9;
		public WebElement getDeleteTask9()
		{
			return oDeleteTask9;
		}
		@FindBy(xpath="//*[@id=\'customerPanel_deleteConfirm_submitBtn\']/div")
		private WebElement oDeleteTask10;
		public WebElement getDeleteTask10()
		{
			return oDeleteTask10;
		}
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]")
		private WebElement oDeleteCustomer1;
		public WebElement getDeleteCustomer1()
		{
			return oDeleteCustomer1;
		}
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		private WebElement oDeleteCustomer2;
		public WebElement getDeleteCustomer2()
		{
			return oDeleteCustomer2;
		}
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")
		private WebElement oDeleteCustomer3;
		public WebElement getDeleteCustomer3()
		{
			return oDeleteCustomer3;
		}
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
		private WebElement oDeleteCustomer4;
		public WebElement getDeleteCustomer4()
		{
			return oDeleteCustomer4;
		}
		@FindBy(xpath="//*[@id=\'customerPanel_deleteConfirm_submitBtn\']/div")
		private WebElement oDeleteCustomer5;
		public WebElement getDeleteCustomer5()
		{
			return oDeleteCustomer5;
		}
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")
		private WebElement oCreateProject1;
		public WebElement getCreateProject1()
		{
			return oCreateProject1;
		}
		@FindBy(xpath="//*[@id=\'ext-gen181\']/div[14]/div[2]")
		private WebElement oCreateProject2;
		public WebElement getCreateProject2()
		{
			return oCreateProject2;
		}
		private WebElement projectPopup_projectNameField;
		public WebElement getCreateProject3()
		{
			return projectPopup_projectNameField;
		}
		@FindBy(xpath="//*[@id=\'ext-gen292\']/td[2]")
		private WebElement oCreateProject4;
		public WebElement getCreateProject4()
		{
			return oCreateProject4;
		}
		@FindBy(xpath="//*[@id=\'ext-gen367\']")
		private WebElement oCreateProject5;
		public WebElement getCreateProject5()
		{
			return oCreateProject5;
		}
		private WebElement projectPopup_newCustomerNameField;
		public WebElement getCreateProject6()
		{
			return projectPopup_newCustomerNameField;
		}
		private WebElement projectDescriptionField;
		public WebElement getCreateProject7()
		{
			return projectDescriptionField;
		}
		private WebElement projectPopup_commitBtn;
		public WebElement getCreateProject8()
		{
			return projectPopup_commitBtn;
		}
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]")
		private WebElement oModifyProj1;
		public WebElement getModifyProj1()
		{
			return oModifyProj1;
			
		}
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
		private WebElement oModifyProj2;
		public WebElement getModifyProj2()
		{
			return oModifyProj2;
		}
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
		private WebElement oModifyProj3;
		public WebElement getModifyproj3()
		{
			return oModifyProj3;
		}
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]")
		private WebElement oDeleteProj1;
		public WebElement getDeleteProj1()
		{
			return oDeleteProj1;
		}
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		private WebElement oDeleteProj2;
		public WebElement getDeleteProj2()
		{
			return oDeleteProj2;
		}
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")
		private WebElement oDeletProj3;
		public WebElement getDeleteProj3()
		{
			return oDeletProj3;
		}
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
		private WebElement oDeleteProj4;
		public WebElement getDeleteProj4()
		{
			return oDeleteProj4;
		}
		@FindBy(xpath="//*[@id=\'customerPanel_deleteConfirm_submitBtn\']/div")
		private WebElement oDeleteProj5;
		public WebElement getDeleteProj5()
		{
			return oDeleteProj5;
		}
	}

	

