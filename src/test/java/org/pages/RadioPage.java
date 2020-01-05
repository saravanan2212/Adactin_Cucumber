package org.pages;

import java.util.List;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioPage extends Base{
	public RadioPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private List<WebElement> radio;
	
	@FindBy(id="continue")
	private List<WebElement> contin;
	
	
	public List<WebElement> getRadio() {
		return radio;
	}
	public List<WebElement> getContin() {
		return contin;
	}
}
