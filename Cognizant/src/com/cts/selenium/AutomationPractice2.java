package com.cts.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationPractice2 extends SuperBaseClass{

	public static void main(String[] args) throws Exception {
		browserLaunch("chrome","http://automationpractice.com/index.php");
		WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
		elementClick(signIn);
		WebElement email1 = driver.findElement(By.id("email"));
		email1.sendKeys("sairamya23@gmail.com");
		WebElement passwd = driver.findElement(By.id("passwd"));
		passwd.sendKeys("dhanvin@1");
		WebElement sign = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		elementClick(sign);
		screenshot("4");
		pagescroll("down",200);
		WebElement women1 = driver.findElement(By.xpath("//a[@class='sf-with-ul']"));
		movetoelement(women1);
		WebElement casualdress = driver.findElement(By.xpath("//a[@title='Casual Dresses'][1]"));
		elementClick(casualdress);
		WebElement casualdressMenu = driver.findElement(By.xpath("//span[contains(text(),'Casual Dresses')][1]"));
		webelementDisplayed("CasualdressMenu",casualdressMenu);
		List<WebElement> selections = driver.findElements(By.xpath("//div[@class='checker']"));
selections.get(8).click();
for (WebElement options : selections) {
	boolean selected = webelementSelected("Options",options);
	
if(selected==false)
{
elementClick(options);
}
}
WebElement range = driver.findElement(By.id("layered_price_slider"));
range.click();
Robot r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_LEFT);
r.keyRelease(KeyEvent.VK_LEFT);
r.keyRelease(KeyEvent.VK_CONTROL);
WebElement dressing = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
String dressname1 = dressing.getAttribute("title");
elementClick(dressing);
Thread.sleep(5000);
//WebElement dressname= driver.findElement(By.xpath("//h1[text()='Printed Dress']"));
// dressname2 = dressname.getText();
//if(dressname1.equalsIgnoreCase(dressname2))
//{
//	System.out.println("Dressname matched");
//}
	//WebElement quantity = driver.findElement(By.name("qty"));
//WebElement plusicon = driver.findElement(By.xpath("//i[@class='icon-plus']"));
//plusicon.click();
//WebElement size = driver.findElement(By.id("group_1"));
	//elementSelect("Value",size,"2");
	WebElement addtocart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
	addtocart.click();
screenshot("5");
pagescroll("down",200);	
WebElement proceedcheckout = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]"));
	proceedcheckout.click();
	String carttot=driver.findElement(By.xpath("//td[@class='cart_total']")).getText();
		String totalprod = driver.findElement(By.id("total_product")).getText();
	if(carttot.equals(totalprod))
	{System.out.println("Total is correct");
	}
	List<WebElement> deladd = driver.findElements(By.xpath("//ul[@class='address first_item item box']"));
System.out.println(deladd.size());
	List<WebElement> invoiceadd = driver.findElements(By.xpath("//ul[@class='address last_item alternate_item box']"));
	boolean equals = deladd.equals(invoiceadd);
	if(equals==true) {
	System.out.println("Address matched");
		}
	WebElement proceedtocheckout = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
	proceedtocheckout.click();
	WebElement proceedtocheckout1 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]"));
	proceedtocheckout1.click();
	driver.findElement(By.id("cgv")).click();
	WebElement proceedtocheckout2 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
	proceedtocheckout2.click();
	WebElement paybywire = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
	paybywire.click();
	WebElement confirmorder = driver.findElement(By.xpath("//span[text()='I confirm my order']"));
	confirmorder.click();
	screenshot("6");
		driver.quit();
	}

	private static void pagescroll(String string, int i) {
		// TODO Auto-generated method stub
		
	}


}