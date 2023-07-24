package com.scs.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckUrlOfSCSDigital {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://shivaconceptdigital.com/digital1");
		ref.manage().window().maximize();
		ref.findElement(By.xpath("//html/body/div[10]/div[1]/div[1]/div/div[1]/div/a[2]")).click();
		String s = ref.getCurrentUrl();
		System.out.println(s);

	}

}
