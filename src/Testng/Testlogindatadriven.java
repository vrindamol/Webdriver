package Testng;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testlogindatadriven {
	ChromeDriver driver;
	String baseurl="https://practicetestautomation.com/practice-test-login/";
	
	@BeforeTest
	public void setUp()
	{
		driver =new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void testlogin() throws Exception
	{
		FileInputStream ob=new FileInputStream("E:\\Automation.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(ob);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int rowsize=sh.getLastRowNum();
		for(int i=1;i<=rowsize;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Username is = "+username);
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Password is ="+pswd);
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(pswd);
			driver.findElement(By.id("submit")).click();
			String currenturl=driver.getCurrentUrl();
			if(baseurl.equals(currenturl))
			{
				System.out.println("Login failed");
			}
			else
			{
				System.out.println("Login sucessfull");
			}
		}
	
}
	
}