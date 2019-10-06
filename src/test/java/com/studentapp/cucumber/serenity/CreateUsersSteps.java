package com.studentapp.cucumber.serenity;

import com.studentapp.utils.POSTUserPayload;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class CreateUsersSteps {
	
	@Step("the user wants to create a user with name <b>{0} </b> and job <b>{1} </b>")
	public ValidatableResponse createUser(String name, String job) {
		POSTUserPayload user = new POSTUserPayload();
		user.setName(name);
		user.setJob(job);
		return SerenityRest.given().contentType(ContentType.JSON)
					   .body(user)
					   .when().post("/api/users")
					   .then().log().all();
	}
}
