package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(name="userName")
	private WebElement user;
	
	@FindBy(name="password")
	private WebElement ps;
	
	@FindBy(name="login")
	private WebElement Submit;
	public Login(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	
	public void applnlogin(String username , String password){
		user.sendKeys(username);
		ps.sendKeys(password);
		Submit.click();
		
	}
	

}
