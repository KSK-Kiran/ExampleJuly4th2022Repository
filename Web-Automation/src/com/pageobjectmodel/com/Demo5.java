package com.pageobjectmodel.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 
{
	public static WebDriver oBrowser=null;
	public static ActiTimeDemo5 oPage=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
		createCustomer();
		createTask();
		deleteTask();
		deleteCustomer();
		createProject();
		modifyProject();
		deleteProject();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimeDemo5(oBrowser);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{

			oBrowser.navigate().to("http://localhost:8082/login.do");
			Thread.sleep(2000);
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

			oPage.getusername().sendKeys("admin");
			oPage.getpassword().sendKeys("manager");
			oPage.getLogin().click();
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
			oPage.getFlyoutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createCustomer()
	{
		try
		{
			oPage.getCreateCustomer().click();
			Thread.sleep(2000);
			oPage.getCreateCustomer1().click();
			Thread.sleep(2000);
			oPage.getCreateCustomer2().click();
			Thread.sleep(2000);
			oPage.getCreateCustomer3().sendKeys("BSS");
			Thread.sleep(2000);
			oPage.getCreateCustomer4().sendKeys("WORTH OF THE PROJECT");
			Thread.sleep(2000);
			oPage.getCreateCustomer5().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
			
		}
	private static void createTask()
	{
		try
		{
			oPage.getCreateTask1().click();
			Thread.sleep(2000);
			oPage.getCreateTask2().click();
			Thread.sleep(2000);
			oPage.getCreateTask3().click();
			Thread.sleep(2000);
			oPage.getCreateTask4().click();
			Thread.sleep(2000);
			oPage.getCreateTask5().sendKeys("KSS");
			Thread.sleep(2000);
			oPage.getCreateTask6().sendKeys("VCK");
			Thread.sleep(2000);
			oPage.getCreateTask7().sendKeys("Task1");
			Thread.sleep(2000);
			oPage.getCreateTask8().sendKeys("Task2");
			Thread.sleep(2000);
			oPage.getCreateTask9().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteTask()
	{
		try
		{
			oPage.getDeleteTask1().click();
			Thread.sleep(2000);
			oPage.getDeleteTask2().click();
			Thread.sleep(2000);
			oPage.getDeleteTask3().click();
			Thread.sleep(2000);
			oPage.getDeleteTask4().click();
			Thread.sleep(2000);
			oPage.getDeleteTask5().click();
			Thread.sleep(2000);
			oPage.getDeleteTask6().click();
			Thread.sleep(2000);
			oPage.getDeleteTask7().click();
			Thread.sleep(2000);
			oPage.getDeleteTask8().click();
			Thread.sleep(2000);
			oPage.getDeleteTask9().click();
			Thread.sleep(2000);
			oPage.getDeleteTask10().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteCustomer()
	{
		try
		{
			oPage.getDeleteCustomer1().click();
			Thread.sleep(2000);
			oPage.getDeleteCustomer2().click();
			Thread.sleep(2000);
			oPage.getDeleteCustomer3().click();
			Thread.sleep(2000);
			oPage.getDeleteCustomer4().click();
			Thread.sleep(2000);
			oPage.getDeleteCustomer5().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createProject()
	{
		try
		{
			oPage.getCreateProject1().click();
			Thread.sleep(2000);
			oPage.getCreateProject2().click();
			Thread.sleep(2000);
			oPage.getCreateProject3().sendKeys("CFFE");
			Thread.sleep(2000);
			oPage.getCreateProject4().click();
			Thread.sleep(2000);
			oPage.getCreateProject5().click();
			Thread.sleep(2000);
			oPage.getCreateProject6().sendKeys("PLAN");
			Thread.sleep(2000);
			oPage.getCreateProject7().sendKeys("Worth of the Project should be More");
			Thread.sleep(2000);
			oPage.getCreateProject8().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyProject()
	{
		try
		{
			oPage.getModifyProj1().click();
			Thread.sleep(2000);
			oPage.getModifyProj2().click();
			Thread.sleep(2000);
			oPage.getModifyproj3().clear();
			oPage.getModifyproj3().sendKeys("Wort Should  not Exceed as Estimated");
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteProject()
	{
		try
		{
			oPage.getDeleteProj1().click();
			Thread.sleep(2000);
			oPage.getDeleteProj2().click();
			Thread.sleep(2000);
			oPage.getDeleteProj3().click();
			Thread.sleep(2000);
			oPage.getDeleteProj4().click();
			Thread.sleep(2000);
			oPage.getDeleteProj5().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
