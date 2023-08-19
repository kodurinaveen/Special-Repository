package Seleniumexamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args, TimeUnit SECONDS, TimeUnit DurationOfSeconds ) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.Chrome.driver", "C://ChromeDriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, DurationOfSeconds);
 driver.get("https://www.facebook.com/");
 
 driver.findElement(By.name("email")).sendKeys("kodurinaveen4@gmail.com");
 driver.findElement(By.name("pass")).sendKeys("9032796148");
// Robot robot=new Robot();
 //robot.keyPress(KeyEvent.VK_ENTER);
 //robot.keyRelease(KeyEvent.VK_ENTER);
 WebElement textbox =driver.findElement(By.name("login"));
 textbox.sendKeys(Keys.ENTER);
 
		
		
		
		
		
	}

}
