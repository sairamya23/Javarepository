package com.selenium.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.baseclass.BaseClass;

public class HomePage extends BaseClass{
	@FindBy(xpath="//img[@class='img-responsive']")
	private WebElement pageLogo;
	@FindBy(xpath="//strong[text()='0123-456-789']")
	private WebElement mobNo;
	@FindBy(xpath="//a[text()='Contact us']")
	private WebElement contactUs;
	@FindBy(xpath="//a[@class='login']")
	private WebElement signIn;
	@FindBy(id="search_query_top")
	private WebElement search;
	@FindBy(xpath="//a[text()='Women']")
	private WebElement women;
	@FindBy(xpath="(//a[text()='Dresses'])[2]")
	private WebElement dresses;
	@FindBy(xpath="(//a[text()='T-shirts'])[2]")
	private WebElement tshirts;
	@FindBy (name="submit_search")
	private WebElement searchIcon;
	@FindBy (xpath="//span[contains(text(),'Ramya')]")
	private WebElement user;
	
	public WebElement getUser() {
		return user;
	}
	public WebElement getSearchIcon() {
		return searchIcon;
	}
	public WebElement getPageLogo() {
		return pageLogo;
	}
	public WebElement getMobNo() {
		return mobNo;
	}
	public WebElement getContactUs() {
		return contactUs;
	}
	public WebElement getSignIn() {
		return signIn;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getWomen() {
		return women;
	}
	public WebElement getDresses() {
		return dresses;
	}
	public WebElement getTshirts() {
		return tshirts;
	}
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
}
