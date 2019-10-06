Feature: To test the GET APIs from https://reqres.in

@Regression @Positive @sys6 @int3
Scenario: To verify that the user is able to get the <b>User Information</b> with a respective id
	Given the user needs the information of user 2
	Then verify that status code is 200

@Regression @Positive @sys6 @int3
Scenario: To verify that the user is NOT able to get the <b>User Information</b> with an invalid respective id
	Given the user needs the information of user 23
	Then verify that status code is 404
	
@Regression @Negative @sys6 @int3
Scenario: To verify that the user is NOT able to get the <b>User Information</b> with an invalid respective id
	Given the user needs the information of user 23
	Then verify that status code is 200