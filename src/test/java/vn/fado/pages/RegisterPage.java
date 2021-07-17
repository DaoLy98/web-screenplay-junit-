package vn.fado.pages;

import net.serenitybdd.core.pages.PageObject;

public class RegisterPage extends PageObject{
	private static final String BUTTONREGISTER = "//input[@id='signup']";
	private static final String ERRORCONFIPASS = "//span[@id='compare']";
	private static final String NAME_FIELD = "//input[@id='userName']";
	private static final String EMAIL_FIELD = "//input[@id='email']";
	private static final String PASS_FIELD = "//input[@id='password']";
	private static final String CONFPASS_FIELD = "//input[@id='re_pass']";
	
	
	public void enterTextIntoFullName(String fullName) {
		$(NAME_FIELD).type(fullName);
	}
	
	public void enterTextIntoEmail(String emailAddress) {
		$(EMAIL_FIELD).type(emailAddress);
	}
	
	public void enterTextIntoPassWord(String passWord) {
		$(PASS_FIELD).type(passWord);
	}
	
	public void enterTextIntoConfPassWord(String confPassWord) {
		$(CONFPASS_FIELD).type(confPassWord);
	}

	public String getWarningErrMesg() {
		
		return $(ERRORCONFIPASS).getText();
	}

	public void clickOnRegisterButton() {
		$(BUTTONREGISTER).click();
		
	}
	
	
	
}
