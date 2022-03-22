package org.pageelements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class FaceBookPageForRegister extends BaseClass {
	public FaceBookPageForRegister() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement createAnAccount;
	@FindBy(name="firstname")
	private WebElement FirstName;
	@FindBy(name="lastname")
	private WebElement LastName;
	@FindBy(id="password_step_input")
	private WebElement Password;
	@FindBy(id="day")
	private WebElement Day;
	@FindBy(id="month")
	private WebElement month;
	@FindBy(id="year")
	private WebElement year;
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement Sex;
	
	public WebElement getCreateAnAccount() {
		return createAnAccount;
	}
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getDay() {
		return Day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getSex() {
		return Sex;
	}
	
	
}
