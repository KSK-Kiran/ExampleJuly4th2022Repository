package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogoutFirefoxDemo 
{
	public static WebDriver oBrowser=null;

	public static void main(String[] args) 
	{
		launchProgram();
		navigate();
		login();
		minimizeFlyoutWindow();
		logOut();
		close();
	}
	private static void launchProgram()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
		}
		catch(Exception e)
		{
			e.printStackTrace();

		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:8082/login.do");
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.cssSelector("#loginButton > div:nth-child(1)")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyoutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logOut()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void close()
	{
		try 
		{
		oBrowser.close();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
