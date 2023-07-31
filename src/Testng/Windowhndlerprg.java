package Testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhndlerprg {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void handler()
	{
		driver.get("http://demo.guru99.com/popup.php");
		String parentWindow=driver.getWindowHandle();
		System.out.println("title is"+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Set <String> allwindowHandles=driver.getWindowHandles();
		for(String handle:allwindowHandles)
		{
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				String s=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).getText();
				System.out.println(s);
				driver.close();
			}
			driver.switchTo().window(parentWindow);
		}
	}
}
