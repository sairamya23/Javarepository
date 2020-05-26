package orangehrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class orangehrm {
public static WebDriver driver;
	
	@BeforeSuite
	public void browserlaunch() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Adactln\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.phptravels.net/login");
	driver.manage().timeouts().implicitlyWait(60, 	TimeUnit.SECONDS);
	}
	
	
@Test
public void loginpage() throws InterruptedException {
WebElement signup = driver.findElement(By.linkText("SIGN UP"));
signup.click();
//Thread.sleep(5000);
WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
fname.sendKeys("Ramya");
WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
lname.sendKeys("Vijay");
WebElement mobno = driver.findElement(By.xpath("//input[@name='phone']"));
mobno.sendKeys("9884259202");
WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
email.sendKeys("cool_ramya@yahoo.co.in");
WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
pwd.sendKeys("dhanvin@1");
WebElement cpwd = driver.findElement(By.xpath("//input[@name='confirmpassword']"));
cpwd.sendKeys("dhanvin@1");
WebElement sign = driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
sign.click();
}
@AfterSuite
public void driverexit() {
System.out.println("Exit");
}
}

