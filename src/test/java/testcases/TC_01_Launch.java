package testcases;

import org.openqa.selenium.WebDriver;

import utilties.MyDriver;

public class TC_01_Launch {
     static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
	}
		public static void launch()
		{
			driver = MyDriver.getDriver("chrome");
			driver.get("http://www.facebook.com");
			
		}

	

}
