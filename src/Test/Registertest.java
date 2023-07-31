package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Blazedemoprg;
import page.Loginblaze;

public class Registertest extends Baseclassblaze {
	@Test
	public void test()
	{
		Blazedemoprg ob=new Blazedemoprg(driver);
		ob.setvalue("Vrinda", "Luminar", "vrindathankan@gmail.com", "abcd", "abcd");
		ob.register();
	
	}

			
		
}
