/**
 * 
 */
package demopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author srinivas.godari
 * this class stores all the locators and methods of the mercury tours page
 */
public class LandinPage1 {
	WebDriver driver;
	By uname = By.name("userName");
	By pswrd = By.name("password");
	By sbmt = By.name("password"); // you can use any other location based upon the context to identify this as unique

	public LandinPage1(WebDriver driver)  // create a constructor
	{
		this.driver = driver; // the main task of this constructor is to initialize the WebDriver
		
	}
	
	public void entername()
	{
		driver.findElement(uname).sendKeys("demo");
	}
	
	public void enterpaswrd()
	{
		driver.findElement(pswrd).sendKeys("demo");
		}
	public void clicksbmt()
	{
		driver.findElement(sbmt).click();
	}
}

