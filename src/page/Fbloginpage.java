package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage 
{
	WebDriver driver;
	By fbemail=By.id("email");
	By fbpswd=By.id("pass");
	By fblogin=By.name("login");


public  Fbloginpage(WebDriver driver)
{
	this.driver=driver;
}


public void  setvalue(String email,String password)
{
	driver.findElement(fbemail).sendKeys(email);
	driver.findElement(fbpswd).sendKeys(password);
	
}
public void login()
{
	driver.findElement(fblogin).click();
}
}
