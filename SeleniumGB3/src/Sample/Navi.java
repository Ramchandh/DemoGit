package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Navi {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/User/Desktop/selenium/SeleniumGB3/drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		//driver.get("");
		
	driver.navigate().to("https://www.facebook.com/");
//		
//		
//		driver.navigate().refresh();
//		
//		driver.navigate().to("https://twitter.com/login?lang=en");
//		
//		driver.navigate().back();
		
		
		WebElement ddnDay = driver.findElement(By.id("day"));

		Select s = new Select(ddnDay);
		
		s.selectByVisibleText("4");
		
		WebElement ddnMonth = driver.findElement(By.id("month"));
		
		Select s1 = new Select(ddnMonth);
		
		s1.selectByValue("10");
		
		WebElement ddnYear = driver.findElement(By.id("year"));
		
	Select s2 = new Select(ddnYear);

	s2.selectByIndex(4);
	
	

		
		
	}

}
