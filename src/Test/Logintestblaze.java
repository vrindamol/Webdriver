package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Blazedemoprg;
import page.Loginblaze;

public class Logintestblaze
{
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/login");
	}
	@Test
	public void test()
	{
		Loginblaze ob1=new Loginblaze(driver);
		ob1.setvalue("vrindathankan@gmail.com", "abcd");
		ob1.login();
		
		
	}
}
