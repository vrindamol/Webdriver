package Pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttonprg {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver =new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		
	}
	@Test
	public void test1()
	{
		
		Boolean radio=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
		 if (radio)
	      {
	         System.out.println("radio button is selected");	
	      }
	      else 
	      {
	         System.out.println("radio button is not selected");
	      }
	}
	
	
	@Test
	public void Test2()
	{
		Boolean button=driver.findElement(By.xpath("//*[@id=\"Register\"]")).isEnabled();
		String title=driver.getTitle();
		
		System.out.println(title);
	      if (button) {
	         System.out.println(" button is enabled");	
	      } else {
	         System.out.println(" button is not enabled");
	      }
	}
	
	@Test
	public void verifyTest()
	{
	String text=	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[1]")).getText();
		System.out.println("Text is "+text);
		System.out.println(text);
		String text1=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[1]/td")).getText();;
		System.out.println(text1);
	}
}

