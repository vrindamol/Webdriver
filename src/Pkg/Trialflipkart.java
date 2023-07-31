package Pkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trialflipkart {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://flipkart.com");
	}
	
 
	@Test
	public void test()
	{
		int sucessfullcount=0;
		List<WebElement> li=driver.findElements(By.tagName("a"));
	//System.out.println("Count of links="+li.size());
	
	/*for(WebElement element:li)
	{
		String link=element.getAttribute("href");
		String linktext=element.getText();
		System.out.println(link +"---"+linktext);
		
		verify(link);
	}*/
	}
	

	public void verify()
	{
		int sucessfullcount=0,fail=0;
		
		
		try
		{
			
		URL u=new URL(link);
		HttpURLConnection con=(HttpURLConnection) u.openConnection();
		con.connect();
		//System.out.println(con.getResponseCode());
		if(con.getResponseCode()==200)
		{
			sucessfullcount=sucessfullcount+1;
			
		}
		else
		{
			fail=fail+1;
		}
		
		System.out.println("count of sucessful link="+sucessfullcount);
		
		}
		
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}


	@After
	public void teardown()
	{
		driver.quit();
	}
}