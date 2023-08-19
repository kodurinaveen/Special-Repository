package Seleniumexamples;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_HRM {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.Chrome.driver","c://Chromedriver.exe");
WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
driver.findElement(By.name("email")).sendKeys("kodurinaveen4@gmail.com");
driver.findElement(By.name("pass")).sendKeys("9032796148");
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Log in')]"))).click();

//driver.findElement(By.name("login")).click();
Thread.sleep(12000);

Alert FB= driver.switchTo().alert();
String actualresult= FB.getText();
Thread.sleep(6000);
FB.dismiss();;
System.out.print(actualresult);

//driver.findElement(By.cssSelector("#mount_0_0_Vk > div > div:nth-child(1) > div > div:nth-child(3) > div.xds687c.x1pi30zi.x1e558r4.xixxii4.x13vifvy.xzkaem6 > div:nth-child(2) > div > div:nth-child(2) > div.xu96u03.xm80bdy.x10l6tqk.x13vifvy > div.x1uvtmcs.x4k7w5x.x1h91t0o.x1beo9mf.xaigb6o.x12ejxvf.x3igimt.xarpa2k.xedcshv.x1lytzrv.x1t2pt76.x7ja8zs.x1n2onr6.x1qrby5j.x1jfb8zj > div > div > div > div > div > div > div > div > div.x9f619.x1ja2u2z.x1k90msu.x6o7n8i.x1qfuztq.x10l6tqk.x17qophe.x13vifvy.x1hc1fzr.x71s49j.xh8yej3 > div > div > div:nth-child(1) > div.x1iorvi4.x4uap5.xwib8y2.xkhd6sd > div > div:nth-child(5) > div > div.x6s0dn4.x1q0q8m5.x1qhh985.xu3j5b3.xcfux6l.x26u7qi.xm0m39n.x13fuv20.x972fbf.x9f619.x78zum5.x1q0g3np.x1iyjqo2.xs83m0k.x1qughib.xat24cr.x11i5rnm.x1mh8g0r.xdj266r.xeuugli.x18d9i69.x1sxyh0.xurb0ha.xexx8yu.x1n2onr6.x1ja2u2z.x1gg8mnh > div.x6s0dn4.xkh2ocl.x1q0q8m5.x1qhh985.xu3j5b3.xcfux6l.x26u7qi.xm0m39n.x13fuv20.x972fbf.x9f619.x78zum5.x1q0g3np.x1iyjqo2.xs83m0k.x1qughib.xat24cr.x11i5rnm.x1mh8g0r.xdj266r.x2lwn1j.xeuugli.x18d9i69.x4uap5.xkhd6sd.xexx8yu.x1n2onr6.x1ja2u2z > div > div > div > div > span")).click();
	}
}
