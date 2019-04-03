package Sample;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Solution {

	public static void main(String[] args) {
		
		WebDriver driver =null;
		
		//configuring your browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\selenium\\SeleniumGB3\\drivers\\chromedriver.exe");
	
	//intializing your webdriver
	 driver = new ChromeDriver();
	
	
	//launching url
	driver.get("https://www.kvb.co.in/");
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebElement closebutton = driver.findElement(By.xpath("//div[@id='applyNow']//*[@class='close']"));
	
	
	
	
	WebElement visible = driver.findElement(By.xpath("(//div[@class='modal-body'])[4]"));
	
	

	
	
	closebutton.click();
	
	WebDriverWait wait = new WebDriverWait(driver, 40);
	
	wait.until(ExpectedConditions.visibilityOf(visible));
	
	closebutton.click();
	
	Actions acc = new Actions(driver);
	
	
	acc.moveToElement(driver.findElement(By.xpath("//*[@class='fa fa-user']"))).perform();
	
	}
	
}
