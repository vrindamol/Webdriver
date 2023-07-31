package Pkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Redifflogo {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver =new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		
	}
	@Test
	public void Test1()
	{
		//WebElement i=driver.findElement(By.xpath("//img[@title='Rediff.com']"));
		Boolean logo=driver.findElement(By.xpath("//img[@title='Rediff.com']")).isDisplayed();
		//Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

	      //verify if status is true
	      if (logo) {
	         System.out.println("Logo present");
	      } else {
	         System.out.println("Logo not present");
	      }
	}
	@Test
	public void Test2()
	{
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("Vrinda");
		driver.findElement(By.xpath("//*[@id=\"Register\"]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();
	}
	@Test
	public void test3() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D://redifscree.png"));
		WebElement button=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		File buttonscreenshot=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(buttonscreenshot, new File("./Screenshot//buttonscreenshot.png"));
	}
}
