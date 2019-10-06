package com.studentapp.utils;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class ResponseHolder {

	private Response response;
	private ValidatableResponse validateResponse;

	public ValidatableResponse getValidateResponse() {
		return validateResponse;
	}

	public void setValidateResponse(ValidatableResponse validateResponse) {
		this.validateResponse = validateResponse;
	}

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}
	
	
}
