package com.scs.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidateTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://shivaconceptdigital.com/digital1");
		String title = ref.getTitle();
		if(title!="")
		{
		if(title.length()>0 && title.length()<=72)
		{
		System.out.println("Title Length is Correct" + title + " "+ title.length());
		}
		else
		{
			System.out.println("Incorrect Title length");
		}
		}
		else
		{
			System.out.println("Title is not set");
		}
		

	}

}
