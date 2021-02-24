package org.tcs.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class POM extends Resuseable {
 public POM() {
  PageFactory.initElements(driver, this);
}
 
 @FindBy(id="email")
 private WebElement email;
 
 @FindBy(id ="pass")
 private WebElement pass;
 
 @FindBys({
	 @FindBy(id ="u_0_d_aF"),
	 @FindBy(name = "login")
	 })
private WebElement log;

public WebElement getEmail() {
	return email;
}

public WebElement getPass() {
	return pass;
}

public WebElement getLog() {
	return log;
} 
 
}


