package Pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchlink {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		
	}
	@Test
	public void Test1()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("total no of list="+li.size());
		 for(WebElement link:li){
			 System.out.println(link.getText() + " - " + link.getAttribute("href"));
	}
		 
}
}