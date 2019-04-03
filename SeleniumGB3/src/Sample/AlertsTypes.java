package Sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTypes {
	
	
	
	void add()
	{
		int i=19,j;
		System.out.println(i/j);
		
		throw new ArithmeticException();
	}
	
	public static void main(String[] args)  {
		
System.setProperty("webdriver.chrome.driver", "C:/Users/User/Desktop/selenium/SeleniumGB3/drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement Fname = driver.findElement(By.xpath("//*[@name='firstname']"));
		
		boolean display = Fname.isDisplayed();
		
		
		System.out.println(display);

		
		boolean enable = Fname.isEnabled();

		System.out.println(enable);

		
		
	}

}
