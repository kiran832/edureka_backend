package TestNGdemos;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class NewTours 
{
	WebDriver driver;
	@BeforeTest
	public void opennewTours()
	{
		/*System.setProperty("WebDriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();*/
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();

	}
	@Test
	public void workingonNewTours() throws IOException
	{   
		try{
		driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/input")).sendKeys("mercury");
		driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]/input")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//b/font/input[2]")).click();
		Select airlineSelector = new Select(driver.findElement(By.name("airline")));
		airlineSelector.selectByIndex(1);
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("Tester");
		driver.findElement(By.name("passLast0")).sendKeys("Lasty");
		driver.findElement(By.name("buyFlights")).click();
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
	/*private Select Select(WebElement findElement) {
		// TODO Auto-generated method stub
		return null;
	}*/
	@AfterTest
	public void closingNewTours()
	{
		String Finalmsg = driver.findElement(By.xpath("//tr[3]/td/p/font/b/font[2]")).getText();
		System.out.println(Finalmsg);
		driver.close();
	}

}
