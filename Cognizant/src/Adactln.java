import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\eclipse-workspace\\Cognizant\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
driver.get("http://adactin.com/HotelApp/");
WebElement username=driver.findElement(By.id("username"));
username.sendKeys("sairamya23");
WebElement password=driver.findElement(By.id("password"));
password.sendKeys("dhanvin@1");
driver.findElement(By.id("login")).click();
WebElement Location=driver.findElement(By.id("location"));
Location.sendKeys("Los Angeles");
WebElement hotel=driver.findElement(By.id("hotels"));
hotel.sendKeys("Hotel Sunshine");
WebElement room=driver.findElement(By.id("room_type"));
room.sendKeys("Super Deluxe");
WebElement noofrooms=driver.findElement(By.id("room_nos"));
noofrooms.sendKeys("1 - One");
WebElement datein=driver.findElement(By.id("datepick_in"));
datein.clear();
datein.sendKeys("20/02/2020");
WebElement dateout=driver.findElement(By.id("datepick_out"));
dateout.clear();
dateout.sendKeys("21/02/2020");
WebElement noofadults=driver.findElement(By.id("adult_room"));
noofadults.sendKeys("2-Two");
WebElement noofchild=driver.findElement(By.id("child_room"));
noofchild.sendKeys("2-Two");
driver.findElement(By.id("Submit")).click();
	}

}
