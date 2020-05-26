package com.cts.practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class flippom {
@FindBy(xpath="//span[contains(text(),'Electronics')]")
private WebElement elect;
@FindBy(xpath="//span[contains(text(),'TVs & Appliances')]")
private WebElement tv;
@FindBy(xpath="//span[contains(text(),'Men')]")
private WebElement men;
@FindBy(xpath="//span[contains(text(),'Women')]")
private WebElement women;
@FindBy(xpath="//span[contains(text(),'Baby & Kids')]")
private WebElement baby;
@FindBy(xpath="//span[contains(text(),'Home & Furniture')]")
private WebElement home;
@FindBy(xpath="'//span[contains(text(),'Sports, Books & More')]'")
private WebElement sports;






}
