package com.scs.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueCommandExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shivaconceptsolution.com/backupmain/test.html");
		WebElement ele = driver.findElement(By.xpath("//html/body/input[8]"));
		System.out.println(ele.getCssValue("color"));
		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"txt1\"]"));
		System.out.println(ele1.getCssValue("width"));
		WebElement el2 = driver.findElement(By.xpath("//*[@id=\"txt1\"]"));
		int x = el2.getLocation().x;
		int y = el2.getLocation().y;
		System.out.println("x="+x + "y="+y);

	}

}
