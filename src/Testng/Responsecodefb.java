package Testng;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Responsecodefb {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver =new ChromeDriver();
    driver.get("https://www.facebook.com");
		
	}
	@Test
	
		public void responseCode()
		{
	driver.findElement(By.xpath("//div[@id='content']/div/div/div/div[2]/div/div[1]/form/div[3]/a")).click();
	driver.navigate().back();
		String currenturl=driver.getCurrentUrl();
		
		
		
			try
			{
				URL u=new URL(currenturl);
				HttpURLConnection con=(HttpURLConnection)u.openConnection();
				con.connect();
				
				System.out.println(con.getResponseCode());
			}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
	}
}
