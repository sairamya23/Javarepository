package com.selenium.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.selenium.baseclass.BaseClass;

public class SummaryPage extends BaseClass {
@FindBy(xpath="(//i[@class='icon-chevron-right right'])[3]")
private WebElement checkout;
@FindBy(xpath="//td[@class='cart_total']")
private WebElement carttot;
@FindBy(id="total_product")
private WebElement totalprod;
@FindBy(xpath="//ul[@class='address first_item item box']/li/span")
private List <WebElement> deladd;
@FindBy(xpath="//ul[@class='address last_item alternate_item box']/li/span")
private List <WebElement> invoiceadd;
@FindBy(xpath="(//i[@class='icon-chevron-right right'])[7]")
private WebElement checkout1;
@FindBy(id="cgv")
private WebElement terms;
@FindBy(xpath="(//i[@class='icon-chevron-right right'])[3]")
private WebElement checkout2;
@FindBy(xpath="//a[@title='Pay by bank wire']")
private WebElement paybywire;
@FindBy(xpath="//span[text()='I confirm my order']")
private WebElement confirmOrder;
@FindBy(xpath="//a[@class='logout']")
private WebElement logoutBtn;

public WebElement getCheckout() {
	return checkout;
}
public WebElement getLogoutBtn() {
	return logoutBtn;
}
public WebElement getCarttot() {
	return carttot;
}
public WebElement getTotalprod() {
	return totalprod;
}

public List<WebElement> getDeladd() {
	return deladd;
}
public List<WebElement> getInvoiceadd() {
	return invoiceadd;
}
public WebElement getCheckout1() {
	return checkout1;
}
public WebElement getTerms() {
	return terms;
}
public WebElement getCheckout2() {
	return checkout2;
}
public WebElement getPaybywire() {
	return paybywire;
}
public WebElement getConfirmOrder() {
	return confirmOrder;
}
public SummaryPage() {
PageFactory.initElements(driver, this);
}

}
