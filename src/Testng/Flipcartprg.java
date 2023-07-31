package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipcartprg {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.facebook.com");
	}
	@Test
	public void test()
	{
		String title=driver.getTitle();
		System.out.println("The title "+title);
		System.out.println(title);
	}
	@Test
	public void faacebooksetvaue()
	{
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("v");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Vidhuunni");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
