package Seleniumexamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Gmail_Login2 {

	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	@Test()	
	void gmailLogin() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C://chromeDriver.exe");
		driver.get("https://mail.google.com/mail/");
		// saving the GUI element reference into a "element" variable of WebElement type
	driver.findElement(By.name("identifier")).sendKeys("dummy@gmail.com");
	driver.findElement(By.id("identifierNext")).click();
	Thread.sleep(1000);
		// entering password
	driver.findElement(By.id("identifierNext")).sendKeys("password");
		// clicking signin button
	Thread.sleep(1000);
	driver.findElement(By.id("signIn")).click();
		// explicit wait - to wait for the compose button to be click-able
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
		// click on the compose button as soon as the "compose" button is visible
		driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
	
	}

}
