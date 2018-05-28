package TestNGdemos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DiffBrowser {
	WebDriver driver;
	@Test
	public void mozillaCheck()
	{

		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.linkedin.com/");

	}
	/* @Test
	public void chromeCheck()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
	}*/
}
