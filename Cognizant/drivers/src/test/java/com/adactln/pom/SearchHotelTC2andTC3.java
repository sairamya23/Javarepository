package com.adactln.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactln.baseclass.BaseClass;


public class SearchHotelTC2andTC3 extends BaseClass{
@FindBy(name="location")
private WebElement location;
@FindBy(id="hotels")
private WebElement hotel;
@FindBy(id="room_type")
private WebElement roomtype;
@FindBy(id="room_nos")
private WebElement roomnos;
@FindBy (id="datepick_in")
private WebElement datein;
@FindBy(id="datepick_out")
private WebElement dateout;
@FindBy (id="adult_room")
private WebElement noofadult;
@FindBy(id="child_room")
private WebElement noofchild;
@FindBy(id="Submit")
private WebElement submitBtn;
public WebElement getLocation() {
	return location;
}
public WebElement getHotel() {
	return hotel;
}
public WebElement getRoomtype() {
	return roomtype;
}
public WebElement getRoomnos() {
	return roomnos;
}
public WebElement getDatein() {
	return datein;
}
public WebElement getDateout() {
	return dateout;
}
public WebElement getNoofadult() {
	return noofadult;
}
public WebElement getNoofchild() {
	return noofchild;
}
public WebElement getSubmitBtn() {
	return submitBtn;
}

public SearchHotelTC2andTC3() {
	PageFactory.initElements(driver, this);
}


}
