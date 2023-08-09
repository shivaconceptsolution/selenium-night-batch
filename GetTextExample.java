package com.scs.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shivaconceptdigital.com/digital1");
		//String data = driver.findElement(By.xpath("//html/body/div[3]/div/div[1]/h1")).getText();
		//System.out.println(data);
		List<WebElement> ls = driver.findElements(By.tagName("h1"));
	    System.out.println(ls.size());
	    if(ls.size()==1)
	    {
	    	System.out.println("Valid heading text");
	    }
	    else
	    {
	    	System.out.println("In Valid heading text");
	    }
		

	}

}
