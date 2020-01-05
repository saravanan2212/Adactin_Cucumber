package org.pages;

import java.util.List;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConformationBookingPage extends Base {
	public ConformationBookingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private List<WebElement> orderNo;

public List<WebElement> getOrderNo() {
	return orderNo;
}
}