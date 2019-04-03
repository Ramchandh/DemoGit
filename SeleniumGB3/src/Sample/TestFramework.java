package Sample;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFramework {
	
	
	
	@BeforeSuite
	
	public void SuiteMethod()
	{
		System.out.println("Beforesuite");
	}
	
	@AfterSuite
	public void SuiteAfter()
	{
		System.out.println("aftersuite");
	}

	@BeforeClass
	
	public void classBefore()
	{
		System.out.println("beforeclass");
	}
	
	@AfterClass
	public void Afterclass()
	{
		System.out.println("Afterclass");
	}
	
	@BeforeMethod
	
	public void Beforemethod()
	{
		System.out.println("Beforemethod");
	}
	
	
	@AfterMethod
	public void Aftermethod()
	{
	
		
		System.out.println("After method");
	}
	
	
	
	@Test(priority=2,description="Positive flow")
	public void Test()
	{
		System.out.println("Test");
		
		
	}
	
	@Test(priority=-1,enabled=false)
	public void Test1()
	{
		System.out.println("Test1 executing based on priority");
	}
	
	@Test(priority=1)
	public void Test2()
	{
		System.out.println("Test1 executing based on priority 2");
	}
}
