package TestNGExamples1;

import org.testng.annotations.Test;

public class DependsExample1 {

	@Test(dependsOnMethods={"addbeneficiary"})
	void Transferfunds()
	{
		System.out.println("Transferfunds");
	}
	@Test(dependsOnMethods={"Login"})
    void addbeneficiary()
    { 
	System.out.println("addbeneficiary");
    }
	@Test()
    void Login()
    {
    System.out.println("Login");
    }
    
}
