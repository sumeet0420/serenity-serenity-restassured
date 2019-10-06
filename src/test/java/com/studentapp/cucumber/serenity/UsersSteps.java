package com.studentapp.cucumber.serenity;

import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class UsersSteps {

	@Step("the user needs the information of user {0}")
	public ValidatableResponse getUserById(int userId) {
		return SerenityRest.given()
					   .pathParam("userId", userId)
					   .when().get("/api/users/{userId}")
					   .then().log().all();
	}
	
}
