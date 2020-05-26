package com.selenium.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.baseclass.BaseClass;

public class SearchResultPage extends BaseClass {
@FindBy(xpath="(//img[@title='Printed Summer Dress'])[2]")
private WebElement selectImage;
@FindBy(xpath="(//span[contains(text(),'Add to cart')][1])")
private WebElement addtoCart;
@FindBy (xpath="(//i[@class='icon-chevron-right right'])[2]")
private WebElement checkout;
public WebElement getSelectImage() {
	return selectImage;
}
public WebElement getAddtoCart() {
	return addtoCart;
}
public WebElement getCheckout() {
	return checkout;
}
public SearchResultPage() {
	PageFactory.initElements(driver, this);
}
}
