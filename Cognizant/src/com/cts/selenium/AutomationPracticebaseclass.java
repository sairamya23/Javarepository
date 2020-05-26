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


public class AutomationPracticebaseclass extends SuperBaseClass{

			public static void main(String[] args) throws Exception {
				int count=0;
				browserLaunch("chrome","http://automationpractice.com/index.php");
				WebElement logo = driver.findElement(By.xpath("//img[@class='img-responsive']"));
				webelementDisplayed("Logo",logo);
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
				webelementDisplayed("contactUs",contactUs);
				WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
				webelementDisplayed("signIn",signIn);
				WebElement search = driver.findElement(By.id("search_query_top"));
				WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
				webelementDisplayed("women",women);
				WebElement dresses = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
				webelementDisplayed("dresses",dresses);
				WebElement tshirts = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
				webelementDisplayed("tshirts",tshirts);
				screenshot("1");
				elementClick(signIn);
				pageTitle();
				//WebElement authentication = driver.findElement(By.xpath("//h1[@class='page-heading']"));
			//	webelementDisplayed("authentication",authentication);
				//WebElement createacc = driver.findElement(By.xpath("//h1[@class='page-heading'])[1]"));
				//webelementDisplayed("Createacc",createacc);
				//WebElement alreadyreg = driver.findElement(By.xpath("(//h3[@class='page-subheading'])[2]"));
				//webelementDisplayed("alreadyreg",alreadyreg);
				WebElement emailadd = driver.findElement(By.xpath("//input[@name='email_create']"));
				elementClick(emailadd);
				Random ran=new Random();
				int randommail=ran.nextInt(1000);
				emailadd.sendKeys("DhanLaks"+randommail+ "@gmail.com");
				WebElement createaccbutn = driver.findElement(By.xpath("//i[@class='icon-user left']"));
				elementClick(createaccbutn);
				WebElement mrs1 = driver.findElement(By.id("id_gender2"));
				elementClick(mrs1);
				webelementSelected("Gender",mrs1);
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
				elementSelect("index",day,"20");
				elementSelect("value",year,"2020");
				elementSelect("index",month,"2");
				WebElement fnameauto = driver.findElement(By.id("firstname"));
				String fname2 = fnameauto.getAttribute("value");
				System.out.println(fname2);
				if(fname1.equals(fname2)){
				System.out.println("First Name is matched");}
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
				elementSelect("value",state,"14");
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
				screenshot("2");
				WebElement registerbtn = driver.findElement(By.xpath("//span[contains(text(),'Register')]"));
				registerbtn.click();
				WebElement welcome = driver.findElement(By.xpath("//p[@class='info-account']"));
				webelementDisplayed("welcome",welcome);				
				WebElement orderhistory = driver.findElement(By.xpath("//span[contains(text(),'Order history and details')]"));
				webelementDisplayed("orderhistory",orderhistory);
				WebElement creditslip = driver.findElement(By.xpath("//span[contains(text(),'My credit slips')]"));
				webelementDisplayed("creditslip",creditslip);				
				WebElement myaddress = driver.findElement(By.xpath("//span[contains(text(),'My addresses')]"));
				webelementDisplayed("myaddress",myaddress);
				WebElement perinfo = driver.findElement(By.xpath("//span[contains(text(),'My personal information')]"));
				webelementDisplayed("perinfo",perinfo);
				WebElement wishlist = driver.findElement(By.xpath("//span[contains(text(),'My wishlists')]"));
				webelementDisplayed("wishlist",wishlist);
				screenshot("3");		}	
	}


