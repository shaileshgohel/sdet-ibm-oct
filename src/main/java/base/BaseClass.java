package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver; 
	
	public void getDriver() {
		driver = new ChromeDriver();
	}

}
