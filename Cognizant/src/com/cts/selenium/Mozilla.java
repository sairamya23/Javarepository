package com.cts.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mozilla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", 
		"C:\\Users\\admin\\eclipse-workspace\\Cognizant\\Driver\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.com/");
	}

}
