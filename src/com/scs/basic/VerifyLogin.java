package com.scs.basic;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class VerifyLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver scs = new ChromeDriver();
		scs.get("https://eroomrent.in");
		WebElement ele = scs.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[3]/a"));
		Actions obj = new Actions(scs);
		Action ack = obj.moveToElement(ele).build();
		ack.perform();
	    scs.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[3]/ul/li[2]/a")).click();
		scs.findElement(By.xpath("//html/body/div/div/center/form/input[1]")).sendKeys("riteshmahajan1997@gmail.com");
		scs.findElement(By.xpath("//html/body/div/div/center/form/input[2]")).sendKeys("ritesh@123");
		scs.findElement(By.xpath("//html/body/div/div/center/form/center/input")).click();
		
		if(scs.getCurrentUrl().equals("https://eroomrent.in/owner/dashboard.php"))
		{
			System.out.println("Login Successfully");
		}
		else
		{
			System.out.println("Login Not Successfully");
		}
	    scs.close();

	}

}
