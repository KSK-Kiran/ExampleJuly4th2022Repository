package com.absoluteandrelativexpath.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAccessDemo 
{
	public static  WebDriver oBrowser=null;

	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		//enterTheSalaryForPersonSachinTendulkar();
		//enterSalaryForThePersonWhoIsNextToRahulDravid();
		//markTheStatusAsActiveFoFreedomFighter();
		//PersonSachinTendulkarHisPrevious2ndRecordmark();
		//BasedOnTheSalaryTextFieldOfSachinTendulkarRecordGetTheIdAttributeOfTheTable();
		basedOnTableEnterSalaryFor6thRecord();
	}
	private static void launchBrowser()
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
	private static void navigate()
	{
		try
		{
			oBrowser.get("file:///D:/WebTableHTML.html");
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/*
	 * case1:following-sibling
	 * Enter the salary for the Person sachinTendulkar
	 */
	private static void enterTheSalaryForPersonSachinTendulkar()
	{
		try
		{
			oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("2500000");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following-sibling::td[3]/input")).sendKeys("25000");
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/*
	 * case2:Following
	 * enter the salary for the Person next to RahulDravid
	 */
	private static void enterSalaryForThePersonWhoIsNextToRahulDravid()
	{
		try
		{
			oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[1]/td[6]/input")).sendKeys("120000");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[1]/td[1]/input")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/following::tr[1]/td[1]/input")).click();
			Thread.sleep(2000);
		}

		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	/*
	 * case3:preceding-sibling
	 * mark the status as active for Indian Freedom Fighter
	 */
	
	private static void markTheStatusAsActiveFoFreedomFighter()
	{
		try
		{
			oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//td[text()='Indian Cricketer']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/*
	 * case4:preceding
	 * From Person Sachin Tendulkar his Previous 2nd Record Mark the Status as Achive 
	 */
	private static void PersonSachinTendulkarHisPrevious2ndRecordmark()
	{
		try
		{
			oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[1]/preceding::tr[1]/td[1]/input")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//td[text()='Indian Politician']/preceding::tr[1]/preceding::tr[1]/td[6]/input")).sendKeys("25222000");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/preceding::tr[1]/preceding::tr[1]/td[6]/input")).sendKeys("1235000");
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/*
	 * case5:Ancestor
	 * Based on the salary text field of Sachin Tendulkar record get the idAttribute of the Table
	 */
	private static void BasedOnTheSalaryTextFieldOfSachinTendulkarRecordGetTheIdAttributeOfTheTable()
	{
		try
		{
			WebElement oEl=oBrowser.findElement(By.xpath("//input[@id='edit5']/ancestor::td/ancestor::tr/ancestor::table"));
			String val=oEl.getAttribute("id");
			System.out.println(val);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
		/*
		 * case6:Descendant
		 * Based on the table entry the salary for 6th Record
		 */
		private static void basedOnTableEnterSalaryFor6thRecord()
		{
			try
			{
				oBrowser.findElement(By.xpath("//table/descendant::tr[6]/td[6]/input")).sendKeys("120012");
				Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//table/descendant::tr[4]/td[1]/input")).click();
			Thread.sleep(2000);
		}
			catch (Exception e)
			{
			e.printStackTrace();
		}
	}
}
