package com.automationAspireportal.helper;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationAspireportal.utils.ReadExcel;
import com.automationAspireportal.utils.ReadTimesheetModuleLocators;

public class EmployeePageHelper 
{
	WebDriver driver;
	ReadTimesheetModuleLocators read=new ReadTimesheetModuleLocators();
	ReadExcel excel= new ReadExcel(0);
	public EmployeePageHelper(WebDriver driver)
	{
		this.driver = driver;
	}

	public void employeeHelper() throws InterruptedException 
	{
		EmployeeloginHelper helper=new EmployeeloginHelper(driver);
		helper.employeelogin();
		driver.findElement(By.xpath(read.slectActivity())).click();
		driver.findElement(By.xpath(read.activity())).click();
		driver.findElement(By.xpath(read.clickonMonday())).sendKeys(excel.Workinghour());
		driver.findElement(By.xpath(read.clickonTuesday())).sendKeys(excel.Workinghour());
		driver.findElement(By.xpath(read.clickonwednesday())).sendKeys(excel.Workinghour());
		driver.findElement(By.xpath(read.clickonThursday())).sendKeys(excel.Workinghour());
		driver.findElement(By.xpath(read.clickonFriday())).sendKeys(excel.Workinghour());
		driver.findElement(By.xpath(read.clickonNotes())).click();
		driver.findElement(By.xpath(read.giveNotes())).sendKeys("Thank you Sir");
		Thread.sleep(2000);
		driver.findElement(By.xpath(read.clickcheck())).click();
//		driver.findElement(By.xpath(read.clickonAddactivity())).click();
//		driver.findElement(By.xpath(read.deleteactivity())).click();
		//driver.findElement(By.xpath(read.saveTimesheet())).click();	
		//Thread.sleep(2000);
		driver.findElement(By.xpath(read.submit())).click();
		Thread.sleep(2000);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		Thread.sleep(2000);


	}

}
