package com.selenium.testscript;

import org.openqa.selenium.WebElement;

import com.selenium.baseclass.BaseClass;
import com.selenium.pom.HomePage;
import com.selenium.pom.LoginPage;
import com.selenium.pom.SearchResultPage;
import com.selenium.pom.SummaryPage;

public class TestScript extends BaseClass {
	public static void main(String[] args) throws Exception {
		browserLaunch("chrome","http://automationpractice.com/index.php");
		LoginPage lp=new LoginPage();
		HomePage hp=new HomePage();
		SearchResultPage sp=new SearchResultPage();
		SummaryPage sup=new SummaryPage();
		webelementDisplayed("Logo",hp.getPageLogo());
		webelementDisplayed("mobno",hp.getMobNo());
		webelementDisplayed("Contact Us",hp.getContactUs());
		webelementDisplayed("Search",hp.getSearch());
		webelementDisplayed("SignIn",hp.getSignIn());
		webelementDisplayed("Women", hp.getWomen());
		webelementDisplayed("Dresses", hp.getDresses());
		webelementDisplayed("T-Shirts", hp.getTshirts());
		elementClick(hp.getSignIn());
webelementDisplayed("authentication", lp.getAuthentication());
webelementDisplayed("Create Acc", lp.getCreateAcc());
webelementDisplayed("Already Reg", lp.getAlreadyReg());
webelementDisplayed("CreateAccButton", lp.getCreateAccBtn());
textsendkeys("sairamya23@gmail.com",lp.getEmail());
textsendkeys("dhanvin@1",lp.getPassword());
webelementEnabled("SignIn", lp.getSignIn());
elementClick(lp.getSignIn());
textsendkeys("printed", hp.getSearch());
elementClick(hp.getSearchIcon());
movetoelement(sp.getSelectImage());
//movetoelement(sp.getAddtoCart());
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
if(!daddval.equals(iaddval))
{
	System.out.println("Addr not Matched");
}
}
System.out.println("Address matched");
sup.getCheckout().click();
sup.getCheckout1().click();
sup.getTerms().click();
sup.getCheckout2().click();
sup.getPaybywire().click();;
sup.getConfirmOrder().click();;
screenshot("Test1");
}
}