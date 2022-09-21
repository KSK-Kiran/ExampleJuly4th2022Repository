package com.absoluteandrelativexpath.com;



import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo 
{
	public static WebDriver oBrowser=null;

	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		ablosuteXpath();
		//getLinks();
		//getlinks_1();
		//getLinks_2();
		//relativeXpathUsingTextContent();
		//relativeXpathUsingPartialMatchingOfTextContent();
		//relativeXpathSelectCheckBox();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser= new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("file:///D:/Sample.html");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void ablosuteXpath()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input")).sendKeys("Demo");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//input[2]")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//input[3]")).click();
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void getLinks()
	{
		try
		{
			List<WebElement>olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			System.out.println("# of links in WebPage:"+olinks.size());

		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void getlinks_1()
	{
		//perform click operation
		try
		{
			List<WebElement>oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0;i<oLinks.size();i++)
			{
				String linName=oLinks.get(i).getText();
				if(linName.endsWith("HQ"))
				{
					oLinks.get(i).click();
					break;
				}
			}
			Thread.sleep(2000);
			oBrowser.navigate().back();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void getLinks_2()
	{
		try
		{
			List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0;i<olinks.size();i++)
			{
				String linkName=olinks.get(i).getText();
				if(linkName.endsWith("HQ"))
				{
					olinks.get(i).click();
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
	private static void relativeXpathUsingTextContent()
	{
		try
		{
			oBrowser.findElement(By.xpath("//a[text()='POI Apache']")).click();
			Thread.sleep(2000);
			oBrowser.navigate().back();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void relativeXpathUsingPartialMatchingOfTextContent()
	{
		try
		{
			oBrowser.findElement(By.xpath("//a[starts-with(text(),'POI')]")).click();
			Thread.sleep(2000);
			oBrowser.navigate().back();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void relativeXpathSelectCheckBox()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='chk1windows']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='chk2linux']")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
