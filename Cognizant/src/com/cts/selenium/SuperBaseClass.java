package com.cts.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuperBaseClass {
 
	
	public static WebDriver driver;
		
	public static WebDriver browserLaunch(String browser,String url) throws Exception
	{
		
		String property = System.getProperty("user.dir");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",property+("\\Driver\\chromedriver.exe"));
		driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
		System.setProperty("Webdriver.gecko.driver", "user.dir"+"\\Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		}	
	
		else if(browser.equalsIgnoreCase("ie"))
	{
		System.setProperty("Webdriver.ie.driver", "user.dir"+"\\Driver\\ie.exe");
		driver=new FirefoxDriver();
	}
	else
	{
		System.out.println("Invalid browser");
		throw new Exception();
	}
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(url);
	driver.manage().window().maximize();
	return driver;
		
	}
	
	public static boolean webelementDisplayed(String elementname,WebElement element)
	{
	boolean displayed = element.isDisplayed();
	System.out.println(elementname+ "display : "+displayed);
	return displayed;
	
	}
	
	public static boolean webelementSelected(String elementname,WebElement element)
	{
	boolean selected = element.isSelected();
	System.out.println(elementname+ "selected : "+selected);
	return selected;
	
	}
	
	public static boolean webelementEnabled(String elementname,WebElement element)
	{
	boolean enabled = element.isEnabled();
	System.out.println(elementname+ "enabled : "+enabled);
	return enabled;
	
	}
	public static String webelementgettext(WebElement element)
	{
		String text = element.getText();
		System.out.println("The text value is: "+text);
		return text;
		
	}
	
	public static String webelementgetattribute(WebElement element,String attribute) 
	{
    String value = element.getAttribute(attribute);
    return value;
	}
	
	public static String pagecurrenturl()
	{
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		
	}
	
	public static void textclear(WebElement element)
	{
		if(element.getText().isEmpty()==false)
		{
			element.clear();
		}
	}
	
	public static void textsendkeys(String value,WebElement element)
	{
		if(element.isDisplayed() && element.isEnabled())
		{
			element.sendKeys(value);
		}
	}
	
	public static void textsendkeys(WebElement element,String value)
	{
		Actions ac=new Actions(driver);
		ac.sendKeys(element, value);
	}
	
	
	
public static void screenshot(String ssname) throws IOException
{
	TakesScreenshot screenshot1=(TakesScreenshot) driver;
	File srcFile=screenshot1.getScreenshotAs(OutputType.FILE);
	File destFile=new File(System.getProperty("user.dir")+"\\Screenshot\\" +ssname+".png");
	FileUtils.copyFile(srcFile, destFile);
	System.out.println("Screenshot taken");
	}
public static void elementClick(WebElement element)
{
	WebDriverWait wb=new WebDriverWait(driver, 10);
	wb.until(ExpectedConditions.elementToBeClickable(element));
	Actions ac=new Actions(driver);
	ac.click(element).build().perform();
}


public static void pageTitle() {
System.out.println("Page Title is: "+driver.getTitle());
}

public static void elementSelect(String selectoption,WebElement element,String val)
{
	int index;
	index=Integer.parseInt(val);
	Select s=new Select(element);
	if(selectoption.equalsIgnoreCase("index"))
	{
	s.selectByIndex(index);
	}
	else if(selectoption.equalsIgnoreCase("value"))
			{s.selectByValue(val);
			}
	else
	{
	s.selectByVisibleText(val);
	}
}

public static void pagescrollvertical(String scrolltype,int height) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	if(scrolltype.equalsIgnoreCase("down"))
	{
	js.executeScript("window.scrollTo(0,"+height+")");}
	else if(scrolltype.equalsIgnoreCase("Up")) {
		js.executeScript("window.scrollTo(0,"+(-height)+")");}
	
	}
		
public static void pagescrollvertical(String scrolltype) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	if(scrolltype.equals("bottom")) {
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");}
	else if(scrolltype.equals("top")) {
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");}
}
public static void pagescrollhorizontal(String scrolltype,int height) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	if(scrolltype.equalsIgnoreCase("right"))
	js.executeScript("window.scrollTo("+height+",0)");
	if(scrolltype.equalsIgnoreCase("left"))
		js.executeScript("window.scrollTo("+(-height)+",0)");
}
public static void movetoelement(WebElement element)
{
	element.isDisplayed();
Actions ac=new Actions(driver);
ac.moveToElement(element).build().perform();

}
}



