package Seleniumexamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitexample1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdriver.Chrome.driver","C:\\ChromeDriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://mail.google.com/mail/");
// saving the GUI element reference into a "element" variable of WebElement type
driver.findElement(By.name("identifier")).sendKeys("kumarkn400@gmail.com");
driver.findElement(By.id("identifierNext")).click();
Thread.sleep(1000);
// entering password
driver.findElement(By.id("identifierNext")).sendKeys("9032796148");
// clicking signin button
Thread.sleep(1000);
driver.findElement(By.id("signIn")).click();
// explicit wait - to wait for the compose button to be click-able
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
WebElement Ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
Ele.click();
	}

}
