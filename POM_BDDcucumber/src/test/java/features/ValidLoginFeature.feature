Feature: free crm application test

Scenario Outline: validate valid login to home page test

	Given user opens browser and navigates to FreeCrm web page
	Then user is on the login page
	And user enters "<username>" and "<password>"
	Then clicks login button
	Then validate home page
	
	Examples: 
		| username            | password       |
		| samisabir212        | Peoplentech212 |
		| hifdsklfjlds        | sasas          |