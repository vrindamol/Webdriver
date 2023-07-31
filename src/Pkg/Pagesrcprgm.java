package Pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesrcprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver ob=new ChromeDriver();
		ob.get("https://www.google.com");
		String src=ob.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}


	}

}
