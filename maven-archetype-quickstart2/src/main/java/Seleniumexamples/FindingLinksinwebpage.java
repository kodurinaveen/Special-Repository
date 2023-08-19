package Seleniumexamples;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingLinksinwebpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.Chrome.driver", "C:\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com");
Thread.sleep(5000);
List<WebElement> values=driver.findElements(By.tagName("a"));
System.out.println(values.size());

driver.findElement(By.name("username")).sendKeys("Admin");
driver.findElement(By.name("password")).sendKeys("admin123");
Thread.sleep(4000);
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(5000);

driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//a[contains(@href,'/web/index.php/pim')]")).click();
Thread.sleep(5000);
		
		
	}

}
