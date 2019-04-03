package frame;


import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngFraame1 {
	

	
		@Test
		public void Method2()
		{
			String Actual = "Selenium";
			
			String expected = "selenium";
			
//			System.out.println(s);
			
			Assert.assertEquals(Actual, expected);
			
			Assert.assertEquals("Why", "Why");
			
			System.out.println("passed assertion");
		}
		

}
