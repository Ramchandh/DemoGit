package Sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.table.TableRowSorter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {
	
	private static WebDriver driver=null;
	
	public void IteratingTableRowTag()
	{
		System.out.println("----------------------------------------------------IteratingTableRowTag-------------------------------------------------------");
		
		List<WebElement> tableRow = driver.findElements(By.tagName("tr"));
		
		for (int i = 0; i < tableRow.size(); i++) {
			
			System.out.println(tableRow.get(i).getText());
	
		}
		
		System.out.println("------------------------------------------------------------------------------------------------------------------");
	}
	
	
	public void IteratingTableData()
	{
		List<WebElement> tableData = driver.findElements(By.tagName("td"));
		
		System.out.println("----------------------------------------------------IteratingTableData-------------------------------------------------------");
		
		for(WebElement td : tableData)
		{
				System.out.println(td.getText());
		}
		
		System.out.println("------------------------------------------------------------------------------------------------------------------");
	}
	
	public void IteratingTheParticularTableRow(int num)
	{
		WebElement particularRow = driver.findElement(By.xpath( "//tr["+num+"]"));
		
		System.out.println("----------------------------------------------------IteratingTheParticularTableRow-------------------------------------------------------");
		
		System.out.println(particularRow.getText());	
		
		System.out.println("------------------------------------------------------------------------------------------------------------------");
	}
	
	public void IteratingTheParticularTableData(int num, String dataname)
	{
		WebElement ParaticularData = driver.findElement(By.xpath("//td["+num+"][contains(text(),'"+dataname+"')]"));
		
		System.out.println("----------------------------------------------------IteratingTheParticularTableData-------------------------------------------------------");
		
		System.out.println(ParaticularData.getText());
		
		System.out.println("------------------------------------------------------------------------------------------------------------------");
	}
	
	public void WaitsImplicit(long num)
	{
		driver.manage().timeouts().implicitlyWait(num, TimeUnit.SECONDS);

	}
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/User/Desktop/selenium/SeleniumGB3/drivers/chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebTable1 s = new WebTable1();
		
		s.IteratingTableRowTag();
		
		s.IteratingTableData();
		
		s.IteratingTheParticularTableRow(2);
		
		s.IteratingTheParticularTableData(2,"Shanghai");
		
		
		
	}

}