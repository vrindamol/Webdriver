package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scrolldown {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("books",Keys.ENTER);
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("//*[@id=\"botstuff\"]/div/div[3]/table/tbody/tr/td[9]/a/span"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
}
