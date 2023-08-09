package com.scs.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class EroomRentExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://eroomrent.in/");
		Actions obj = new Actions(driver);
	    WebElement source = driver.findElement(By.linkText("Owner-G"));
	    Action ref = obj.moveToElement(source).build();
	    ref.perform();
		driver.findElement(By.partialLinkText("Login")).click();

	}

}
