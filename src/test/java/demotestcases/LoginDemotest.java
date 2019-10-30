package demotestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import demoUtiliites.Driver5419;
import demopages.LandinPage1;
public class LoginDemotest {
	WebDriver driver;
  @Test
  public void f() {
	  driver = Driver5419.getDriver("chrome");
	  driver.get("http://www.newtours.demoaut.com");
	  LandinPage1 obj1 = new LandinPage1(driver);
	  obj1.entername();
	  obj1.enterpaswrd();
	  obj1.clicksbmt();
  }
}
