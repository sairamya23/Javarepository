package com.selenium.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.baseclass.BaseClass;

public class LoginPage extends BaseClass{
@FindBy(xpath="//h1[@class='page-heading']")
private WebElement authentication;
@FindBy(xpath="((//h1[@class='page-heading'])[1])")
private WebElement createAcc;
@FindBy(xpath="((//h3[@class='page-subheading'])[2])")
private WebElement alreadyReg;
@FindBy(xpath="//input[@name='email_create']")
private WebElement emailAdd;
@FindBy(xpath="//i[@class='icon-user left']")
private WebElement createAccBtn;
@FindBy (id="email")
private WebElement email;
@FindBy(id="passwd")
private WebElement password;
@FindBy(xpath="//i[@class='icon-lock left']")
private WebElement signIn;
public WebElement getSignIn() {
	return signIn;
}
public WebElement getAuthentication() {
	return authentication;
}
public WebElement getCreateAcc() {
	return createAcc;
}
public WebElement getAlreadyReg() {
	return alreadyReg;
}
public WebElement getEmailAdd() {
	return emailAdd;
}
public WebElement getCreateAccBtn() {
	return createAccBtn;
}
public WebElement getEmail() {
	return email;
}
public WebElement getPassword() {
	return password;
}
public LoginPage() {
PageFactory.initElements(driver, this);
}
}
