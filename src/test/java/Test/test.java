package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {
	
	@Test
	public void TestFireFox(){
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("http://www.facebook.com");

	driver.quit();

	}

}
