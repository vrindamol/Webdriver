package Pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void Test1()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test
	public void Test2()
	{
		
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("vrindathankan7@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Vidhuunni");
		driver.findElement(By.xpath("//*[@id='content']/div/div/div/div[2]/div/div/form/div[2]/button")).click();
		
	}
}
