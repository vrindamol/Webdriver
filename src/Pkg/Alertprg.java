package Pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprg {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Documents/alert.html");
	}
	
 
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@value='Disply alert box']")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vrinda");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Thankan");
		driver.findElement(By.xpath("//input[@value='submit']")).click();	
		}
}
