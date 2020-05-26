package com.adactln.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.baseclass.BaseClass;

public class LogoutTC10 extends BaseClass {
@FindBy(xpath="//*[contains(text(),'login')]")
private WebElement loginagain;

public WebElement getLoginagain() {
	return loginagain;
}
public LogoutTC10() {
PageFactory.initElements(driver, this);
}
}
