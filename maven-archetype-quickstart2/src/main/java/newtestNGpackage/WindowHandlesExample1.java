package newtestNGpackage;



import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesExample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.Chrome.driver","C://chromedriver.exe");
		//WebDriverManager.ChromeDriver.setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.irctctourism.com/");
	driver.manage().window().maximize();
	String Parentwindow=driver.getWindowHandle();
		System.out.println(Parentwindow);
		String Title=driver.getTitle();
		System.out.println(Title);
		Thread.sleep(4000);
		driver.findElement(By.linkText("Bus Tickets")).click();
	ArrayList<String>tabs =new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));
	 String power=driver.getTitle();
	 System.out.println(power);
		
	}

}
