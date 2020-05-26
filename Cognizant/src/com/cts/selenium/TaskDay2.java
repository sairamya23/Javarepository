package com.cts.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskDay2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\eclipse-workspace\\Cognizant\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		//driver.get("https://www.google.com/");
		//driver.navigate().back();
		//driver.navigate().to("https://www.amazon.in/");
		
		//Facebook login
		/*WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("sairamya23@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("sairam");
		WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
		*/
		
		//Redbus from and to
		
		/*driver.get("https://www.redbus.in/");
		Thread.sleep(4000);	
		WebElement From = driver.findElement(By.id("src"));
		From.sendKeys("Chennai (All Locations)");
		WebElement To = driver.findElement(By.id("dest"));
		To.sendKeys("Madurai (All Locations)");*/
		
		//ICICI Login
		
		//driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		/*driver.findElement(By.id("user-id-goahead")).click();
		Thread.sleep(3000);
		WebElement userid = driver.findElement(By.xpath("//input[@title='User Id']"));
		Thread.sleep(3000);
		userid.sendKeys("sairamya23");
		WebElement pwd = driver.findElement(By.xpath("//input[@title='Password']"));
		pwd.sendKeys("password");
		driver.quit();
		*/
		
	/*	WebElement mobno = driver.findElement(By.xpath("//input[@title='Registered Mobile Number']"));
		driver.findElement(By.xpath("(//img[@title='arrow'])[2]")).click();
		Thread.sleep(2000);
		mobno.sendKeys("9710919408");*/
		
		//HDFC Customer login
		
		
		/*driver.get("https://netbanking.hdfcbank.com/");
		driver.switchTo().frame(0);
		WebElement custId = driver.findElement(By.xpath("//input[@type='text']"));
		
		Thread.sleep(4000);
		Actions ac=new Actions(driver);
		ac.sendKeys(custId,"1234567").build().perform();
		driver.quit();*/
		
		//SWIGGY
		/*driver.get("https://www.swiggy.com/");
		WebElement location = driver.findElement(By.id("location"));
		location.sendKeys("Chennai, Tamilnadu, India");
		
		//SNAPDEAL
		
		driver.get("https://www.snapdeal.com/login");
		WebElement userId = driver.findElement(By.id("userName"));
		userId.sendKeys("9710919408");*/
		
		//INstagram
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en)%20login%20page");
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
		File destFile=new File("C:\\Users\\admin\\Documents\\sample.png");
		FileUtils.copyFile(srcFile, destFile);

	}

}
