package vn.fado.features.browers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import vn.fado.steps.serenity.HomeSteps;

@RunWith(SerenityRunner.class)
@WithTags({
	@WithTag("parallel"),
	@WithTag("chrome")
})
public class WhenOpeningTheWeb {
	@Managed
	WebDriver driver;
	
	@Steps
	HomeSteps homeSteps;
	
	@Test
//	@WithTag("web")
	public void lauch_web_application() {
		homeSteps.visit_application();
		
//		homeSteps.select_states("Alaska", "Arizona");
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
