package com.studentapp.cucumber.stepdefinition;

import com.studentapp.cucumber.serenity.UsersSteps;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;

public class UsersStepDefinitions{

	 @Steps
	 UsersSteps usersSteps;
	 
	 ValidatableResponse response;
	
	@Given("^(?:.*) needs the information of user (\\d+)$")
	public void the_user_needs_the_information_of_user(int id) {
		response = usersSteps.getUserById(id);
	}
	
	/*
	 * @Then("^verify that status code is (\\d+)$") public void
	 * verify_that_status_code_is(int code) {
	 * response.assertThat().statusCode(code); }
	 */
}