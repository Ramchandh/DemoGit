package Sample;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class WebTable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/User/Desktop/selenium/SeleniumGB3/drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Wait<WebDriver> gWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(100))
		        .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);	
		
		
		driver.get("https://www.toolsqa.com/automation-practice-table/");
	
		List<WebElement> tableROw = driver.findElements(By.tagName("tr[1]"));
		
		
	WebElement element = gWait.until(new function)
		
		for(int i=0;i<=tableROw.size();i++)
		{
			
			System.out.println(tableROw.get(i).getText());
			
			List<WebElement> tableData = driver.findElements(By.tagName("td"));
			
				for(int j = 0;j<=tableData.size();j++)
				{
					System.out.println(tableData.get(j).getText());
				}
		}
		
		
		
	}
	

}
