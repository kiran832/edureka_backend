package TestNGdemos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
public class LinkedIn {

	WebDriver driver;

	@BeforeTest
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
	}
	@Test
	public void signCheckindisable()
	{
		boolean signind = driver.findElement(By.id("login-submit")).isEnabled();
		Assert.assertFalse(signind);
	}
	@Test
	public void signCheckvisible()
	{
		boolean signinv = driver.findElement(By.id("login-submit")).isDisplayed();
		Assert.assertTrue(signinv);
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}


}
