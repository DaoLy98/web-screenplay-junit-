package vn.fado.features.browers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.fado.steps.serenity.HomeSteps;

@RunWith(SerenityRunner.class)
public class WhenOpeningTheWeb {
	@Managed
	WebDriver driver;
	
	@Steps
	HomeSteps homeSteps;
	
	@Test
	public void lauch_web_application() {
		homeSteps.visit_application();
	}
}
