package vn.fado.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject{
	@FindBy(xpath = "//a[contains(text(),'Create New Account')]")
	WebElementFacade registerLink;
	public void clickOnRegisterLink() {
		registerLink.click();
	}

}
