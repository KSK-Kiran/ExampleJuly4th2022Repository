package com.pageobjectmodel.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeDemo2 
{

	public  ActiTimeDemo2(WebDriver oBrowser)

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
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")
	private WebElement CreateUser;
	public WebElement getCreateUser()
	{
		return CreateUser;
	}
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div")
	private  WebElement AddUser;
	public WebElement getAddUser()
	{
		return AddUser;
	}
	private WebElement firstName;
	public WebElement getfirstName()
	{
		return firstName;
	}
	private WebElement lastName;
	public WebElement getlastName()
	{
		return lastName;
	}
	private WebElement email;
	public WebElement getemail()
	{
		return email;
	}
	private WebElement username1;
	public WebElement getuserName()
	{
		return username;
	}

	private WebElement password;
	public WebElement getpassword1()
	{
		return password;
	}

	private WebElement passwordCopy;
	public WebElement getpasswordCopy()
	{
		return passwordCopy;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']")
	private WebElement ocreateUser;
	public WebElement getCreateUser1()
	{
		return ocreateUser;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[3]/span")
	private WebElement oModifyUser;
	public WebElement getModifyUser()
	{
		return oModifyUser;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")
	private WebElement oClickModifyUser;
	public WebElement getClickModifier()
	{
		return oClickModifyUser;
	}
	private WebElement firstName1;
	public WebElement getModify()
	{
		return firstName;
	}
	private WebElement email1;
	public WebElement getModify1()
	{
		return email;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div")
	private WebElement oSelectModify;
	public WebElement getSelectModify()
	{
		return oSelectModify;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")
	private WebElement UserButton;
	public WebElement getUserButton()
	{
		return UserButton;
	}
	
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getDeleteButton()
	{
		return userDataLightBox_deleteBtn;
	}
	private WebElement logoutLink;
	public WebElement  getlogoutLink()
	{
		return logoutLink;
	}
}



