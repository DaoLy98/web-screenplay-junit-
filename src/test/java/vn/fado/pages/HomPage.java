package vn.fado.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


public class HomPage extends PageObject{
	@FindBy(xpath = "//a[contains(text(),'Đăng nhập')]")
	WebElementFacade loginLink;
	public void clickOnLoginLink() {
		loginLink.click();
	}
	
}
