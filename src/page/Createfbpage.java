package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Createfbpage {
	WebDriver driver;
	By createpage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By getstarted=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");
	
	public Createfbpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void createpage()
	{
		driver.findElement(createpage).click();
		String s=driver.getTitle();
		System.out.println(s);
		
	}
	public void getstarted()
	{
		driver.findElement(getstarted).click();
	}
}