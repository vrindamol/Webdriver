package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Contactdetails
{
	WebDriver driver;
	By contactname=By.xpath("//*[@id=\"txtcontactPerson\"]");
	By Contactno=By.xpath("//*[@id=\"txtMobileNo\"]");
	By Emailid=By.xpath("//*[@id=\"txtEmail\"]");
	
	public Contactdetails(WebDriver driver)
	{
		this.driver=driver;
	}
	public void  setvalues(String name,String No,String email)
	{
		driver.findElement(contactname).sendKeys(name);
		driver.findElement(Contactno).sendKeys(No);
		driver.findElement(Emailid).sendKeys(email);
		}
}
