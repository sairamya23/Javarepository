package com.autiomationpract.testsuite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import com.selenium.baseclass.BaseClass;
import com.selenium.pom.HomePage;
import com.selenium.pom.LoginPage;
import com.selenium.pom.SearchResultPage;
import com.selenium.pom.SummaryPage;



public class JunitScript extends BaseClass{
	@BeforeClass
	public static void browserlaunch() throws Exception {
		browserLaunch("chrome","http://automationpractice.com/index.php");
	}

	@Before
	public void login() {
		LoginPage lp=new LoginPage();
		HomePage hp=new HomePage();
		boolean result = webelementDisplayed("SignIn",hp.getSignIn());
		assertTrue(result);
		elementClick(hp.getSignIn());
		textsendkeys("sairamya23@gmail.com",lp.getEmail());
		textsendkeys("dhanvin@1",lp.getPassword());
		assertTrue(webelementEnabled("SignIn", lp.getSignIn()));
		elementClick(lp.getSignIn());
		assertTrue(pageTitle().equalsIgnoreCase("My account - My Store"));
	String username = webelementgettext(hp.getUser());
assertTrue(username.contains("Ramya"));
Assert.assertEquals("Hi", "iH");
	}
@Test
public void searchoption() {
	HomePage hp=new HomePage();
SearchResultPage sp=new SearchResultPage();
SummaryPage sup=new SummaryPage();
textsendkeys("printed", hp.getSearch());
elementClick(hp.getSearchIcon());
pagescrollvertical("down",200);
movetoelement(sp.getSelectImage());
movetoelement(sp.getAddtoCart());
sp.getAddtoCart().click();
sp.getCheckout().click();;
if(webelementgettext(sup.getCarttot()).equals(webelementgettext(sup.getTotalprod())))
	
{System.out.println("Total matched");
}
System.out.println(sup.getDeladd().size());
System.out.println(sup.getInvoiceadd().size());
for(int i=0;i<sup.getDeladd().size();i++)
{
WebElement dadd=sup.getDeladd().get(i);
WebElement iadd=sup.getInvoiceadd().get(i);
String daddval=dadd.getText();
String iaddval=iadd.getText();
assertTrue(daddval.equals(iaddval));
}
System.out.println("Address matched");
sup.getCheckout().click();
sup.getCheckout1().click();
sup.getTerms().click();
sup.getCheckout2().click();
sup.getPaybywire().click();;
sup.getConfirmOrder().click();;
try {
	screenshot("JunitTest1");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
@Test
public void menuOption() {

}
@After
public void logout() {
SummaryPage sup=new SummaryPage();
webelementDisplayed("Logout", sup.getLogoutBtn());
elementClick(sup.getLogoutBtn());
String pageTitle = pageTitle();
assertTrue(pageTitle.equalsIgnoreCase("Login - My Store"));
}

@AfterClass
public void driverexit() {
driver.quit();
}

}

