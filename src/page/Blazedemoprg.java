package page;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class Blazedemoprg {
	WebDriver driver;
	By BlazeName=By.id("name");
	By BlazeCompany=By.xpath("//*[@id=\"company\"]");	
	By Emailaddress=By.xpath("//*[@id=\"email\"]");
	By Password=By.xpath("//*[@id=\"password\"]");
	By Confirmpswd=By.xpath("//*[@id=\"password-confirm\"]");
	By registerbtton=By.xpath("//button[@type='submit']");

	public Blazedemoprg (WebDriver driver)
	{
		this.driver=driver;
	}


	public void  setvalue(String Name,String Company,String Email,String Pswd,String Confirm)
	{
		driver.findElement(BlazeName).sendKeys(Name);
		driver.findElement(BlazeCompany).sendKeys(Company);
		driver.findElement(Emailaddress).sendKeys(Email);
		driver.findElement(Password).sendKeys(Pswd);
		driver.findElement(Confirmpswd).sendKeys(Confirm);
		
		
		
	}
	public void register()
	{
		driver.findElement(registerbtton).click();
		driver.navigate().back();
	}
	
}

