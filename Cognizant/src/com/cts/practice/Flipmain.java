package com.cts.practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.selenium.baseclass.BaseClass;

public class Flipmain extends BaseClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

Scanner s=new Scanner(System.in);
Scanner sc=new Scanner(System.in);
System.out.println("Enter the menu option");
String menuoption=s.nextLine();
System.out.println("Enter the submenu");
String submenuoption=sc.nextLine();
browserLaunch("chrome", "https://www.flipkart.com/");
Robot r=new Robot();
r.keyPress(KeyEvent.VK_ESCAPE);
r.keyRelease(KeyEvent.VK_ESCAPE);;
List<WebElement> menu = driver.findElements(By.tagName("span"));
List<WebElement> submenu = driver.findElements(By.tagName("a"));
Actions ac=new Actions(driver);
	for (WebElement webElement : menu) {
		if(webElement.getText().equalsIgnoreCase(menuoption))
		{
			Thread.sleep(4000);
		ac.moveToElement(webElement).build().perform();
		break;}
	}	
	
	Thread.sleep(4000);
		for (WebElement webElement2 : submenu) {
			if(webElement2.getAttribute("title").equalsIgnoreCase(submenuoption))
				{webElement2.click();;
			break;}
		}
		
		
		
	
	}
	
	}


