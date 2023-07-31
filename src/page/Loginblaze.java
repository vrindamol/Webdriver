package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginblaze {
	WebDriver driver;
	
	By Emaild=By.xpath("//*[@id=\"email\"]");
	By password=By.xpath("//*[@id=\"password\"]");
	By Remember=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[3]/div/div/label/input");
	By Loginbutton=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
	By loginlink=By.xpath("//*[@id='app-navbar-collapse']/ul[2]/li[1]/a");
	
	public Loginblaze (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalue(String email,String pswd)
	{
		
		driver.findElement(Emaild).sendKeys(email);
		driver.findElement(password).sendKeys(pswd);
	}
	public void login()
	{
		driver.findElement(Remember).click();
		driver.findElement(Loginbutton).click();
	}
}

