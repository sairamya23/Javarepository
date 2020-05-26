package com.cts.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\eclipse-workspace\\Cognizant\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement fname=driver.findElement(By.xpath("//input[@name='firstname']"));
		fname.sendKeys("Ramya");
		WebElement lname=driver.findElement(By.xpath("//input[@name='lastname']"));
		lname.sendKeys("Ravikumar");
		WebElement mobno=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		mobno.sendKeys("9710919407");
		WebElement pwd=driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		pwd.sendKeys("dhanvin@1");
		WebElement date=driver.findElement(By.id("day"));
		date.sendKeys("28");
		WebElement month=driver.findElement(By.id("month"));
		month.sendKeys("Dec");
		WebElement year=driver.findElement(By.id("year"));
		year.sendKeys("1998");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		//driver.findElement(By.name("websubmit")).click();

		WebElement fbtext=driver.findElement(By.xpath("//div[@class='mbs _52lq fsl fwb fcb']"));
		String text = fbtext.getText();
		System.out.println(text);
		String attribute = year.getAttribute("value");
		System.out.println(attribute);
		List<WebElement> gen = driver.findElements(By.xpath("//div[@class='mtm mbs _2_68']"));
		for (int i=0;i<gen.size();i++)

		{
			System.out.println(gen.get(i));

		}

	}
}