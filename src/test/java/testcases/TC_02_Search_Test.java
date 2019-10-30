package testcases;
import org.openqa.selenium.WebDriver;

import pages.LandingPage;
import utilties.MyDriver;

public class TC_02_Search_Test {
    static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		search_check();
	}
	
	public static void search_check()
	{
		driver = MyDriver.getDriver("chrome");
		driver.get("http://www.google.com");
		LandingPage.Search_Box(driver).sendKeys("Accenture");
		LandingPage.Search_button(driver).click();
		
	}

}
