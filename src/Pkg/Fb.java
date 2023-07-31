package Pkg;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Fb {
	ChromeDriver driver;
	@Before
	public void Setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	
		public void test1()
		{
			driver.findElement(By.id("email")).sendKeys("vrindathankan7@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("Vidhuunni");
			driver.findElement(By.name("login")).click();
		}
	@Test
	public void test2() throws IOException
	{
		WebElement button=driver.findElement(By.xpath("//*[@name='login']"));
		File buttonscreenshot=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(buttonscreenshot, new File("./Screenshot//fbbuttonscshot.png"));
	
	}
	@After
	public void teardown()
	{
		driver.quit();
	}
	}
	
	

