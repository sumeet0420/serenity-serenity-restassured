package com.studentapp.cucumber.stepdefinition;

import com.studentapp.cucumber.serenity.CreateUsersSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.components.HtmlTable;

public class CreateUsersStepDefinition{

	@Steps
	CreateUsersSteps createUsers;
	
	
	  @Given("^the user wants to create a user with name (.*) and job (.*)$")
	  public void the_user_wants_to_create_a_user_with_name_and_job(String name,
	  String job) { createUsers.createUser(name, job).assertThat().statusCode(201);
	  HtmlTable.withColumns(""); }
	 
	
	  @Then("^verify that status code is (\\d+)$") public void
	  verify_that_status_code_is(int code) {
	  //response.assertThat().statusCode(code);
	  }
	 
}
