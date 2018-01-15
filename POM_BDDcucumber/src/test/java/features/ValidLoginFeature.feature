Feature: free crm application test

Scenario: validate valid login to home page test

	Given user opens browser and navigates to FreeCrm web page
	Then user is on the login page
	And user enters username and password
	Then clicks login button
	Then homepage is displayed
	Then validate home page
	