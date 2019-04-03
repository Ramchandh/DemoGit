package frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {
	
	WebDriver driveer =null;
	
	@Parameters("First-parameter")

	@Test
	
	void Method3(String data)
	{
		System.out.println(data);
		
		WebElement email = driveer.findElement(By.id("email"));
		
		List<WebElement> findElements = driveer.findElements(By.id("pass"));
		
		
		email.sendKeys(data);
		
	}
	
}
