package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Createfbpage;
import page.Fbloginpage;

public class Fblogintest {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalue("vrindathankan7@gmail.com", "abcde");
				ob.login();
				driver.navigate().back();
				Createfbpage ob1=new Createfbpage(driver);
				ob1.createpage();
				ob1.getstarted();
		
	}
}
