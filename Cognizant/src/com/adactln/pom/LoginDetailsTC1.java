package com.adactln.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.baseclass.BaseClass;

public class LoginDetailsTC1 extends BaseClass {
	@FindBy(id = "username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id="login")
	private WebElement loginbtn;
	
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public LoginDetailsTC1() {
		PageFactory.initElements(driver, this);
	}

}
