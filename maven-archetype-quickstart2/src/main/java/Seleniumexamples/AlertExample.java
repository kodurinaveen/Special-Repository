package Seleniumexamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlertExample{

@Test()	
	void Alertexample()throws InterruptedException{
	//public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.Chrome.driver", "C://chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
driver.switchTo().frame("login_page");
Thread.sleep(10000);
driver.findElement(By.cssSelector("#pageBody > div.main-container.login-main > form > div.container > div > div > div.netwrapper > div.col-sm-6.leftwrap.fl > div:nth-child(2) > div.inputfield.ibvt.loginData > a")).click();
Thread.sleep(5000);
Alert hdfc=driver.switchTo().alert();
String actualresult=hdfc.getText();
Thread.sleep(6000);
hdfc.accept();
driver.switchTo().defaultContent();
System.out.println(actualresult);
String expectedresult="Customer ID  cannot be left blank.";
SoftAssert softAssert=new SoftAssert();
Thread.sleep(8000);
softAssert.assertEquals(actualresult,expectedresult,"not matching");
Thread.sleep(4000);
System.out.print("afterassert");
driver.close();	
softAssert.assertAll();
	}
}

