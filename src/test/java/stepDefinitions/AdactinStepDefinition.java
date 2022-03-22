package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.pageelements.LoginPage;
import org.pageelements.PageForBook;
import org.pageelements.PageForSearchHotel;

import base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinStepDefinition extends BaseClass {
	LoginPage l;
	PageForSearchHotel p;
	PageForBook b;
	@Given("Open the adactin url")
	public void open_the_adactin_url() {
		launchUrl("http://adactinhotelapp.com/");   
	}
	@When("Enter the login {string} and {string} details")
	public void enter_the_login_and_details(String userId, String password) {
		l = new LoginPage();
		enterText(l.getUser(), userId);
		enterText(l.getPass(), password);
	}
	@When("Enter the next or submit button")
	public void enter_the_next_or_submit_button() {
		btnclick(l.getLogin());
	}

	@When("Select the Location Hotel RoomType NoOfRooms")
	public void select_the_Location_Hotel_RoomType_NoOfRooms() throws IOException {
		p = new PageForSearchHotel();
		selectOptionsByValue(p.getLocation(), readExcel("Sheet2", 0, 0));
		selectOptionsByValue(p.getHotels(), readExcel("Sheet2", 1, 0));
		selectOptionsByValue(p.getRoomType(), readExcel("Sheet2", 2, 0));
	}

	@When("Enter the NoOf Adults and NoofChilds")
	public void enter_the_NoOf_Adults_and_NoofChilds() throws NumberFormatException, IOException {
		p = new PageForSearchHotel();
		selectOptions(p.getAdult(), Integer.parseInt(readExcel("Sheet2", 6, 0)));
		selectOptions(p.getChild(), Integer.parseInt(readExcel("Sheet2", 7, 0)));
		btnclick(p.getSubmit());
	}

	@When("click the search")
	public void click_the_search() {
		p = new PageForSearchHotel();
		btnclick(p.getRadio());
		btnclick(p.getContinue());
	}

	@When("Enter the FirstName LastName Address CreditCardNumber")
	public void enter_the_FirstName_LastName_Address_CreditCardNumber() throws IOException {
		b = new PageForBook();
		enterText(b.getFirstName(), readExcel("Sheet3", 0, 0));
		enterText(b.getLastName(), readExcel("Sheet3", 1, 0));
		enterText(b.getAddress(), readExcel("Sheet3", 2, 0));
		enterText(b.getCardNumber(), readExcel("Sheet3", 3, 0));
	}
	@When("Select the CardType ExpiryMonth ExpiryYear")
	public void select_the_CardType_ExpiryMonth_ExpiryYear() throws NumberFormatException, IOException {
		selectOptionsByValue(b.getCardType(), readExcel("Sheet3", 4, 0));
		selectOptions(b.getMonth(), Integer.parseInt(readExcel("Sheet3", 5, 0)));
		selectOptionsByValue(b.getYear(), readExcel("Sheet3", 6, 0));
	}

	@When("Enter the cvv number")
	public void enter_the_cvv_number() throws IOException {
		enterText(b.getCvv(), readExcel("Sheet3", 7, 0));

	}

	@Then("click the BookNow")
	public void click_the_BookNow() {
		btnclick(b.getBook());
	}
}