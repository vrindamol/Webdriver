package Pkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findresponsecode {
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	@Before
	public void setUp()
	{
		driver =new ChromeDriver();
		driver.get(baseurl);
		
	}
	@Test
	
	public void responseCode()
	{
		try
		{
			URL u=new URL(baseurl);
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
