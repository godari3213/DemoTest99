package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

//	Type 1:
	public static WebElement Search_Box(WebDriver driver) {
		
		WebElement element =driver.findElement(By.name("q"));
		return element;

	}
    public static WebElement Search_button(WebDriver driver) {
		
		WebElement element =driver.findElement(By.name("btnK"));
		return element;

	}
	
//	Type 2:
	
//	static WebElement element = null;
//		public static WebElement Search_Box(WebDriver driver) {
//		
//		element =driver.findElement(By.name("q"));
//		return element;
//
//	}
//    public static WebElement Search_button(WebDriver driver) {
//		
//		element =driver.findElement(By.name("btnK"));
//		return element;
//
//	}

}
