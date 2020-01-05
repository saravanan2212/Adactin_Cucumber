package org.pages;
import java.util.List;
import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage extends Base {
public LoginPage() {
	PageFactory.initElements(driver, this);
	//PageFactory.initElements(driver, this);
}
@FindBy(id="username")
private List<WebElement> userName;

@FindBy(id="password")
private List<WebElement> password;


@FindBy(id="login")
private List<WebElement> login;

public List<WebElement> getUserName() {
	return userName;
}

public List<WebElement> getPassword() {
	return password;
}

public List<WebElement> getLogin() {
	return login;
}
}
