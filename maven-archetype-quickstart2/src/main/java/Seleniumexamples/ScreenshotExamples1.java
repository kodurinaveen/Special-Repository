package Seleniumexamples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExamples1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.Chrome.driver", "C://ChromeDriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com");
Thread.sleep(8000);
File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
try{
	FileUtils.copyFile(screenshot,new File("C:\\Screenshots-SeleniumExample\\Selenium.png"));
}catch (IOException e){
	System.out.println(e.getMessage());
	
}
		
	driver.close();
		
		
	}

}
