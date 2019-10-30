package utilties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriver {


		public static WebDriver getDriver(String browser) {
			if(browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C:\\Drivers\\Drivers\\chromedriver.exe");
				return new ChromeDriver();
			}
			else if (browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C:\\Drivers\\Drivers\\chromedriver.exe");
				return new ChromeDriver();
			}
			else if  (browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C:\\Drivers\\Drivers\\chromedriver.exe");
				return new ChromeDriver();
			}
			else
				return null;
	
		}
}
