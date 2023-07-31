package Testng;

import javax.swing.JList.DropLocation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dragprgm {
	ChromeDriver driver;
	
	
	
	@BeforeTest
	public void setUp()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/");
	}
	@Test
	public void drag()
	{
		WebElement drag= driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		Actions act=new Actions(driver);
		
		WebElement drop= driver.findElement(By.xpath("//*[@id='droppable']"));
		act.dragAndDrop(drag,drop).perform();
		String actualtitle=drop.getText();
		String exp="Dropped";
		if(actualtitle.equalsIgnoreCase(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		
	}
}
