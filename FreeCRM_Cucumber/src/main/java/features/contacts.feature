Feature: Free CRM Login Feature 

#with Examples Keyword
Scenario Outline: Free CRM Login test scenario 

	Given user is already on the login page 
	When title of login page is Free CRM 
	Then user enters "<username>" and "<password>" 
	Then user clicks on login button 
	And user is on the home page 
	Then user moves to the new contact page
	Then user enters "<firstname>" and "<lastname>" and "<position>"
	Then user closes the browser 
	

	Examples:
		| username               | paassword      | firstname | lastname | position          |
		| samisabir212@gmail.com | Peoplentech212 | sami      | sabir    | Automation Tester |
		| fakeusername           | fakepass       | app       | test     | tester            |