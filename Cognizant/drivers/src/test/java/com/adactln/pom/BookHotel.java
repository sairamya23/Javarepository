package com.adactln.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactln.baseclass.BaseClass;


public class BookHotel extends BaseClass {
@FindBy(id="hotel_name_dis")
private WebElement disp_hotelname;
@FindBy(id="location_dis")
private WebElement disp_location;
@FindBy(id="room_type_dis")
private WebElement disp_roomtype;
@FindBy(id="room_num_dis")
private WebElement disp_roomno;
@FindBy(id="total_days_dis")
private WebElement disp_totaldays;
@FindBy(id="price_night_dis")
private WebElement disp_pricepernight;
@FindBy(id="total_price_dis")
private WebElement disp_totalprice;
@FindBy(id="gst_dis")
private WebElement disp_gst;
@FindBy(id="final_price_dis")
private WebElement disp_finalprice;
@FindBy(id="first_name")
private WebElement fname;
@FindBy(id="last_name")
private WebElement lname;
@FindBy(id="address")
private WebElement address;
@FindBy(id="cc_num")
private WebElement ccnum;
@FindBy(id="cc_type")
private WebElement cctype;
@FindBy(id="cc_exp_month")
private WebElement ccexpmonth;
@FindBy(id="cc_exp_year")
private WebElement ccexpyear;
@FindBy(id="cc_cvv")
private WebElement cvv;
@FindBy (id="book_now")
private WebElement bookBtn;
@FindBy(id="cancel")
private WebElement cancelBtn;
public WebElement getDisp_hotelname() {
	return disp_hotelname;
}
public WebElement getDisp_location() {
	return disp_location;
}
public WebElement getDisp_roomtype() {
	return disp_roomtype;
}
public WebElement getDisp_roomno() {
	return disp_roomno;
}
public WebElement getDisp_totaldays() {
	return disp_totaldays;
}
public WebElement getDisp_pricepernight() {
	return disp_pricepernight;
}
public WebElement getDisp_totalprice() {
	return disp_totalprice;
}
public WebElement getDisp_gst() {
	return disp_gst;
}
public WebElement getDisp_finalprice() {
	return disp_finalprice;
}
public WebElement getFname() {
	return fname;
}
public WebElement getLname() {
	return lname;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCcnum() {
	return ccnum;
}
public WebElement getCctype() {
	return cctype;
}
public WebElement getCcexpmonth() {
	return ccexpmonth;
}
public WebElement getCcexpyear() {
	return ccexpyear;
}
public WebElement getCvv() {
	return cvv;
}
public WebElement getBookBtn() {
	return bookBtn;
}
public WebElement getCancelBtn() {
	return cancelBtn;
}

public BookHotel() {
PageFactory.initElements(driver, this);

}




}
