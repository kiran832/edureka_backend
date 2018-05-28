package com.demoaut.newtours.Testscripts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.Login;

import reporter.JyperionListener;

@Listeners(JyperionListener.class)
public class InvalidUser extends BaseTest
	{
		
		@Test
		public void userValidation()
		{
			Login lp = new Login(driver);
			lp.applnlogin("osd", "mercury");
			boolean signon = driver.findElement(By.linkText("SIGN-ON")).isDisplayed();
			Assert.assertTrue(signon);
			
		}
		
	}


