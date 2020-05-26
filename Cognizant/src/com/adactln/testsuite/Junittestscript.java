package com.adactln.testsuite;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.adactln.pom.BookHotel;
import com.adactln.pom.BookingConfirmation;
import com.adactln.pom.LoginDetailsTC1;
import com.adactln.pom.LogoutTC10;
import com.adactln.pom.SearchHotelTC2andTC3;
import com.adactln.pom.SelectHotelTC4TC5TC6TC7TC8;
import com.selenium.baseclass.BaseClass;

public class Junittestscript extends BaseClass{

	@BeforeClass
	public static void browserlaunch() throws Exception {
		browserLaunch("Chrome", "http://adactin.com/HotelApp/");
		}
	@Before
	public void logindtls() {
	LoginDetailsTC1 lp=new LoginDetailsTC1();
textsendkeys("sairamya23", lp.getUsername());
textsendkeys("dhanvin@1", lp.getPassword());
lp.getLoginbtn().click();
if(driver.getTitle().equalsIgnoreCase("AdactIn.com - Search Hotel"))
{System.out.println("Test Case 1: Passed");}
else
{System.out.println("Test Case 1 Failed");
}
	}
	@Test
	public void testcases() throws IOException  {
		LoginDetailsTC1 lp=new LoginDetailsTC1();
		SearchHotelTC2andTC3 sp=new SearchHotelTC2andTC3();
		SelectHotelTC4TC5TC6TC7TC8 slp=new SelectHotelTC4TC5TC6TC7TC8();
		LogoutTC10 ltp=new LogoutTC10();
		BookHotel bh=new BookHotel();
		BookingConfirmation bc=new BookingConfirmation();
		elementSelect("index", sp.getLocation(), "1");
		String location1 = selectedValue(sp.getLocation());
		elementSelect("index", sp.getHotel(), "1");
		String hotel1 = selectedValue(sp.getHotel());
		elementSelect("value", sp.getRoomtype(), "Super Deluxe");
		String roomtype1 = selectedValue(sp.getRoomtype());
		elementSelect("index", sp.getRoomnos(), "1");
		String roomnos1 = selectedValue(sp.getRoomnos());
		sp.getDatein().clear();
		try {
			textsendkeys("10/03/2020",sp.getDatein());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sp.getDateout().clear();
		textsendkeys("08/03/2020",sp.getDateout());
		elementSelect("index", sp.getNoofadult(), "1");
		elementSelect("value", sp.getNoofchild(), "2");
		sp.getSubmitBtn().click();
		if(driver.getTitle().equalsIgnoreCase("AdactIn.com - Select Hotel"))
		{System.out.println("Test Case 2: Failed");}
		else {
			System.out.println("Test Case 2: Passed");
		}
		screenshot("ss1");
//Test Case 3//
		sp.getDatein().clear();
		textsendkeys("27/02/2020",sp.getDatein());
		sp.getDateout().clear();
		textsendkeys("02/03/2020",sp.getDateout());
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
		String location2=webelementgetattribute(slp.getLocation_Select(),"value");
		if(location1.equalsIgnoreCase(location2))
		{		System.out.println("Test Case 4: Passed");}
		else{
			System.out.println("Test Case 4: Failed");}
			//TestCase 5//
			navigationHandle("back");
			sp.getDatein().clear();
			textsendkeys("04/03/2020",sp.getDatein());
			String datein1 = sp.getDatein().getText();
			sp.getDateout().clear();
			textsendkeys("08/03/2020",sp.getDateout());
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
		}
@After
public void logoutaf() throws IOException
{
BookingConfirmation bc=new BookingConfirmation();
	bc.getLogoutBtn().click();
	if(driver.getTitle().equalsIgnoreCase("AdactIn.com - Logout"))
	{	System.out.println("Test Case 9: Passed ");
	}
	else{
		System.out.println("Test Case 9: Failed");
	}
	screenshot("ss4");

}
@AfterClass
public static void driverexit() {
driver.quit();
}
	}

