package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {
	
	
	public static void main(String[] args) {
		
		
		//browser config
		System.setProperty("webdriver.chrome.driver", "C:/Users/User/Desktop/selenium/SeleniumGB3/drivers/chromedriver.exe");
		
		//webdriver init
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
		
		
		
	}

}
