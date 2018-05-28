package com.demoaut.newtours.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinder 
{

	@FindBy(xpath="//b/font/input[2]")
	private WebElement oneway;
	@FindBy(name="airline")
	private WebElement nameairline;
	@FindBy(name="findFlights")
	private WebElement continue1;
	public FlightFinder(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	
	public void findflight()
	{
		oneway.click();
		Select drpdwn = new Select(nameairline);
		drpdwn.selectByIndex(2);
		continue1.click();

	}
}
