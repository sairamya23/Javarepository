package com.adactln.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactln.baseclass.BaseClass;


public class BookingConfirmation extends BaseClass {
	@FindBy(id="hotel_name")
	private WebElement disp_hotelname;
	@FindBy(id="location")
	private WebElement disp_location;
	@FindBy(id="room_type")
	private WebElement disp_roomtype;
	@FindBy(id="total_rooms")
	private WebElement disp_roomno;
	@FindBy(id="price_night")
	private WebElement disp_pricepernight;
	@FindBy(id="total_price")
	private WebElement disp_totalprice;
	@FindBy(id="gst")
	private WebElement disp_gst;
	@FindBy(id="final_price")
	private WebElement disp_finalprice;
	@FindBy(id="first_name")
	private WebElement fname;
	@FindBy(id="last_name")
	private WebElement lname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="order_no")
	private WebElement order_no;
	@FindBy(id="search_hotel")
	private WebElement searchhotelBtn;
	@FindBy(id="my_itinerary")
	private WebElement my_itineraryBtn;
	@FindBy(id="logout")
	private WebElement logoutBtn;
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
	public WebElement getOrder_no() {
		return order_no;
	}
	public WebElement getSearchhotelBtn() {
		return searchhotelBtn;
	}
	public WebElement getMy_itineraryBtn() {
		return my_itineraryBtn;
	}
	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
public BookingConfirmation() {
PageFactory.initElements(driver, this);

}	
}
