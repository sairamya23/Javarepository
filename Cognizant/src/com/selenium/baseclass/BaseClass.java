package com.selenium.baseclass;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

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
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
		
		String text = element.getText();
		if(text.isEmpty()==false)
		{
		element.clear();}
		
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
	}
public static void elementClick(WebElement element)
{
	//WebDriverWait wb=new WebDriverWait(driver, 30);
	//wb.until(ExpectedConditions.elementToBeClickable(element));
	element.click();}


public static String pageTitle()
{
	String title = driver.getTitle();
	return title;
}

public static void elementSelect(String selectoption,WebElement element,String val)
{
	Select s=new Select(element);element
	Point xyvalue=element.getLocation()
	
	if(selectoption.equalsIgnoreCase("index"))
	{
	s.selectByIndex(Integer.parseInt(val));
	}
	else if(selectoption.equalsIgnoreCase("value"))
			{s.selectByValue(val);
			}
	else
	{
	s.selectByVisibleText(val);
	}
}

public static String selectedValue(WebElement element) {

	Select s=new Select(element);
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	String text = firstSelectedOption.getText();
	return text;
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

public static void pagescrollbyview(WebElement element1,WebElement element2) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", element1);
	js.executeScript("arguments[0].scrollIntoView();", element2);
}
public static void movetoelement(WebElement element)
{
if(element.isDisplayed()) {
Actions ac=new Actions(driver);
ac.moveToElement(element).build().perform();
}
}

public static void elementDoubleClick(WebElement element)
{
	Actions ac=new Actions(driver);
	WebDriverWait wb=new WebDriverWait(driver, 3000);
	wb.until(ExpectedConditions.elementToBeClickable(element));
	ac.doubleClick(element).build().perform();
}

public static void elementRightClick(WebElement element)
{
	Actions ac=new Actions(driver);
	WebDriverWait wb=new WebDriverWait(driver, 3000);
	wb.until(ExpectedConditions.elementToBeClickable(element));
	ac.contextClick(element).build().perform();
}
public static void elementDragandDrop(WebElement element1,WebElement element2)
{
	Actions ac=new Actions(driver);
	WebDriverWait wb=new WebDriverWait(driver, 3000);
	wb.until(ExpectedConditions.elementToBeClickable(element1));
	wb.until(ExpectedConditions.visibilityOf(element2));
	ac.dragAndDrop(element1, element2);
}
public static void alertHandle(String alerttype) {
Alert alert=driver.switchTo().alert();
if(alerttype.equalsIgnoreCase("simple"))
{
	alert.accept();
}
else if(alerttype.equalsIgnoreCase("confirmaccept"))
{
	alert.accept();
}
if(alerttype.equalsIgnoreCase("confirmdismiss"))
{
	alert.dismiss();
}
driver.switchTo().defaultContent();
}
public static void alertHandle(String alerttype,WebElement element,String text) {
	Alert alert=driver.switchTo().alert();
	if(alerttype.equalsIgnoreCase("prompt"))
	{
		textsendkeys(text, element);
		alert.accept();
	}
driver.switchTo().defaultContent();

}
public static void navigationHandle(String option)
{
	if(option.equalsIgnoreCase("back")) {
	driver.navigate().back();}
	else if(option.equalsIgnoreCase("forward")) {
		driver.navigate().forward();}
	else if(option.equalsIgnoreCase("refresh")) {
		driver.navigate().refresh();}
	
}
public static void navigationHandle(String option,String url)
{
	if(option.equalsIgnoreCase("url")) {
	driver.navigate().to(url);
	}
		
}

}



