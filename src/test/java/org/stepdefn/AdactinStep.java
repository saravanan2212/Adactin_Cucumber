package org.stepdefn;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pages.LoginPage;
import org.pages.HotelDetailsPage;
import org.pages.RadioPage;
import org.pages.CustomerDetailsPage;
import org.pages.ConformationBookingPage;

import io.cucumber.java.en.*;
import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

public class AdactinStep extends Base {
	
	@Given("User is in adactin home page")
	public void user_is_in_adactin_home_page() {
		getDriver();
		loadUrl("https://adactin.com/HotelApp/"); 
	}

	@When("User enter the {string}, {string}")
	public void user_enter_the(String string, String string2) {
		LoginPage p=new LoginPage();
		fill(p.getUserName().get(0), string);
		fill(p.getPassword().get(0), string2);
		btnClick(p.getLogin().get(0));
	}

	@When("User enter the hotel details {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enter_the_hotel_details(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		HotelDetailsPage p1=new HotelDetailsPage();
		selectIndex(p1.getLocation().get(0), string);
		selectIndex(p1.getHotels().get(0), string2);
		selectIndex(p1.getRoom().get(0), string3);
		//selectIndex(p1.getRoomNos().get(0), string4);
		//fill(p1.getDateIn().get(0), string5);
		//fill(p1.getDateOut().get(0), string6);
		selectIndex(p1.getAdult().get(0), string7);
		selectIndex(p1.getChild().get(0), string8);
		btnClick(p1.getSubmit().get(0));
	}

	@When("User select the particular hotel")
	public void user_select_the_particular_hotel() {
		RadioPage p2=new RadioPage();
		btnClick(p2.getRadio().get(0));
		btnClick(p2.getContin().get(0));
	}

	@When("User book a ticket with enter the personal details {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_book_a_ticket_with_enter_the_personal_details(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {
		CustomerDetailsPage p3=new CustomerDetailsPage();
		fill(p3.getFirst().get(0), string);
		fill(p3.getLast().get(0), string2);
		fill(p3.getAddress().get(0), string3);
		fill(p3.getCcNum().get(0), string4);
		selectIndex(p3.getCcType().get(0), string5);
		selectIndex(p3.getCcMonth().get(0), string6);
		selectIndex(p3.getCcYear().get(0), string7);
		fill(p3.getCcCvv().get(0), string8);
		btnClick(p3.getBookNow().get(0));
		Thread.sleep(5000);
		
	}

	@Then("User validate the ticket booking successfully or not")
	public void user_validate_the_ticket_booking_successfully_or_not() {
		ConformationBookingPage p4=new ConformationBookingPage();
		getAtt(p4.getOrderNo().get(0));
		
	}


}
