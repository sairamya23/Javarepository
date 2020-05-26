package orangehrm;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ohrmprofile extends orangehrm {
	
@Test
	public static void myprofilepage() {
	WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
	pwd.sendKeys("dhanvin@1");
	WebElement cpwd = driver.findElement(By.xpath("//input[@name='confirmpassword']"));
	cpwd.sendKeys("dhanvin@1");
	WebElement add1 = driver.findElement(By.xpath("//input[@name='address1']"));
	add1.sendKeys("1");
	WebElement add2 = driver.findElement(By.xpath("//input[@name='address2']"));
	add2.sendKeys("ambattur");
	WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
	city.sendKeys("chennai");
	WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
	state.sendKeys("TN");
	WebElement zip = driver.findElement(By.xpath("//input[@name='zip']"));
	zip.sendKeys("600001");
	WebElement country = driver.findElement(By.xpath("//div[text()='Select Country']"));
	Select s=new Select(country);
	s.selectByIndex(81);
	WebElement submit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
	submit.click();

	
	cpwd.sendKeys("dhanvin@1");



	
	}
}
