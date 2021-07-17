package vn.fado.steps.serenity;

import net.thucydides.core.annotations.Step;
import vn.fado.pages.HomPage;

public class HomeSteps {
	HomPage onHomePage;
	
	@Step
	public void visit_application() {
		onHomePage.open();
	}
	
	@Step
	public void click_on_acc_link() {
		onHomePage.clickOnAccountLink();
	}
	
	@Step
	public void click_on_login_link() {
		onHomePage.clickOnLoginLink();
	}
}
