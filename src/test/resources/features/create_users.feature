Feature: To test the POST APIs from https://reqres.in

Scenario: To verify that the user is able to create the <b>User Information</b>
	Given the user wants to create a user with name <"name"> and job <"job"> 
	Then verify that status code is 201