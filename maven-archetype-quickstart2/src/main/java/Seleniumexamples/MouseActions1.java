package Seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions1 {

	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub

	System.setProperty("webdriver.Chrome.driver","C:\\ChromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.jqueryui.com/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Draggable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions mouse=new Actions(driver);
		Thread.sleep(6000);
		mouse.dragAndDropBy(driver.findElement(By.id("draggable")), 50,80).build().perform();
		driver.quit();
	}		
	
}
