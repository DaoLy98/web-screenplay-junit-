package vn.fado.steps.serenity;

import net.thucydides.core.annotations.Step;
import vn.fado.pages.HomPage;

public class HomeSteps {
	HomPage onHomePage;
	
	@Step
	public void visit_application() {
		onHomePage.open();
	}
}
