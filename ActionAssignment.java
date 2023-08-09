package com.scs.basic;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class ActionAssignment {

	public static void main(String[] args) {
		System.setProperty("web.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://shivaconceptsolution.com/");
        String c = driver.findElement(By.cssSelector("a[href=\"./about\"]")).getCssValue("color");
        String bc = driver.findElement(By.cssSelector("a[href=\"./about\"]")).getCssValue("background-color");

        System.out.println("Color before mouse hover =  color : "+c+" background color : "+bc);


        Actions obj = new Actions(driver);
        WebElement ele = driver.findElement(By.cssSelector("a[href=\"./about\"]"));
        Action ref = obj.moveToElement(ele).build();
        ref.perform();
        String c1 = ele.getCssValue("color");
        String bc1 = ele.getCssValue("background-color");
        System.out.println("Color after mouse hover  =  color : "+c1+" background color : "+bc1);

	}

}
