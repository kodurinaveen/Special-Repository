package Seleniumexamples;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangaHRM_Login {
@Test() 
void OrangaHTM() throws Exception{
	//public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver","C://ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(2) > a")).click();
		//driver.findElement(By.cssSelector(  470.417 316.26 C 479.663 310.71 491.663 313.708 497.213 322.959 C 502.764 332.209 499.764 344.206 490.515 349.756 L 477.503 357.563 C 480.053 365.529 481.442 374.011 481.442 382.813 C 481.442 391.614 480.054 400.096 477.503 408.063 L 490.515 415.869 C 499.764 421.418 502.764 433.416 497.214 442.665 Z M 442.38 382.813 C 442.38 358.581 422.666 338.867 398.435 338.867 C 374.204 338.867 354.49 358.581 354.49 382.813 C 354.49 407.044 374.204 426.758 398.435 426.758 C 422.666 426.758 442.38 407.044 442.38 382.813 Z" data-v-bddebfba=""></path></g></svg><span class="oxd-text oxd-text--span oxd-main-menu-item--name" data-v-7b563373="" data-v-6475d26d="">Leave</span></a>))
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(3) > a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(4) > a")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(5) > a")).click();
	Thread.sleep(2000);
        driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(6) > a")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(7) > a")).click();
	}

}
