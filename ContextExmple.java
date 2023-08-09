package com.scs.basic;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class ContextExmple {

	public static void main(String[] args) {
		 System.setProperty("web.chrome.driver", "c://chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.shivaconceptsolution.com/backupmain/test.html");
	        WebElement input1 = driver.findElement(By.id("txt1"));
	        Actions obj = new Actions(driver);
	        Action text1 = obj.moveToElement(input1).click().keyDown(Keys.SHIFT).sendKeys("shubham").keyUp(Keys.SHIFT).doubleClick().keyDown(Keys.CONTROL).sendKeys("C").build();
	        text1.perform();
	        WebElement input2 = driver.findElement(By.id("txt3"));
	        Action text2 = obj.moveToElement(input2).click().keyDown(Keys.CONTROL).sendKeys("V").build();
	        text2.perform();

	}

}
