package com.scs.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver scs = new ChromeDriver();
		scs.get("https://shivaconceptdigital.com");
		WebElement ele = scs.findElement(By.xpath("//*[@id=\"first_logo_1\"]"));
		int x = ele.getLocation().x;
		int y = ele.getLocation().y;
		System.out.println("x="+x);
		System.out.println("y="+y);
	

	}

}
