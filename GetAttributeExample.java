package com.scs.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://shivaconceptdigital.com/digital1");
		ref.manage().window().maximize();
		WebElement ele = ref.findElement(By.xpath("//*[@id=\"first_logo_1\"]"));
		String s = ele.getAttribute("src");
		System.out.println(s);

	}

}
