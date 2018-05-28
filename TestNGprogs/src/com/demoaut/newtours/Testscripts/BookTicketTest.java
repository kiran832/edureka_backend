package com.demoaut.newtours.Testscripts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.demoaut.newtours.Pages.BookaFlight;
import com.demoaut.newtours.Pages.FlightConformation;
import com.demoaut.newtours.Pages.FlightFinder;
import com.demoaut.newtours.Pages.Login;
import com.demoaut.newtours.Pages.SelectFlight;

import reporter.JyperionListener;

@Listeners(JyperionListener.class)
public class BookTicketTest extends BaseTest{

	
	@Test
	public void ticketbookingTest()
	{

		Login t01 = new Login(driver);
		t01.applnlogin("mercury", "mercury");
		FlightFinder t02 = new FlightFinder(driver);
		t02.findflight();
		SelectFlight t03 = new SelectFlight(driver);
		t03.flightSelect();
		BookaFlight t04 = new BookaFlight(driver);
		t04.Flightabook();	 
		FlightConformation t05 = new FlightConformation(driver);
		t05.ConformationFlight();

	}

}
