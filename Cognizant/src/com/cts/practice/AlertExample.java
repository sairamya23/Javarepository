package com.cts.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\admin\\eclipse-workspace\\Cognizant\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		WebElement alertbox = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		alertbox.click();
		Thread.sleep(3000);
		Alert alertb=driver.switchTo().alert();
		alertb.accept();
		WebElement confirm = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		confirm.click();
		Thread.sleep(3000);
		Alert confirmalert=driver.switchTo().alert();
		confirmalert.accept();
		

	}
}