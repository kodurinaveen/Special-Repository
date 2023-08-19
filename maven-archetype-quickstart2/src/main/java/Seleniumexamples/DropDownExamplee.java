package Seleniumexamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExamplee {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.Chrome.driver", "C://chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.navigate().to("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	Thread.sleep(6000);
	driver.findElement(By.linkText("Sign up for Facebook"));
	//Robot robot=new Robot();
	//robot.keyPress(KeyEvent.VK_ENTER);
	//robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(6000);
	WebElement Day=driver.findElement(By.name("birthday_day"));
	Select select=new Select(Day);
	select.selectByIndex(8);
    WebElement month =driver.findElement(By.name("birthday_month"));
	Select select1=new Select(month);
	//select1.selectByVisibleText("Jun");
	select1.selectByIndex(5);
	Thread.sleep(7000);
	driver.findElement(By.cssSelector("input[value='2']")).click();
	
	}

}
