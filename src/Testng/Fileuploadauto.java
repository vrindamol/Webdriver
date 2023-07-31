package Testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadauto {
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test() throws InterruptedException, IOException 
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id='pickfiles']/span")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("\"C:\\Users\\user\\Downloads\\autoit\\T1.exe\"");
		Thread.sleep(3000);
		
	}
}
