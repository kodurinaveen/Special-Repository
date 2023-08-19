package TestNGExamples1;

import org.testng.annotations.Test;

public class EnableExample1 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
@Test()
	public void case1()
	{
		System.out.println("Test Case 1");
	}
@Test(enabled=false)
	public void case2()
	{
		System.out.println("Test Case 2");
	}
	
}
