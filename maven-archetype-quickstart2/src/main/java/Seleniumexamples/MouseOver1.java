package Seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.Gecko.driver", "C:\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https:www.amazon.in//");
driver.manage().window().maximize();
Actions mouse=new Actions(driver);
Thread.sleep(5000);
mouse.moveToElement(driver.findElement(By.linkText("Mobiles"))).click().build().perform();
Thread.sleep(5000);
driver.close();
		
		
		
		
		
	}

}
