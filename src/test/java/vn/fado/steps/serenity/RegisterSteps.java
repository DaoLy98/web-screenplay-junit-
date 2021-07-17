package vn.fado.steps.serenity;

import static org.junit.Assert.assertEquals;

import net.thucydides.core.annotations.Step;
import vn.fado.pages.RegisterPage;
import static org.junit.Assert.*;

public class RegisterSteps {
	RegisterPage onRegisterPage;
	
	public void register_new_account(String name, String email, String password, String confPass){
		enter_full_name(name);
		enter_email(email);
		enter_password(password);
		enter_confirm_password(confPass);
		click_on_register_button();
	}
	public void click_on_register_button() {
		onRegisterPage.clickOnRegisterButton();
		
	}
	@Step
	public void enter_full_name(String name) {
		onRegisterPage.enterTextIntoFullName(name);
		
	}
	@Step
	public void enter_email(String email) {
		onRegisterPage.enterTextIntoEmail(email);
	}

	@Step
	public void enter_password(String password) {
		onRegisterPage.enterTextIntoPassWord(password);
		
	}
	@Step
	public void enter_confirm_password(String confPass) {
		onRegisterPage.enterTextIntoConfPassWord(confPass);
	}

	@Step
	public void should_see_warning_error_message_correct(String expectedErrMsg) {
		assertEquals(expectedErrMsg, onRegisterPage.getWarningErrMesg());
		
	}
}

