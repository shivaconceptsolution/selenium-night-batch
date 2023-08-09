package com.scs.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParagraphExample {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver ref = new ChromeDriver();
	ref.get("file:///D:/seleniumlocator.html");
	ref.findElement(By.name("txt1")).sendKeys("Locate By name");
	ref.findElement(By.id("txt2")).sendKeys("Locate By id");
	ref.findElement(By.className("abc")).sendKeys("Locate by Classname");
	//	WebElement ele= ref.findElement(By.tagName("p"));
		ref.findElement(By.linkText("click here")).click();
		ref.navigate().back();
		ref.findElement(By.partialLinkText("scs")).click();
		ref.navigate().back();
		List<WebElement> ele= ref.findElements(By.tagName("p"));
		System.out.println(ele.get(1).getText());
		
		

	}

}
