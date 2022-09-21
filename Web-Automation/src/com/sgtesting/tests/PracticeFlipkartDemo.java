package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeFlipkartDemo 
{
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		CreateUser() ;
		noOfLinks() ;
		//ListOfLinks();
		ReturnPolicy();
	}
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
	public static void navigate()
	{
		try
		{
			oBrowser.get("https://www.flipkart.com/");
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public  static void CreateUser() 
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@class='_14Me7y']"))	.click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("9844107025");
			Thread.sleep(2000);
			//oBrowser.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
			//Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
			Thread.sleep(2000);
			//oBrowser.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
			//Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static void noOfLinks() 
	{
		try
		{
			List<WebElement> olinks=oBrowser.findElements(By.xpath("//*[@href]"));
			System.out.println("#of links in webpage:"+olinks.size());
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
	public static void ListOfLinks() 
	{
		try
		{
			List<WebElement> olinks=oBrowser.findElements(By.xpath("//*[@href]"));
			for(int i=0;i<olinks.size();i++)
			{
				String linkname=olinks.get(i).getText();
				System.out.println(linkname);
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
	public static void ReturnPolicy()
	{
		try
		{
			List<WebElement>olinks=oBrowser.findElements(By.xpath("//*[@href]"));
			for(int i=0;i<olinks.size();i++)
			{
				String LinkName=olinks.get(i).getText();
				if(LinkName.startsWith("Return"))
				{
					olinks.get(i).click();
					break;
				}
			}
			Thread.sleep(2000);
			oBrowser.navigate().back();
		}
		
		catch (Exception e) 
		{
		e.printStackTrace();
		}
		
	}

}
