package com.adactln.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.baseclass.BaseClass;

public class BookedItinerary extends BaseClass {
		

@FindBy(xpath="//input[contains(@id,'')]")
private List <WebElement> hotelname;
@FindBy(xpath="//input[contains(@id,'337728')]")
private List <WebElement> location;
@FindBy(xpath="//input[contains(@id,'337728')]")
private List <WebElement> noofrooms;
@FindBy(xpath="//input[contains(@id,'first_name')]")
private List <WebElement> fname;
@FindBy(xpath="//input[contains(@id,'last_name')]")
private List <WebElement> lname;
@FindBy(xpath="//input[contains(@id,'arr_date')]")
private List <WebElement> indate;
@FindBy(xpath="//input[contains(@id,'dep_date')]")
private List <WebElement> outdate;
@FindBy(xpath="//input[contains(@id,'no_days')]")
private List <WebElement> noofdays;
@FindBy(xpath="//input[contains(@id,'room_type')]")
private List <WebElement> roomtype;
@FindBy(xpath="//input[contains(@id,'price_night')]")
private List <WebElement> ppn;
@FindBy(xpath="//input[contains(@id,'total_price')]")
private List <WebElement> totalprice;
@FindBy(xpath="//input[contains(@id,'order_id_text')]")
private List <WebElement> searchorder;
@FindBy(xpath="//input[contains(@id,'search_hotel_id')]")
private List <WebElement> gobtn;
@FindBy(xpath="//input[contains(@name,'ids[]')]")
private List <WebElement> check;
@FindBy(xpath="//input[contains(@id,'order_id')]")
private List <WebElement> orderno;
public List<WebElement> getOrderno() {
	return orderno;
}
public List<WebElement> getHotelname() {
	return hotelname;
}
public List<WebElement> getNoofrooms() {
	return noofrooms;
}
public List<WebElement> getFname() {
	return fname;
}
public List<WebElement> getLname() {
	return lname;
}
public List<WebElement> getIndate() {
	return indate;
}
public List<WebElement> getOutdate() {
	return outdate;
}
public List<WebElement> getNoofdays() {
	return noofdays;
}
public List<WebElement> getRoomtype() {
	return roomtype;
}
public List<WebElement> getPpn() {
	return ppn;
}
public List<WebElement> getTotalprice() {
	return totalprice;
}
public List<WebElement> getSearchorder() {
	return searchorder;
}
public List<WebElement> getGobtn() {
	return gobtn;
}
public List<WebElement> getCheck() {
	return check;
}
public List<WebElement> getLocation() {
	return location;
}
public BookedItinerary() {
PageFactory.initElements(driver, this);}

}
