package Pkg;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dislayenable1 {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		Boolean button=driver.findElement(By.xpath("//input[@class='submitbtn']")).isEnabled();
		if(button)
		{
			System.out.println("is enbld");
		}
		else
		{
			System.out.println("not enabled");
		}
	}
	@Test
	public void test1()
	{
		Boolean check=driver.findElement(By.xpath("//input[@class='nomargin']")).isSelected();
		if(check)
		{
			System.out.println("is selected");
		}
		else
		{
			System.out.println("not selected");
		}
	}
	@Test
	public void test2()
	{
		Boolean button=driver.findElement(By.xpath("//input[@value='f']")).isSelected();
		if(button)
		{
			System.out.println("radio is selectedd");
		}
		else
		{
			System.out.println("radio not selected");
		}	
	}
	@Test
	public void linkValidation()
	{
		List <WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("Count of lnks is="+li.size());
		for (WebElement element:li)
		{
			String link=element.getAttribute("href");
		String linktext=element.getText();
		System.out.println(link +"----"+linktext);
			//verify(link);
			
		}
	}
	/*public void verify(String link)
		{
		try
		{
		
			URL u=new URL(link);
			HttpURLConnection con=(HttpURLConnection) u.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("sucessful--"+link);
			}
			else if(con.getResponseCode()==400)
			{
				System.out.println("broken--"+link);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}*/
	@After
	public void teardown()
	{
		driver.quit();
	}
}

