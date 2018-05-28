package TestNGdemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class VerifyTitle {
	WebDriver driver;

	@BeforeTest

	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void verifyTitle()
	{
		String expectedTitle = "Facebook – log in or sign up";
	    String actualTitle = driver.getTitle();
	    Assert.assertEquals(actualTitle, expectedTitle);
	    System.out.println("Actual Title and Expected Title are same");
	}

	@AfterTest
    public void closeBrowser(){
		driver.close();
	}

}
