package Sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lvb {
	
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:/Users/User/Desktop/selenium/SeleniumGB3/drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		
		driver.manage().window().maximize();
		
		String parentWindow = driver.getWindowHandle();
		
		//erc432
		
		System.out.println(parentWindow);
	
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//a[@class='link3a'])[2]")).click();
		
		Set<String> childWindow = driver.getWindowHandles();
		//erc432,zx123
		
		for(String wind : childWindow)
		{
			System.out.println("Child window id's"+wind);
		}
		
		for(String window : childWindow)
		{
			//zx123    erc432
			if(!window.equals(parentWindow))
			{
				driver.switchTo().window(window);
				
				System.out.println(driver.getTitle());
				
				driver.findElement(By.xpath("//a[contains(text(),'Reset Login password')]")).click();
			}
		}
		
		
		driver.switchTo().window(parentWindow);
		
		System.out.println(driver.getTitle());
		
	}

}
