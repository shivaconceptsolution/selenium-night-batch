package com.scs.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertboxExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("http://output.jsbin.com/usidix/1");
		ref.findElement(By.xpath("//html/body/input")).click();
		String s =ref.switchTo().alert().getText();
		System.out.println(s);
		ref.switchTo().alert().accept();

	}

}
