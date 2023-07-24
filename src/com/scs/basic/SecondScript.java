package com.scs.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shivaconceptdigital.com/digital1");
		driver.findElement(By.xpath("//*[@id=\"header_login_button\"]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"enrol_now\"]")).click();
		

	}

}
