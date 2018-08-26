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
    String paltform = System.getProperty("platform","url1");
    if(paltform.contains("url1"))
    {
	driver.get("http://www.facebook.com");
    }
    else if (paltform.contains("url2"))
    {
    	driver.get("http://www.facebook.com");
    }
	//System.out.println("doing the branch commit");

	driver.quit();

	}

}
