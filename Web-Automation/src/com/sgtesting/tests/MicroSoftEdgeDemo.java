package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MicroSoftEdgeDemo 
{
public static  WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		closeBrowser();

	}
	public static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.edge.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\msedgedriver.exe");
		    oBrowser=new EdgeDriver();
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
			oBrowser.get("https://www.facebook.com/home.php");
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeBrowser()
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
