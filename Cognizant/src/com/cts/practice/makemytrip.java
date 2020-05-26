package com.cts.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.baseclass.BaseClass;

public class makemytrip extends BaseClass {

	public static void main(String[] args) throws Exception {
browserLaunch("chrome", "https://www.makemytrip.com/");
WebElement multicity = driver.findElement(By.xpath("//li[@data-cy='mulitiCityTrip']"));
multicity.click();
driver.findElement(By.xpath("(//span[text()='From'])[1]")).sendKeys("Chennai, India");
//WebElement from = driver.findElement(By.xpath("(//input[@placeholder='From'])[1]"));
//from.sendKeys("Chennai, India");
driver.findElement(By.xpath("//p[text()='Chennai, India']")).click();
driver.findElement(By.xpath("(//span[text()='To'])[1]")).click();
WebElement to = driver.findElement(By.xpath("(//input[@placeholder='To'])[1]"));
to.sendKeys("Delhi, India");
driver.findElement(By.xpath("//p[text()='Delhi, India']")).click();
driver.findElement(By.xpath("(//span[text()='DEPARTURE'])[1]")).click();
driver.findElement(By.xpath("(//p[text()='11'])[1]")).click();
driver.findElement(By.xpath("//span[text()='Travellers & CLASS']")).click();
driver.findElement(By.xpath("//li[@data-cy='adults-2']"));
driver.findElement(By.xpath("//button[text()='APPLY']")).click();
driver.findElement(By.xpath("(//span[text()='From'])[2]")).click();
WebElement from1 = driver.findElement(By.xpath("(//input[@placeholder='From'])[2]"));
from1.sendKeys("Delhi, India");
driver.findElement(By.xpath("//p[text()='Delhi, India']")).click();
driver.findElement(By.xpath("(//span[text()='To'])[2]")).click();
WebElement to1 = driver.findElement(By.xpath("(//input[@placeholder='To'])[2]"));
to1.sendKeys("Chennai, India");
driver.findElement(By.xpath("//p[text()='Chennai, India']")).click();
driver.findElement(By.xpath("(//span[text()='DEPARTURE'])[1]")).click();
driver.findElement(By.xpath("(//p[text()='13'])[1]")).click();
driver.findElement(By.linkText("Search")).click();





	}

}
