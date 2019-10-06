package com.studentapp.cucumber.stepdefinition;

import org.junit.BeforeClass;

import cucumber.api.java.Before;
import io.restassured.RestAssured;

public abstract class TestBase {

	@Before
	public void setUp() {
		RestAssured.baseURI="https://reqres.in/";
	}
}
