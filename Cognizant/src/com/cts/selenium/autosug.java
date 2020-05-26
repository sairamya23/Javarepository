package com.cts.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosug {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\eclipse-workspace\\Cognizant\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement text = driver.findElement(By.name("q"));
		text.sendKeys("Greens tech"); 
		Thread.sleep(4000);
		List<WebElement> x = driver.findElements(By.xpath("//span[contains(text(),'greens tech')]"));
		System.out.println(x.size());
		
		for (WebElement y : x) {
			System.out.println(y.getText());
		}
	String tagName = text.getTagName();
	System.out.println(tagName);
	driver.quit();
	
	}

}