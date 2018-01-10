Feature: Free CRM Login Feature 

#*******without examples keyword********
#Scenario: Free CRM Login test scenario
#
#Given user is already on the login page
#When title of login page is Free CRM
#Then user enters "samisabir212" and "Peoplentech212"
#Then user clicks on login button
#And user is on the home page
#Then user closes the browser



#with Examples Keyword
Scenario Outline: Free CRM Login test scenario 

	Given user is already on the login page 
	When title of login page is Free CRM 
	Then user enters "<username>" and "<password>" 
	Then user clicks on login button 
	And user is on the home page 
	Then user closes the browser 
	
	Examples: 
		| username            | password       |
		| samisabir212        | Peoplentech212 |
		| hifdsklfjlds        | sasas          |
		
