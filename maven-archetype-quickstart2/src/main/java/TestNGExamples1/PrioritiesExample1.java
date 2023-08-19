package TestNGExamples1;

import org.testng.annotations.Test;

public class PrioritiesExample1 {
@Test(priority=2)
void transferfunds()	
{
	System.out.println("Test case 3 ");
}
@Test()
void Login()	
{
	System.out.println("Test case 1 ");
}
@Test(priority=1)
void Addbeneficiary()
{
	System.out.println("Test case 2 ");
}
	
}
