package Sample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitss {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/User/Desktop/selenium/SeleniumGB3/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.toolsqa.com/automation-practice-form/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement emailTextbox = driver.findElement(By.id("email"));

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOf(emailTextbox));
	
		
//		Wait<WebDriver> gWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(100))
//		        .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);	
		
		
		Wait wait  = new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		
		
		emailTextbox.sendKeys("Sample@gmail.com");

	}

}
