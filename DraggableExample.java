package com.scs.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableExample {

	public static void main(String[] args) {
		System.setProperty("web.chrome.driver", "f://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/dragabble");
        WebElement ele = driver.findElement(By.id("dragBox"));
        System.out.println(ele.getLocation().x+","+ele.getLocation().y);
        Actions obj = new Actions(driver);
        obj.dragAndDropBy(ele, ele.getLocation().x+100, ele.getLocation().y+100).perform();
        
	}

}
