package Testng;

import java.time.Duration;
import java.util.List;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepickerprg {
	WebDriver driver;
	String baseurl="https://www.booking.com";
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
	
	}
	@Test
	public void test() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/div[21]/div/div/div/div[1]/div[1]/div/button/span/span/svg")).click();
		driver.findElement(By.xpath("//*[@id=\":Ra9:\"]")).sendKeys("Munnar",Keys.ENTER);
		
		while(true)
		{
			String Monthtext=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3")).getText();
			System.out.println("Month="+Monthtext);
			if(Monthtext.equals("July 2023"))
			{
				System.out.println("Month seected");
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button")).click();
			}
		
	}
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr/td/span/span"));
		for(WebElement dateelement:alldates)
		{
			String date=dateelement.getText();
			System.out.println("date is"+date);
			if(date.equals("20"))
			{
				dateelement.click();
				break;
			}
			while(true)
			{
				String Monthtext2=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3")).getText();
				System.out.println("Month="+Monthtext2);
				if(Monthtext2.equals("August 2023"))
				{
					System.out.println("month selected");
					break;
				}
				else
				{
					driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button")).click();
				}
			}
			List<WebElement> alldates2=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr/td/span/span"));
			for(WebElement dateelement:alldates2)
			{
				String date=dateelement.getText();
				System.out.println("date is"+date);
				if(date.equals("20"))
				{
					dateelement.click();
					break;
				}
		}
	}
		
	}
	

