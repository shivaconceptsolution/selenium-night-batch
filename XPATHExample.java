package com.scs.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATHExample {

	public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///D:/xpathtest.html");
			WebElement txtele= driver.findElement(By.xpath("//*[@class='abc']/input"));
			txtele.sendKeys("Relative XPATH");
			
			//driver.close();

	}

}
