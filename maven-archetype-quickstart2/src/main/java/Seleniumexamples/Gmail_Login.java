package Seleniumexamples;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "c://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.gmail.com");
		
		Thread.sleep(7000);
		driver.findElement(By.name("identifier")).sendKeys("kumarkn400@gmail.com");
		Thread.sleep(12000);
		
	//driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/span")).click();
	driver.findElement(By.cssSelector("#yDmH0d > c-wiz > div > div.eKnrVb > div > div.Z6Ep7d > div > div.XOrBDc > div > div > div:nth-child(1) > div > button > span")).click();
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("#yDmH0d > c-wiz > div > div.eKnrVb > div > div.Z6Ep7d > div > div.XOrBDc > div > div > div:nth-child(2) > div > ul > li:nth-child(2)")).click();
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']"))).sendKeys("Naveen");
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Naveen");
	driver.findElement(By.name("lastName")).sendKeys("Kumar");
	//Thread.sleep(8000);
	WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
	WebElement Ele=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("VfPpkd-vQzf8d")));
	Ele.click();
	//driver.findElement(By.className("VfPpkd-vQzf8d")).click();
	Thread.sleep(7000);
	driver.findElement(By.name("day")).sendKeys("2");
	Thread.sleep(6000);
	
	driver.findElement(By.id("month")).sendKeys("April");
	Thread.sleep(5000);
	driver.findElement(By.name("year")).sendKeys("1994");
	Thread.sleep(5000);
	driver.findElement(By.id("gender")).sendKeys("Male");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(7000);
	driver.findElement(By.name("Username")).sendKeys("kodurinaveen55");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='next']/div/button/span")).click();
	Thread.sleep(12000);
	driver.findElement(By.name("Passwd")).sendKeys("9032796148@ab");
	Thread.sleep(5000);
	driver.findElement(By.name("PasswdAgain")).sendKeys("9032796148@ab");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@class='VfPpkd-muHVFf-bMcfAe']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='createpasswordNext']/div/button/span")).click();
	Thread.sleep(7000);
driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9390068792");
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div[2]/div/div/div/div/button/span")).click();
Thread.sleep(6000);
driver.findElement(By.name("code")).sendKeys("123456");
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id='next']/div/button/span")).click();
Thread.sleep(5000);
driver.close();

	}

}
