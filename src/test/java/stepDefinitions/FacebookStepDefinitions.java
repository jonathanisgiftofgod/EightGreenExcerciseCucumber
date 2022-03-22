package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.pageelements.FaceBookPageForRegister;
import base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookStepDefinitions extends BaseClass {
	FaceBookPageForRegister f;
	@Given("User should open the facebook application")
	public void user_should_open_the_facebook_application() {
		launchUrl("https://www.facebook.com/");
	    f = new FaceBookPageForRegister();
	    btnclick(f.getCreateAnAccount());
	}

	@When("User should enter the firstname lastname email and password details")
	public void user_should_enter_the_firstname_lastname_email_and_password_details() throws IOException {
		f = new FaceBookPageForRegister();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		enterText(f.getFirstName(), readExcel("Sheet2", 0, 0));
	    enterText(f.getLastName(), readExcel("Sheet2", 1, 0));
	    enterText(f.getPassword(), readExcel("Sheet2", 3, 0));
	}

	@When("User should enter the date of birth")
	public void user_should_enter_the_date_of_birth() throws IOException {
		f = new FaceBookPageForRegister();
		selectOptionsByValue(f.getDay(), readExcel("Sheet2", 4, 0));
		selectOptionsByValue(f.getMonth(), readExcel("Sheet2", 5, 0));
		selectOptionsByValue(f.getYear(), readExcel("Sheet2", 6, 0));
	}

	@Then("User should click the gender details")
	public void user_should_click_the_gender_details() {
		f = new FaceBookPageForRegister();
		btnclick(f.getSex());
	}



}
