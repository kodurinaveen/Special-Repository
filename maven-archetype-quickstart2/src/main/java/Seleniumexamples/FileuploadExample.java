package Seleniumexamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploadExample {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.Chrome.driver","C://chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.monsterindia.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id='heroSection-container']/div[3]/div[2]/div[2]")).click();
Thread.sleep(4000);
driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Venkat\\Downloads\\fresher CV.pdf");
//JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("arguments[0].click();",button1);  //click action on button
//driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
//JavascriptExecutor js= (JavascriptExecutor)driver;
//js.executeScript("arguments[0].click()",button1);
//Thread.sleep(6000);
//StringSelection ss=new StringSelection("C:\\Users\\Venkat\\Downloads\\fresher CV.pdf");
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

//Robot robo=new Robot();
//robo.keyPress(KeyEvent.VK_CONTROL);
//robo.keyPress(KeyEvent.VK_V);
//robo.keyRelease(KeyEvent.VK_CONTROL);
//robo.keyRelease(KeyEvent.VK_V);
//robo.keyPress(KeyEvent.VK_ENTER);
	
	}

}
