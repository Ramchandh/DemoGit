package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActions {
	
	
	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "C:/Users/User/Desktop/selenium/SeleniumGB3/drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		WebElement ele1 = driver.findElement(By.xpath("//*[contains(text(),'COURSES')]"));
		
		Actions acc = new Actions(driver);
		
		
		acc.moveToElement(ele1).perform();
		
		
		WebElement ele2 = driver.findElement(By.xpath("//*[contains(text(),'Oracle Training')]"));
		
		acc.moveToElement(ele2).perform();
		
		WebElement odt = driver.findElement(By.xpath("//*[contains(text(),'Oracle DBA Training')]"));
		
		odt.click();
	}

}
