package TestNGExamples1;

import org.testng.annotations.*;

public class AllAnotationsExample1 {
@Test()
void testCase1()
{
	System.out.println("Inside test case 1");
}
@BeforeTest()
void beforeTest()
{
	System.out.println("Inside the before test");
}

@Test()
void testCase2()
{
	System.out.println("Inside the test case 2");
}
@BeforeSuite()
void beforeSuite()
{
	System.out.println("Inside the before suite");
}
@AfterSuite()
void afterSuite()
{
	System.out.println("Inside the After Suite");
}
@AfterTest()
void afterTest()
{
	System.out.println("Inside the after test");
}
@BeforeClass()
void beforeClass()
{
	System.out.println("Inside the before class");
}
@AfterClass()
void afterClass()
{
	System.out.println("Inside the after class");
}
@BeforeMethod()
void beforeMethod()
{
	System.out.println("Inside the before method");
}
@AfterMethod()
void afterMethod()
{
	System.out.println("Inside the after method");
}


}


	
