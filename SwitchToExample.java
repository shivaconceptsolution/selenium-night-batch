package com.scs.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver ref = new ChromeDriver();
	//	ref.get("https://demo.guru99.com/selenium/deprecated.html");
		ref.get("file:///C:/Users/DELL/Desktop/htmlbackup/frameexample.html");
		
		ref.switchTo().frame("top");
		ref.findElement(By.xpath("//html/body/a[1]")).click();

	}

}
