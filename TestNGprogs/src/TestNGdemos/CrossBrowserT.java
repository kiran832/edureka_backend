package TestNGdemos;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserT {
	WebDriver driver;
 
	
	@BeforeTest
	@Parameters("browser")
	public void openBrowser(String browser)
	{
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "./driver/MicrosoftWebDriver.exe");
			driver=new EdgeDriver();
		}

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
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
	@Test //@Test(enabled=false) For Skkipping the test case
	public void verifyText2() throws IOException 
	{ 
		try{
			boolean textpresent = driver.getPageSource().contains("Create an account");
			Assert.assertTrue(textpresent);
		}
		catch(Exception e)
		{
			takescreenshot();
		}
	}
	private void takescreenshot() throws IOException 
	{
		//File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(ss,new File("C:\\Users\\kiran\\Pictures\\Sel\\S1S"+(new Random().nextInt())+".jpg"));
			File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(ss, new File("D:\\Ses"+(new Random().nextInt()) +".jpg"));

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
