package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Base {
	public static  WebDriver driver;
	public static void getDriver() throws InterruptedException {
		Thread.sleep(1000);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT Adayar\\eclipse-workspace\\Adactin\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();	}
	public static void loadUrl(String s) {
		driver.get(s);
	}
	public static void fill(WebElement e,String s1) {
	e.sendKeys(s1);
	}
	public static void btnClick(WebElement e) {
		e.click();
	}
	public void selectIndex(WebElement w,String s) {
	Select se=new Select(w);
	se.selectByVisibleText(s);
}
	public void getAtt(WebElement w) {
		String attribute = w.getAttribute("value");
		System.out.println(attribute);
	}}