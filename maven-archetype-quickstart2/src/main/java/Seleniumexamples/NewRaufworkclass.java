package Seleniumexamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewRaufworkclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
String month ="November";
String day="12";
	System.setProperty("webdriver.Chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.makemytrip.com/bus-tickets/hyderabad-city-online-booking.html");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.findElement(By.className("hsBackDrop")).click();
	String hal= driver.findElement(By.xpath("//*[@id='busModifySearch']/div/div[4]/div[1]/div[2]/div/div[2]/div[1]/div[1]/div]")).getText();
System.out.println(hal);
	//while(true){
		//if (hal.equals(month)){
		//	break;
		                  //  }
		//else{
		//	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-stid='date-picker-paging']"))).click();
			//Thread.sleep(6000);
//driver.findElement(By.xpath("//button[@data-stid='date-picker-paging']")).click();
		//  }
	  //        }
	//
	// driver.findElement(By.xpath("//*[@id='lodging_search_form']/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[2]/td[6]/button")).click();
	}

}

