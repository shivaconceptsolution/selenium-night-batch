package com.scs.basic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountTotalHyperlink {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shivaconceptdigital.com");
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		System.out.println("Total Hyperlink are"+ele.size());
		ArrayList<String> arr = new ArrayList<String>();
		for(WebElement we : ele)
		{
			String url = we.getAttribute("href");
			System.out.println(url);
			arr.add(url);
			
		}
		for(String data:arr)
		{
			try
			{
			if(data!=null)
			{
			driver.navigate().to(data);
			Thread.sleep(2000);
			driver.navigate().back();
			}
			}
			catch(Exception ex)
			{
				
			}
		}

	}

}
