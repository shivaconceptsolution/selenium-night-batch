package com.scs.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionExample23 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shivaconceptsolution.com/backupmain/test.html");
		WebElement ele = driver.findElement(By.id("txt1"));
		Actions obj = new Actions(driver);
		Action ref = obj.moveToElement(ele).click().keyDown(Keys.SHIFT).sendKeys("Welcome").doubleClick().contextClick().build();
		ref.perform();

	}

}
