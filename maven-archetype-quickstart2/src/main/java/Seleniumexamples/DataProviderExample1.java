package Seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample1 {

	 private WebDriver driver;
	
	 //public static void main(String[] args) {
		// TODO Auto-generated method stub
     @DataProvider(name="my test")
	public Object[][] createData1(){
	return new	Object[][]{
	
		{"India"},
		{"Pakistan"},
		{"United Kingdom"},
		{"South America"},
		{"Russia"},
		{"Brazil"},
		{"Paris"},
	};
     }
	@Test(dataProvider="my test")
	public void testsearchCountry(String country) throws Exception{
     
     System.setProperty("webdriver.Chrome.driver", "C://ChromeDriver.exe");
     
     driver=new ChromeDriver();
     driver.get("http://www.wikipedia.org/wiki/Main_Page");
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     
     driver.findElement(By.name("search")).sendKeys(country);
     driver.findElement(By.xpath("//*[@id='searchform']/div/button")).click();
     //Thread.sleep(8000);
     String actualresult=driver.findElement(By.id("firstHeading")).getText();
     System.out.println(actualresult);
     Assert.assertTrue(country.equals(actualresult.trim()));
	}
	@AfterMethod()
	public void teardown(){
     driver.quit();
	}
     
	
	}
		
		
		
	




