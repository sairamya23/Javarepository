package com.cts.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\eclipse-workspace\\Cognizant\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		WebElement btn1 = driver.findElement(By.id("home"));
		String oldwindow = driver.getWindowHandle();
		btn1.click();
		Set<String> handles = driver.getWindowHandles();
		for (String newwindows : handles) {
			driver.switchTo().window(newwindows);
		}
		System.out.println("Windows opened"+handles.size());
		WebElement edit = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		edit.click();
		if(!handles.equals(oldwindow)) {
	driver.close();}
		
		driver.switchTo().window(oldwindow);

		WebElement btn2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		btn2.click();

		Set<String> handle1 = driver.getWindowHandles();
		System.out.println("Number of windows"+handle1.size());
		WebElement btn3 = driver.findElement(By.id("color"));
		for (String string : handle1) {
			if(!string.equals(oldwindow))
			{driver.close();
			}
		}
	}
}



