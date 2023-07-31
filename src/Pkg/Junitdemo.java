package Pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver =new ChromeDriver();
		driver.get("https://www.google.com");
		
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
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
		@After
		public void teardown()
		{
			driver.quit();
		}
	}

