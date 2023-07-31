package Testng;

import org.junit.Before;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
	
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
		public void logo()
		{
			Boolean logo=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
			if(logo)
			{
				System.out.println("is enbld");
			}
			else
			{
				System.out.println("not enabled");
			}
		}
}
