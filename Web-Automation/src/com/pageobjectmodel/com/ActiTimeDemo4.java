package com.pageobjectmodel.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeDemo4 
{
	public ActiTimeDemo4(WebDriver oBrowser)
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
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr/td[3]/a")
	private WebElement oTask;
	public WebElement getTask()
	{
		return oTask;
	}
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")
	private WebElement oAddcustomer;
	public WebElement getAddcustomer()
	{
		return oAddcustomer;
	}
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement oAddNewCustomer;
	public WebElement getAddNewCustomer()
	{
		return oAddNewCustomer;
	}
	private WebElement customerLightBox_nameField;
	public WebElement getCustomerName()
	{
		return customerLightBox_nameField;
	}
	private WebElement customerLightBox_descriptionField;
	public WebElement getProjectDetail()
	{
		return customerLightBox_descriptionField;
	}
	private WebElement customerLightBox_commitBtn;
	public WebElement getCreatCustomer()
	{
		return customerLightBox_commitBtn;
	}
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]")
	private WebElement oModifyCustomer;
	public WebElement getModifyCustomer()
	{
		return oModifyCustomer;
	}
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement oEdditButton;
	public WebElement getEditButton()
	{
		return oEdditButton;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement oEditReq;
	public WebElement getEditReq()
	{
		return oEditReq;
	}
	/*private WebElement oClick;
	public WebElement getClick()
	{
		return oClick;
	}*/
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement oEdit;
	public WebElement getEdit()
	{
		return oEdit;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")
	private WebElement oEditButton;
	public WebElement getEditButton1()
	{
		return oEditButton;
	}
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")
	private WebElement oDelete;
	public WebElement getDelete()
	{
		return oDelete;
	}
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")
	private WebElement oDeletebutton;
	public WebElement getDeleteButton()
	{
		return oDeletebutton;
	}
	@FindBy(xpath="//*[@id=\'customerPanel_deleteConfirm_submitBtn\']/div")
	private WebElement oDeleteCustomer;
	public WebElement getDeleteCustomer()
	{
		return oDeleteCustomer;
	}
	private WebElement logoutLink;
	public WebElement  getlogoutLink()
	{
		return logoutLink;
	}
}



