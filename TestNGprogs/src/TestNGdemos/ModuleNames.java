package TestNGdemos;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ModuleNames {

	WebDriver driver;

	@Test
	public void loginacc() throws InterruptedException, FindFailed
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.edureka.co/");
		//driver.findElement(By.className("signin pull-right top-signin")).click();
		//driver.findElement(By.className("//a[2][@class='signin pull-right top-signin']")).click();

		driver.findElementByCssSelector("#header-II > section > nav > div > a.signin.pull-right.top-signin").click();
		driver.manage().window().maximize();
		driver.findElement(By.id("inputName")).sendKeys("kiran.kumar@edureka.co");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("pwd1")).sendKeys("Edureka9040");

		driver.findElement(By.xpath("//button[contains(text(),'START LEARNING')]")).click(); // Clicks on Start Learning on Login Pop-up
		Thread.sleep(5000);
		driver.findElement(By.id("homeSearchBar")).sendKeys("Sel"); // Typing Sel & to wait for suggestions for Selenium Course
		
        driver.findElement(By.xpath("//*[text()='enium 3.0 Certification Training ']")).click(); // Find the Selenium Text
        
        JavascriptExecutor jse = (JavascriptExecutor)driver; // Declaring JavaScript Executor
        jse.executeScript("window.scrollBy(0,250)", "");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='Batches']/div/div[2]/div[2]/a/button")).click(); // Click on Start Learning in CLP
        
        //driver.findElement(By.cssSelector("#footauto > app-root > app-curriculum-main > section.container-fluid.maincurriculumsec > div > div > app-curriculum-leftnav > div > ul > li:nth-child(4) > a")).click();
        
        Screen s = new Screen();
        Pattern m1 = new Pattern("D:\\Automation\\Course Content.PNG");
        
        s.click(m1);
		//driver.findElement(By.id("search-inp")).click();
		//System.out.println("TS");

	}
	/* @Test (dependsOnMethods = {"loginacc"})
	public void verifyText() 
	{   
		//ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.findElement(By.id("//*[@id='mat-tab-label-0-1']")).click(); // Clicking on No.1
	   
	    String actualm1name = driver.findElement(By.xpath("//*[@id='mat-tab-content-0-0']/div/div/h2/span[2]")).getText(); // Getting Text from M1
		String expectedm1name="Introduction to Selenium and its Components";
		Assert.assertEquals(actualm1name, expectedm1name);
	} */
    @AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}



