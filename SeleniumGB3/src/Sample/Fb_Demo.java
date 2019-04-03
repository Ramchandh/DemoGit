package Sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_Demo {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/User/Desktop/selenium/SeleniumGB3/drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		driver.manage().window().maximize();
		
		
//		WebElement emailTextbox = driver.findElement(By.id("email"));
//		
//		emailTextbox.sendKeys("Sample@gmail.com");
//		
//		WebElement passTexbox = driver.findElement(By.id("pass"));
//		
//		passTexbox.sendKeys("qwertyu");
	
//		String attr = passTexbox.getAttribute("value")
//		
//		System.out.println(attr);
		
//		WebElement createText = driver.findElement(By.xpath("(//*[@class='html7magic'])[1]"));
//		
//		String text = createText.getText();
//
//		System.out.println(text);
		
		
		
//		WebElement radio = driver.findElement(By.xpath("(//*[@class='_5k_2 _5dba'])[1]"));
//		
//		radio.click();
		
		
		List<WebElement> checkbox = driver.findElements(By.name("tool"));
		//     i=0         i<3              i+1     
	 	for (int i = 0; i < checkbox.size(); i++) {
			
				checkbox.get(i).click();
			
		}
		
		
	 	for( WebElement e: checkbox)
	 	{
	 		
	 	}
	 	
	
		
		
		
	}

}
