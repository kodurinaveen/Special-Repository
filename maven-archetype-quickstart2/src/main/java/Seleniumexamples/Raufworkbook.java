package Seleniumexamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Raufworkbook {

	//public static void main(String[] args) throws IOException, ClassNotFoundException, AWTException {
		//  Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		FileInputStream file= new FileInputStream("//C://Users//Venkat//Downloads//Story1.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		XSSFSheet sheet=workBook.getSheet("Sheet1");
		int rowcount=sheet.getLastRowNum();
		int colcount=sheet.getRow(0).getLastCellNum();
		for(int i=0;i<rowcount;i++)
		{
			XSSFRow currentrow=sheet.getRow(i);
		for(int j=0;j<colcount;j++)
		{
			String value=currentrow.getCell(j).toString();
			System.out.println(value);
		}
		   System.out.println();
		}
		
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		
		Select select=new Select(value);
		select.selectByIndex(0);
		Select select1= new Select(value1);
		select.selectByVisibleText("April");
		
		Actions mouse=new Actions(driver);
		mouse.moveToElement(driver.findElement(By.linkText("Login"))).build().perform();
		
		Alert abdcf= driver.switchTo().alert();
		String actualresult = abdcf.getText();
		String expectedresult = "how are you";
		abdcf.accept();
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(actualresult, expectedresult, "both are not equal");
		System.out.println("after assertion");
		softAssert.assertAll();
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File( "C:\\selenium.png"));
		}catch (Exception e)
		{ System.out.println(e.getMessage());
		}
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",button);
		
		StringSelection ss= new StringSelection("C:\\doc.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='forgotpassword']")));
		
		FluentWait wait1= new FluentWait(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(10))
		.ignoring(NoSuchElementException.class);
	    WebElement balance=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Name")));
		
	      String value= driver.getWindowHandle();
	        String title=driver.getTitle();
	        ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
	      driver.switchTo().window(tabs.get(1));
	      String val =   driver.getTitle();
	 @DataProvider(name=" mytest")
	public void object[][]createdata1(){
		return new object[][]{
			{"india"},
			{"america"}
		};
	 }
		@Test(DataProvider= " mytest")
	public	void testcountysearch(String Country){
			System.out.println(kjfl);
		}
	
		Vector<String> vl=new vector<String>();
		vl.add("2");
		vl.add("Naveen");
		vl.add("kumar");
		
		vl.remove(2, "kumar")
		for(int i=0;vl.size();i++)
		{
			System.out.println(vl.get(i));
		}
	}
}
