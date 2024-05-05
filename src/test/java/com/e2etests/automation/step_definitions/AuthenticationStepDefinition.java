package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.AuthenticationPage;
import com.e2etests.automation.utility.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition {

	private AuthenticationPage authenticationPage;

	public AuthenticationStepDefinition() {
		this.authenticationPage = new AuthenticationPage();
	}

	@Given("Je me connecte a l application SWAGLABS")
	public void jeMeConnecteALApplicationSWAGLABS() {
		authenticationPage.goToUrl();
	}

	@When("Je saisis le Username {string}")
	public void jeSaisisLeUsername(String username) {
		authenticationPage.fillUsername(username);
	}

	@When("Je saisis le Password {string}")
	public void jeSaisisLePassword(String password) {
		authenticationPage.fillPassword(password);
	}

	@When("Je clique sur le bouton LOGIN")
	public void jeCliqueSurLeBoutonLOGIN() {
		authenticationPage.clickOnBtnLogin();
	}

	@Then("Je me suis redirigée vers la page home de SWAGLABS {string}")
	public void jeMeSuisRedirigéeVersLaPageHomeDeSWAGLABS(String msg_txt) {

		// System.out.println(Setup.driver.getTitle());
		// Assert.assertTrue(Setup.driver.getTitle()=="SWAGLABS");
		Assert.assertTrue(Setup.driver.getTitle().contains(msg_txt));
//		AuthenticationPage.menuList.click();
	}

}
