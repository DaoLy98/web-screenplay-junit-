package vn.fado.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


public class HomPage extends PageObject{
	
	@FindBy(xpath = "//a[@id='dropdownMenuButton']")
	WebElementFacade AccLink;
	public void clickOnAccountLink() {
		AccLink.click();
	}
	
	@FindBy(xpath = "//span[contains(text(),'Log In')]")
	WebElementFacade loginLink;
	public void clickOnLoginLink() {
		loginLink.click();
	}
	public void SelectMultiState(String... states) {
		for (String state : states) {
			element("//input[@type='search']").waitUntilPresent().typeAndEnter(state);
		}
		
	}
}
