package Seleniumexamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Createfacebookaccount {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C://Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Naveen");
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		driver.findElement(By.name("reg_email__")).sendKeys("kumarkn400@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kumarkn400@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("9032796148");
		driver.findElement(By.name("birthday_day")).sendKeys("2");
		driver.findElement(By.xpath("//select[@aria-label='Month']")).sendKeys("Apr");
		driver.findElement(By.name("birthday_year")).sendKeys("1994");
		driver.findElement(By.cssSelector("input[value='2']")).click();
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@id=':r0:']")).sendKeys("12345");
		Thread.sleep(9000);
	    //driver.findElement(By.xpath("//*[@id='scrollview']/div/div/div/div[2]/div/div/div/div[1]/div/div/div[1]/div/div/div/div/div/div/div/div[4]/div/div[2]/div[1]/div")).click();
	driver.findElement(By.cssSelector("#scrollview > div > div > div > div.x9f619.x1n2onr6.x1ja2u2z > div > div > div > div.x1qjc9v5.x78zum5.xl56j7k.x193iq5w.x1t2pt76 > div > div > div.x14lw9ws.xh8yej3 > div > div > div > div > div > div > div > div:nth-child(3) > div > div.x9f619.x1n2onr6.x1ja2u2z.x78zum5.xdt5ytf.x2lah0s.x193iq5w.xeuugli.x150jy0e.x1e558r4.x10b6aqq.x1yrsyyn > span > div")).click();
	Thread.sleep(17000);
	driver.findElement(By.xpath("//*[@id='scrollview']/div/div/div/div[2]/div/div/div/div[1]/div/div/div[1]/div/div/div/div/div/div/div/div[4]/div/div[1]/div[2]/div")).click();
	
	}

	
}
	
