package com.adactln.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.baseclass.BaseClass;

public class SelectHotelTC4TC5TC6TC7TC8 extends BaseClass{
@FindBy(xpath="//input[contains(@id,'radiobutton')]")
private WebElement selectHotel;
@FindBy(id="hotel_name")
private WebElement hotelName;
@FindBy(id="location_name")
private WebElement location_select;
@FindBy(id="rooms_no")
private WebElement noOfRooms;
@FindBy(id="arr_date")
private WebElement inDate;
@FindBy(id="dep_date")
private WebElement outDate;
@FindBy(id="no_days")
private WebElement noOfDays;
@FindBy(id="room_types")
private WebElement roomType;
@FindBy(xpath="//*[contains(@id,'price_night')]")
private WebElement pricePerNight;
@FindBy(xpath="//*[contains(@id,'total_price')]")
private WebElement totalPrice;
@FindBy(id="continue")
private WebElement continueBtn;
@FindBy(id="cancel")
private WebElement cancelBtn;
@FindBy(xpath="//*[contains(text(),'Logout')]") 
private WebElement logout;

public WebElement getLogout() {
	return logout;
}
public WebElement getSelectHotel() {
	return selectHotel;
}
public WebElement getHotelName() {
	return hotelName;
}
public WebElement getLocation_Select() {
	return location_select;
}
public WebElement getNoOfRooms() {
	return noOfRooms;
}
public WebElement getInDate() {
	return inDate;
}
public WebElement getOutDate() {
	return outDate;
}
public WebElement getNoOfDays() {
	return noOfDays;
}
public WebElement getRoomType() {
	return roomType;
}
public WebElement getPricePerNight() {
	return pricePerNight;
}
public WebElement getTotalPrice() {
	return totalPrice;
}
public WebElement getContinueBtn() {
	return continueBtn;
}
public WebElement getCancelBtn() {
	return cancelBtn;
}
public SelectHotelTC4TC5TC6TC7TC8() {
PageFactory.initElements(driver, this);
}



}
