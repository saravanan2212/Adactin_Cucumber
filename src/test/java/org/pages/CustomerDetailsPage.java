package org.pages;

import java.util.List;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerDetailsPage extends Base{
	public CustomerDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private List<WebElement> first;
	@FindBy(id="last_name")
	private List<WebElement> last;
	@FindBy(id="address")
	private List<WebElement> address;
	@FindBy(id="cc_num")
	private List<WebElement> ccNum;
	@FindBy(id="cc_type")
	private List<WebElement> ccType;
	@FindBy(id="cc_exp_month")
	private List<WebElement> ccMonth;
	@FindBy(id="cc_exp_year")
	private List<WebElement> ccYear;
	@FindBy(id="cc_cvv")
	private List<WebElement> ccCvv;
	@FindBy(id="book_now")
	private List<WebElement> bookNow;
	
	public List<WebElement> getFirst() {
		return first;
	}
	public List<WebElement> getLast() {
		return last;
	}
	public List<WebElement> getAddress() {
		return address;
	}
	public List<WebElement> getCcNum() {
		return ccNum;
	}
	public List<WebElement> getCcType() {
		return ccType;
	}
	public List<WebElement> getCcMonth() {
		return ccMonth;
	}
	public List<WebElement> getCcYear() {
		return ccYear;
	}
	public List<WebElement> getCcCvv() {
		return ccCvv;
	}
	public List<WebElement> getBookNow() {
		return bookNow;
	}
}
