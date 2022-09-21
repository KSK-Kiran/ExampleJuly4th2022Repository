package com.testngassignmment.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment3 
{
	public static WebDriver oBrowser=null;
	@Test(priority=1)
	public static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 2)
	private static void navigate()
	{
		try
		{
			String expected,actual;
			expected= "actiTIME - Login";
			oBrowser.get("http://localhost:8082/login.do");
			Thread.sleep(2000);
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected,actual);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 3,dataProvider = "getcredentials")
	private static void login(String user,String password)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@name='username']")).sendKeys(user);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@name='pwd']")).sendKeys(password);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
	@DataProvider
	public Object[][] getcredentials()
	{
		return new Object[][] {{"admin","manager"}};
	}
	@Test(priority = 4)
	private static void minimizeFlyoutWindow()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@class='gettingStartedShortcutsLabel']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 7)
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 8)
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 5)
	private static void createCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@class='content tasks']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@class='addNewButton']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@class='item createNewCustomer ellipsis']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_nameField']")).sendKeys("DEMOUSER");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_descriptionField']")).sendKeys("DEMOCUSTOMER");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 6)
	private static void deleteCustomer()
	{
		try
		{
			//oBrowser.findElement(By.xpath("//*[@class='placeholder bottom']")).click();
			//Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@class='editButton available']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@class='actionButton']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[text()='Delete permanently']")).click();
			Thread.sleep(2000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}


