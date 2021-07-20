package vn.fado.steps.serenity;

import static org.junit.Assert.assertEquals;

import javax.swing.AbstractAction;

import net.thucydides.core.annotations.Step;
import vn.fado.pages.RegisterPage;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class RegisterSteps {
	RegisterPage onRegisterPage;
	
	public void register_new_account(String name, String email, String password, String confPass){
		enter_full_name(name);
		enter_email(email);
		enter_password(password);
		enter_confirm_password(confPass);
		click_on_register_button();
	}
//	public void register_new_account(Account account){
//		enter_full_name(account.getName());
//		enter_email(account.getEmail());
//		enter_password(account.getPassWord());
//		enter_confirm_password(account.getConfiPass());
//		click_on_register_button();
//	}
	
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
		String actualErrMsg = onRegisterPage.getWarningErrMesg();
		//Junit
		assertEquals(expectedErrMsg, actualErrMsg);
		//Hamcrest
		assertThat(expectedErrMsg, equalTo(actualErrMsg));
		
	}
}

