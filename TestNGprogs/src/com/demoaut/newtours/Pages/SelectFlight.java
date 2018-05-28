package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight {

	@FindBy(xpath="//table[1]/tbody/tr[5]/td[1]/input")
    private WebElement seldepart;
	@FindBy(xpath="//table[2]/tbody/tr[5]/td[1]/input")
    private WebElement selreturn;
	@FindBy(name="reserveFlights")
	private WebElement continue2;
	public SelectFlight(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	
	public void flightSelect()
	{
		seldepart.click();
		selreturn.click();
		continue2.click();
	}
}
