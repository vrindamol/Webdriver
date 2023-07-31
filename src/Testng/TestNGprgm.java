package Testng;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGprgm {
	ChromeDriver driver;
	@BeforeTest(alwaysRun = true)
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod (alwaysRun = true)
	public void urlLoading()
	{
		driver.get("https://www.facebook.com");
	}
	@Test /*(groups={"sanity","smoke"})*///(priority=1,invocationCount=2)
	public void titleVerifiation()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test /*(groups={"sanity"})*///(priority=2,enabled =false)
	public void contentverification()
	{
		String src=driver.getPageSource();
		if(src.contains("facebook"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@Test(groups={"regression"})
	public void test1()
	{
		System.out.println("test");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("aftermetho");
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
