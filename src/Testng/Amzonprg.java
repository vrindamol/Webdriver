package Testng;

import java.io.IOException;
import java.util.Set;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Amzonprg {
	ChromeDriver driver;
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	@BeforeTest
	 public void befTest()
	 {
		 reporter=new ExtentHtmlReporter("./Report/myreport1.html");
		reporter.config().setDocumentTitle("Automationreport");
		 
		 reporter.config().setReportName("Functional test");
		 reporter.config().setTheme(Theme.DARK);
		 extent=new ExtentReports();
		 extent.attachReporter(reporter);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("os", "windows11");
		 extent.setSystemInfo("testername","abc");
				 extent.setSystemInfo("Browser name","chrome");
				driver=new ChromeDriver();
	 }
	 @BeforeMethod
	
	public void setUp()
	 {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in");
		
	 }
	
	@Test
	public void search() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobile phones",Keys.ENTER);
		
		String exp="Amazon.in : Mobile phones";
		 String actual=driver.getTitle();
		
		 Assert.assertEquals(exp, actual);
		 String parentWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
			
			Set <String> allwindowHandles=driver.getWindowHandles();
			for(String handle:allwindowHandles)
			{
				if(!handle.equalsIgnoreCase(parentWindow))
				{
					driver.switchTo().window(handle);
					driver.findElement(By.xpath("//*[@id=\'add-to-cart-button\']")).click();
					Thread.sleep(3000);
					 driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")).click();
					driver.close();
				}
				driver.switchTo().window(parentWindow);
				}
				
	
	

	
			
	
	
}}



