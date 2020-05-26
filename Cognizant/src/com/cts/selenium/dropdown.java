package com.cts.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\admin\\eclipse-workspace\\Cognizant\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.leafground.com/pages/Dropdown.html");
WebElement dd1=driver.findElement(By.id("dropdown1"));
WebElement dd2=driver.findElement(By.name("dropdown2"));
WebElement dd3=driver.findElement(By.id("dropdown3"));
WebElement dd=driver.findElement(By.className("dropdown"));
Select st=new Select(dd1);
Select sc=new Select(dd2);
Select sl=new Select(dd3);
Select se=new Select(dd);
st.selectByIndex(2);
st.selectByValue("1");
st.selectByVisibleText("Loadrunner");
sc.selectByIndex(2);
sl.selectByIndex(3);
List<WebElement> options = se.getOptions();

for (WebElement x : options) 
{
	System.out.println(x.getText());
}
int y=options.size();
System.out.println("The count of dropdown Elements are" +y);
	WebElement dd4=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
	dd4.sendKeys("Appium");
	
	WebElement muldd=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
	Select s=new Select(muldd);
	if(s.isMultiple())
	{
	s.selectByIndex(2);
	s.selectByVisibleText("Loadrunner");
	s.selectByValue("1");
	
	}
	
	s.deselectByIndex(2);	
	boolean equals = s.equals(st);
	System.out.println(equals);
	List<WebElement> als = s.getAllSelectedOptions();
	for (WebElement n : als) {
	System.out.println(n.getText());	
	System.out.println(als.size());
	}
	WebElement fs = s.getFirstSelectedOption();
	System.out.println(fs.getText());
	
}
}