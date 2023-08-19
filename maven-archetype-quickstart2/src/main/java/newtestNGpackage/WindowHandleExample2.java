package newtestNGpackage;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.Chrome.driver","C:\\ChromeDriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.irctctourism.com/");
String parentwindow=driver.getWindowHandle();
System.out.println(parentwindow);
String title=driver.getTitle();
System.out.println(title);
 driver.findElement(By.linkText("Bus Tickets")).click();
 ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
 
 driver.switchTo().window(tabs.get(1));
String Title=driver.getTitle();
System.out.println(Title);
		
		
	}

}
