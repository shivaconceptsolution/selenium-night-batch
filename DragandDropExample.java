package com.scs.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropExample {

	public static void main(String[] args) {
		System.setProperty("web.chrome.driver", "f://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/droppable/");
        Actions obj = new Actions(driver);
        WebElement from = driver.findElement(By.id("draggable"));
        WebElement to = driver.findElement(By.id("droppable"));
        obj.dragAndDrop(from, to).perform();
        String data = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p")).getText();
        if(data.equals("Dropped!"))
        {
        	System.out.println("Success");
        }
        else
        {
        	System.out.println("Try Again");
        }

	}

}
