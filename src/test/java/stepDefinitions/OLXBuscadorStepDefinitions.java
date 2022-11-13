package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import steps.OLXSteps;

public class OLXBuscadorStepDefinitions {
	
	@Steps
	OLXSteps olxSteps = new OLXSteps();

	@Given("^que me encuentro en la pagina de OLX con la url (.*)$")
	public void queMeEncuentroEnLaPaginaDeOLXConLaUrlHttpsWwwOlxComCo(String url) {
		SeleniumWebDriver.ChromeWebDriver(url);
	}

	@When("^busco el proudcto en el buscador$")
	public void buscoElProudctoEnElBuscador() {
		olxSteps.buscarProductoEnOLX();
	}

	@Then("^podre ver el producto en pantalla$")
	public void podreVerElProductoEnPantalla() {
		SeleniumWebDriver.driver.quit();
	}
}
