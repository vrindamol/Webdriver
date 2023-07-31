package Testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demosite {
	
		ChromeDriver driver;
		
		//driver.manage().window().maximize();
		
		@BeforeTest
		public void setUp()
		{
			driver =new ChromeDriver();
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		}
		@Test
		public void demo()
		{
			WebElement link = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
			Actions act=new Actions(driver);
			
			act.contextClick(link).perform();
			driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
			driver.switchTo().alert().accept();
			WebElement doubleclick1=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
			act. doubleClick (doubleclick1).perform();
			
			Alert a=driver.switchTo().alert();
			String alerttext=a.getText();
			a.accept();
			
			System.out.println(alerttext);
			
		}
}
