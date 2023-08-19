package Seleniumexamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class AlertExample2{
	@Test()
	public void Alertmethod() throws Exception{
	//public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.Chrome.driver", "C://chromedriver.exe");
WebDriver driver= new ChromeDriver();

driver.navigate().to("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
//Thread.sleep(6000);
//driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
Thread.sleep(6000);
driver.findElement(By.cssSelector("button[onclick='myFunctionPrompt()']")).click();
Alert Elem= driver.switchTo().alert();
String actualresult= Elem.getText();
System.out.println(actualresult);
Elem.accept();
driver.findElement(By.id("male")).click();
driver.findElement(By.id("tuesday")).click();

	}

}
