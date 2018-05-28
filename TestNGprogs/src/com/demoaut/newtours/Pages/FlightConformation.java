package com.demoaut.newtours.Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightConformation {
	
	@FindBy(xpath="//tbody/tr[3]/td/p/font/b/font[2]")
	private WebElement actualmsg;
	
	
	String expectedmsg = "Your itinerary has been booked!";
	
	public FlightConformation(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	
	public void ConformationFlight()
	{
		String am = actualmsg.getText();
		Assert.assertEquals(expectedmsg, am);
	}
	

}
