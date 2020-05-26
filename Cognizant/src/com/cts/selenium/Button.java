package com.cts.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\admin\\eclipse-workspace\\Cognizant\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://my.naukri.com/account/register/basicdetails");
WebElement button1=driver.findElement(By.name("userType"));
button1.click();
	WebElement Button=driver.findElement(By.name("uploadCV"));
	Point location = Button.getLocation();
	int x=location.getX();
	int y=location.getY();
	System.out.println("x is "+x);
	System.out.println("y is" +y);
	Dimension size = Button.getSize();
	System.out.println("Size is" +size);
	System.out.println("Height is" +size.height);
	System.out.println("Height is get" +size.getHeight());
	System.out.println("Width is" +size.width);
	System.out.println("Width is get" +size.getWidth());
	String css1 = Button.getCssValue("background-color");
	String css2 = Button.getCssValue("font-size");
	String css3 = Button.getCssValue("font-family");
	System.out.println("Back color is: "+css1);
	System.out.println("Font size is: "+css2);
	System.out.println("Font family is: "+css3);
	
	
	}
	
	
}
