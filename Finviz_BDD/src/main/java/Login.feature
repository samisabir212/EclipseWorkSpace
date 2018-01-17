Feature: After a user creates an account the user should be able to login from the
 homepage 

Scenario:

#	Backgrounds: 
#		open browser
#		navigate to url
#		close
	

	Given user is on the url homepage
	Then user clicks login button located on the navigation bar on the right side
	Then user enters username and password 
	Then user clicks login button
	Then user should be logged in with username located on the right side of the navigation bar