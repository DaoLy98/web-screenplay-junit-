package vn.fado.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import vn.fado.MyPageObject;

public class LoginPage extends MyPageObject{
	@FindBy(xpath = "//a[contains(text(),'Create New Account')]")
	WebElementFacade registerLink;
	public void clickOnRegisterLink() {
		highLightElement(registerLink);
		registerLink.click();
	}

}
