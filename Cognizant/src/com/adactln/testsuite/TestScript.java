package com.adactln.testsuite;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.server.handler.ClearElement;

import com.adactln.pom.BookHotel;
import com.adactln.pom.BookedItinerary;
import com.adactln.pom.BookingConfirmation;
import com.adactln.pom.LoginDetailsTC1;
import com.adactln.pom.LogoutTC10;
import com.adactln.pom.SearchHotelTC2andTC3;
import com.adactln.pom.SelectHotelTC4TC5TC6TC7TC8;
import com.selenium.baseclass.BaseClass;
import com.selenium.pom.SearchResultPage;

import net.bytebuddy.asm.Advice.Local;

public class TestScript extends BaseClass {
	public static void main(String[] args) throws Exception {
		browserLaunch("Chrome", "http://adactin.com/HotelApp/");

		//TestCase1
		LoginDetailsTC1 lp=new LoginDetailsTC1();
		SearchHotelTC2andTC3 sp=new SearchHotelTC2andTC3();
		SelectHotelTC4TC5TC6TC7TC8 slp=new SelectHotelTC4TC5TC6TC7TC8();
		LogoutTC10 ltp=new LogoutTC10();
		BookHotel bh=new BookHotel();
		BookingConfirmation bc=new BookingConfirmation();
		BookedItinerary bi=new BookedItinerary();
		textsendkeys("sairamya23", lp.getUsername());
		textsendkeys("dhanvin@1", lp.getPassword());
		lp.getLoginbtn().click();
		if(driver.getTitle().equalsIgnoreCase("AdactIn.com - Search Hotel"))
		{System.out.println("Test Case 1: Passed");}
		else
		{System.out.println("Test Case 1 Failed");
		}
		elementSelect("index", sp.getLocation(), "1");
		String location1 = selectedValue(sp.getLocation());
		elementSelect("index", sp.getHotel(), "1");
		String hotel1 = selectedValue(sp.getHotel());
		elementSelect("value", sp.getRoomtype(), "Super Deluxe");
		String roomtype1 = selectedValue(sp.getRoomtype());
		elementSelect("index", sp.getRoomnos(), "1");
		String roomnos1 = selectedValue(sp.getRoomnos());

		//Testcase 2//
		sp.getDatein().clear();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ldate = LocalDate.now().plusDays(7);
		String indate = dtf.format(ldate);
		textsendkeys(indate,sp.getDatein());
		sp.getDateout().clear();
		LocalDate ldate1 = LocalDate.now().plusDays(5);
		String outdate = dtf.format(ldate1);
		textsendkeys(outdate,sp.getDateout());
		elementSelect("index", sp.getNoofadult(), "1");
		elementSelect("value", sp.getNoofchild(), "2");
		sp.getSubmitBtn().click();
		if(driver.getTitle().equalsIgnoreCase("AdactIn.com - Select Hotel"))
		{System.out.println("Test Case 2: Failed");}
		else {
			System.out.println("Test Case 2: Passed");
		}
		screenshot("ss1");

		//Test case 3//
		sp.getDatein().clear();
		LocalDate minusDays = LocalDate.now().minusDays(5);
		textsendkeys(dtf.format(minusDays),sp.getDatein());
		sp.getDateout().clear();
		LocalDate minusDays2 = LocalDate.now().minusDays(3);
		textsendkeys(dtf.format(minusDays2),sp.getDateout());
		elementSelect("index", sp.getNoofadult(), "1");
		elementSelect("value", sp.getNoofchild(), "2");
		sp.getSubmitBtn().click();
		if(driver.getTitle().equalsIgnoreCase("AdactIn.com - Select Hotel"))
		{
			System.out.println("Test Case 3: Failed");}
		else {
			System.out.println("Test Case 3: Passed");
		}
		screenshot("ss2");

		//TestCase4//

		String location2=webelementgetattribute(slp.getLocation_Select(),"value");
		if(location1.equalsIgnoreCase(location2))
		{		System.out.println("Test Case 4: Passed");}
		else{
			System.out.println("Test Case 4: Failed");
		}

		//TestCase 5//
		navigationHandle("back");
		sp.getDatein().clear();
		LocalDate ld=LocalDate.now();
		String date1 = dtf.format(ld);
		textsendkeys(date1,sp.getDatein());
		String datein1 = sp.getDatein().getText();
		sp.getDateout().clear();
		LocalDate plusDays = ld.plusDays(4);
		String date2 = dtf.format(plusDays);
		textsendkeys(date2,sp.getDateout());
		String dateout1 = sp.getDateout().getText();
		sp.getSubmitBtn().click();
		String datein_Sel=slp.getInDate().getText();
		String dateout_Sel=slp.getOutDate().getText();
		String hotelname_Sel=webelementgetattribute(slp.getHotelName(), "value");
		String location_Sel=webelementgetattribute(slp.getLocation_Select(),"value");
		String noofrooms_Sel=webelementgetattribute(slp.getNoOfRooms(), "value");
		String noofdays_Sel=webelementgetattribute(slp.getNoOfDays(), "value");
		String roomtype_Sel=webelementgetattribute(slp.getRoomType(),"value");


		if(datein1.equalsIgnoreCase(slp.getInDate().getText())
				&& dateout1.equalsIgnoreCase(slp.getOutDate().getText()))
		{
			System.out.println("Test Case 5: Passed");
		}
		else 
		{System.out.println("Test Case 5 Failed");}

		//Testcase 6//
		if(roomnos1.contains(webelementgettext(slp.getNoOfRooms())))
		{
			System.out.println("Test Case 6: Passed");
		}
		else
		{System.out.println("Test Case 6: Failed");}

		//TestCase 7//
		if(roomtype1.equalsIgnoreCase
				(webelementgetattribute(slp.getRoomType(),"value")))
		{
			System.out.println("Test Case 7: Passed");
		}
		else
		{System.out.println("Test Case 7: Failed");}
		
		
		//Test Case 8//

		String p1 = webelementgetattribute(slp.getPricePerNight(),"value");
		String replaceAll = p1.replaceAll("[audAUD$ ]","");
		long pricePerNight_Sel=Long.parseLong(replaceAll);
		String p2=webelementgetattribute(slp.getNoOfRooms(),"value");
		int noofrooms=Integer.parseInt(p2);
		String p3=webelementgetattribute(slp.getNoOfDays(),"value");
		int noOfDays=Integer.parseInt(p3);
		long totalprice_expected=pricePerNight_Sel*noofrooms*noOfDays;
		String tot = webelementgetattribute(slp.getTotalPrice(),"value");
		String replaceAll1 = tot.replaceAll("[audAUD$ ]","");
		int totalprice_Sel=Integer.parseInt(replaceAll1);
		if(totalprice_expected==totalprice_Sel)
		{System.out.println("Test Case 8: Passed");
		}
		else
		{System.out.println("Test Case 8: Failed");}
		screenshot("ss3");

		//Test Case 9//
		slp.getSelectHotel().click();
		slp.getContinueBtn().click();
		textsendkeys("Ramya",bh.getFname());
		textsendkeys("Vijay", bh.getLname());
		textsendkeys("Chennai", bh.getAddress());
		textsendkeys("1234567812345678", bh.getCcnum());
		elementSelect("index", bh.getCctype(), "2");
		elementSelect("index", bh.getCcexpmonth(),"3");
		elementSelect("index", bh.getCcexpyear(), "5");
		textsendkeys("221", bh.getCvv());
		bh.getBookBtn().click();
		bc.getLogoutBtn().click();
		if(driver.getTitle().equalsIgnoreCase("AdactIn.com - Logout"))
		{	System.out.println("Test Case 9: Passed ");
		}
		else{
			System.out.println("Test Case 9: Failed");
		}
		screenshot("ss4");

		//Test Case 10//
		ltp.getLoginagain().click();
		textsendkeys("sairamya23", lp.getUsername());
		textsendkeys("dhanvin@1", lp.getPassword());
		lp.getLoginbtn().click();
		elementSelect("index", sp.getLocation(), "1");
		elementSelect("index", sp.getHotel(), "1");
		elementSelect("value", sp.getRoomtype(), "Super Deluxe");
		elementSelect("index", sp.getRoomnos(), "1");
		sp.getDatein().clear();
		textsendkeys("04/03/2020",sp.getDatein());
		sp.getDateout().clear();
		textsendkeys("08/03/2020",sp.getDateout());
		elementSelect("index", sp.getNoofadult(), "1");
		elementSelect("value", sp.getNoofchild(), "2");
		sp.getSubmitBtn().click();
		slp.getSelectHotel().click();
		slp.getContinueBtn().click();
		String val1 = webelementgetattribute(bh.getDisp_roomno(), "value");
		String val2=val1.replace(" Room(s)","");
		String val=webelementgetattribute(bh.getDisp_pricepernight(),"value");
		String ppn=val.replaceAll("[audAUD$ ]","");
		int pricepernight_book=Integer.parseInt(ppn);
		int norooms=Integer.parseInt(val2);
		String val3 = webelementgetattribute(bh.getDisp_totaldays(), "value");
		String val4=val3.replace(" Day(s)", "");
		int days=Integer.parseInt(val4);
		int total_expected=pricepernight_book*norooms*days;
		String val5=webelementgetattribute(bh.getDisp_totalprice(),"value");
		String tot1=val5.replaceAll("[audAUD$ ]","");
		int total_actual_book=Integer.parseInt(tot1);
		if(total_expected==total_actual_book)
		{
			System.out.println("Test Case 10: Passed");}
		else
		{
			System.out.println("Test Case 10: Failed");}

		//Test Case 12//
		String v1=webelementgetattribute(bh.getDisp_finalprice(), "value");
		String f1=v1.replaceAll("[audAUD$ ]","");
		float finaltotal_actual=Float.parseFloat(f1);
		float gst=(total_actual_book*10)/100f;
		float finaltotal_expected=total_actual_book+gst;
		if(finaltotal_expected==finaltotal_actual)
		{
			System.out.println("Test Case 12: Passed");}
		else
		{
			System.out.println("Test Case 12: Failed");
		}
		//Test Case 13//
		String location_book=webelementgetattribute(bh.getDisp_location(), "value");
		String roomtype_book=webelementgetattribute(bh.getDisp_roomtype(), "value");
		String hotelname_book= webelementgetattribute(bh.getDisp_hotelname(), "value");
		String noofrooms_book=webelementgetattribute(bh.getDisp_roomno(),"value").replace(" Room(s)","");
	    String noofdays_book=webelementgetattribute(bh.getDisp_totaldays(), "value").replace(" Day(s)","");
	    
		if (hotelname_book.equals(hotelname_Sel)&& location_Sel.equals(location_book)
				&&roomtype_Sel.equals(roomtype_book)&& noofdays_Sel.equals(noofdays_book)
				&&noofrooms_Sel.equals(noofrooms_book)&&pricePerNight_Sel==pricepernight_book&&
						totalprice_Sel==total_actual_book)
				
				{

			System.out.println("Test Case 13: Passed");}
		else
		{
			System.out.println("Test Case 13: Failed");
		}


//Test Case 11//
		
		textsendkeys("Ramya",bh.getFname());
		textsendkeys("Vijay", bh.getLname());
		textsendkeys("Chennai", bh.getAddress());
		textsendkeys("1234567812345678", bh.getCcnum());
		elementSelect("index", bh.getCctype(), "2");
		elementSelect("index", bh.getCcexpmonth(),"3");
		elementSelect("index", bh.getCcexpyear(), "5");
		textsendkeys("221", bh.getCvv());
		bh.getBookBtn().click();
		String hotelname_bc = webelementgetattribute(bc.getDisp_hotelname(), "value");
		String location_bc = webelementgetattribute(bc.getDisp_location(), "value");
String roomtype_bc=webelementgetattribute(bc.getDisp_roomtype(),"value");
String totalrooms_bc=webelementgetattribute(bc.getDisp_roomno(), "value");
String priceperNight_bc=webelementgetattribute(bc.getDisp_pricepernight(), "value");  	
	if(hotelname_bc.equals(hotelname_book)&&location_bc.equals(location_book)
			&&roomtype_bc.equals(roomtype_book)&&totalrooms_bc.equals(noofrooms_book)
			&&priceperNight_bc.equals(val))
	{ 
		System.out.println("Test Case 11: Passed");
	}
	else
	{System.out.println("Test Case 11: Failed");
	}
	
	//Test case 14//
	
	String value = webelementgetattribute(bc.getOrder_no(), "value");
	if(value.isEmpty())
	{
		System.out.println("Test Case 14: Failed");
	}
	else
	{System.out.println("Test Case 14: Passed");
	}
	
	/*Test Case 15//
	bc.getMy_itineraryBtn().click();
	
	for(int i=0;i<size;i++)
		{bi.getOrderval().get(i).clear()
		{
			System.out.println("TC fail");}
		else {
		System.out.println("Test Case 15: Passed");}
	}*/
			
	
	}
}
