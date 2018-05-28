package TestNGprogs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class STMSikuli {

	@Test
	public void facebookLogin() throws FindFailed{
		
	// Creating Object of 'Screen' class
	//Screen is a base class provided by Sikuli. It allows us to access all the methods provided by Sikuli.
	Screen screen = new Screen();
	// Creating Object of Pattern class and specify the path of specified images
	// I have captured images of Facebook Email id field, Password field and Login button and placed in my local directory
	// Facebook user id image 
	Pattern username = new Pattern("C:\\Users\\admin\\Desktop\\Sikuli Images For Selenium\\FacebookEmail.png");
	// Facebook password image
	Pattern password = new Pattern("C:\\Users\\admin\\Desktop\\Sikuli Images For Selenium\\FacebookPassword.png");
	// Facebook login button image
	Pattern login = new Pattern("C:\\Users\\admin\\Desktop\\Sikuli Images For Selenium\\FacebookLogin.png");
	// Initialization of driver object to launch firefox browser 
	
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	 ChromeDriver driver = new ChromeDriver();
	// To maximize the browser
	driver.manage().window().maximize();
	// Open Facebook
	driver.get("https://en-gb.facebook.com/");
	screen.wait(username, 10);	 
	// Calling 'type' method to enter username in the email field using 'screen' object
	screen.type(username, "softwaretestingmaterial@gmail.com");
	// Calling the same 'type' method and passing text in the password field
	screen.type(password, "softwaretestingmaterial");
	// This will click on login button
	screen.click(login);
	}
 
}