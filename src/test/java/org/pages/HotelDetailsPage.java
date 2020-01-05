package org.pages;

import java.util.List;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelDetailsPage extends Base {
	public HotelDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private List<WebElement> location;
	@FindBy(id="hotels")
	private List<WebElement> hotels;
	@FindBy(id="room_type")
	private List<WebElement> room;
	@FindBy(id="room_nos")
	private List<WebElement> roomNos;
	@FindBy(id="datepick_in")
	private List<WebElement> dateIn;
	@FindBy(id="datepick_out")
	private List<WebElement> dateOut;
	@FindBy(id="adult_room")
	private List<WebElement> adult;
	@FindBy(id="child_room")
	private List<WebElement> child;
	@FindBy(id="Submit")
	private List<WebElement> Submit;
	
	public List<WebElement> getLocation() {
		return location;
	}
	public List<WebElement> getHotels() {
		return hotels;
	}
	public List<WebElement> getRoom() {
		return room;
	}
	public List<WebElement> getRoomNos() {
		return roomNos;
	}
	public List<WebElement> getDateIn() {
		return dateIn;
	}
	public List<WebElement> getDateOut() {
		return dateOut;
	}
	public List<WebElement> getAdult() {
		return adult;
	}
	public List<WebElement> getChild() {
		return child;
	}
	public List<WebElement> getSubmit() {
		return Submit;
	}
}
