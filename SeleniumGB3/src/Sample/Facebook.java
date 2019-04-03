package Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Facebook {

	WebDriver driver = null;

	WebElement fn, pass;

	@BeforeSuite
	public void OnetimeSetup() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/User/Desktop/selenium/SeleniumGB3/drivers/chromedriver.exe");

	}

	@BeforeClass

	public void BeforeClass() {

		// driver = new ChromeDriver();
		//
		// driver.get("https://www.facebook.com/");

		// driver.manage().window().maximize();
	}

	@BeforeMethod

	public void BeforeMethod() {
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void PositiveFlow() {
		fn = driver.findElement(By.id("email"));

		pass = driver.findElement(By.id("pass"));

		fn.sendKeys("sample@gmail.com");

		pass.sendKeys("qwertyuiop");

		WebElement loginbutton = driver.findElement(By.id("loginbutton"));

		loginbutton.click();

	}

	@Test

	public void NegativeFlow() {

		fn = driver.findElement(By.id("email"));

		pass = driver.findElement(By.id("pass"));

		fn.sendKeys("sample21@gmail.com");

		pass.sendKeys("qwertyop");

		WebElement loginbutton = driver.findElement(By.id("loginbutton"));

		loginbutton.click();

	}

	@AfterMethod
	public void AfterMethod() {

	}

	@AfterClass

	public void AfterClass() {
		driver.close();
	}

	@AfterSuite
	public void OneTimeAfterSuite() {
		driver.quit();

	}

}
