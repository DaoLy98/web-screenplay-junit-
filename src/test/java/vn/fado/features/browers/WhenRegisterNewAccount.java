package vn.fado.features.browers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.fado.steps.serenity.HomeSteps;
import vn.fado.steps.serenity.LoginSteps;
import vn.fado.steps.serenity.RegisterSteps;

@RunWith(SerenityRunner.class)
public class WhenRegisterNewAccount {
	@Managed
	WebDriver driver;
	
	@Steps
	HomeSteps homeSteps;
	
	@Steps
	LoginSteps loginSteps;
	
	@Steps
	RegisterSteps registerSteps;
	
	@Test
	public void lauch_web_application() throws InterruptedException {
		String errMsgString = "Password is not matched";
		homeSteps.visit_application();
		homeSteps.click_on_acc_link();
		homeSteps.click_on_login_link();
		loginSteps.click_on_register_link();
		
		registerSteps.register_new_account("DaoLy01", "daothily16@gmail.com", "Da160298@", "Da16029");
		registerSteps.should_see_warning_error_message_correct(errMsgString);
	}
}
