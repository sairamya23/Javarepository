package com.adactln.baseclass;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.rauschig.jarchivelib.IOUtils;

public class BaseClass {

	public static WebDriver driver;

	public static void browserLaunch(String browser,String url) {


		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Adactln\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\eclipse-workspace\\Adactln\\Driver\\chromedriver.exe");
			driver=new FirefoxDriver();

		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	public static void elementgetdisplayed(WebElement element) {
		element.isDisplayed();
	}

	public static void elementisenabled(WebElement element) {
		elementgetdisplayed(element);
		element.isEnabled();
	}

	public static void elementselected(WebElement element) {
		elementgetdisplayed(element);
		elementisenabled(element);
		element.isSelected();
	}


	public static String pagetitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public static String elementgetText(WebElement element)
	{
		String text = element.getText();
		return text;
	}
	
	public static String elementgetAttribute(WebElement element,String attribute)
{
String value = element.getAttribute(attribute);	
return value;
}
	public static void getScreenshot() throws IOException {
TakesScreenshot ss=(TakesScreenshot)driver;
File src=ss.getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\admin\\eclipse-workspace\\Adactln\\Screenshots");
FileUtils.copyFile(src, dest);
	}
	public static void getScreenshothandler() throws IOException {
		TakesScreenshot ss=(TakesScreenshot)driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\admin\\eclipse-workspace\\Adactln\\Screenshots");
FileHandler.copy(src, dest);			}
	
	public static void getScreenshotrobot() throws IOException, AWTException
	{
		Robot r= new Robot();
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rec=new Rectangle(d);
		BufferedImage src = r.createScreenCapture(rec);
		File dest=new File("C:\\Users\\admin\\eclipse-workspace\\Adactln\\Screenshots");
		ImageIO.write(src, "png", dest);
		}

	
	public static void movetoelement(WebElement element) {
Actions ac=new Actions(driver);
ac.moveToElement(element).build().perform();
}

public static void elementclick(WebElement element) {

	element.click();
}		
	public static void elementclick(WebElement element, String val) {
Actions ac=new Actions(driver);
ac.click(element).build().perform();
	}
	
	public static void elementDropanddown(String option, String val, WebElement element)
	{
		
Select sc=new Select(element);
if(option.equalsIgnoreCase("index"))
{
	sc.selectByIndex(Integer.parseInt(val));
}
else if(option.equalsIgnoreCase("value"))
{
	sc.selectByValue(val);
}

else if(option.equalsIgnoreCase("text"))
{
	sc.selectByVisibleText(val);
}
	}
	public static void pagescroll(int height, String scrollType) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
		if(scrollType.equalsIgnoreCase("bottom")) {
	
	js.executeScript("window.scrollTo(0,"+height+")");
		}
		else if(scrollType.equalsIgnoreCase("top"))
		{
			js.executeScript("window.scrollBy(0,"+(-height)+")");
		}
	}
	public static void elementsendKeys(String value,WebElement element) {
element.sendKeys(value);
	}
	
	public static void pagescrollbyview(WebElement element1,WebElement element2) {
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("arguments[0].scrolIntoView();", element1);
js.executeScript("arguments[0].scrollIntoView();",element2);

		
	}

		}
	
	
	
	
		

	