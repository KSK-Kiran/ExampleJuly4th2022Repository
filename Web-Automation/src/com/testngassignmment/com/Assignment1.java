package com.testngassignmment.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment1 
{
	public static WebDriver oBrowser=null;
	public static String firstName="Kiran";
	public static String lastName="Hassan";

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
	private static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@class='content users']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@class='addUserButton beigeButton useNativeActive']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//input[@name='firstName']")).sendKeys("USER1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//input[@name='lastName']")).sendKeys("DEMO1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//input[@id='userDataLightBox_emailField']")).sendKeys("Demouser11@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//input[@id='userDataLightBox_usernameField']")).sendKeys("DemoUser");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//input[@name='password']")).sendKeys("manager123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("manager123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 6)
	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@class='userNameCell first']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
			Alert oalert=oBrowser.switchTo().alert();
			String content=oalert.getText();
			System.out.println(content);
			oalert.accept();
			Thread.sleep(2000);
		}catch (Exception e)
		{
		 e.printStackTrace();
		}
	}
}
