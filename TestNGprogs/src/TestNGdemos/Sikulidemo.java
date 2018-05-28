package TestNGdemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Sikulidemo {
	
	@Test
	public void youTubetest() throws FindFailed, InterruptedException 
	{ 
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.youtube.com/watch?v=nRbmUouN1F0");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		 Thread.sleep(5000);
		 Screen s = new Screen();
		 Pattern pause = new Pattern("D:\\Programs\\TestNGprogs\\sikuli\\pause.PNG");
		 s.click(pause);
		 
	
	     
	     
	}

}
