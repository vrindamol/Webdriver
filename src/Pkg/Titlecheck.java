package Pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Titlecheck {

	public static void main(String[] args) {
		ChromeDriver ob=new ChromeDriver();
		ob.get("https://www.rediff.com/");
		String actualtitle=ob.getTitle();
		String exp="Rediff";
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
