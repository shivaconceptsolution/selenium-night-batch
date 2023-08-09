package com.scs.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorExampleNew {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://www.shivaconceptsolution.com/backupmain/test.html");
		Select s = new Select(ref.findElement(By.cssSelector("select[multiple=true]")));
		s.selectByValue("TestNG");
		s.selectByValue("Selenium GRID");
		s.selectByVisibleText("Web Driver");
		s.deselectByVisibleText("Web Driver");
		
		Select s1 = new Select(ref.findElement(By.cssSelector("select[id=c]")));
		s1.selectByValue("TestNG");
	
		
		

	}

}
