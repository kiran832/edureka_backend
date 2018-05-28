package TestNGdemos;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class FbValidations {

	WebDriver driver;

	@BeforeTest
	public void openBrowser()
	{
		/*
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		 */
		/* ChromeOptions options =  new ChromeOptions(); / Browser Profiling/
		options.addArguments("--disable-notifications"); */

		System.setProperty("webdriver.edge.driver", "./driver/MicrosoftWebDriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void verifyTitle()
	{
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		//System.out.println("Actual Title and Expected Title are same");
	}
	@Test
	public void verifyText1()
	{
		String expectedText="Facebook helps you connect and share with the people in your life.";
		String actualText=driver.findElement(By.cssSelector("#content > div > div > div > div > div.lfloat._ohe > div > div")).getText();
		Assert.assertEquals(actualText, expectedText);
		//System.out.println("Actual Text and Expected Text are same");

	}
	@Test
	public void verifyText2()
	{
		boolean textpresent = driver.getPageSource().contains("Create an account");
		Assert.assertTrue(textpresent);
	}
	@Test(priority=0)
	public void verifyRadiobuton()
	{
		boolean radiobuton = driver.findElement(By.id("u_0_c")).isSelected();
		Assert.assertFalse(radiobuton);
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}



}
