package Pkg;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Amazon {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		
	}
	@Test
	public void Test1()
	{
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("mobiles",Keys.ENTER);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[10]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span\r\n")).click();
		driver.navigate().back();
		
		/*driver.findElement(By.xpath("//div[@id='nav-cart-count-container']/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[2]")).click();
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys("vriiindathankan7@gmail.com");
		driver.findElement(By.xpath("//input[@id='ap_email']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']")).click();
	*/
		
		//div[@id='search']/script[1]/script/script[2]/script[3]/script[1]/script/span/div[1]/div[1]/div[1]/div/spn/div[1]/div/div/
		
				
		//span[@class='a-size-medium a-color-base a-text-normal']
	}
	
}
