package Pkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecode {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void linkValidationmthd()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("link count is="+li.size());
		for(WebElement element:li)
		{
			String link=element.getAttribute("href");
			verify(link);
		}
	}
	private void verify(String link)
	{
		try
		{
			URL u=new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.connect();
			if(con.getResponseCode()==200) 
			{
				System.out.println("Sucessull--"+link);
			}
			else if(con.getResponseCode()==400)
			{
				System.out.println("broken link--"+link);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
