package com.cts.selenium;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractice1 extends SuperBaseClass {

	public static void main(String[] args) throws Exception {

		int count=0;
		browserLaunch("chrome","http://automationpractice.com/index.php");
		
		/*driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();*/
		WebElement logo = driver.findElement(By.xpath("//img[@class='img-responsive']"));
		webelementDisplayed(logo);
		
		/*boolean status1=logo.isDisplayed();
		System.out.println("Logo Display: "+status1);*/
		WebElement mobno = driver.findElement(By.xpath("//strong[text()='0123-456-789']"));
		String mobileno = webelementgettext(mobno);
		for(int i=0;i<mobileno.length();i++)
		{
			if(mobileno.charAt(i)>='0' && mobileno.charAt(i)<='9')
				count+=1;
		}
		System.out.println(mobileno);
		System.out.println("Count of digits in mob no: "+count);
		WebElement contactUs = driver.findElement(By.xpath("//a[text()='Contact us']"));
		webelementDisplayed(contactUs);
		//boolean status2=contactUs.isDisplayed();
		//System.out.println("Contact Us Display: "+status2);
		WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
		//boolean status3=signIn.isDisplayed();
		//System.out.println("signIn Display: "+status3);
		webelementDisplayed(signIn);
		WebElement search = driver.findElement(By.id("search_query_top"));
		//boolean status4=search.isDisplayed();
		//System.out.println("Search Display: "+status4);
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		boolean status5=women.isDisplayed();
		System.out.println("Women Display: "+status5);
		WebElement dresses = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		boolean status6=dresses.isDisplayed();
		System.out.println("Dresses Display: "+status6);
		WebElement tshirts = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
		boolean status7=tshirts.isDisplayed();
		System.out.println("T-shirts Display: "+status7);
		TakesScreenshot screenshot1=(TakesScreenshot) driver;
		File srcFile=screenshot1.getScreenshotAs(OutputType.FILE);
		File destFile=new File("C:\\Users\\admin\\Documents\\Screenshot\\Screenshot1.png");
		FileUtils.copyFile(srcFile, destFile);
		signIn.click();
		String title = driver.getTitle();
		System.out.
		println("Title is: "+title);
		WebElement authentication = driver.findElement(By.xpath("//h1[@class='page-heading']"));
		boolean status8 = authentication.isDisplayed();
		System.out.println("Authentication display: "+status8);
		WebElement createacc = driver.findElement(By.xpath("(//h3[@class='page-subheading'])[1]"));
		boolean status9 = createacc.isDisplayed();
		System.out.println("CreateAcc display: "+status9);
		WebElement alreadyreg = driver.findElement(By.xpath("(//h3[@class='page-subheading'])[2]"));
		boolean status10 = alreadyreg.isDisplayed();
		System.out.println("Already Registered display: "+status10);
		WebElement emailadd = driver.findElement(By.xpath("//input[@name='email_create']"));
		emailadd.click();
		Random ran=new Random();
		int randommail=ran.nextInt(1000);
		emailadd.sendKeys("DhanLaks"+randommail+ "@gmail.com");
		WebElement createaccbutn = driver.findElement(By.xpath("//i[@class='icon-user left']"));
		createaccbutn.click();
		//WebElement mrbtn=driver.findElement(By.xpath("//div[@id='uniform-id_gender1']"));
		//WebElement mrsbtn=driver.findElement(By.id("id_gender2"));
		Actions ac=new Actions(driver);
		//ac.click(mrsbtn).build().perform();
		WebElement mrs1 = driver.findElement(By.id("id_gender2"));
		mrs1.click();
		Thread.sleep(10000);
		// result1 = mrbtn.isSelected();
		//System.out.println(result1);
		boolean result2 = mrs1.isSelected();
		System.out.println("result2: "+result2);
		WebElement fname = driver.findElement(By.id("customer_firstname"));
		fname.sendKeys("Ramya");
		String fname1 = fname.getAttribute("value");
		WebElement lname = driver.findElement(By.id("customer_lastname"));
		lname.sendKeys("Vijay");
		String lname1 = lname.getAttribute("value");
		WebElement email = driver.findElement(By.id("email"));
		String emailidpresent = email.getAttribute("value");
		System.out.println("Email ID added is: "+emailidpresent);
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("dhanvin@1");
		WebElement day = driver.findElement(By.id("days"));
		WebElement month = driver.findElement(By.id("months"));
		WebElement year = driver.findElement(By.id("years"));
		Select s1=new Select(day);
		Select s2=new Select(month);
		Select s3=new Select(year);
		s1.selectByValue("20");
		s2.selectByValue("2");
		s3.selectByIndex(3);
		WebElement check1 = driver.findElement(By.id("uniform-newsletter"));
		check1.click();
		WebElement check2 = driver.findElement(By.id("uniform-optin"));
		check2.click();
		boolean drop1 = day.isSelected();
		System.out.println("Drop1 selected:"+drop1);
		boolean drop2 = month.isSelected();
		System.out.println("Drop2 selected: "+drop2);
		boolean drop3 = year.isSelected();
		System.out.println("Drop 3 selected:"+drop3);
		if(drop1==true&&drop2==true&&drop3==true)
		{System.out.println("DOB is selected");

		}
		WebElement fnameauto = driver.findElement(By.id("firstname"));
		String fname2 = fnameauto.getAttribute("value");
		System.out.println(fname2);
		if(fname1.equals(fname2))
		{
			System.out.println("First Name is matched");
		}
		WebElement lnameauto = driver.findElement(By.id("lastname"));
		String lname2 = lnameauto.getAttribute("value");
		if(lname1.equals(lname2))
		{System.out.println("Last name is matched");

		}

		WebElement add1 = driver.findElement(By.id("address1"));
		add1.sendKeys("Lotus Apartments");
		WebElement add2 = driver.findElement(By.id("address2"));
		add2.sendKeys("No1, Lilly Street");
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("LOS");


		WebElement state = driver.findElement(By.id("id_state"));
		Select s4=new Select(state);
		s4.selectByValue("14");
		WebElement pincode = driver.findElement(By.id("postcode"));
		pincode.sendKeys("10000");
		WebElement addinfo = driver.findElement(By.id("other"));
		addinfo.sendKeys("Welcome");
		WebElement hphone = driver.findElement(By.id("phone"));
		hphone.sendKeys("9876543210");
		WebElement mobphone = driver.findElement(By.id("phone_mobile"));
		mobphone.sendKeys("1234567890");
		WebElement altadd = driver.findElement(By.id("alias"));
		altadd.sendKeys("Hellllo");
		TakesScreenshot screenshot2=(TakesScreenshot) driver;
		File soufile=screenshot2.getScreenshotAs(OutputType.FILE);
		File destinFile=new File("C:\\Users\\admin\\Documents\\Screenshot\\Screenshot2.png");
		FileUtils.copyFile(soufile, destinFile);
		Robot r =new Robot();
r.createScreenCapture()		

		WebElement registerbtn = driver.findElement(By.xpath("//span[contains(text(),'Register')]"));

		registerbtn.click();
		//WebElement welcome = driver.findElement(By.xpath("//p[@class='info-account']"));
		//boolean status11 = welcome.isDisplayed();
		//System.out.println("Welcome note Display: "+status11);
		WebElement orderhistory = driver.findElement(By.xpath("//span[contains(text(),'Order history and details')]"));
		boolean status12 = orderhistory.isDisplayed();
		System.out.println("Order History display: "+status12);
		WebElement creditslip = driver.findElement(By.xpath("//span[contains(text(),'My credit slips')]"));
		boolean status13 = creditslip.isDisplayed();
		System.out.println("credit Slip display: "+status13);
		WebElement myaddress = driver.findElement(By.xpath("//span[contains(text(),'My addresses')]"));
		boolean status14 = myaddress.isDisplayed();
		System.out.println("My Addresses display: "+status14);
		WebElement perinfo = driver.findElement(By.xpath("//span[contains(text(),'My personal information')]"));
		boolean status15 = myaddress.isDisplayed();
		System.out.println("My Personal Info display: "+status15);
		WebElement wishlist = driver.findElement(By.xpath("//span[contains(text(),'My wishlists')]"));
		boolean status16 = wishlist.isDisplayed();
		System.out.println("My Wishlist display: "+status16);
		TakesScreenshot screenshot3=(TakesScreenshot) driver;
		File sourcefile=screenshot3.getScreenshotAs(OutputType.FILE);
		File destinationFile=new File("C:\\Users\\admin\\Documents\\Screenshot\\Screenshot3.png");
		FileUtils.copyFile(sourcefile, destinationFile);




driver.close();
		driver.quit();*/

}
}