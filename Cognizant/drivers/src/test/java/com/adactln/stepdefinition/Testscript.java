package com.adactln.stepdefinition;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.adactln.baseclass.BaseClass;
import com.adactln.pom.LoginDetailsTC1;
import com.adactln.pom.LogoutTC10;
import com.adactln.pom.SearchHotelTC2andTC3;
import com.adactln.pom.SelectHotelTC4TC5TC6TC7TC8;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;

public class Testscript extends BaseClass {
 
	Map<String, String> search_m=new HashMap<String, String>();
	Map<String,String>  select_m=new HashMap<String, String>();
	
	
	@Given("^User launches the browser and hit the url$")
	public void user_launches_the_browser_and_hit_the_url() throws Throwable {
	  browserLaunch("chrome", "http://adactin.com/HotelApp/"); 
	    
	}

	@Given("^User enters the user name and password$")
	public void user_enters_the_user_name_and_password(DataTable datatable) throws Throwable {
		LoginDetailsTC1 lp=new LoginDetailsTC1();   
	List<String> li=datatable.asList(String.class);
	   String username = li.get(0);
	   String password = li.get(1);
	   elementsendKeys(username, lp.getUsername());
	   elementsendKeys(password, lp.getPassword());
	   
	   
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}

	@Given("^User clicks the login button$")
	public void user_clicks_the_login_button() throws Throwable {
		LoginDetailsTC1 lp=new LoginDetailsTC1();
		elementclick(lp.getLoginbtn());
	    
	}

	@Then("^User verifies the page title is displayed as \"([^\"]*)\"$")
	public void user_verifies_the_page_title_is_displayed_as(String title) throws Throwable {
		SearchHotelTC2andTC3 sp=new SearchHotelTC2andTC3();
		if(driver.getTitle().equalsIgnoreCase(title))
				
			{System.out.println("Test Case 1: Passed");}
			else
			{System.out.println("Test Case 1 Failed");
			}
			
	}

	@When("^User enter invalid dates$")
	public void user_enter_invalid_dates(DataTable dataTable) throws Throwable {
	    
        List<Map<String, String>> l = dataTable.asMaps(String.class, String.class);
		SearchHotelTC2andTC3 sp=new SearchHotelTC2andTC3();
		for(int i=0;i<l.size();i++)
		{
		String location= l.get(i).get("Location");
		String hotelname=l.get(i).get("Hotel");
		String roomt=l.get(i).get("roomtype");
		String nofrooms=l.get(i).get("noofrooms");
		String indate=l.get(i).get("datein");
		String outdate=l.get(i).get("dateout");
		String adult=l.get(i).get("adults");
		String childno=l.get(i).get("children");
		elementDropanddown("value", location, sp.getLocation());
		elementDropanddown("value", hotelname, sp.getHotel());
		elementDropanddown("value", roomt, sp.getRoomtype());
		elementDropanddown("value",nofrooms , sp.getRoomnos());
		sp.getDatein().clear();
		elementsendKeys(indate,sp.getDatein());
		sp.getDateout().clear();
		elementsendKeys(outdate,sp.getDateout());
		elementDropanddown("value", adult, sp.getNoofadult());
		elementDropanddown("value", childno, sp.getNoofchild());
		}
	}
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	

	

	@When("^User clicks search button$")
	public void user_clicks_search_button() throws Throwable {
	   SearchHotelTC2andTC3 sp=new SearchHotelTC2andTC3();
		sp.getSubmitBtn().click();
		if(driver.getTitle().equalsIgnoreCase("AdactIn.com - Select Hotel"))
		{System.out.println("Test Case: Failed");}
		else {
			System.out.println("Test Case: Passed");
		}
	}

	@Then("^User verifies if an error message is reported$")
	public void user_verifies_if_an_error_message_is_reported() throws Throwable {
	   getScreenshotrobot();
	    
	}

	@When("^User enters the checkin and checkout date in the past$")
	public void user_enters_the_checkin_and_checkout_date_in_the_past(DataTable dataTable) throws Throwable {
	   
		SearchHotelTC2andTC3 sp=new SearchHotelTC2andTC3();
		List<Map<String, String>> l = dataTable.asMaps(String.class, String.class);
		for(int i=0;i<l.size();i++)
		{
		String location= l.get(i).get("Location");
		String hotelname=l.get(i).get("Hotel");
		String roomt=l.get(i).get("roomtype");
		String nofrooms=l.get(i).get("noofrooms");
		String indate=l.get(i).get("datein");
		String outdate=l.get(i).get("dateout");
		String adult=l.get(i).get("adults");
		String childno=l.get(i).get("children");
		elementDropanddown("value", location, sp.getLocation());
		elementDropanddown("value", hotelname, sp.getHotel());
		elementDropanddown("value", roomt, sp.getRoomtype());
		elementDropanddown("value",nofrooms , sp.getRoomnos());
		sp.getDatein().clear();
		elementsendKeys(indate,sp.getDatein());
		sp.getDateout().clear();
		elementsendKeys(outdate,sp.getDateout());
		elementDropanddown("value", adult, sp.getNoofadult());
		elementDropanddown("value", childno, sp.getNoofchild());
		}
		}

@When("^User enters valid checkin and checkout date$")
public void user_enters_valid_checkin_and_checkout_date(DataTable dataTable) throws Throwable {
	SearchHotelTC2andTC3 sp=new SearchHotelTC2andTC3();
	List<Map<String, String>> l = dataTable.asMaps(String.class, String.class);

	for(int i=0;i<l.size();i++)
	{
	String location= l.get(i).get("Location");
	String hotelname=l.get(i).get("Hotel");
	String roomt=l.get(i).get("roomtype");
	String nofrooms=l.get(i).get("noofrooms");
	String indate=l.get(i).get("datein");
	String outdate=l.get(i).get("dateout");
	String adult=l.get(i).get("adults");
	String childno=l.get(i).get("children");
	elementDropanddown("value", location, sp.getLocation());
	elementDropanddown("value", hotelname, sp.getHotel());
	elementDropanddown("value", roomt, sp.getRoomtype());
	elementDropanddown("value",nofrooms , sp.getRoomnos());
	sp.getDatein().clear();
	elementsendKeys(indate,sp.getDatein());
	sp.getDateout().clear();
	elementsendKeys(outdate,sp.getDateout());
	elementDropanddown("value", adult, sp.getNoofadult());
	elementDropanddown("value", childno, sp.getNoofchild());
	Map<String, String> map = l.get(i);	
	search_m.putAll(map);
	}
}

@Then("^User verifies if the page title is \"([^\"]*)\"$")
public void user_verifies_if_the_page_title_is(String title) throws Throwable {
	SelectHotelTC4TC5TC6TC7TC8 slp=new SelectHotelTC4TC5TC6TC7TC8();
	Assert.assertTrue(driver.getTitle().equalsIgnoreCase(title));
}

@Then("^User verifies if data in search hotel page gets matched with select hotel page$")
	public void user_verifies_if_data_in_search_hotel_page_gets_matched_with_select_hotel_page() throws Throwable {
	SelectHotelTC4TC5TC6TC7TC8 slp=new SelectHotelTC4TC5TC6TC7TC8();
	String location_Sel=elementgetAttribute(slp.getLocation_Select(),"value");
    String datein_Sel=slp.getInDate().getText();
	String dateout_Sel=slp.getOutDate().getText();
	String hotelname_Sel=elementgetAttribute(slp.getHotelName(), "value");
	String noofrooms_Sel=elementgetAttribute(slp.getNoOfRooms(), "value");
	String noofdays_Sel=elementgetAttribute(slp.getNoOfDays(), "value");
	String roomtype_Sel=elementgetAttribute(slp.getRoomType(),"value");
	select_m.put("Location", location_Sel);
	select_m.put("Hotel", hotelname_Sel);
	select_m.put("datein", datein_Sel);
	select_m.put("dateout", dateout_Sel);
	select_m.put("roomtype", roomtype_Sel);
	select_m.put("noofrooms", noofrooms_Sel);
	select_m.put("noofdays", noofdays_Sel);
	Assert.assertTrue(search_m.get("Location").equalsIgnoreCase(select_m.get("Location")));
	Assert.assertTrue(search_m.get("Hotel").equalsIgnoreCase(select_m.get("Hotel")));
	Assert.assertTrue(search_m.get("datein").equalsIgnoreCase(select_m.get("datein")));
	Assert.assertTrue(search_m.get("dateout").equalsIgnoreCase(select_m.get("dateout")));
	Assert.assertTrue(search_m.get("roomtype").equalsIgnoreCase(select_m.get("roomtype")));
	Assert.assertTrue(search_m.get("noofrooms").contains(select_m.get("noofrooms")));
	}
}