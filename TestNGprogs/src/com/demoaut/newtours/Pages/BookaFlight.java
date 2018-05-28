package com.demoaut.newtours.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookaFlight {
	
	/*driver.findElement(By.name("passFirst0")).sendKeys("Tester");
	driver.findElement(By.name("passLast0")).sendKeys("Lasty");
	driver.findElement(By.name("buyFlights")).click();*/
	
	@FindBy(name="passFirst0")
	private WebElement fname;
	
	@FindBy(name="passLast0")
	private WebElement lname;
	
	@FindBy(name="buyFlights")
	private WebElement securepurchase;
	public BookaFlight(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	
	public void Flightabook()
	{
		fname.sendKeys("Automation");
		lname.sendKeys("Testing");
		securepurchase.click();
	}
	
}
